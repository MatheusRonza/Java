package com.humanresources.hrfolhapagamento.servicos;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.humanresources.hrfolhapagamento.entidades.FolhaPagamento;
import com.humanresources.hrfolhapagamento.entidades.Funcionario;

@Service
public class FolhaPagamentoServico {

	@Value("${hr-funcionario.host}")
	private String funcionariohost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public FolhaPagamento getPagamento(long funcionarioid, int dias) {
		
		Map<String, String> uriVariaveis = new HashMap<>();
		uriVariaveis.put("id", ""+funcionarioid);
		
		Funcionario funcionario = restTemplate.getForObject(funcionariohost + "workers/{id}", Funcionario.class, uriVariaveis);
		
		return new FolhaPagamento(funcionario.getNome(),funcionario.getSalario_dia(),dias);
	
	}

}