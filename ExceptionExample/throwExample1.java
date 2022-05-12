package ExceptionExample;
class Throw{
	public void validate(int num) {
		try {
		if(num>1) {
			System.out.println("square "+ num+ "is"+(num*num));
		}
		else {
		
			throw new ArithmeticException("cannot calculate square");
			
		}
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	System.out.println("hello");
		
	}
}

public class throwExample1 {
	public static void main(String[] args) {
		Throw t = new Throw();
		t.validate(0);
		
	}

}
