package com.logic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/searchHome")
	public String home() {
		System.out.println("Going to home page");

		return "searchHome";
	}

	@RequestMapping("searchV")
	public RedirectView search(@RequestParam("queryBox") String query) {

		String url = "https://www.google.co.in/search?q=" + query;

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		


		return redirectView;
	}
	
//	Path Variable
	@RequestMapping("/user/{id}")
	public String getUserDetail(@PathVariable("id") int userID) {
		
		System.out.println(userID);
		return "success";
	}
}