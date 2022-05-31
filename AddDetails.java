package linkedList;

public class AddDetails {
	String uname;
	long uphoneno;
	String uadd;
	public AddDetails(String uname,long uphoneno, String uadd) {
		this.uname=uname;
		this.uphoneno=uphoneno;
		this.uadd=uadd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public long getUphoneno() {
		return uphoneno;
	}
	public void setUphoneno(long uphoneno) {
		this.uphoneno = uphoneno;
	}
	public String getUadd() {
		return uadd;
	}
	public void setUadd(String uadd) {
		this.uadd = uadd;
	}
	@Override
	public String toString() {
		return "[uname=" + uname + ", uphoneno=" + uphoneno + ", uadd=" + uadd + "]";
	}
	
	
}
