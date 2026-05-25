package br.com.gbrlrd.sb_api_curso_souzadev.database.model;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductEntity {
	private int id;
	private String name;
	private BigDecimal price;
	private int quantity;
}