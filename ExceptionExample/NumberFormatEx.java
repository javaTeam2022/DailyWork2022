package ExceptionExample;

public class NumberFormatEx {
	public static void main(String[] args) {
		try {
		int a=Integer.parseInt("Helloe");
		
		}catch(NumberFormatException Num) {
			System.out.println("continue\n"+Num);
		}
	}

}
