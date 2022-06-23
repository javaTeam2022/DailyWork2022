package strings_concepts;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Strings_SliptMethod1 {

	public static void main(String[] args) {
		Strings_SliptMethod ss1 = new Strings_SliptMethod(101,784356864,"Ganesh","87326476","kondapur");
		System.out.println(ss1);
    	Scanner sc = new Scanner(System.in);
		String s2,s3;
        System.out.println("Enter first name :");
        s2=sc.nextLine();
        System.out.println("Enter second name :");
        s3=sc.nextLine();
        if (s2.compareTo(s3)>0) {
			System.out.println("First is Biggest number");
		} if (s2.compareTo(s3)<0) {
			System.out.println("Second is Biggest number");
		}System.out.println("Values :"+s2.compareTo(s3));
		System.out.println("===============");
		  //tokens are legacy class before 1.2 version
//        StringTokenizer token = new StringTokenizer("Ganesh,Venu,kalyan,Navya");
//        while (token.hasMoreTokens()) {
//			System.out.println(token.nextToken(",")); 
//		}
        //split() using the spaces.
        String s1="Java Is Awesome";
        String a[]=s1.split(" ");
        for (String yes : a) {
			System.out.println(yes);
		}
	}

}
