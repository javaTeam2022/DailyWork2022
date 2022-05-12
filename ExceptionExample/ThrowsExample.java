package ExceptionExample;
import java.io.*;
interface IntermediateExams{
	public void MPC();
	public void BIPC();
	public void MEC();
}
class Intermediate implements IntermediateExams{
	public void Exams()throws IOException {
		BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Intermediate Borad Exams");
		String MPC,BIPC,MEC;
		System.out.println("Groups\nMPC\nBIPC\nMEC");
		System.out.println("enter any key");
		String s[]  = new String[3];
		String s1  = dr.readLine();
		
	}
	public void MPC() {
		int i=1;
		String Subjects;
		System.out.println("MPC subjects Are\nMathematics\nPhysics\nchemistry\nSanskrit\nEnglish");
		
		
	}
	public void BIPC() {
		int i=1;
		String Subjects;
		System.out.println("MPC subjects Are\nBiology\nZoology\nPhysics\nchemistry\nSanskrit\nEnglish");
			
	}
	public void MEC(){
		int i=1;
		String Subjects;
		System.out.println("MPC subjects Are\nMathematics\nEconomics\nchemistry\nSanskrit\nEnglish");
		
		
	}
}

public class ThrowsExample {
	public static void main(String[] args)throws IOException {
		Intermediate i = new Intermediate();
		i.Exams();
		i.MPC();
		i.BIPC();
		i.MEC();
	}

}
