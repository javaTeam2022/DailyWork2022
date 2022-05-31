package CollectionFrameWork;
//A class that can handle any type of data is know as generic class.
class Generic <T>{
	
	T x,y;
	void getData(T x,T y) {
		this.x=x;
		this.y=y;
	}
	void showData() {
		
		System.out.println(x);
		System.out.println(y);
	}
}
public class GenericsEx {

	public static void main(String[] args) {
		 
		Generic<String> ge = new Generic();// String Type
		ge.getData("Venu","Ganesh");
		ge.showData();
		Generic<Integer> geint = new Generic();
		geint.getData(55, 79);
		geint.showData();
	}
}
