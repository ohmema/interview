
from BinaryTree import BinaryTree, Node



#O(n^2)
def get_Smallest_Common_Ancestor(root, n1, n2):
    if root == None:
        return None
    if isChildNode(root, n1) and isChildNode(root, n2):
        left = get_Smallest_Common_Ancestor(root.left, n1, n2)
        if left != None:
            return left

        right = get_Smallest_Common_Ancestor(root.right, n1, n2)
        if right != None:
            return right

        return root

    else:
        return None





# O(n)
def isChildNode(node, n1):
    if node == None:
        return False

    if node.obj is n1.obj:
        return True
    return isChildNode(node.left, n1) or isChildNode(node.right, n1)


tree = Node("0")
tree.left = Node("1")
tree.right = Node("2")
tree.left.left = Node("3")
tree.left.right = Node("4")
tree.right.left = Node("5")
tree.right.right = Node("6")
tree.right.right.left = Node("10")
tree.right.right.right = Node("7")
tree.right.right.right.right = Node("8")
BinaryTree.print(tree)

node = get_Smallest_Common_Ancestor(tree, tree.right, tree.right.right.right.right)
print("Smalest common ancestor: {}".format(node.obj))
