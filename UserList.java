package CollectionFrameWork;
import java.util.LinkedList;
import java.util.Scanner;

public class UserList {

	public static void main(String[] args) {
		
		String name;
		Scanner sc = new Scanner(System.in);
		LinkedList<String> lst = new LinkedList(); 
		
		System.out.println("Type exit For Exit the loop.");
		System.out.println("Enter Item names ");
		
		while(true) {
			name = sc.next();
			if(name.contentEquals("exit")) {
				System.out.println("Exited");
				System.out.println(lst);
				break;
			}
			lst.add(name);
		}
	}
} 
