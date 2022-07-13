package com.springboot.studyhyeonwook.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping({"/", "/index"})
	public String indexPage() {
		return "Auth/index";
	}
	
}