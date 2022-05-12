package collections_Task_Programms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_Program1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        String name;
		int num;
		String per_address;
		Scanner sc = new Scanner(System.in);
		LinkedList<String>  lst = new LinkedList<String>();
		lst.add("Venu");
		lst.add("Ganesh");
		lst.add("kalyan");
		System.out.println("List :"+lst);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element;
		int userposition,choice;
		while (true) {
			System.out.println("1.Add the element");
			System.out.println("2.Delte the element");
			System.out.println("3.Exit");
			System.out.println("Choose anyone option");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("ENTER YOUR DETAILS :1.NAME 2.MOBILE_NO 3.ADDRESS ");
				System.out.println("Enter your name :");
				name = sc.next();
				System.out.println("Enter your mobile no :");
				num = sc.nextInt();
				System.out.println("Enter your address :");
				per_address = sc.next();
				
				System.out.println("[Your Name :"+name+" Your Number :"+num+" Your Address :"+per_address+"]");
				
				System.out.println("Enter the element name :");
				element = br.readLine();
				System.out.println("What is the position");
				userposition = Integer.parseInt(br.readLine());
				lst.add(userposition-1,element);
				
				break;
			case 2:
				System.out.println("Delete the element");
				userposition = Integer.parseInt(br.readLine());
				lst.remove(userposition-1);
                break;
			default:
				System.out.println("Terminate the programm");
				return;
			}
//			System.out.println("LIST "+lst);

			Iterator<String> it = lst.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
		
			
		}

	}

}
