package ExceptionExample;

public class StringExample {
	public static void main(String[] args) {
		String name1 = "Navya";
		String name2 = "Gundapuneni";
		String name3 = "Java Team";
		String name4 = "8 members";
		String name5 = "LOGIN";
		System.out.println(name1==name2);//== equals method return to the true are false.
		System.out.println(name2.length());// length of the String.
		System.out.println(name3.hashCode());//hasCode it returns to the code.
		System.out.println(name4.toUpperCase());//given string is converted into upperCase.
		System.out.println(name5.toLowerCase());//given string is converted into lowerCase.
		System.out.println(name1.charAt(2));//charAt to checks to the character with index position.
		System.out.println(name2.compareTo(name3));//compare to return to the values.
		System.out.println(name4.compareToIgnoreCase(name2));
		System.out.println(name2.startsWith("v"));//given string StartsWith.
		System.out.println(name5.endsWith("N"));//given String endsWith.
		System.out.println(name2.substring(5));//subString method checks to the index Position.
		System.out.println(name3.trim());//spaces it is not required.
		
	}

}
