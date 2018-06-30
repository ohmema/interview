class Node:
    def __init__(self, e=None, left = None, right = None, neighbor = None):
        self.e, self.left, self.right, self.neighbor = e, left, right, neighbor

def make_neighbor_tree(tree):
    level_nodes = dict()
    make_level_nodes(level_nodes, tree, 0)
    for level in range(len(level_nodes)):
        nodes = level_nodes[level]
        for j in range(1, len(nodes)):
            node = nodes[j-1]
            next_node = nodes[j]
            node.neighbor = next_node

def make_level_nodes(level_nodes, root, level):
    if root == None:
        return
    make_level_nodes(level_nodes, root.left, level + 1)
    nodes = level_nodes.get(level, [])
    nodes.append(root)
    level_nodes[level] = nodes
    make_level_nodes(level_nodes, root.right, level + 1)


def check_level_tree(root, level, visited):
    if root == None:
        return

    if not visited[level] :
        level_print(level, root)
        visited[level]=True

    check_level_tree(root.left, level + 1, visited )
    check_level_tree(root.right, level + 1, visited)

def level_print(level, node):
    current = node
    print("{} : ".format(level), end=" ")

    while current != None:
        print(current.e, end = "->")
        current = current.neighbor
    print("None")

def getDepth(tree, level):
    if tree == None:
        return level

    leftDepth = getDepth(tree.left, level+1)
    rightDepth = getDepth(tree.right, level+1)
    return max(leftDepth, rightDepth)

tree = Node(3, Node(1, left = Node(-3)), Node(4, right = Node(23)))
make_neighbor_tree(tree)
check_level_tree(tree, 0, [False]*getDepth(tree, 0))

print("#"*100)
tree = Node(3, Node(1, left = Node(-3), right = Node(5, right= Node(-4))), Node(4, right = Node(23, left = Node(6, Node(4)))))
make_neighbor_tree(tree)
check_level_tree(tree,0, [False]*getDepth(tree, 0))



