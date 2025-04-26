package com.humanresources.hrfolhapagamento.recursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.humanresources.hrfolhapagamento.entidades.FolhaPagamento;
import com.humanresources.hrfolhapagamento.servicos.FolhaPagamentoServico;

@RestController
@RequestMapping(value = "/pagamentos")
public class FolhaPagamentoRecurso {

	@Autowired
	private FolhaPagamentoServico service;
	
	@GetMapping(value = "{funcionarioId}/dias/{dias}")
	public ResponseEntity<FolhaPagamento> getFolhaPagamento(@PathVariable Long funcionarioId, @PathVariable Integer dias ){
		FolhaPagamento folhapagamento = service.getPagamento(funcionarioId, dias);
		return ResponseEntity.ok(folhapagamento);
	}

}
