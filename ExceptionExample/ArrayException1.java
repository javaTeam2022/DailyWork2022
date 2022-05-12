package ExceptionExample;

public class ArrayException1 {
	public static void main(String[] args) {
		int a[]= new int[5];
		int a1=10,b =0, c;
		try {
			c=a1/b;
			System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println("hi"+e);
		}
		
		/*finally {
			try {
				System.out.println(a[6]);
			}catch(Exception e1) {
				System.out.println("hello"+e1);
				
			}
		
			System.out.println("Exception :");
		}*/
		
	
	}
}
