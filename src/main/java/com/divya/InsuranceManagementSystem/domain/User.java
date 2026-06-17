package com.divya.InsuranceManagementSystem.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String username;
	@Column(unique = true)
	private String password;

	private static User user;

	public User() {}

	public static User getUserInstance() {
		if (user == null) user = new User();
		return user;
	}

	public static User cloneUser(User u) {
		user.setUsername(u.getUsername());
		user.setPassword(u.getPassword());
		return user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
