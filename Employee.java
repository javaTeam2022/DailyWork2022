package linkedList;
public class Employee {

	int eid;
	String ename;
	String eroll;
	public Employee(int eid, String ename,String eroll){
		this.eid = eid;
		this.ename = ename;
		this.eroll = eroll;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEroll() {
		return eroll;
	}

	public void setEroll(String eroll) {
		this.eroll = eroll;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eroll=" + eroll + "]";
	}
	
}

