package com.humanresources.user.recursos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humanresources.user.entidades.User;
import com.humanresources.user.repositorios.UserRepositorio;

@RestController
@RequestMapping(value= "/users")
public class UserRecurso {
			
	@Autowired
	private UserRepositorio repository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){

		User f = repository.findById(id).get();
		return ResponseEntity.ok(f);
	}
	@GetMapping(value = "/search")
	public ResponseEntity<User> findById(@RequestParam String email){

		User f = repository.findByEmail(email);
		return ResponseEntity.ok(f);
	}
}
