package com.springweb.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String Test(){
		System.out.println("TestController");
		return "test";
	}

}
