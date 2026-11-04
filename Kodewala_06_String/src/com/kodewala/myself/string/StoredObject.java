package com.kodewala.myself.string;

public class StoredObject {

	public static void main(String[] args) {

		String s1="Java";  //SCP =1
		String s2=new String("Java");  //Heap =1
		
		String s3=s2.intern(); //SCP =0 (Reuse it)
		String s4="Java"; //SCP =0 (Reuse it)
		
		String s5=new String("JavaScript").intern();  //Heap + SCP = 2
		
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s5=="JavaScript");
		
		//Total 4 object created.
		
	}

}
