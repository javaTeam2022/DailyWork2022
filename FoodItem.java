package linkedList;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class FoodItem {

	public static void main(String[] args) {
		int fi;
		String fname;
		String choice;
		Scanner sc = new Scanner(System.in);
		
		LinkedList food = new LinkedList<ItemDetails>();
		
		food.add("idly");
		food.add("dosa");
		food.add("puri");
		food.add("wada");
		food.add("capathi");

		while (true) {
			System.out.println(
					"Select the option below:\n-->Add Record(add).\n-->Update Record(update).\n-->Remove Record(remove).\n-->Display the list(display).\n-->Enter exit for Exit the loop.");
			System.out.println("Enter the choice:");
			choice = sc.next();
			switch (choice) {
			case "add":
				while (true) {
					System.out.println("Enter the Food Item Name:");
					fname = sc.next();
					if (fname.equalsIgnoreCase("done")) {
						System.out.println("List Completed.");
						break;
					}
					ItemDetails itd = new ItemDetails(fname);
					food.add(itd);
				}
				break;
			case "remove":
				System.out.println("Enter the item name to remove:");
				fname = sc.next();
				food.remove(fname);
				System.out.println("Item was removed.");
				break;
			case "update":
				System.out.println("Enter the index number and item name:");
				fi = sc.nextInt();
				fname = sc.next();
				food.set(fi, choice);
				break;
			case "display":
				System.out.println("Food Item List:");
				Iterator fit = food.iterator();
				while (fit.hasNext()) {
					System.out.println(fit.next());
				}
				break;
			default:
				System.out.println("Exited.");
				return;
			}

		}

	}
}