package com.turknet.boot.model;
 
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="test")
public class ApplicationLog {

	@Id 
	private String applicationLogId; 
	@Field
	private String severity; 
	@Field
	private String message; 
	@Field
	private String detail; 
	@Field
	private Date creationDate;
	@Field
	private Date updatedDate;
	
	public ApplicationLog()
	{ }
	
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getApplicationLogId() {
		return applicationLogId;
	}

	public void setApplicationLogId(String applicationLogId) {
		this.applicationLogId = applicationLogId;
	} 

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "ApplicationLog [applicationLogId=" + applicationLogId + ", severity=" + severity + ", message="
				+ message + ", detail=" + detail + ", creationDate=" + creationDate + ", updatedDate=" + updatedDate
				+ "]";
	} 
	
}
