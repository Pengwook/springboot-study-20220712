package com.springboot.studyhyeonwook.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MethodStudyController {
	
	@GetMapping({"/", "/index"})
	public String getMethod() {
		return "method/get";	// method라는 폴더 안에 get 불러온것
	}
	
	@GetMapping("/test")
	public String getMethod2() {
		return "method/test";
	}
}
