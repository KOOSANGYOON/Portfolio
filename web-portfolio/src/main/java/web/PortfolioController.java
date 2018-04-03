package web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Portfolio;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController {
	private static final Logger log = LoggerFactory.getLogger(Portfolio.class);
}
