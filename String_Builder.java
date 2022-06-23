package strings_concepts;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
//		sb.append("Java");
//      System.out.println(sb);
//		sb.insert(1, "Java");
//		System.out.println(sb);
//		sb.replace(0,0,"java ");
//		System.out.println(sb);
//		sb.delete(0,2);
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Java is my favourite language");
		System.out.println(sb);
		 
		
	}

}
