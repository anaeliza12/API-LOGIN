package com.hacka.demo.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hacka.demo.entities.Login;
import com.hacka.demo.functionalities.LoginFunctionalities;
import com.hacka.demo.service.LoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginResource {

	@Autowired
	private LoginService service;

	@Autowired
	private LoginFunctionalities functionalities;

	@PostMapping
	public ResponseEntity<Void> recoverPassword(@RequestBody String email, @RequestBody String password) {
		if (functionalities.recoverPassword(email, password) == false) {
			return ResponseEntity.notFound().build();

		} else
			return ResponseEntity.ok().build();

	}

	@PostMapping
	public ResponseEntity<Void> login(@RequestBody Login login) {
		ResponseEntity<Void> http = null;
		if (service.findLogin(login) == true)
			http = ResponseEntity.ok().build();

		return http;

	}

}
