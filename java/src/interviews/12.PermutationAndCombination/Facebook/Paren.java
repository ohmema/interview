package Facebook;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Paren {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
//		paren(3*2,0,set,new StringBuffer());
		opimizedParen(3,3,set,new StringBuffer());
		for(String s : set)
		{
			System.out.println(s);
		}
		System.out.println(set.size());

	}
	
	static void opimizedParen(int leftParen, int rightParen,Set<String> set, StringBuffer sb )
	{
		if(rightParen == 0){
				set.add(sb.toString());
			return;
		}
		
		if(leftParen > 0)
		{
			sb.append("(");
			opimizedParen(leftParen-1, rightParen, set, sb);
			sb.setLength(sb.length() -1);
		}
		
		if(leftParen < rightParen)
		{
			sb.append(")");
			opimizedParen(leftParen, rightParen-1, set, sb);
			sb.setLength(sb.length() -1);
		}
	}
	//O(n2^n)
	static void paren(int n, int k , Set<String> set, StringBuffer sb){

		if(n == k){
			if(validateString(sb.toString()))
				set.add(sb.toString());
			return;
		}

			sb.append("(");
			paren(n, k+1, set, sb);
			sb.setLength(sb.length() -1);
			
			sb.append(")");
			paren(n, k+1, set, sb);
			sb.setLength(sb.length() -1);
		
	}
	
	static boolean validateString(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i =0; i < s.length(); i++)
		{
			if(s.charAt(i) == '(')
			{
				stack.push('(');
			}
			else
			{
				if(stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		
		return (stack.isEmpty())? true: false;
	}
}
