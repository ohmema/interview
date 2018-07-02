package ReverseSinlyLinkeList;

public class LinkedList {

	class Node {
		Node next;
		int o;

		public Node(Node t, int i) {
			next = t;
			o = i;
		}
	}

	Node header = null;

	public void add(int n) {
		Node tmp = new Node(header, n);
		header = tmp;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node pos = header;
		while (pos != null) {
			sb.append(pos.o + "-->");
			pos = pos.next;
		}
		sb.setLength(sb.length() - 3);
		return sb.toString();
	}

	public Node reverse(Node pos) {
		if (pos == null)
			return null;
		
		if(pos.next ==null)
			header = pos;
		
		Node tmp = reverse(pos.next);
		
		if (tmp != null)
			tmp.next = pos;
		
		pos.next = null;
		return pos;
	}

	public static Node reverseList(LinkedList list, Node pos){
		if (pos == null)
			return null;
		
		if(pos.next ==null)
			list.header = pos;
		
		Node tmp = reverseList(list, pos.next);
		
		if (tmp != null)
			tmp.next = pos;
		
		pos.next = null;
		return pos;
	}
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list.toString());
		
		/*list.reverse(list.header);*/
		reverseList(list, list.header);
		System.out.println(list.toString());

	}

}
