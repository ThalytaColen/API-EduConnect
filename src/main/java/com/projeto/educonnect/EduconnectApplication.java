package com.projeto.educonnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.projeto.educonnect")
@EntityScan("com.projeto.educonnect.entities")
public class EduconnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduconnectApplication.class, args);
	}

}
