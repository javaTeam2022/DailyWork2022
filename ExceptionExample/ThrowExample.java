package ExceptionExample;
class ExpectionEx{
	int marks=350,total=1000;
	public void show() {
	try {
		if(total<=500) {
			System.out.println("your pass");
		}
		else {
			throw new UserDefindException("your fail");
		}
		
	}
	catch(UserDefindException ed){
		System.out.println(ed);
	}
	}
}
public class ThrowExample {
	
	public static void main(String[] args) {
		ExpectionEx ee = new ExpectionEx();
		ee.show();
	}


}
