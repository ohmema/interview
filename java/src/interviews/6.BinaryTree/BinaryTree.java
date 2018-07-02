import java.util.Arrays;

public class BinaryTree {

	public static class Node {
		int value;
		Node left;
		Node right;

		public Node(int v, Node l, Node r) {
			value = v;
			left = l;
			right = r;
		}
	}
	public static class MyInt{
		Integer i;
		public MyInt()
		{
			i =0;
		}
		MyInt increase()
		{
			i++;
			return this;
		}
		MyInt decrease()
		{
			i--;
			return this;
		}
		public int getInt()
		{
			return i;
		}		
	}
	Node head;

	public String toString() {
		return printTree(head, new StringBuffer());
	}

	public String printTree(Node h, StringBuffer sb) {
		if (h == null)
			return null;


		printTree(h.left, sb);
		sb.append(h.value + " ");
		printTree(h.right, sb);
		return sb.toString();
	}

	public static BinaryTree makeTree(int[] array) {
		BinaryTree one = new BinaryTree();
		Node h =  makeTree(array,0);
		one.head = h;
		return one;
	}


	private static Node makeTree(int[] array, int k) {
			
		if (k >= array.length){  //k > array.length  --> (k is array.length) is passed
			return null;
		}
		
		Node l = makeTree(array, k*2+1);
		Node r = makeTree(array,  k*2+2);
		return new Node(array[k],l,r);
	}

	public static BinaryTree makeBST(int[] array) {
		BinaryTree one = new BinaryTree();
		Arrays.sort(array);

		Node h =  makeBST(array,0, array.length-1);
		one.head = h;
		return one;
	}


	private static Node makeBST(int[] array, int l, int r) {
			
		if (l > r){      //   if(l >= r ) => Then there will be missing nodes.
			return null;
		}
		
		int mid = (l+r)/2;
		Node lNode = makeBST(array, l, mid -1);
		Node rNode = makeBST(array, mid +1, r);
		return new Node(array[mid],lNode,rNode);
	}
	
	
	public static void main(String[] args) {

		int[] array = { 1, 4, 3, 6, 45, 54, 23, 43, 34 };

		BinaryTree one = makeTree(array);
		System.out.println(one.toString());

		BinaryTree two = makeBST(array);
		System.out.println(two.toString());
	}

}
