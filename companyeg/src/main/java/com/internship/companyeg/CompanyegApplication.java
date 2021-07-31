package com.internship.companyeg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Company Example", version = "V1", description = "Web application of a company."))
public class CompanyegApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyegApplication.class, args);
	}

}
