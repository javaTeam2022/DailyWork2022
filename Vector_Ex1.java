package vector;
import java.util.*;
public class Vector_Ex1 {

	public static void main(String[] args) {
		Stack  stackdemo = new Stack();
		Stack<Integer> stckInt = new Stack<Integer>();
		
		// push(E item)
		
		// implemeting the stack in 8th line
		stackdemo.push(78);
		stackdemo.push("Stack");
		stackdemo.push(95.356);
		stackdemo.push("Java");
		stackdemo.push(true);
		stackdemo.push(100);
		
		System.out.println(stackdemo);
		
		
		// to check whether the stack is empty or not
	//	System.out.println(stackdemo.empty());
		
		// to search an elemen in the stack
		System.out.println(stackdemo.search("Stack"));// this mthod provided by stack
		System.out.println("---1----");
		System.out.println(stackdemo.indexOf(95.356));// this is extended from vector
		System.out.println("---2----");
		System.out.println(stackdemo.peek());
		System.out.println("---3---");
		System.out.println(stackdemo.pop());//
		System.out.println(stackdemo);
		

	}

}
