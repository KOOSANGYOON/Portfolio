package com.koo.webPortfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.koo.web", "com.koo.webPortfolio"})
public class WepPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(WepPortfolioApplication.class, args);
	}
}
