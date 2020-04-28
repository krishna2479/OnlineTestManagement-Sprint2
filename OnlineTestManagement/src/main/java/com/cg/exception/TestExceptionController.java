package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TestExceptionController {

	@ExceptionHandler(value = TestException.class)
	public ResponseEntity<Object> handleException(TestException exception){
	return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
}
}
