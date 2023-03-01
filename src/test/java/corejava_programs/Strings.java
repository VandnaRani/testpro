package corejava_programs;

public class Strings {

	public static void main(String[] args) {

String f =" Hi All,My Name Is Vandna";
System.out.println(f);

String e = "My Name is VanDNA";
System.out.println(e);

//UpperCase

System.out.println(e.toUpperCase());
// lower case

System.out.println(e.toLowerCase());
//Length
		String h = "Hi All";
		System.out.println(h.length());
		
		// Get  the third Index
		System.out.println(h.charAt(4));
		
 String i = "Apple";
 String j = "apple";
 
 // check two String are Equal or not
 
 if (i.equals(j)) {
	 System.out.println(" Both are matching");
	 
 }else {
	 System.out.println(" Both are not Equals");
 }
 
 // Equal Ignore method:  While compare two string it will avoid the case sensitive
 if (i.equalsIgnoreCase(j)) {
	 System.out.println(" Both are Matching");
 }
 else {
	 System.out.println(" Both are not Maching");
 }
  // check the Given word/statement/char is available in a string
 String K = "Vandna is living in USA";
 if(K.contains("USA")) {
	 System.out.println("Given word is available");
 } else {
	 System.out.println(" Givem word is not available");
 }
}
	
}