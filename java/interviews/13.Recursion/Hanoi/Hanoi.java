package Hanoi;

import java.util.Stack;

public class Hanoi {
//16.1 elements of programming interviews
	public static void main(String[] args) {
		Stack<Integer>[] stacks  = new Stack[3];
		for(int i= 0 ; i <3; i++)
		{
			stacks[i] = new Stack<Integer>();
		}
		
		int n = 6;
		
		for(int i =n; i >= 1; --i)
		{
			stacks[0].push(i);
		}
		
		move(stacks, 6, 0,1,2);
		
		for(int i= 0 ; i <3; i++)
		{
			System.out.println("Stack = "+ i);
			while(!stacks[i].isEmpty())
			{
				System.out.print(stacks[i].pop());
			}
			System.out.println();
		}
		
	}
	
	static void move(Stack<Integer>[] stacks, int n, int i , int j, int k )
	{
		if(n == 0)
			return;
		
		move (stacks, n-1, i, k, j);
		stacks[j].push(stacks[i].pop());
		move(stacks, n-1, k, j, i);
	}

}
