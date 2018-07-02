package findsuccessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class BinaryTreeSuccess {

	static class Node {
		int value;
		Node left;
		Node right;

		public Node(int v, Node l, Node r) {
			value = v;
			left = l;
			right = r;
		}

		public static Node makeBST(int[] array, int l, int r) {

			if (l > r) { // if(l >= r ) => Then there will be missing nodes.
				return null;
			}

			int mid = (l + r) / 2;
			Node lNode = makeBST(array, l, mid - 1);
			Node rNode = makeBST(array, mid + 1, r);
			return new Node(array[mid], lNode, rNode);
		}

		public static String printTree(Node h, StringBuffer sb) {
			if (h == null)
				return null;
			printTree(h.left, sb);
			sb.append(h.value + " ");
			printTree(h.right, sb);
			return sb.toString();
		}

		public static void printTreeLevel(Node h) {
			if (h == null)
				return;

			Stack<Node> stack = new Stack<Node>();
			Stack<Node> reverse = new Stack<Node>();
			stack.push(h);
			ArrayList<Node> list = new ArrayList<Node>();

			int i = 100;

			while (!stack.isEmpty()) {
				while (!stack.isEmpty()) {
					reverse.push(stack.pop());
				}

				while (!reverse.isEmpty()) {
					Node tmp = reverse.pop();
					System.out.printf("%10d ", tmp.value);
					if (tmp.left != null)
						stack.push(tmp.left);
					if (tmp.right != null)
						stack.push(tmp.right);

				}
				System.out.println();
			}

		}
		static class NodeContainer{
			public Node node;
			public NodeContainer(Node n)
			{
				node =n; 
			}
		}
		public static Node findInOrderSuccessor(Node cur, NodeContainer pre, Node target) {
			if (cur == null)
				return null;

			Node left = findInOrderSuccessor(cur.left, pre, target);
			if (left != null)
				return left;

			if (pre.node != null && pre.node == target)
				return cur;

			if (pre.node != null)
				System.out.printf("pre = %d, cur = %d \n", pre.node.value, cur.value);
			else
				System.out.printf("pre = null, cur = %d \n",  cur.value);
			
			pre.node = cur;
			
			Node right = findInOrderSuccessor(cur.right, pre, target);
			if (right != null)
				return right;

			return null;
		}

		public static Node findInOrderSuccessorc(Node cur, Node pre, Node target) {
			if (cur == null)
				return null;
			Node left = null;
			if(cur.value > target.value)
			{
				left = findInOrderSuccessorc(cur.left, cur, target);
			}
			else
				left = findInOrderSuccessorc(cur.left, pre, target);
			
			if (left != null)
				return left;

			if (pre != null && pre == target)
				return cur;


			if (pre != null)
				System.out.printf("pre = %d, cur = %d \n", pre.value, cur.value);
			else
				System.out.printf("pre = null, cur = %d \n",  cur.value);
			
			pre = cur;
			
			Node right = findInOrderSuccessorc(cur.right, pre, target);
			if (right != null)
				return right;

			return null;
		}
		public static class Int {
			public int k;

			public Int(int i) {
				k = i;
			}
		}

		public static Node getNode(Node header, Int i) {
			if (header == null || i.k < 0)
				return null;

			Node left = Node.getNode(header.left, i);
			if (left != null)
				return left;

			if (i.k == 0)
				return header;

			i.k--;

			Node right = Node.getNode(header.right, i);
			if (right != null)
				return right;

			return null;

		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 2,3,4,5,6,7,8,9,10,11,12,13, 14, 15, 16, 17, 18, 19,20,21, 22, 23, 24, 25, 26,27};
		Arrays.sort(array);
		Node treeNode = Node.makeBST(array, 0, array.length - 1);
		Node.printTreeLevel(treeNode);

		System.out.println(Node.printTree(treeNode, new StringBuffer()));

		Node tmp = Node.getNode(treeNode, new Node.Int(array.length - 1));

		System.out.printf("Target = %d\n", tmp.value);

		Node s = Node.findInOrderSuccessor(treeNode, new Node.NodeContainer(null) , tmp);

		Node s1 = Node.findInOrderSuccessorc(treeNode, null , tmp);
//		System.out.printf("Target = %d successor  = %d", tmp.value, s.value);

	}

}
