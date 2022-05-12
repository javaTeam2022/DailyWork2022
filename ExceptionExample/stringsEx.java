package ExceptionExample;

public class stringsEx {
	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Navya");
		sb.append("Gundapuneni");
		System.out.println(sb);
		sb.insert(5,'@');
		System.out.println(sb);
		sb.replace(0, 5,"Srinivasrao");
		System.out.println(sb);
		sb.delete(8,11);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.charAt(4);
		System.out.println(sb);
	}

}
