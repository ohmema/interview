"""
Give an Node
{
    Node getLeft();
    Node getRight();
    String toString();
}
Give a root nodeNode root
       *
      / \
    +     -
   /  \  / \
   1  2 3 4
Return(1 + 2) * (3 - 4)

If (1 + 2) + (3 + 4)
doesnot need to be bracketed Only leaf nodes are numbers

followup Give you * + 1 2 - 3 4 to return this tree
"""
class Node:
    def __init__(self, e, left = None, right = None):
        self.e, self.left, self.right = e, left, right

class ArithmeticTree:
    def __init__(self, line):
        chars = line.strip().split()
        self.root = self.makeTree(chars)

    def makeTree(self, chars):
        if len(chars) == 0:
            return None

        op = chars[0]
        chars.pop(0)
        node = Node(op)
        if not op.isdigit():
            node = Node(op)
            node.left = self.makeTree(chars)
            node.right = self.makeTree(chars)
        return node

    def print(self):
        q = list()
        current_level = 0
        q.append( (0, self.root))
        while len(q) != 0:
            temp = q.pop(0)
            if temp[0]  != current_level:
                current_level = temp[0]
                print()
            print(temp[1].e, end=" ")
            if temp[1].left is not None:
                q.append((current_level+1, temp[1].left))
            if temp[1].right is not None:
                q.append((current_level +1, temp[1].right))
        print()

    def inorder(self):
        self._in_order(self.root, [])
        print()

    def _in_order(self, node, brace):
        if node == None:
                return

        if node.e == "+" or node.e == "-":
            print("(", end="")

        self._in_order(node.left, brace)

        print("{}".format(node.e), end = " ")

        self._in_order(node.right, brace)

        if node.e == "+" or node.e == "-":
            print(")", end="")

input = "* + 1 2 - 3 4 "
tree = ArithmeticTree(input)
print("{} : ".format(input), end="")
tree.inorder()

input = "* + 1 * 3 4 - / 3 4 4 "
tree = ArithmeticTree(input)
print("{} : ".format(input), end="")
tree.inorder()
