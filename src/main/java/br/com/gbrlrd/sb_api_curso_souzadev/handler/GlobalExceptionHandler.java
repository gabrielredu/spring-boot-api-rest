package br.com.gbrlrd.sb_api_curso_souzadev.handler;

import br.com.gbrlrd.sb_api_curso_souzadev.exception.ErrorResponse;
import br.com.gbrlrd.sb_api_curso_souzadev.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException exception) {
		ErrorResponse response = ErrorResponse.builder()
				.message(exception.getMessage())
				.status(HttpStatus.NOT_FOUND.value())
				.build();

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception exception) {
		ErrorResponse response = ErrorResponse.builder()
				.message(exception.getMessage())
				.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
				.build();

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	}
}