package Vectors;

import java.util.Stack;

public class StackVec {
	public static void main(String args[]) {
		Stack stackdemo = new Stack();
		Stack<Integer> str = new Stack<Integer>();
		stackdemo.push(90);
		stackdemo.push(50);
		stackdemo.push(60);
		stackdemo.push(85);
		stackdemo.push(20);
		System.out.println(stackdemo);
		System.out.println(stackdemo.empty());
		System.out.println(stackdemo.search(60));
		System.out.println(stackdemo.indexOf("stack"));
		System.out.println(stackdemo.peek());
		System.out.println(stackdemo.pop());
		System.out.println(stackdemo);
	}

}
