package com.tcs.m3;

import java.util.Date;

public class ErrorDetails {
	private Date timestamp;
	private String message;

	public ErrorDetails(Date timestamp, String message) {
		super();
		this.timestamp = timestamp;
		this.message = message;
	}
}