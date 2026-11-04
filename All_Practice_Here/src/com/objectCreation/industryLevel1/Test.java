package com.objectCreation.industryLevel1;

class Cons3 extends Cons2{
	 Cons3(){
		 super();
		 System.out.println("Cons3 ");
	 }
	 
	 void m3() {
		 System.out.println("Cons2 - m ");
	 }
	 void m4() {
		 System.out.println("Cons2 - m ");
	 }
	 void m5() {
		 System.out.println("Cons2 - m ");
	 }
	 void m6() {
		 System.out.println("Cons2 - m ");
	 }
	 
}



class Cons2 extends Object{
	 Cons2(){
		 super();
		 System.out.println("Cons2 ");
		 
	 }
	 
	 void m3() {
		 System.out.println("Cons2 - m ");
	 }
	 
}


class Cons1 extends Cons3{
	 
	Cons1(){
		 super();
		 System.out.println("Cons1");
		 
	 }
	 void m1() {
		 System.out.println("Cons1 - m ");
	 }
}

class Hello
{
	Hello()
	{
		super();
		System.out.println("Cons Hello ");
	}
	
	static void m2() {
		 System.out.println("Main - m ");
	 }
	
	
	public static void main(String[] args)
	{
		
				
		new Cons3();
		Hello.m2();
		//System.out.println("Hello Worlds!!!");
	}
}