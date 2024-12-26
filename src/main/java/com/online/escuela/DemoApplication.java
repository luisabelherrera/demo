package com.online.escuela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@EnableJpaRepositories(basePackages = "com.online.escuela.repositories.jpa")
//opcional  EntityScan
@SpringBootApplication
public class DemoApplication {

   
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
