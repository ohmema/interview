import java.util.ArrayList;
import java.util.Stack;

public class BinarySearchTree {

	static class Node {

		Node left;
		Node right;
		int value;

		public Node(int value) {
			this.value = value;
		}

		public Node(Node l, Node r, int value) {
			left = l;
			right = r;
			this.value = value;
		}
	}

	Node rootNode = null;

	public BinarySearchTree() {
		rootNode = null;
	}

	public void insert(int value) {
		if (rootNode == null)
			rootNode = insert(rootNode, value);
		else
			insert(rootNode, value);
	}

	public Node insert(Node tmp, int data) {

		if (tmp == null) {
			return (new Node(data));
		} else {
			// 2. Otherwise, recur down the tree
			if (data <= tmp.value)
				tmp.left = insert(tmp.left, data);
			else
				tmp.right = insert(tmp.right, data);

			return (tmp); // return the (unchanged) node pointer
		}
	}

	public boolean lookup(Node node, int target) {
		if (node == null)
			return false;

		if (node.value > target)
			return lookup(node.left, target);
		else if (node.value < target)
			return lookup(node.right, target);
		else
			return true;
	}

	public Node lookUp(Node node, int target) {
		Node tmp = node;
		while (tmp != null) {
			if (tmp.value > target)
				tmp = tmp.left;
			else if (tmp.value < target)
				tmp = tmp.right;
			else
				return tmp;
		}
		return null;
	}

	public void printInOrder() {
		printInOrder(rootNode);
	}

	public void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.left);
			System.out.println("  Traversed " + node.value);
			printInOrder(node.right);
		}
	}

	public ArrayList<Integer> inOrderWithoutRecursion() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Node> s = new Stack<Node>();
		Node current = rootNode;
		while (current != null || !s.empty()) {
			if (current != null) {
				s.push(current);
				current = current.left;
			} else {

				Node tmp = s.pop();
				list.add(tmp.value);
				current = tmp.right;
			}
		}
		return list;
	}

	public ArrayList<Integer> preOrderWithoutRecursion() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Node> s = new Stack<Node>();
		s.push(rootNode);
		Node current = rootNode;
		while (!s.empty()) {
			current = s.pop();
			list.add(current.value);

			if (current.right != null)
				s.push(current.right);
			if (current.left != null)
				s.push(current.left);
		}
		return list;
	}

	public ArrayList<Integer> postOrderWithoutRecursion() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(rootNode);
		Node current = rootNode;
		while (!s1.empty()) {
			current = s1.pop();
			s2.push(current);
			if (current.left != null)
				s1.push(current.left);
			if (current.right != null)
				s1.push(current.right);
		}
		while (!s2.isEmpty()) {
			Node node = s2.pop();
			list.add(node.value);
		}

		return list;
	}

	public boolean checkBST(Node node) {
		if (node == null)
			return true;

		if (node.left != null && node.right != null) {
			if (node.left.value < node.value && node.right.value > node.value)
				return true && checkBST(node.left) && checkBST(node.right);
		} else if (node.left != null && node.right == null) {
			if (node.left.value < node.value)
				return true && checkBST(node.left);
		} else if (node.left == null && node.right != null) {
			if (node.right.value < node.value)
				return true && checkBST(node.right);
		} else {
			return true;
		}
		return true;
	}

	public static int getHeight(Node n)
	{
		if(n == null)
			return 0;
		
		return Math.max(1+getHeight(n.right), 1+getHeight(n.left));
	}
	public static void PathPrint(Node node, ArrayList<Integer> p)
	{
//		if(node == null)
//		{
//			print(p);
//			return;
//		}
		
//		ArrayList<Integer> newArrayListForLeft = (ArrayList<Integer>)p.clone();
//		ArrayList<Integer> newArrayListForRight = (ArrayList<Integer>)p.clone();
//		newArrayListForLeft.add(node.value);
//		newArrayListForRight.add(node.value);
//		
//		if(node.left == null && node.right == null)
//			PathPrint(node.left,newArrayListForLeft);
//		else if (node.left != null && node.right == null)
//		{
//			PathPrint(node.left,newArrayListForLeft);
//			//PathPrint(node.right,newArrayListForRight);
//		}
//		else if (node.left == null && node.right != null)
//		{
//			//PathPrint(node.left,newArrayListForLeft);
//			PathPrint(node.right,newArrayListForRight);
//		}
//		else
//		{
//			PathPrint(node.left,newArrayListForLeft);
//			PathPrint(node.right,newArrayListForRight);
//		}
		

		ArrayList<Integer> newArrayListForRight = (ArrayList<Integer>)p.clone();
		newArrayListForRight .add(node.value);
		p.add(node.value);
		
		if(node.left == null && node.right == null)
			print(p);
		else if (node.left != null && node.right == null)
		{
			PathPrint(node.left,p);
			//PathPrint(node.right,newArrayListForRight);
		}
		else if (node.left == null && node.right != null)
		{
			//PathPrint(node.left,newArrayListForLeft);
			PathPrint(node.right,newArrayListForRight);
		}
		else
		{
			PathPrint(node.left,p);
			PathPrint(node.right,newArrayListForRight);
		}
		
		return;
		
	}
	public static void print(ArrayList<Integer> p)
	{
		for(Integer i:p)
			System.out.print(i +" -> ");
		System.out.println("null");
		return;
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		// System.out.println("Building tree with rootvalue " +
		// bst.rootNode.value);
		System.out.println("=================================");

		bst.insert(50);
		bst.insert(11);
		bst.insert(15);
		bst.insert(16);
		bst.insert(1);
		bst.insert(23);
		bst.insert(79);
		bst.insert(19);
		bst.insert(9);
		bst.insert(25);
		bst.printInOrder();
		System.out.println("Traversing tree in order");
		System.out.println("=================================");
		System.out.println(getHeight(bst.rootNode));
		ArrayList<Integer> inorder = bst.preOrderWithoutRecursion();
		for (int i : inorder) {
			System.out.print(i + " ");
		}
		int target = 1;
		Node t = null;
		if ((t = bst.lookUp(bst.rootNode, target)) != null) {
			System.out.printf("\n%d is found\n", t.value);
		}
		bst.checkBST(bst.rootNode);
		
		PathPrint(bst.rootNode, new ArrayList<Integer>());
	}

}
