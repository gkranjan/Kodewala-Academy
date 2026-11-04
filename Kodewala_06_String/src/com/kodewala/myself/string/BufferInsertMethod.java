package com.kodewala.myself.string;

public class BufferInsertMethod {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("Welcome to ");
		sb.insert(10, "Kodewala!");
		
		System.out.println(sb); // pointed the 10 is insert string after that index.
	}

}
