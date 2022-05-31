package CollectionFrameWork;

public class PersonDetails {

	private String name;
	private long mobileno;
	private String address;
	
	public PersonDetails(String name,long mobileno,String address) {
           
		this.name=name;
		this.mobileno = mobileno;
		this.address = address;  
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", mobileno=" + mobileno + ", address=" + address + "]";
	}
	
	
}
