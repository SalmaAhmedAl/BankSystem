package com.tech.thejavaacademybank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The Java Bank application",
				description = "Backend Rest APIs for The Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Salma Ahmed Ali",
						email = "salmahamzaahmed77@gmail.com",
						url = "https://github.com/SalmaAhmedAl/tja-bank"
				),
				license = @License(
						name = "MIT",
						url = "https://github.com/SalmaAhmedAl/tja-bank"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "The Java Bank App Documentation",
				url = "https://github.com/SalmaAhmedAl/tja-bank"

		)
)
public class TheJavaAcademyBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheJavaAcademyBankApplication.class, args);
	}

}
