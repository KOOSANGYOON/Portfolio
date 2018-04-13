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
	
	@GetMapping("/test")
	public String test() {
		log.debug("test controller in");
		return "test";
	}
}
