package com.Shoppingcart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Shoescart {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "home";
	}
	@RequestMapping("/home")
	public String home1() {
		return"home";
	}
	@RequestMapping("/contact")
	public String contact() {
		return"contact";
	}
	@RequestMapping(value = "/order")
	public String order() {
		return "order";
	}
	
	@RequestMapping("/Product")
	public String home() {
		return "Product";
	}

	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/probookform")
		public String probookform() {
			return "probookform";
		}
	
	
	@RequestMapping("/probookdetails")
		public String probookdetails() {
		
		return "probookdetails";
		
			
		}
	}

