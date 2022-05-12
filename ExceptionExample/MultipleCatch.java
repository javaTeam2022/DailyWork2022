package ExceptionExample;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[]= new int[10];
			System.out.println("Divided by:"+a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs\n"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExceptionOccurs\n"+e);
		}
		catch(Exception e) {
			System.out.println("Parent Exception Occurs\n"+e);
		}
		System.out.println("continee");
	}

}
