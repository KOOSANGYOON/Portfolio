package com.KOO.webPortfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String home() {
		System.out.println("home controller in");
		log.debug("home controller in");
		return "index";
	}
	
	@GetMapping("/test")
	public ModelAndView home2() {
		ModelAndView result = new ModelAndView();
		result.setViewName("index");
		System.out.println("home controller in");
		log.debug("home controller in");
		return result;
	}
}
