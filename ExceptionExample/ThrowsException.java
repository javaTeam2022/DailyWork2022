package ExceptionExample;
import java.io.*;

class Excep{
	public void Read() throws IOException{
	
	BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("enter what now you are thinking now");
	String s[]  = new String[3];
	String s1  = b.readLine();
	
		
}
}
public class ThrowsException {
	public static void main(String[] args) throws IOException{
	
		Excep em = new Excep();
		em.Read();
	}

}
