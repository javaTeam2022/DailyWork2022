package ExceptionExample;

public class ArrayExeption {
	public static void main(String[] args) {
		try {
		int a[]= new int[5];
		System.out.println(a[6]);
		}
		catch(Exception e){
			System.out.println("Hi\n"+e);
			
		}
		System.out.println("out side the block");
	}

}
