package br.com.gbrlrd.sb_api_curso_souzadev.service;

import br.com.gbrlrd.sb_api_curso_souzadev.database.model.ProductEntity;
import br.com.gbrlrd.sb_api_curso_souzadev.dto.ProductDto;
import br.com.gbrlrd.sb_api_curso_souzadev.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

	private static final List<ProductEntity> PRODUCTS = new ArrayList<>();

	static {
		PRODUCTS.add(
			ProductEntity.builder()
			.id(0)
			.name("Lorem ipsum")
			.price(new BigDecimal(10))
			.quantity(1)
			.build()
		);
		PRODUCTS.add(
			ProductEntity.builder()
			.id(1)
			.name("Sit dolor")
			.price(new BigDecimal(24513))
			.quantity(2)
			.build()
		);
		PRODUCTS.add(
			ProductEntity.builder()
			.id(2)
			.name("Amet")
			.price(new BigDecimal(67))
			.quantity(7)
			.build()
		);
		PRODUCTS.add(
			ProductEntity.builder()
			.id(3)
			.name("Consectetur")
			.price(new BigDecimal(987))
			.quantity(3)
			.build()
		);
	}

	public List<ProductEntity> findAll() {
		return new ArrayList<>(PRODUCTS);
	}

	public ProductEntity createProduct(ProductDto productDto) {

		int newId = PRODUCTS.stream()
				.mapToInt(ProductEntity::getId)
				.max()
				.orElse(0) + 1;

		ProductEntity newProduct = ProductEntity.builder()
				.id(newId)
				.name(productDto.getName())
				.price(productDto.getPrice())
				.quantity(productDto.getQuantity())
				.build();

		PRODUCTS.add(newProduct);

		return newProduct;
	}

	public ProductEntity updateProduct(ProductDto productDto, Integer id) throws NotFoundException {
		ProductEntity product = PRODUCTS.stream()
				.filter(p -> p.getId().equals(id))
				.findAny()
				.orElseThrow(() -> new NotFoundException("Product not found."));

		product.setName(productDto.getName());
		product.setPrice(productDto.getPrice());
		product.setQuantity(productDto.getQuantity());

		return product;
	}

	public void deleteProduct(Integer id) {
		PRODUCTS.removeIf(productEntity -> productEntity.getId().equals(id));
	}
}
