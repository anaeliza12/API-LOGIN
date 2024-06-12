package com.hacka.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hacka.demo.entities.Login;
import com.hacka.demo.functionalities.LoginFunctionalities;
import com.hacka.demo.service.LoginService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping(value = "/login")
public class LoginResource {

	@Autowired
	private LoginService service;

	@Autowired
	private LoginFunctionalities functionalities;

	@PostMapping(value = "/recoverPassword")
	public ResponseEntity<String> recoverPassword(@RequestBody String email, @RequestBody String password) {
		if (functionalities.recoverPassword(email, password) == false) {
			return ResponseEntity.notFound().build();

		} else
			return ResponseEntity.ok().body("Password recovered succesfully");

	}

	@PostMapping(value = "/auth")
	public ResponseEntity<Login> login(@RequestBody Login login) {
		ResponseEntity<Login> http = null;
		if (service.findLogin(login) == true) {


			http = ResponseEntity.ok().body(new Login("ex@gmail.con", "123", true));
		} else
			http = ResponseEntity.notFound().build();

		return http;

	}

}
