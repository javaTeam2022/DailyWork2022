package ExceptionExample;

public class ExceptionExa {
	public static void main(String[] args) {
		int balance=10000,amount=10001;
		try {
			if(amount<=balance) {
				System.out.println("please collect your cash");
			}
			else {
				throw new Exception("insufficiat Balance");
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
