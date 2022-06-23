package strings_concepts;

import java.util.Scanner;
class ToStringComparision{
	Scanner sc = new Scanner(System.in);
	String first;
	String second;
	public void stringcomparision() {
		System.out.println("Enter first name :");
		first = sc.nextLine();
		System.out.println("Enter Second name :");
		second = sc.nextLine();
		if (first.compareTo(second)>0) {
			System.out.println("First is biggest value :");
		}else if (first.compareTo(second)<0) {
			System.out.println("Second is biggest value :");
		}else{
			System.out.println("Both Strings are equal");
		}System.out.println(first.compareTo(second));
	}
	}

public class Strings_Ex1 {
	public static void main(String[] args) {
		ToStringComparision Comparision = new ToStringComparision();
		Comparision.stringcomparision();
	}

}
