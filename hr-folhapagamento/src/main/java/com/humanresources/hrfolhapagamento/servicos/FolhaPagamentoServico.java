package com.humanresources.hrfolhapagamento.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresources.hrfolhapagamento.entidades.FolhaPagamento;
import com.humanresources.hrfolhapagamento.entidades.Funcionario;
import com.humanresources.hrfolhapagamento.feignclients.FuncionarioFeignClients;



@Service
public class FolhaPagamentoServico {
	
	@Autowired
	private FuncionarioFeignClients funcionarioFeignClient;
	
	public FolhaPagamento getPagamento(long funcionarioid, int dias) {
		
		
		Funcionario funcionario = funcionarioFeignClient.findById(funcionarioid).getBody();
		
		return new FolhaPagamento(funcionario.getNome(),funcionario.getSalario_dia(),dias);
	
	}
	
}