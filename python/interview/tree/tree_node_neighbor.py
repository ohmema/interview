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
    make_level_nodes(level_nodes, root.left, level+1)
    nodes = level_nodes.get(level, [])
    nodes.append(root)
    level_nodes[level] = nodes
    make_level_nodes(level_nodes, root.right, level + 1)

#Wrong
def check_level_tree(root):
    if root == None:
        return False

    level_print(root)
    if check_level_tree( root.left ) == False:
        check_level_tree(root.right)

def level_print(node):
    current = node
    while current != None:
        print(current.e, end = " ")
        current = current.neighbor
    print()

tree = Node(3, Node(1, left = Node(-3)), Node(4, right = Node(23)))
make_neighbor_tree(tree)
check_level_tree(tree)
print("#"*100)
tree = Node(3, Node(1, left = Node(-3), right = Node(5, right= Node(-4))), Node(4, right = Node(23, left = Node(6, Node(4)))))
make_neighbor_tree(tree)
check_level_tree(tree)



