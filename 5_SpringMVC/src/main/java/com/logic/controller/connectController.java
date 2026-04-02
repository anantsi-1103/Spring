package com.logic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logic.model.User;
import com.logic.service.UserService;

@Controller
public class connectController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commanDataModel(Model m) {
		m.addAttribute("heads", "This is Spring MVC");
		m.addAttribute("para", "Where we connect Spring with Website");
		
	}

	@RequestMapping("/form")
	public String ShowForm(Model m) {

		System.out.println("Inside Show Form");

		return "connect";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model m) {

		System.out.println("Inside Process Form");
		this.userService.createUser(user);

		System.out.println(user);
		return "success";
	}

//	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("username") String uname, @RequestParam("email") String email,
//			@RequestParam("password") String passw, Model m) {
//		
//		System.out.println("Username : "+ uname);
//		System.out.println("Email : "+ email);
//		System.out.println("Password : "+ passw);
//		
//		
//		User user = new User();
//		user.setUsername(uname);
//		user.setEmail(email);
//		user.setPassword(passw);
//		
//		m.addAttribute("user",user);
//		System.out.println(user);
//
////		m.addAttribute("usern" , uname);
////		m.addAttribute("email" , email);
////		m.addAttribute("password" , passw);
//		
//		
//		
//		return "success";
//	}

//	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("username") String uname, @RequestParam("email") String email,
//			@RequestParam("password") String passw, Model m) {
//		
//		System.out.println("Username : "+ uname);
//		System.out.println("Email : "+ email);
//		System.out.println("Password : "+ passw);
//
//		m.addAttribute("usern" , uname);
//		m.addAttribute("email" , email);
//		m.addAttribute("password" , passw);
//		
//		
//		
//		return "success";
//	}

//	Old Way from Servlet 
//	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest req) {
//		String name = req.getParameter("username");
//		System.out.println("User - name is " + name);
//		
//		return "";
//	}
}
