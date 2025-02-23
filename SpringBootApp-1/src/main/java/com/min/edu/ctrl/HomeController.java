package com.min.edu.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		System.out.println("처음 호출되는 요청입니다.");
		return "index";
	}
	
}
