package Strings;
/*
  - String is sequence of characters or group of characters
  - In java String class is Immutable (immutable means unchanged);
  - Strings are 2 types Mutable and Immtable.
  - strings we can create 2 ways reference variable(literals) and create object to string.
  - literals store in String constant pool(String constant pool is memory area of jvm) and string object store in heap memory it is out of the constant pool
  - Everytime when ever we create a string literal, the JVM checks "string constant pool" first.
  - If the string already exists in the SCP , a refernce to the pooled instance is returned.
  - If the string is not exists in the SCP, a new string instance created and it is placed in the pool.
  
 */
public class StringEx {
public static void main(String[] args) {
	
	// Declarating of String literls
	String str = "chicken biryani";
	String str2 = "chicken biryani";
   
	// here created 2 string with same charachters but inside SCP it will not create saparete memorey for string str2 .
	// inside SCP str and str2 point out the same memorey location because strings of charecters are same.
	
	System.out.println(str.hashCode());//3615926
	System.out.println(str2.hashCode());//3615926
	System.out.println(str == str2);// ture here "==" operetor copares the hashcode of the 2 strings
	System.out.println(str.equals(str2));//true equals() method coparese the content of the two strings  
	
	/* compareTo() method compares two strings lexicographically based on ASCII values.
	   if str > str2 returns +ve value.
	      str < str2 returns -ve value.
	      str == str2 returns Zero.
	*/
	System.out.println(str.compareTo(str2));//0 
	
	str2 = "veg biryani";// here create a new memorey for str2
	
	System.out.println(str2.hashCode());// 1612659258 
	System.out.println(str == str2);// false hashcode of the two string are not equals
	System.out.println(str.equals(str2));// false
	System.out.println(str.compareTo(str2));//-19
	System.out.println(str2.length());//11  (including spaces)
	System.out.println(str2.charAt(2));//9
	
	String str3 = "chicken biryani";
	// here String str3 wont create another memorey because str and str3 contant is same.
	// str3 refernce variable pointing to str1 memorey location so str3 have same hashcode of str1.
	System.out.println(str == str3);// true
	System.out.println(str.equals(str3));// true
	System.out.println(str.compareTo(str3));// 0
	
	 // Declarating of String objects
		String str4 = new String("tandoori");
		String str5 = new String(str4);
		System.out.println(str4==str5);// false
		System.out.println(str4.equals(str5));//true
		System.out.println(str4.compareTo(str5));//0
		
		String str6 = new String("butter naan");
		
		System.out.println(str5==str6);// false
		System.out.println(str5.hashCode());//-1756315933
		System.out.println(str6.hashCode());//-1988361408
		System.out.println(str5.equals(str6));//false
		System.out.println(str5.compareTo(str6));//1
}
}

