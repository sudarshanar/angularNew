package com.myapp.model;

import java.util.List;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Document(collection = "users")
@EqualsAndHashCode(callSuper = true)
public class MarkDownUserModel extends GenericModel {
	@Indexed(direction=IndexDirection.DESCENDING, unique=true)
	private String userName;
	private String password;
	private String jwtToken;
	private String displayName;
	private List<String> roles;

	public MarkDownUserModel(String userName, String password, String jwtToken, String displayName,
			List<String> roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.jwtToken = jwtToken;
		this.displayName = displayName;
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "MarkDownUserModel [" + (userName != null ? "userName=" + userName + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (jwtToken != null ? "jwtToken=" + jwtToken + ", " : "")
				+ (displayName != null ? "displayName=" + displayName + ", " : "")
				+ (roles != null ? "roles=" + roles : "") + "]";
	}
}
