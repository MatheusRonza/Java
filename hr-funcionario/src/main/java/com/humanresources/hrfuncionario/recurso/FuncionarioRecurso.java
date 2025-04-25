package com.humanresources.hrfuncionario.recurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.humanresources.hrfuncionario.entidades.Funcionario;
import com.humanresources.hrfuncionario.repositorios.FuncionarioRepositorio;

@RestController
@RequestMapping(value= "/workers")
public class FuncionarioRecurso {

	@Autowired
	private FuncionarioRepositorio repository;
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> findAll(){
		List<Funcionario> list = repository.findAll();
		return ResponseEntity.ok(list);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> findById(@PathVariable Long id){
		Funcionario f = repository.findById(id).get();
		return ResponseEntity.ok(f);
	
	}
}
