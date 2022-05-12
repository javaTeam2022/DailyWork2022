package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList4 {
	public static void main(String[] args) {
		String name;
		int mobileNo;
		String address;
		LinkedList<PersonDetails> lp = new LinkedList<PersonDetails>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Person name, mobileno and address");
		name = sc.next();
		mobileNo =sc.nextInt();
		address = sc.next();
		PersonDetails pd = new PersonDetails(name,mobileNo,address);
		lp.add(pd);
	}
	//Iterator<PersonDetails> it =lp.iterator();

}
