package com.hacka.demo.functionalities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hacka.demo.entities.Login;
import com.hacka.demo.service.LoginService;

public class LoginFunctionalities {

	@Autowired
	private LoginService service;

	public boolean recoverPassword(String email, String password) {
		boolean verify = false;
		List<Login> logins = service.findAll();
		for (Login l : logins) {
			if (l.getEmail().equalsIgnoreCase(email)) {
				l.setPassword(password);
				verify = true;
				break;
			}

		}
		return verify;

	}

	public boolean changeEmail(String newEmail, String oldEmail) {
		boolean verify = false;
		List<Login> logins = service.findAll();
		for (Login l : logins) {
			if (l.getEmail().equalsIgnoreCase(oldEmail)) {
				l.setEmail(newEmail);
				verify = true;
				break;
			}

		}
		return verify;

	}

}
