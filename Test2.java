package strings_concepts;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int a;
		int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Add :"+(a+b));
        System.out.println("Sub :"+(a-b));
        System.out.println("Mul :"+(a*b));
        System.out.println("Div :"+(a/b));
	}

}
