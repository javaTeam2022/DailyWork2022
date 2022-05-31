package stack;

public class Element {
public void addStack(int a) {
		
		
		
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
