package CollectionFrameWork;

import java.util.Scanner;
import java.util.Stack;

public class OperationsOnStack {

	static Scanner sc = new Scanner(System.in);
	static Stack<Integer> stack = new Stack();
	public static void main(String[] args) {

		  stack.push(5);
		  stack.push(79);
		  stack.push(13);
		  stack.push(96);
		  stack.push(63);
		  stack.push(46);
		  System.out.println("Elements of stack object");
		  System.out.println(stack);
		  while(true) {
		    System.out.println();
		    System.out.println("Select operation");
	        System.out.println("1.Add Elements\n2.Read Elements\n3.Update Elements\n4.Search Element\n5.Delete Elements\n6.Exit");
		    int choose = sc.nextInt();
	     switch (choose) {
		case 1:
			System.out.println("Enter a Element to add");
			int insert = sc.nextInt();
			addElement(insert);
			System.out.println("After add "+stack);
			break;
		case 2:
			System.out.println("Elements of stack object");
			System.out.println(stack);
			break;
		case 3:
			System.out.println("Enter a elemet to update");
			int updateaElement = sc.nextInt();
			update(updateaElement);
			System.out.println("After Update "+stack);
			break;
		case 4:
			System.out.println("Enter element to search");
			int searchElement = sc.nextInt();
			search(searchElement);
			break;
		case 5:
			System.out.println("Enter a Element to Delete");
			int remove = sc.nextInt();
			deleteElement(remove);
			break;
		case 6:
			System.out.println("Exited");
			return;
			
		default:
			System.out.println("Invalid option");
		    return;
		}  
		  }
	}
	private static void addElement(int add) {
		 stack.push(add);
	}
	
	private static void deleteElement(int del) {
		
		if(stack.contains(del)) {
			stack.removeElement(del);
			System.out.println("After remove "+stack);
			
		}else {
			System.out.println("Element not found");
			
		}	 
	}
	
	private static void update(int up) {
		System.out.println("Enter a position to update Or replace element");
		int postion = sc.nextInt();
		if(postion-1<stack.size()) {
		
			System.out.println(stack.set(postion-1, up)+" updated as "+up+" in position "+postion);
		}else {
			System.out.println("Out of indexbound");
		}
	}
	private static void search(int search1) {
		
		if(stack.contains(search1)) {	
		System.out.println("Element : "+search1);
		System.out.println("Index: "+stack.search(search1));
		}else {
			System.out.println("Element not found");
		}
		
	}
}
