package com.banregio.aura.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Error model
 * 
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	/**
	 * Contains the status identifier for transaction
	 */
	private int statusId;

	/**
	 * Identify a code generated in the transaction flow
	 */
	private String code;

	/**
	 * Identify the message resulted in the transaction flow
	 */
	private String message;

	/**
	 * Identify the exception generated in the transaction flow, null value when the transaction is clean
	 */
	private String exception;

	/**
	 * Identify the success for the transaction
	 */
	private boolean success;

	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}
