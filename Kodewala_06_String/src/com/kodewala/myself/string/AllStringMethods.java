package com.kodewala.myself.string;

public class AllStringMethods {

	public static void main(String[] args) {

		String s1="Kodewala";
		String s2="Kodewala";
		
		/**
		 * 		==> Length and Character Access.
		 * 
		 *   length()  => Return the length of the string
		 *   => How many character in the string. 
		 */
		
		//System.out.println(s1.length());  //Output 8
		
		
		/**
		 *   charAt(int index)  => Return the character at the specified index.
		 *   => Check character at that index.
		 */
		
		//System.out.println(s1.charAt(2));  //d
		
		
		/**
		 * 		==> String Comparison
		 * 
		 *  equals(Object obj)  => Compares the content of two string for equality. 
		 */
		
		//System.out.println(s1.equals(s2));  //True
		
		/**
		 *  equalsIgnoreCase()  => Compare two string,ignoring case.
		 */
		
//		String s3="Kodewala";
//		String s4="KODEWALA";
//		System.out.println(s3.equalsIgnoreCase(s4));  //True
		
		/**
		 * 	==>	Searching and Substrings.
		 * 
		 * indexOf(String str) => Returns the first occurrence index of a substring
		 */
		
//		System.out.println(s1.indexOf("w"));  // 4
//		System.out.println(s1.indexOf("m"));  // -1 if index is not found
		
		/**
		 * lastindexOf(String str)  => Return the last occurrence index of a substring
		 */
		
//		String s5="Kodewala Academy";
//		System.out.println(s5.lastIndexOf("a"));  // 11
		
		/**
		 * substring(int beginIndex)  => Retruns the substring from the specified index to the end. 
		 */
		
		//System.out.println(s1.substring(4));  // wala
		
		/**
		 * substring(int beginIndex , int endIndex)  => returns the substring from beginindex(inclusive) to endindex(exclusive)
		 */
		
		//System.out.println(s1.substring(0, 4));  // Kode
		
		
		/**
		 * 		==> String Modification
		 * 
		 * toUpperCase()  => Convert all characters to uppercase.
		 */
		
		//System.out.println(s1.toUpperCase());  //KODEWALA
		
		/**
		 * toLowerCase()  => convert all characters to lowercase.
		 */
		
//		String s6="KODEWALA";
//		System.out.println(s6.toLowerCase());  //kodewala
		
		/**
		 * trim()  => remove leading and trailing whitespace.
		 */
		
//		String s7= "   Kodewala   ";
//		System.out.println(s7.trim());   //Kodewala
		
		/**
		 * replace(char oldChar,char newChar)  => Replace all occurrences of a character with another character.
		 */
		
		//System.out.println(s1.replace('w', 'g'));  // Kodegala
		
		/**
		 *  	==> Splitting
		 * 
		 * spilt(String regex) => Splits the string into an array of substrings based on a delimiter.
		 */
		
//		String str="Kodewala ,Academy ,BTM,Bangalore";
//		String[] languages = str.split(",");  // splitting based on comma
//		
//		for(String lang : languages)
//		{
//			System.out.println(lang);
//		}
		
		/**
		 * 		==> Checking String content
		 * 
		 * contains(CharSequence s)  => Checks if the string contains a specific sequence.
		 */
		
//		String s8="Kodewala Academy";
//		System.out.println(s8.contains("Academy"));   //true
		
		/**
		 * startWith(String prefix) => Checks if the string with a specified prefix.
		 */
		String s9="Kodewala Academy";
//		System.out.println(s9.startsWith("Kode"));  // True

		/**
		 * endWith(String suffix) => Checks if the string ends with a specified suffix
		 */
		
		//System.out.println(s9.endsWith("Academy")); // True 
		
		/**
		 * 		==> Conversions
		 * 
		 * toCharArray() => Convert the string to a character array.
		 */
		
//		String s10="Kodewala";
//		char[] chars =s10.toCharArray();
//		for(char c:chars)
//		{
//			System.out.print(c+ " ");  // K o d e w a l a
//		}
		
		
		/**
		 * 		==> String Concatenation 
		 * 
		 * Using the + operator ==> most used used way to concatenate strings
		 */
		
		String s11="Kodewala ";
		String s12="Academy";
//		
//		String s13=s11+s12;
//		
//		System.out.println(s13);
		
		/**
		 * using concat() method => concatenates the specified string to the end of the current string
		 */
		
		String result= s11.concat(s12);
		System.out.println(result);  // Kodewala Academy
			
		
	}

}
