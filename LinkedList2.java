package LinkedList;

public class LinkedList2 {
	int rollNo,age;
	String name,Class;
	public LinkedList2(int rollNo,String name,int age,String Class) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.Class = Class;
	}
	@Override
	public String toString() {
		return "LinkedList2 [rollNo=" + rollNo + ", name=" + name + ",, age=\" + age + \" Class=" + Class + "]";
	}
	
	
}
