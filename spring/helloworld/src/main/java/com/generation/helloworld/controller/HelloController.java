package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// classe que vai responder requisições HTTP
@RestController
@RequestMapping("/hello") // a url é o endereço principal da classe
public class HelloController {
	
	// esse método precisa de um "verbo", será o "GET"
	@GetMapping
	public String hello () {
		return "Hello World!!!";
	}
	
	@GetMapping("/top")
	public String top() {
		return "Hello World TOP!!!";
	}
}
