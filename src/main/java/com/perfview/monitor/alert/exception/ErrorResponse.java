package com.perfview.monitor.alert.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponse {
	String errorCode;
	String errorStatus;
	

}
