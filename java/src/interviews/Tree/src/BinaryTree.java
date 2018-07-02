import java.util.ArrayList;

public class BinaryTree {
	public static class BinaryNode {
		private int value;
		private int leftChildId = -1;
		private int rightChildId = -1;
		private int parentId = -1;

	}

	private ArrayList<BinaryNode> nodes = new ArrayList<BinaryNode>();

	public BinaryTree() {
		BinaryNode newNode = new BinaryNode();
		nodes.add(newNode);
	}

	public void addLeftNode(int val, int parentId) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = val;
		newNode.parentId = parentId;
		 nodes.add(newNode);
		 int nodeId = nodes.indexOf(val); //No duplication allowed
		((BinaryNode) nodes.get(parentId)).leftChildId = nodeId;
	}

	public int addRightNode(int val, int parentId) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = val;
		newNode.parentId = parentId;
		nodes.add(newNode);
		 int nodeId = nodes.indexOf(val); //No duplication allowed
		((BinaryNode) nodes.get(parentId)).rightChildId =nodeId;
		return nodeId;
	}

	public void removeNode(int nodeId) {
		// recurse to remove children
		if (((BinaryNode) nodes.get(nodeId)).leftChildId != -1) {
			removeNode(((BinaryNode) nodes.get(nodeId)).leftChildId);
		}
		if (((BinaryNode) nodes.get(nodeId)).rightChildId != -1) {
			removeNode(((BinaryNode) nodes.get(nodeId)).rightChildId);
		}

		// remove parent reference
		int oldParentId = ((BinaryNode) nodes.get(nodeId)).parentId;
		if (((BinaryNode) nodes.get(oldParentId)).leftChildId == nodeId) {
			((BinaryNode) nodes.get(oldParentId)).leftChildId = -1;
		}
		if (((BinaryNode) nodes.get(oldParentId)).rightChildId == nodeId) {
			((BinaryNode) nodes.get(oldParentId)).rightChildId = -1;
		}
		nodes.remove(nodeId);
	}

	public static void main(String[] args)

	{
		BinaryTree bt = new BinaryTree();
		
	}
}
