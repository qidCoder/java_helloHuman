package com.helloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String greeting(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value = "last_name", required=false) String last_name, Model viewModel) {
		viewModel.addAttribute("first_name", first_name);
		viewModel.addAttribute("last_name", last_name);
		
		if(first_name == null) {
			viewModel.addAttribute("first_name", "Human");
			viewModel.addAttribute("last_name", "");
		}
		
		return "index.jsp";
	}
}
