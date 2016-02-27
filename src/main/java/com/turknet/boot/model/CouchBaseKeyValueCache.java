package com.turknet.boot.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Document(expiry = 0)
public class CouchBaseKeyValueCache {
	
	@Id
	private String id; 

	@Field
	@NotNull
	private String key; 

	@Field
	@NotNull
	private Object value; 

	@Field
	private Date creationDate;
	@Field
	private Date updatedDate;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
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
	
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "CouchBaseKeyValueCache [id=" + id + ", key=" + key + ", value=" + value + ", creationDate="
				+ creationDate + ", updatedDate=" + updatedDate + "]";
	} 
	
	
}
