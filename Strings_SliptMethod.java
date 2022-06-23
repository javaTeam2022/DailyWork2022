package strings_concepts;

public class Strings_SliptMethod {
	 int slNo ;
     long AcNo;
     String Name;
     String Mobile_No;
     String Address ;
     
	public Strings_SliptMethod(int slNo, long acNo, String name, String mobile_No, String address) {
		this.slNo = slNo;
		this.AcNo = acNo;
		this.Name = name;
		this.Mobile_No = mobile_No;
		this.Address = address;
	}
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public long getAcNo() {
		return AcNo;
	}
	public void setAcNo(long acNo) {
		AcNo = acNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Strings_SliptMethod [slNo=" + slNo + ", AcNo=" + AcNo + ", Name=" + Name + ", Mobile_No=" + Mobile_No
				+ ", Address=" + Address + "]";
	}
     
	   }
