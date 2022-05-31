package linkedHashSet;

public class Details {
	String uname;
	String uqualification;
	String udob;
	String uphoneno;
	String uadd;
	public Details(String uname, String uqualification, String udob, String uphoneno, String uadd) {
		super();
		this.uname = uname;
		this.uqualification = uqualification;
		this.udob = udob;
		this.uphoneno = uphoneno;
		this.uadd = uadd;
	}
	@Override
	public String toString() {
		return "[uname=" + uname + ", uqualification=" + uqualification + ", udob=" + udob + ", uphoneno="
				+ uphoneno + ", uadd=" + uadd + "]";
	}
	

}
