package br.com.gbrlrd.sb_api_curso_souzadev.exception;

import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ErrorResponse {

	private String message;
	private Integer status;

}