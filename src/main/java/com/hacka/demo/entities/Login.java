package com.hacka.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String email;
	private String password;
	private Boolean isLogged;

	public Login() {

	}

	public Login(String email, String password, Boolean isLogged) {
		this.email = email;
		this.password = password;
		this.isLogged = isLogged;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsLogged() {
		return isLogged;
	}

	public void setIsLogged(Boolean isLogged) {
		this.isLogged = isLogged;
	}

}
