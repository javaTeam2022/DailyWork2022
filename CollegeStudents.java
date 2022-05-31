package CollectionFrameWork;

public class CollegeStudents {

	private int id;
	private String name;
	private String domain;
	
	public CollegeStudents(int id, String name,String domain) {
		this.id = id;
		this.name = name;
		this.domain=domain;
	}
	

	
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", domain=" + domain + "]";
	}	
}
