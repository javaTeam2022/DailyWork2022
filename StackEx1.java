package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		int c;
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(23);
		stack.push(36);
		stack.push(45);
		stack.push(55);
		stack.push(67);
		stack.push(81);
		System.out.println(stack);
		System.out.println("Select the choice:\n1.AddElements");
		System.out.println("Enter the Choice:");
		c=sc.nextInt();
		while (true) {
			switch (c) {
			case 1:
				System.out.println("Enter the elements:");
				if(stack.empty()) {
					
					stack.push(a);
					stack.push(30);
					stack.push(40);
					stack.push(50);
					
				}
				
				else {
					if(stack.contains(a)){
						System.out.println("Duplicate value");
						}
					System.out.println("Enter a new value");
					a = sc.nextInt();
					stack.push(a);
					
				}
				
				break;

			default:
				break;
			}
		}
		

	}

}