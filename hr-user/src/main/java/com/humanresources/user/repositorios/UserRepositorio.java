package com.humanresources.user.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanresources.user.entidades.User;

public interface UserRepositorio extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
