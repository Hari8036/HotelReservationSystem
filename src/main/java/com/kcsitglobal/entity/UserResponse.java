package com.kcsitglobal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserResponse {

	private String token;
	private String note;

	public UserResponse(String token, String note) {
		super();
		this.token = token;
		this.note = note;
	}

	public UserResponse() {
		super();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
