package com.humanresources.oath.servico;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresources.oath.entidades.User;
import com.humanresources.oath.feignclients.UserFeignClients;

@Service
public class UserServico {

	private static Logger logger = LoggerFactory.getLogger(UserServico.class);
	
	@Autowired
	private UserFeignClients userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if (user == null) {
			logger.error("Email não encontrado " + email);
			throw new IllegalArgumentException("Email não encontrado");
		}
		logger.info("Email encontrado " + email);		
		return user;
	}

}
