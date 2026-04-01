package com.logic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is First Handler");
//		
//		return "redirect:/two";
//	}
//	

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is First Handler");

		RedirectView rv = new RedirectView();
		rv.setUrl("two");
		return rv;
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("This is Second Handler");

		return "";
	}
}
