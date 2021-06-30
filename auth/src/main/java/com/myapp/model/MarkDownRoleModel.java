package com.myapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Document(collection = "roles")
@EqualsAndHashCode(callSuper = true)
public class MarkDownRoleModel extends GenericModel {
	private String role;

	public MarkDownRoleModel(String role) {
		super();
		this.role = role;
	}

	@Override
	public String toString() {
		return "MarkDownRoleModel [" + (role != null ? "role=" + role : "") + "]";
	}

}
