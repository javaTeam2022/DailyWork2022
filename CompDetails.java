package hashSet;

public class CompDetails {
	String id;
	String name;
	String phoneno;
	String domain;
	public CompDetails() {
		
	}
	public CompDetails(String id, String name, String phoneno, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.domain = domain;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", domain=" + domain + "]";
	}

}
