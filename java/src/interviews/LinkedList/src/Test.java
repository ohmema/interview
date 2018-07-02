
public class Test {

	public static void main(String[] args) {
		Linkedlist linkedList = new Linkedlist();
		
		linkedList.insert(7);		
		linkedList.insert(8);
		linkedList.insert(9);
		linkedList.insert(10);
		linkedList.insert(11);
		linkedList.insert(12);
		linkedList.printList();
		linkedList.remove(8);
		linkedList.printList();
	}

}
