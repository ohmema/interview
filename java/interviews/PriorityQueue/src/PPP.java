import java.util.Comparator;
import java.util.PriorityQueue;


public class PPP
{

	
	public static class StringLengthComparator implements Comparator<String>
	{
	    public int compare(String x, String y)
	    {
	        if (x.length() < y.length())
	        {
	            return -1;
	        }
	        if (x.length() > y.length())
	        {
	            return 1;
	        }
	        return 0;
	    }
	}
    public static void main(String[] args)
    {
        Comparator<String> comparator = new StringLengthComparator();
        PriorityQueue<String> queue = 
            new PriorityQueue<String>(10, comparator);
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        queue.add("6");
        queue.add("7");
        queue.add("8");
        queue.add("9");
        queue.add("10");
        queue.add("11");
        queue.add("12");
        queue.add("13");
        queue.add("14");
        queue.add("15");
        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
        System.out.println(queue.poll());
    }
}

