package vector;
import java.util.Scanner;
import java.util.Stack;
public class Task_program {
		static Scanner sc = new Scanner(System.in);
		static Stack<Integer> ref = new Stack<Integer>();
     public static void main(String[] args) {
    		System.out.println("Enter you element");
    		int insert = sc.nextInt();
    		
    			addStack(insert);
    			
    		
    		System.out.println("After insert "+ref);
    		
    		// deletion
    		System.out.println("Enter the element you want to delete");
    		int del = sc.nextInt();
    		
    		delStack(del);
    		System.out.println("Please enter a valid element");
    		int del2 = sc.nextInt();
    		delStack(del2);
    		System.out.println("After delete"+ref);
    		
    		//again inserting
    		System.out.println("Add your element");
    		int insert2 = sc.nextInt();
    		addStack(insert2);
    		// updation
    		System.out.println("Please enter a element to update");
    		int update1 = sc.nextInt();
    		update(update1);
    		System.out.println("Please enter a valid element to update");
    		int update2 = sc.nextInt();
    		update(update2);
    		System.out.println("After update:"+ref);
    		

    	}
    	
    	public static void addStack(int a) {
    		
    		if(ref.empty()) {
    			
    			ref.push(a);
    			ref.push(30);
    			ref.push(40);
    			ref.push(50);
    			
    		}
    		
    		else {
    			if(ref.contains(a)){
    				System.out.println("Duplicate value");
    				}
    			System.out.println("Enter a new value");
    			a = sc.nextInt();
    			ref.push(a);
    			
    		}
    		
    	}
    	public static void delStack(int b) {
    		
    		if(ref.empty()) {
    			System.out.println("Stakc is empty");
    		}
    		
    		else {
    			if(ref.contains(b)) {
    				
    				ref.removeElement(b);
    			
    			}
    			else {
    				System.out.println("Element not found");
    			}
    			
    		}
    	}
    	
    	public static void update(int c) {
    		if(ref.empty()) {
    			System.out.println("Stakc is empty");
    		}
    		else {
    			if(ref.contains(c)) {
    				ref.indexOf(c);
    				System.out.println("Upadate your element :");
    				int userInput = sc.nextInt();
    				ref.set(ref.indexOf(c), userInput);
    			}
    			else
    				System.out.println("Element not found");
    		}
	}
    }
