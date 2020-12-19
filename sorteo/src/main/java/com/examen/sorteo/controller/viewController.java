package com.examen.sorteo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/sorteo/crear")
	public String createSorteo() {
		return "createSorteo";
	}
	
}
