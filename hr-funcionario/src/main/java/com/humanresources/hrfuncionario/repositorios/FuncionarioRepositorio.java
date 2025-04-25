package com.humanresources.hrfuncionario.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanresources.hrfuncionario.entidades.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long>{

}
