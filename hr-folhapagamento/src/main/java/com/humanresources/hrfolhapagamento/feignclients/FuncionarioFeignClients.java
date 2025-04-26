package com.humanresources.hrfolhapagamento.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.humanresources.hrfolhapagamento.entidades.Funcionario;

@Component
@FeignClient(name = "hr-funcionario", url = "localhost:8001", path = "/workers")
public interface FuncionarioFeignClients {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Funcionario> findById(@PathVariable Long id);

}
