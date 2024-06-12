package com.hacka.demo.token;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hacka.demo.entities.Login;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {

	private Integer expiration = 60000;

	public String genetareToken(Login login) {

		return null;
	}
}
