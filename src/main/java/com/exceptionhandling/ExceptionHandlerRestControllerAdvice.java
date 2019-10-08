package com.exceptionhandling;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.exception.ResourceNotFoundException;
import com.models.ExceptionResponse;

@RestControllerAdvice
//@ControllerAdvice
public class ExceptionHandlerRestControllerAdvice {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public ExceptionResponse handleResouceNotFound(final ResourceNotFoundException exception,
															final HttpServletRequest request) {
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorMessage(exception.getMessage()+" RestControllerAdvice resource not found edited");
		response.setRequestedURI(request.getRequestURI());
		return response;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public ExceptionResponse handleException(final Exception exception,
											final HttpServletRequest request) {
		ExceptionResponse response = new ExceptionResponse();
		response.setErrorMessage(exception.getMessage()+" RestControllerAdvice exception edited");
		response.setRequestedURI(request.getRequestURI());
		return response;
	}
}
