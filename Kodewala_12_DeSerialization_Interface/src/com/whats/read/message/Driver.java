package com.whats.read.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.whatsapp.message.Message;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// give file path loaction and use last point to file name.
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\gauta\\OneDrive\\Desktop\\Kodewala\\All_Java_Files\\Class-Data\\Eclipse\\Workspace\\Kodewala_11_Serialization_Interface\\message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Message message = (Message) ois.readObject(); // here used Down-Casting.

		// System.out.println("De Ser : "+message.getMessage()); // i write before the
		// transit use.

		/**
		 * its used de-serialized ,give the null values in runtime.for used in transact.
		 */
		System.out.println("De Ser : " + message.getMessage() + " and user id " + message.getUserId());

	} 

}
