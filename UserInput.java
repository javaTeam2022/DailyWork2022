package vector;

public class UserInput {
	String name;
	int i=0;
	
	UserInput(String n){
		name=n;
	}

	@Override
	public String toString() {
		++i;
		return "[name=" + name + "]";
	}
	
}
