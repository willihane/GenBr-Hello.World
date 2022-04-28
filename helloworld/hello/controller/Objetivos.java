package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	
	@GetMapping
	public String hello() {
		String obj1 = "Orientação ao futuro \n";
        String obj2 = "Comunicação.";
        return obj1+obj2;
	}

}
