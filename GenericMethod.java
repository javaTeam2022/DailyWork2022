package CollectionFrameWork;
// We can create generic method that can accept any type of arguments.
class GenMethod{
	<T> void genericMethod(T x,T y) {
		
		System.out.println(x);
		System.out.println(y);
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		GenMethod gm = new GenMethod();
		gm.genericMethod("Venu", 8.9f);
	}
}

