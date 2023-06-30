package com.ferreira.rebeca.frankinstain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

@SpringBootApplication(exclude={JdbcTemplateAutoConfiguration.class})
public class FrankinstainApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrankinstainApplication.class, args);
	}

}
