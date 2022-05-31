package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class MainMobile {

	public static void main(String[] args) {
		LinkedList<MobilesDetails> mobileList = new LinkedList<MobilesDetails>();

		MobilesDetails apple1 = new MobilesDetails("Apple", "iphone13mini", 64999);
		MobilesDetails apple2 = new MobilesDetails("Apple", "iphone 13 pro", 125999);
		MobilesDetails apple3 = new MobilesDetails("Apple", "iphone 13 pro max", 165999);
		MobilesDetails samsung1 = new MobilesDetails("samsung", "S 21", 68999);
		MobilesDetails samsung2 = new MobilesDetails("samsung", "note 20", 85999);
		MobilesDetails oneplus1 = new MobilesDetails("oneplus", "nord 2", 29356);
		MobilesDetails oneplus2 = new MobilesDetails("oneplus", "9 rt", 40999);
		MobilesDetails oneplus3 = new MobilesDetails("oneplus", "9r", 42499);

		mobileList.add(apple1);
		mobileList.add(apple2);
		mobileList.add(apple3);
		mobileList.add(samsung1);
		mobileList.add(samsung2);
		mobileList.add(oneplus1);
		mobileList.add(oneplus2);
		mobileList.add(oneplus3);

		System.out.println(mobileList);
		String choose;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Brand\n1.Apple\n2.Samsung\n3.Oneplus");
		choose = sc.next();
		switch (choose) {
		case "1":

			System.out.println(apple1);
			System.out.println(apple2);
			System.out.println(apple3);
			System.out.println("Select model to buy");
			String selectModel = sc.next();
			System.out.println(mobileList.getClass());
//				if(mobileList.contains())
//					
//					System.out.println(apple1.getPrice());
//				else if (selectModel==apple2.getModel())
//					System.out.println(apple2);
//				else if (selectModel==apple3.getModel()) 
//					System.out.println(apple3);
			break;

		default:
			break;
		}
		System.out.println("V");

	}

}
