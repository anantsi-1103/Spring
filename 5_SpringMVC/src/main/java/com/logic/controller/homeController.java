package com.logic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

//	get mapping , post , put , delete, patch
	@RequestMapping("/home")
	public String home() {
		System.out.println("Url Understand Home Controller");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page");
		return "about";
	}

	@RequestMapping("/getData")
	public String getData(Model m) {
		System.out.println("Sending data by Model");

		m.addAttribute("name", "Aman Singh");
		m.addAttribute("city", "Delhi");

		return "index";
	}

	@RequestMapping("/mvData")
	public ModelAndView mdata() {
		System.out.println("Sending data by ModelandView");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("name", "Ajay");
		modelAndView.addObject("id", 1234567);

		modelAndView.setViewName("data");
		return modelAndView;

	}
}
