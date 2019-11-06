package com.garage.Rest;

import org.springframework.http.HttpStatus;

/**
 *  Created by raz samari on 03.11.2019.
 */
public class MssageEroorRsponse {
	
	private HttpStatus status;
	
	private String message;
	
	private long timestamp;

	public MssageEroorRsponse(HttpStatus status, String message, long timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}
	
	public static MssageEroorRsponse now(HttpStatus status, String message) {
		return new MssageEroorRsponse(status,message,System.currentTimeMillis());
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}
