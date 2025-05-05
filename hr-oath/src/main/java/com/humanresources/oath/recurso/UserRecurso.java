package com.humanresources.oath.recurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humanresources.oath.entidades.User;
import com.humanresources.oath.servico.UserServico;

@RestController
@RequestMapping(value = "/users")
public class UserRecurso {

	@Autowired
	private UserServico servico;
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		try{
			User user = servico.findByEmail(email);
			return ResponseEntity.ok(user);}
		catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		}
	}
	

