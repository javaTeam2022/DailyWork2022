package vector;

import java.util.Stack;

public class Task_program_Ex1 {
public static void main(String[] args) {
	Stack<Integer> element = new Stack();
	element.add(101);
	element.add(102);
	element.add(103);
	element.add(104);
	element.add(105);
	System.out.println("Elements :"+element);
	System.out.println(element.peek());//peek()will be called in the index order.
	System.out.println(element);
	System.out.println(element.pop());//pop()method will remove the data
	System.out.println(element);
	System.out.println(element.pop());
	System.out.println(element);
	System.out.println(element.push(106));
	System.out.println(element);
	System.out.println(element.push(107));//push the elements 
	System.out.println(element);
}
}
/*
 Stack :

The stack is a linear data structure. This is based on LIFO(Last in First Out), In addition to the basic push and pop operation.
the class provides some more functions of empty,search, and peek .The class can also be called as extend vector.


The class supports one default constructor Stack() which is used to create empty stack.


Let's see how stack works

We have two most operations they are Push and Pop 
push - it inserts the element- it inserts next to the element in the stack
pop - it removes the element -  it removes the element from the top of the stack.*/
