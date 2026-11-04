package com.kodewala.myself.string;

public class BufferCapacity {

	public static void main(String[] args) {

		
		StringBuffer sb=new StringBuffer();
		int capacity = sb.capacity();
		
		System.out.println("Initial capacity of string buffer is " +capacity); //16
		
		sb.append("Welcome to kodewala!!!!");
		
		System.out.println(sb.capacity());  //34
	}

}
