package strings_concepts;

public class Strings_Methods {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "java";
		String s5 = "Hello World";
		String s3 = new String("Java");
		String s4 = new String("Java");
		// == operator it returns boolean values
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		// it will checks to the ASSCI values
		System.out.println(s2.compareTo(s1));
		// it will ignore the first letter.
		System.out.println(s1.compareToIgnoreCase(s2));
		// Both are equal it will true again it returns false.
		System.out.println(s1.equalsIgnoreCase(s2));
		// we can check the letters in small are capital.
		System.out.println(s1.startsWith("J"));
		// it check to index position.
		System.out.println(s1.startsWith("a", 3));
		System.out.println(s1.concat(" Is Awesome"));
		// to check the length
		System.out.println(s1.length());
		// endswith() method will check end of the character.
		System.out.println(s2.endsWith("a"));
		System.out.println(s1.charAt(2));
		// trim() spaces is not spacified
		if(s5.trim().length()>0) {
			System.out.println("No space will aquipied");
		}else {
			System.out.println("Aquipying the space");
		}
		
	}

}
