package com.pmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan("com.pmo.db.entity")
public class PmoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmoApplication.class, args);
	}

}
