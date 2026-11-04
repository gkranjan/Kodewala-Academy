package com.whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String messageId;
	private String message;
	
	private transient String userId; // will be skipped during serialization.
	
	
	public Message(String userId) {
		super();
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	
	public Message(String messageId, String message ,String userId) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.userId=userId;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
