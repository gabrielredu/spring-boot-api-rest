package br.com.gbrlrd.sb_api_curso_souzadev.dto;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProductDto {

	private String name;
	private BigDecimal price;
	private int quantity;

}