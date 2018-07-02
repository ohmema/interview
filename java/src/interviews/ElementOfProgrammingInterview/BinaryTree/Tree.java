package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
	public class TreeNode {
		TreeNode left;
		TreeNode right;
		int value;

		public TreeNode(TreeNode left, TreeNode right, int v) {
			this.left = left;
			this.right = right;
			this.value = v;
		}
	}

	TreeNode header;
	Queue<TreeNode> level = new LinkedList<TreeNode>();

	public Tree() {
		header = null;
	}

	public void add(int v) {
		boolean inserted = false;
		while (!inserted) {
			if (level.isEmpty()) {
				header = new TreeNode(null, null, v);
				level.add(header);
				inserted = true;
			} else {
				TreeNode tmp = level.peek();
				if (tmp.left == null) {
					tmp.left = new TreeNode(null, null, v);
					level.add(tmp.left);
					inserted = true;

				} else if (tmp.right == null) {
					tmp.right = new TreeNode(null, null, v);
					level.add(tmp.right);
					inserted = true;
				} else
					level.remove();
			}
		}
	}

	public static int calculateNumOfNodes(TreeNode node) {
		if (node == null)
			return 0;

		return calculateNumOfNodes(node.left) + calculateNumOfNodes(node.right)
				+ 1;

	}

	public String toString() {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Queue<Integer> level = new LinkedList<Integer>();
		queue.add(header);
		level.add(0);
		int preLevel = -1;
		StringBuffer sb = new StringBuffer();
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.remove();
			int tmpLevel = level.remove();

			if (tmpLevel != preLevel) {
				sb.append("\n");
				preLevel = tmpLevel;
			}
			sb.append(tmp.value + " ");
			// System.out.print(tmp.value);

			if (tmp.left != null) {
				queue.add(tmp.left);
				level.add(tmpLevel + 1);
			}
			if (tmp.right != null) {
				queue.add(tmp.right);
				level.add(tmpLevel + 1);
			}

		}
		return sb.toString();
	}

	public class MutableInt{
		int value;
		
		public MutableInt()
		{
			value =0;
		}
		public MutableInt(int v)
		{
			value = v;
		}
		
		public int get()
		{
			return value;
		}
		public void set(int v)
		{
			value = v;
		}
		public void increment()
		{
			value ++;
		}
		public void decrement()
		{
			value --;
		}
	}
	public static TreeNode inOrderTree(TreeNode n, MutableInt k) {
		if (n == null)
			return null;
		TreeNode left = inOrderTree(n.left, k);
		if (left != null)
			return left;
		System.out.print(n.value + " \"K:" + k.get()+ "\" ");
		
		k.decrement();
		if (k.get() == 0)
			return n;
		
		return inOrderTree(n.right, k);

	}

	public static void main(String[] args) {
		Tree newTree = new Tree();

		newTree.add(2);
		newTree.add(23);
		newTree.add(24);
		newTree.add(1);
		newTree.add(12);
		newTree.add(122);
		newTree.add(6);
		newTree.add(29);
		System.out.println(newTree.toString());

		System.out.println("Num of Nodes: "
				+ calculateNumOfNodes(newTree.header));

		int num = 4;
		
		TreeNode t = inOrderTree(newTree.header,  newTree.new MutableInt(num));
		System.out.println(num + " st in order node is " + t.value);

	}

}
