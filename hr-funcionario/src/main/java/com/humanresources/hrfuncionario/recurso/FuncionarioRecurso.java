package com.humanresources.hrfuncionario.recurso;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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

	private static Logger logger = LoggerFactory.getLogger(FuncionarioRecurso.class);
	
	@Value("${test.config}")
	private String TestConfig;
	
	@Autowired
	private Environment env;
			
	@Autowired
	private FuncionarioRepositorio repository;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		logger.info("CONFIG = " + TestConfig);
		return ResponseEntity.noContent().build();
	}	
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> findAll(){
		List<Funcionario> list = repository.findAll();
		return ResponseEntity.ok(list);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> findById(@PathVariable Long id){

		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Funcionario f = repository.findById(id).get();
		return ResponseEntity.ok(f);
		
		
	}
}
