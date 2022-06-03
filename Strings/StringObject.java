package Strings;

public class StringObject {

	public static void main(String[] args) {
		
		String color = "black";
		// here creating a object of strings
		String color2 = new String ("black");
		String color3 = new String ("black");
		System.out.println(color == color2); // false
		System.out.println(color2 == color3);// false
		System.out.println(color.equals(color2));//ture
		System.out.println(color.compareTo(color2));//0
		
		String color4 = new String("red");
		System.out.println(color3 == color4); // false
		System.out.println(color == color4);// false
		System.out.println(color3.equals(color4));//false
		System.out.println(color3.compareTo(color4));//-16
		/*
		 in scenario we creating object for two string and memory will create in heap area 
		 in String objects "==" operater will return flase because content is same but hacode is different
		 */
		System.out.println(color.hashCode());
		System.out.println(color2.hashCode());
		System.out.println(color == color2);
	}
}
