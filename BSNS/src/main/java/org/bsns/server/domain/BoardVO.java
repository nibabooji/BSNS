package org.bsns.server.domain;

import java.util.Date;

public class BoardVO {

	private Integer number;
	
	private String type;
	
	private String email;
	
	private String content;
	
	private Date date;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BoardVO [number=" + number + ", type=" + type + ", email="
				+ email + ", content=" + content + ", date=" + date + "]";
	}
	
	
	
}
