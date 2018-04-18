package com.diary.torp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.diary.torp.web.HomeController;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home() {
		log.debug("home controller in");
		return "main";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
