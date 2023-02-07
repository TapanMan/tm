package com.mandal.tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmApplication.class, args);
	}

}
