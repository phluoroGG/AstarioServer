package com.tp31.astarioserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tp31.astarioserver")
@EnableAutoConfiguration
public class AstarioServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstarioServerApplication.class, args);
	}

}
