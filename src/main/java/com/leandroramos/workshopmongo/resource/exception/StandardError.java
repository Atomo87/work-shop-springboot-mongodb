package com.leandroramos.workshopmongo.resource.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	private long timestamp;
	private Integer status;
	private String error;
	private String path;
	private String mensage;
	
	public StandardError() {
		
	}

	public StandardError(long timestamp, Integer status, String error, String mensage,String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.path = path;
		this.mensage = mensage;
	}

	public long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getMensage() {
		return mensage;
	}
	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

}
