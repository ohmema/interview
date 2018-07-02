package chang.practice;

import java.util.StringTokenizer;

public class RegularExpreesion {

	public static void main(String[] args) {
	
		st();
	}
	public static void st()
	{
		String s = new StringBuilder()
        .append("It was the best of times, it was the worst of times,")
        .append("it was the age of wisdom, it was the age of foolishness,")
        .append("it was the epoch of belief, it was the epoch of incredulity,")
        .append("it was the season of Light, it was the season of Darkness,")
        .append("it was the spring of hope, it was the winter of despair,")
        .append("we had everything 234-23-3232 before us, we had nothing before us")
        .toString();
		
		StringTokenizer  token = new StringTokenizer(s);
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
		
		if(s.matches(".*(\\d{3}-\\d{2}-\\d{4}).*"))
		{
			System.out.println("matches");
		}	
	}
}
