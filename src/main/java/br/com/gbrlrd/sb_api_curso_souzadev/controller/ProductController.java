package br.com.gbrlrd.sb_api_curso_souzadev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String findAll() {
		return "Lista de produtos!";
	}
}