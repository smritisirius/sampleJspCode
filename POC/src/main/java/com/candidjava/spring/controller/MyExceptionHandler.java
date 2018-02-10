package com.candidjava.spring.controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.datetime.DateTimeFormatAnnotationFormatterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);
	/*
	@ExceptionHandler(RuntimeException.class)
	public String handleSQLException(HttpServletRequest request, Exception ex){
		logger.info("Exception occurs="+request.getRequestURL());
		return "database_error";
	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="IOException occured")
	@ExceptionHandler(IOException.class)
	public void handleIOException(){
		logger.error("Page not Found handler executed");
		//returning 404 error code
	}*/
	@ExceptionHandler(Exception.class)
	public String exception(Exception e) {
		logger.error("Exception cause by"+e.getMessage());
		return "error";
	}
}