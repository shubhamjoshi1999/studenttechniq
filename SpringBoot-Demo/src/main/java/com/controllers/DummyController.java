package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	@GetMapping("/dummy")
	public String dummyGet() {
		return "hello Student technique.";
	}
	
	@PostMapping("/dummy/{id}")
	public String dummyPost(@PathVariable Integer id) {
		return "dummy id has been received.";
	}
}
