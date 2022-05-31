package set_Interface;

public class HashSet_RealTimeEx1 {
		String id;
		String name;
		String mobile_Num;
		String domain;
		public HashSet_RealTimeEx1(String id, String name, String mobile_Num, String domain)
		{
			this.id=id;
			this.name = name;
			this.mobile_Num = mobile_Num;
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


		public String getMobile_Num() {
			return mobile_Num;
		}


		public void setMobile_Num(String mobile_Num) {
			this.mobile_Num = mobile_Num;
		}


		public String getDomain() {
			return domain;
		}


		public void setDomain(String domain) {
			this.domain = domain;
		}


		@Override
		public String toString() {
			return "[id=" + id + ", name=" + name + ", mobile_Num=" + mobile_Num + ", domain=" + domain
					+ "]";
		}
	  
	}
