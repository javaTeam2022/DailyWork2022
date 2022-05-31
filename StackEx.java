package CollectionFrameWork;
import java.util.Stack;
//Stack follow a rule is called LIFO(Last in first out) to and retrive elements.
//it allwos the duplicates,it maintais the insertion order.
//push,pop and search are common operations can be done on stack.
// it contai methods such as push,pop,peek,search and empty.
public class StackEx {

	public static void main(String[] args) {
		
		Stack<Integer> stackint = new Stack();
		
		stackint.push(870);
		stackint.push(871);
		stackint.push(872);
		stackint.push(873);
		stackint.push(874);
		stackint.push(875);
		stackint.push(876);
		stackint.push(877);
		stackint.push(878);
		System.out.println(stackint);
		
		stackint.pop();// it remove the last element of object
		System.out.println(stackint);
	
		System.out.println(stackint.empty());// checks the object is empty or not  
		System.out.println(stackint.search(870)); // Returns the 1-based position where an object is on this stack.
		System.out.println(stackint.peek());
		System.out.println(stackint);//Looks at the object at the top of this stack without removing it from the stack.
	}
}
