class Node:
    def __init__(self, item, left = None, right = None):
        self.item = item
        self.left = left
        self.right = right

def convert_ll_to_BST(ll):
    root = _convert_ll_to_BST(ll, 0, len(ll)-1)
    return root

def _convert_ll_to_BST(ll, i, j):
    if i > j:
        return None
    #if i == j:
    #    return Node(ll[i])
    mid = (i+j)//2
    root = Node(ll[mid])
    root.left = _convert_ll_to_BST(ll, i, mid - 1)
    root.right = _convert_ll_to_BST(ll, mid + 1, j)
    return root

def print_tree(root):
    if root == None:
        return
    print_tree(root.left)
    print(root.item, end="=>")
    print_tree(root.right)

def second_largest_element(root, prev = None, pp = None):
    if root == None:
        return pp

    a1 = second_largest_element(root.left, root, prev)
    a1 = second_largest_element(root.right, root, a1)
    return a1

_list=[1,3,5, 7, 8, 10]
root = convert_ll_to_BST(_list)
print_tree(root)

print()
prev = second_largest_element(root)
print(prev.item)


root = Node(10, Node(5, Node(3)))
prev = second_largest_element(root)
print(prev.item)



root = Node(1, Node(7, None, Node(13)))
prev = second_largest_element(root)
print(prev.item)