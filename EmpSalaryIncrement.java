package CollectionFrameWork;
import java.util.List;
import java.util.stream.Collectors;
import java.util.LinkedList;
public class EmpSalaryIncrement {

	public static void main(String[] args) {
		
		List<Employee> ls = new LinkedList();
		Employee e1 = new Employee("abc", 26, 15000.00);
		Employee e2 = new Employee("def", 25, 18000.00);
		Employee e3 = new Employee("ijk", 27, 17000.00);
		Employee e4 = new Employee("lmn", 24, 16000.00);
		Employee e5 = new Employee("opq", 23, 19000.00);
		
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		ls.add(e4);
		ls.add(e5);
		
		System.out.println("Original Salaries");
		System.out.println(ls);
		
	    List<Employee> IncrementSalary = ls.stream().map( e ->{
	    	if(e.getSalary() >= 15000) {
	    		e.setSalary(e.getSalary() * 1.10);
	    	}
	    	return e;
	    }).collect(Collectors.toList());
		
	    System.out.println("Incremet Salaries");
		System.out.println(IncrementSalary);
	}
}
