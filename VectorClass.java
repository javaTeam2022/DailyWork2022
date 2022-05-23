package vector;

import java.util.*;

public class VectorClass {
	public static void main(String[] args) {
		String sname;
		Scanner sc = new Scanner(System.in);
		LinkedList<String> lsitems = new LinkedList();
		System.out.println("1.Enter your food Items\n2.Exit");
		while (true) {
			System.out.println("Select your food item :");
			sname = sc.next();
			if (sname.equals("Exit")) {
				System.out.println("Exit");
				System.out.println(lsitems);
				return;
			}
			lsitems.add(sname);
		}

	}

}
