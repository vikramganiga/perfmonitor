package com.gerutree.perfmonitor.alert.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GobalAlertExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody
	public ErrorResponse requestHandingNotFound() {
		return new ErrorResponse(HttpStatus.NOT_FOUND.toString(), "Controller/Handler not found- resource not found");
	}

}
