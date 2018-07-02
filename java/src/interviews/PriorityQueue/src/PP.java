import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class PP {
	static class Wrap{
	    String url;
	    int val;
	    Wrap(String s, int val){url = s; this.val = val;}
	}
	
	
	public static void main(String[] args) {
		LinkedList<Wrap> l = new LinkedList<Wrap>();
		Hashtable<String, Wrap> hash = new Hashtable<String, Wrap>();
		Wrap one =  new Wrap("google", 1);
		hash.put(one.url, one);
		l.add(one);
		printHash(hash);
		printlinkedlist(l);
		
		one.url ="microsoft";
		printHash(hash);
		printlinkedlist(l);
		
	}
	public static void printlinkedlist(List a)
	{
		
		for(int i =0;i<a.size();i++)
		{
			Wrap buff = (Wrap) a.get(i);	
			 System.out.println(buff.url +" hits: " + buff.val);
		}
	}
	
	public static  void printHash(Hashtable hash)
	{
		Iterator it = hash.keySet().iterator();
			
		while(it.hasNext())
		{	
			Wrap buff = (Wrap) hash.get((String)it.next());
			System.out.println(buff.url +" hits: " + buff.val);
		}
//		for(Object buff : hash.values())
//		{
//			System.out.println(((Wrap)buff).url +" hits: " + ((Wrap)buff).val);
//		}
	}
}
