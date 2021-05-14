package com.dwes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudUnoAMuchosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudUnoAMuchosApplication.class, args);
	}

}
