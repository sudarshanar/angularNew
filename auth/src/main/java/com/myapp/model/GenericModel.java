package com.myapp.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;

import lombok.Data;

@Data
public class GenericModel implements Serializable, Persistable<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@CreatedDate
	private String createdAt;
	@LastModifiedDate
	private String updatedAt;

	public GenericModel() {
		this.id=UUID.randomUUID().toString();
	}

	public GenericModel(String id, String createdAt, String updatedAt) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "GenericModel [id=" + id + ", createdBy=" + createdAt + ", updatedBy=" + updatedAt + "]";
	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return this.createdAt != null ? true : false;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
