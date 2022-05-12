package ExceptionExample;

public class NestedTryBlock {
	public static void main(String[] args) {
		int a=20,b=0,c;
		
		try {
			int a1=20,b1=10,c1;
			c1=a1+b1;
			System.out.println("Addition \n"+c1);
			try {
				c=a/b;
				System.out.println("divided by 0"+c);
			}
			catch(ArithmeticException e) {
				System.out.println("Airthmetic Exception\n"+e);
				
			}
			try {
				int x[] = new int[5];
				System.out.println("Array"+x[5]);
			}
			catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("ArrayIndexOutOfBounds\n"+e1);
			}
		}
		catch(Exception e2) {
			System.out.println("out side the block"+e2);
		}
	}

}
