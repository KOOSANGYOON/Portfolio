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
		log.debug("test controller in");
		return "portfolioOne";
	}
	
	@GetMapping("/contact")
	public String contact() {
		log.debug("contact controller in");
		return "test2";
	}
}
