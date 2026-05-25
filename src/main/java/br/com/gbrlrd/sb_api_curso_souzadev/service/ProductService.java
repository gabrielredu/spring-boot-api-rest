package br.com.gbrlrd.sb_api_curso_souzadev.service;

import br.com.gbrlrd.sb_api_curso_souzadev.database.model.ProductEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

	private static final List<ProductEntity> PRODUCTS = List.of(
		ProductEntity.builder()
			.id(0)
			.name("Lorem ipsum")
			.price(new BigDecimal(10))
			.quantity(1)
			.build(),
		ProductEntity.builder()
			.id(1)
			.name("Sit dolor")
			.price(new BigDecimal(24513))
			.quantity(2)
			.build(),
		ProductEntity.builder()
			.id(2)
			.name("Amet")
			.price(new BigDecimal(67))
			.quantity(7)
			.build(),
		ProductEntity.builder()
			.id(3)
			.name("Consectetur")
			.price(new BigDecimal(987))
			.quantity(3)
			.build()
	);

	public List<ProductEntity> findAll() {
		return new ArrayList<>(PRODUCTS);
	}
}
