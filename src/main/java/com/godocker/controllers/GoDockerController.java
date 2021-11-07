package com.godocker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoDockerController {
	
	  @RequestMapping("/")
	  public String home() {
	    return "Greetings Docker World";
	  }
}
