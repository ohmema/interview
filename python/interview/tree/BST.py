class Node:
    def __init__(self, key, item):
        self.key = key
        self.item = item
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None

    def add(self, key, item=None):
        a_node = Node(key, item)
        if self.root == None:
            self.root = a_node
            return

        p = self.root
        pp = self.root
        while pp:
            p = pp
            if pp.key < key:
                pp = pp.right
            else:
                pp = pp.left

        if p.key < key:
             p.right = a_node
        else:
            p.left = a_node
    
    def find(self, node, data):
        if node == None:
            return None
        if node.data == data:
            return node
        if node.data > data:
            return self.find(node.left, data)
        else:
            return self.find(node.right, data)
        
    def remove(self, data):
        target = self.find(self.head, data)
        if target == None:
            return
        replace = self.closest_node(target, data)

        target.data = replace.data
        parent = self.parent_node(replace)
        if parent.left == replace:
            parent.left = None
        else:
            parent.right = None

    def _leftmost(self, pp, p):
        while pp.left:
            p = pp
            pp = pp.left
        return pp, p

    def _rightmost(self, pp, p):
        while pp.right:
            p = pp
            pp = pp.right
        return pp, p

    @staticmethod
    def print(node):
        if node == None:
            return
        q = list()
        q.insert(0, (1, node))
        level = 1
        while len(q):
            nl, node = q.pop()
            if nl != level:
                print("{:50}".format(("---level " + str(level)).rjust(20," ")))
                level += 1
            print(node.key, end=" ")
            if node.left != None:
                q.insert(0, (level+1, node.left))
            if node.right != None:
                q.insert(0, (level+1, node.right))
        print("{:50}".format(("---level " + str(level)).rjust(20," ")))

    ##Wong logic
    """
    @staticmethod
    def isBST(node):
        if node == None:
            return True
        key = node.key

        result = True
        if node.left and node.left.key > key:
            result = False
        if node.right and node.right.key < key:
            result = result and False
        return result and BST.isBST(node.left) and BST.isBST(node.right)
        """

    @staticmethod
    def isBST(node, leftkey = -10000, rightkey = 10000):
        if node == None:
            return True
        key = node.key

        result = True
        if not leftkey < key < rightkey:
            result = False
            return result

        if node.left:
            result = result and BST.isBST(node.left, leftkey, node.key)
        if node.right:
            result = result and BST.isBST(node.right, node.key, rightkey)

        return result

    @staticmethod
    def isBalanced(node):
        if node == None:
            return True

        if abs(BST.height(node.left) - BST.height(node.right)) > 1:
            return False

        return BST.isBalanced(node.left) and BST.isBalanced(node.right)

    @staticmethod
    def height(node):
        if node == None:
            return 0

        return 1 + max(BST.height(node.left), BST.height(node.right))
    
    def closest_node(self, node, data):
        if node.left == None and node.right == None:
            return node

        if node.data > data:
            self.find(node.left, data)
        else:
            self.find(node.right, data)
            
    def parent_node(self, node):
        # CASE: try to find prent of head
        if self.head is node:
            return None

        pre = self.head
        if node.data < pre.data:
            next = pre.left
        else:
            next = pre.right

        while next != node:
            if next == None:
                break
            pre = next
            if node.data < pre.data:
                next = pre.left
            else:
                next = pre.right

        # CASE 1: next is node : node found
        # CASE 2: next is None: node  Not found
        if next == None:
            raise KeyError

        return pre

    def pre_order(self):
        self._pre_order(self.head)

    def _pre_order(self, node):
        if node == None:
            return
        print("{} => ".format(node.data), end="")
        self._pre_order(node.left)
        self._pre_order(node.right)

    def in_order(self):
        self._in_order(self.head)

    def _in_order(self, node):
        if node == None:
            return
        self._in_order(node.left)
        print("{} => ".format(node.data), end="")
        self._in_order(node.right)

    def post_order(self):
        self._post_order(self.head)

    def _post_order(self, node):
        if node == None:
            return
        self._post_order(node.left)
        self._post_order(node.right)
        print("{} => ".format(node.data), end="")

    def store_by_level(self, node, level = 0, store = {}):
        """
        d = {0:[],1:[], 2:[],...]
        """
        if node == None:
            return

        list_of_level = store.get(level,[])
        list_of_level.append(node.data)
        store[level]=list_of_level
        self.store_by_level(node.left,level + 1, store)
        self.store_by_level(node.right, level + 1, store)

bst = BST()
bst.add(50)
bst.add(25)
bst.add(75)
bst.add(1)
bst.add(30)
bst.add(60)
bst.add(90)
bst.add(100)
bst.add(200)
#bst.root.right.left.key = 30
print(BST.isBST(bst.root))
BST.print(bst.root)
print(BST.height(bst.root))
print(BST.isBalanced(bst.root))