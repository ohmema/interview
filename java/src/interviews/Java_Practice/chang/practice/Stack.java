package chang.practice;
import java.util.*;
import java.lang.*;
public class Stack {
	public static void main(String[] args) throws Exception
	{
//		Stack stack = new Stack();
//		MyStack<Integer> ss = stack.new MyStack <Integer>(5);
//		
//		ss.push(6);
//		ss.push(7);
//		ss.push(8);
//		
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
//		System.out.println(ss.pop());
		Stack stack = new Stack();
		MyQueue<Integer> ss = stack.new MyQueue <Integer>(5);
		
		ss.enQueue(0);
		ss.enQueue(1);
		ss.enQueue(2);
		ss.enQueue(3);
		ss.enQueue(4);
		ss.enQueue(5);
		ss.enQueue(6);
		ss.enQueue(7);
		ss.enQueue(8);
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		ss.enQueue(9);
		ss.enQueue(10);
		ss.enQueue(11);
		ss.enQueue(12);
		
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
		System.out.println(ss.deQueue());
	}
	
	public void test_stack()
	{
		java.util.Stack <Number>stack = new java.util.Stack<Number>();
		
		stack.push(new Long(12));
		stack.push(new Long(14));
	}
	
	public class MyStack<E>
	{
		private final int size ;
		private int top;
		private E[] e;
		
		public MyStack()
		{
			this(10);
		}
		public MyStack(int size)
		{
			this.size = size < 10 ?10: size;
			top = -1;
			e = (E[]) new Object[this.size];
		}
		public void push(E Object) throws Exception
		{
			if(top == size - 1)
				throw new Exception("Stack overflow");
			e[++top] = Object;
		}
		public E pop() throws Exception
		{
			if (top == -1)
				throw new Exception("empty stack");
				return e[top--];
		}
	}
	
	public class MyQueue<E>
	{
		private final int size ;
		private int top;
		private int bottom;
		private E[] e;
		
		public MyQueue()
		{
			this(10);
		}
		public MyQueue(int size)
		{
			this.size = size < 10 ?10: size;
			top = 0;
			bottom = 0;
			e = (E[]) new Object[this.size];
		}
		public void enQueue(E Object) throws Exception
		{
			if((top + 1)%size == bottom)
				throw new Exception("Stack overflow");
			e[(top++)%size] = Object;
		}
		public E deQueue() throws Exception
		{
			if ((bottom)%size  ==  top)
				throw new Exception("empty stack");
				return e[(bottom++)%size];
		}
	}
}
