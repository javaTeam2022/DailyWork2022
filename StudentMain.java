package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
class StudentDetails{
	String name;
	String idno;
	String branch;
	String phoneno;
	String year;
	public StudentDetails(String name, String idno, String branch, String phoneno, String year) {
		this.name = name;
		this.idno = idno;
		this.branch = branch;
		this.phoneno = phoneno;
		this.year = year;
	}
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", idno=" + idno + ", branch=" + branch + ", phoneno=" + phoneno + ", year="
				+ year + "]";
	}
	
}
public class StudentMain {

	public static void main(String[] args) {
		String name;
		String idno;
		String branch;
		String phoneno;
		String year;
		ArrayList<StudentDetails> alsd = new ArrayList<StudentDetails>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records you want enter:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Ente Id no:");
			idno = sc.next();
			System.out.println("Enter the Student name:");
			name = sc.next();
			System.out.println("Enter the Branch name:");
			branch = sc.next();
			System.out.println("Enter the Phone Number:");
			phoneno = sc.next();
			System.out.println("Enter the year:");
			year = sc.next();
			StudentDetails sds = new StudentDetails(name, idno, branch, phoneno, year);
			alsd.add(sds);
		}
		System.out.println("Student Details:");
		for (int j = 0; j < alsd.size(); j++) {
			System.out.println(alsd.get(j));
		}
	}
}