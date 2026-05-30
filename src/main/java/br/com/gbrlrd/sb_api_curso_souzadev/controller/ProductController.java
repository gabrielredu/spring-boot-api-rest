package br.com.gbrlrd.sb_api_curso_souzadev.controller;

import br.com.gbrlrd.sb_api_curso_souzadev.database.model.ProductEntity;
import br.com.gbrlrd.sb_api_curso_souzadev.dto.ProductDto;
import br.com.gbrlrd.sb_api_curso_souzadev.exception.NotFoundException;
import br.com.gbrlrd.sb_api_curso_souzadev.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<ProductEntity> findAll() {
		return service.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductEntity createProduct(@RequestBody ProductDto product) {
		return service.createProduct(product);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ProductEntity updateProduct(@RequestBody ProductDto product, @PathVariable Integer id) throws NotFoundException {
		return service.updateProduct(product, id);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteProduct(@PathVariable Integer id) {
		service.deleteProduct(id);
	}
}