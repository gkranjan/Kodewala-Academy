package com.practice.buffer.supportChat;

public class ChatHistory {

	public static void main(String[] args) {

		StringBuffer chat = new StringBuffer();
		
		//chat.insert(0,"Support Agent: Amit\n\n");
		
		chat.append("Customer: My payment failed.\n");
		chat.append("Agent: Please share transaction ID. \n");
		chat.append("Customer: TXN12345\n");
		chat.append("Agent: Your payment is under review.");
		
				// in Both condition output will be the same.put in the upper in program.
		
		//chat.insert(0,"Support Agent: Amit\n\n");
		
		System.out.println("======== CHAT HISTORY ======");
		System.out.println(chat);
		
		System.out.println("\nTotal Characters: " +chat.length());
	}

}
