package br.com.gbrlrd.sb_api_curso_souzadev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String helloWorldComId(@PathVariable("id") String id) {
		return "Hello World with id: " + id;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String helloWorldDois(){
		return "Esse é simples";
	}
}
