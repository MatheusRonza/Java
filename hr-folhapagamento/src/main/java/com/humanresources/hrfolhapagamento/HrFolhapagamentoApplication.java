package com.humanresources.hrfolhapagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrFolhapagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrFolhapagamentoApplication.class, args);
	}

}
