package com.hacka.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacka.demo.entities.Register;
import com.hacka.demo.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository repository;

	public List<Register> findAll() {
		return repository.findAll();
	}

	public Register findById(Integer id) {
		return repository.findById(id).get();
	}

	public boolean insert(Register register) {
		if (register.getConfirmPassword().equalsIgnoreCase(register.getPassword())) {
			repository.save(register);
			return true;

		} else
			return false;

	}

}
