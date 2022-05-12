package LinkedList;

import java.util.Scanner;

public class PersonDetails {
	 String name;
	 int mobileNo;
	 String address;
	//Scanner sc = new Scanner(System.in);
	public PersonDetails(String name, int mobileNo, String address) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.address =address;	
		
	}
	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", mobileNo=" + mobileNo + ", address=" + address + "]";
	}
	

}
