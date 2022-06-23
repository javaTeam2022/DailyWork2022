package strings_concepts;

public class String_Buffer {

	public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Java is Awesome");
    //Insert the element in index position.
    sb.insert(0,"Good Morning ");
    System.out.println(sb);
    //if you are using in substring()for index position after will be continue.
    System.out.println(sb.substring(8));
    //substring()for index position then returns the middile values.
    System.out.println(sb.substring(0, 4));
    sb.append(" Hello World");
    System.out.println(sb);
    //find the characters for index position.
    System.out.println( sb.charAt(0));
    //the length of an string.
    System.out.println( sb.length());
    System.out.println(sb);
    
	}

}
