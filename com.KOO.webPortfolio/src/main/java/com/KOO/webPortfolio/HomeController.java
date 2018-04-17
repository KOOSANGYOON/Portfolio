package com.KOO.webPortfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String home() {
		log.debug("home controller in");
		return "index";
	}
	
	@GetMapping("/main")
	public String main() {
		log.debug("main controller in");
		return "main";
	}
	
	@GetMapping("/portfolio/1")
	public String portfolioOne() {
		log.debug("portfolio one controller in");
		return "portfolioOne";
	}
	
	@GetMapping("/portfolio/2")
	public String portfolioTwo() {
		log.debug("portfolio two controller in");
		return "portfolioTwo";
	}
	
	@GetMapping("/portfolio/3")
	public String portfolioThree() {
		log.debug("portfolio three controller in");
		return "portfolioThree";
	}
	
	@GetMapping("/contact")
	public String contact() {
		log.debug("contact controller in");
		return "test2";
	}
}
