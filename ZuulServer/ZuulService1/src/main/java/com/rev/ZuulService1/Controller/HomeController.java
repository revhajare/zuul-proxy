package com.rev.ZuulService1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/user")
	public String user() {
		return "<h1>User page - Service 1</h1>";
	}
}
