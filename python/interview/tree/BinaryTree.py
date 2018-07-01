class Node:
    def __init__(self, obj, left=None, right=None):
        self.obj, self.left, self.right = obj, left, right

class BinaryTree:
    def __init__(self, obj, left=None, right=None):
        self.head = Node(obj,left, right)

    def add_left(self, obj):
        self.head = Node(obj,self.head, None)

    def add_right(self, obj):
        self.head = Node(obj, None, self.head)

    @staticmethod
    def pre_order(node):
        if node is None:
            return
        print(node.obj)
        BinaryTree.pre_order(node.left)
        BinaryTree.pre_order(node.right)

    @staticmethod
    def in_order(node):
        if node is None:
            return
        BinaryTree.in_order(node.left)
        print(node.obj,end="")
        BinaryTree.in_order(node.right)

    def add(self, obj):
        q = list()
        q.append(self.head)
        while len(q) != 0:
            temp = q.pop(0)
            if temp.left == None:
                temp.left = Node(obj)
            else:
                q.append(temp.left)

            if temp.right == None:
                temp.right = Node(obj)
            else:
                q.append(temp.right)

    def remove(self, obj):
        pass

    def height(self):
        pass

    def printGivenLevel(self, level):
        pass

    @staticmethod
    def print(node):
        q = list()
        current_level = 0
        q.append( (0, node))
        while len(q) != 0:
            temp = q.pop(0)
            if temp[0]  != current_level:
                current_level = temp[0]
                print()
            print(temp[1].obj, end=" ")
            if temp[1].left is not None:
                q.append((current_level+1, temp[1].left))
            if temp[1].right is not None:
                q.append((current_level +1, temp[1].right))
        print()

"""
bt =  BinaryTree("a")
bt.head.left = Node("b")
bt.head.right = Node("c")
bt.head.left.left = Node("d")
bt.head.left.right = Node("e")
bt.head.right.left = Node("f")
bt.head.right.right = Node("g")
BinaryTree.in_order(bt.head)
print()
BinaryTree.print(bt.head)
"""