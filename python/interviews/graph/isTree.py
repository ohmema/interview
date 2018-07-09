"""
Given a graph, find if it represents a tree.
"""

def isTree(node):
    s = set()
    return _isTree(node, s)

def _isTree(node, s):
    if node == None:
        return True
    if node in s:
        return False
    s.add(node)

    return _isTree(node.left, s) and _isTree(node.right, s)

class Node:
    def __init__(self, e=None, l=None, r=None):
        self.e, self.left, self.right = e, l, r

tree = Node(1, Node(2,Node(3)), Node(4,None, Node(5,None, Node(6))))
print(isTree(tree))

root = Node(1)
root.left= Node(1, Node(2,Node(3)), Node(4,None, Node(5,None, Node(6))))
root.right = Node(1, Node(2,Node(3)), Node(4,None, Node(5,root, Node(6))))
print(isTree(root))