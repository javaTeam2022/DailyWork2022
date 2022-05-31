package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class EmpDetails {
public static void main(String[] args) {
	LinkedList<Employee> lle = new LinkedList<Employee>();
	Employee emp1 = new Employee(450,"Kalyan", "Developer");
	Employee emp2 = new Employee(457,"Venu", "Developer");
	Employee emp3 = new Employee(454,"Navya", "Developer");
	Employee emp4 = new Employee(453,"Ganesh", "Developer");
	Employee emp5 = new Employee(451,"Sai", "Developer");
	Employee emp6 = new Employee(455,"Kalyan", "Developer");
	
	lle.add(emp1);
	lle.add(emp2);
	lle.add(emp3);
	lle.add(emp4);
	lle.add(emp5);
	lle.add(emp6);
	System.out.println(lle);
	Iterator<Employee> ite = lle.descendingIterator();
	while (ite.hasNext()) {
		System.out.println(ite.next());
	}
}
}
