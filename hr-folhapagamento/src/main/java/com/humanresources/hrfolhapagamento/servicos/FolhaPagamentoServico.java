package com.humanresources.hrfolhapagamento.servicos;

import org.springframework.stereotype.Service;

import com.humanresources.hrfolhapagamento.entidades.FolhaPagamento;

@Service
public class FolhaPagamentoServico {

	public FolhaPagamento getPagamento(long funcionarioid, int dias) {
		return new FolhaPagamento("Mario", 200.0, dias);
	}
}
