package com.restservice;

public class Message {
	private long id;
	private String content;

	public Message() {
		super();
	}

	public Message(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
