package com.whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		MessageSerialization messageSerialization =new MessageSerialization();
		
		Message message =new Message("MSG1","mai abhi busy hu","USR01"); // this is the msg in file.
		
		messageSerialization.serializeMsg(message);
		
	}

}
