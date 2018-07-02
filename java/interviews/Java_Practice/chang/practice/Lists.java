package chang.practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Lists {

	public static void main(String[] args) {

		ArrayList_foo();
	}
	public static void ArrayList_foo()
	{
		ArrayList<String> list = new  ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		int size = list.size();
//		list.remove("a");
		list.remove(0);

		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
