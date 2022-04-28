package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmGeneration {
	
	@GetMapping
	public String hello() {
		String titulo = "Habilidades comportamentais & Mentalidades: \n";
        String texto = "Mentalidade de crescimento, persistência, comunicação, responsabilidade pessoal.";
        return titulo+texto;
	}

}
