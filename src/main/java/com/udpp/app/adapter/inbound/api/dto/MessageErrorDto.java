package com.udpp.app.adapter.inbound.api.dto;

import java.util.Date;

/// The Message error (Data transfer object).
/// @since 1.0
/// @author Claudiomildo Ventura.
public final class MessageErrorDto {
	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;

	public MessageErrorDto(int statusCode, Date timestamp, String message, String description) {
		this.statusCode = statusCode;
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}
}