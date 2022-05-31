package stack_Examples;

import java.util.Stack;

public class Stack_Ex1 {

	public static void main(String[] args) {
		Stack<Integer> element = new Stack();
		element.add(101);
		element.add(102);
		element.add(103);
		element.add(104);
		element.add(105);
		System.out.println("Elements :"+element);
		System.out.println(element.peek());//peek()will be called in the index order.
		System.out.println(element);
		System.out.println(element.pop());//pop()method will remove the data
		System.out.println(element);
		System.out.println(element.pop());
		System.out.println(element);
		System.out.println(element.push(106));
		System.out.println(element);
		System.out.println(element.push(107));//push the elements 
		System.out.println(element);

	}

}
