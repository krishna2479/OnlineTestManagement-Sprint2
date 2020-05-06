package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TestExceptionController {

	@ExceptionHandler(value = TestException.class)
	public ResponseEntity<Object> handleNullException(TestException exception){
	return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
}
	@ExceptionHandler(value = InvalidException.class)
	public ResponseEntity<Object> handleInvalidException(InvalidException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
}
