package strings_concepts;
class Parent{
	void parentClass() {
		System.out.println("Parent class");
	}
	
}
class Child extends Parent{
	void childClass() {
		System.out.println("Child Class");
	}
}

public class SignalInheritance {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.parentClass();
		obj.childClass();
	}
}
