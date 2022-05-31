package HashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import java.util.LinkedList;

public class HashsetEx1 {
	public static void main(String[] args) throws IOException {
		HashSet<ComDetails> hash = new HashSet<ComDetails>();
		LinkedList<ComDetails> link = new LinkedList<ComDetails>();
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String Choose;
		String id,name,phoneno,domain;
		ComDetails cd1 = new ComDetails("1","navya","9010814429","java");
		ComDetails cd2 = new ComDetails("2","ganesh","9010814429","java");
		ComDetails cd3 = new ComDetails("3","venu","9010814429","java");
		ComDetails cd4 = new ComDetails("4","kalyan","9010814429","java");
		hash.add(cd1);
		hash.add(cd2);
		hash.add(cd3);
		hash.add(cd4);
		link.addAll(hash);
		while (true) {
			System.out.println("choose the option:\n -->AddRecords(add).\n -->RemoveRecords(remove).\n -->UpdateRecord(update).\n -->DisplayRecord(display)");
			System.out.println("Enter the option");
			Choose = bfr.readLine();
			switch(Choose) {
			case "add":
				System.out.println();
			}
			
		}
	}
	

}
