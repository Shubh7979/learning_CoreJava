package loops;

public class StringFunctions {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str3 = "    Java programming    ";
		String str2 = new String("Advance Java Program");
		
		System.out.println(str1);
		System.out.println(str2);
		
		//Concatenation using + operator
		String result = str1 +": "+ str2;
		System.out.println(result);
		
		//Concat
		System.out.println("concat: "+str2.concat(str1));
		//Length 
		int len = str1.length();
		System.out.println("Length of String: " + len);

		//any one character
		System.out.println("One character is visible : " + str1.charAt(5));
		
		//Substring
		System.out.println("substring: " + str1.substring(5));

		System.out.println("substring: " + str2.subSequence(2, 7));
		System.out.println("substring: " + str2.substring(2, 7));
		
		//Uppercase
		System.out.println("Uppercase: "+ str1.toUpperCase());

		//lowercase
		System.out.println("Uppercase: "+ str1.toLowerCase());
		
		//Check content in string
		System.out.println("Contain is : " + str1.contains("Pro"));
		System.out.println("Contain is : " + str1.contains("pro"));
		
		//check indexing value
		System.out.println("element of " + str1.indexOf('P'));
		System.out.println("element of " + str1.indexOf("ing"));
		
		//Replace the string
		System.out.println("Replace: "+ str1.replace('v', 'y'));
		System.out.println("Replace: "+ str1.replace("Pro","noob"));
		
		//compare
		System.out.println("Equal or not: " + str1.equals(str2));
		System.out.println("Equal or not: " + str1.equals(str3));
		
		System.out.println("Equal ignore case: " + str1.equalsIgnoreCase(str3));
		
		//trim
		System.out.println(str3);
		System.out.println("trim: "+str3.trim());
		
		//Reverse a string
		StringBuilder s = new StringBuilder(str1);
		System.out.println("Reverse: "+ s.reverse());
		
		String rev ="";
		for (int i = str2.length()-1;i>=0;i--) {
			rev = rev+str2.charAt(i);
		}
		System.out.println("reverse with loop: "+rev);
		
		//Append
		StringBuilder s2 = new StringBuilder(str1);

		System.out.println("append: "+ s2.append(str2));
		System.out.println("append: "+ s2.append(" hello"));

	} 
	
} 