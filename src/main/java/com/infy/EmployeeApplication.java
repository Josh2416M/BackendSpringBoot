package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication implements commandLineRunner{

	@Autowire
	private App app;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		app.login();
	}

}
