package br.com.gbrlrd.sb_api_curso_souzadev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
@CrossOrigin("*")
public class HelloWorldController {

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String helloWorld() {
		return "Hello World!";
	}
}
