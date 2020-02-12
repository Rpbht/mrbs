package com.cignex.mrbs.exception;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

import com.cignex.mrbs.log.MrbsLoggerFactory;
import com.cignex.mrbs.response.MrbsResponse;
import com.cignex.mrbs.response.impl.ErrorResponse;
import com.cignex.mrbs.utils.MrbsConstants;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * The Class MrbsExceptionHandler.
 *
 * @author rahul.panchal
 */
@RestControllerAdvice
public class MrbsExceptionHandler {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = MrbsLoggerFactory.getWebFormLogger(MrbsExceptionHandler.class);

    /**
     * Handle exception.
     *
     * @param ex     the ex
     * @param method the method
     * @return mrbs response
     */
    @ExceptionHandler(Exception.class)
    public MrbsResponse handleException(Exception ex, HandlerMethod method) {

	LOGGER.error("Cause: " + ex.getMessage() + " Method: " + method.getMethod() + " Class: "
		+ method.getMethod().getDeclaringClass().toString());

	if (ex instanceof JsonMappingException || ex instanceof HttpMessageNotWritableException) {

	    return new ErrorResponse(false, HttpStatus.NOT_FOUND, MrbsConstants.NOT_FOUND_MSG);

	} else if (ex instanceof EntityNotFoundException) {

	    return new ErrorResponse(false, HttpStatus.NOT_FOUND, MrbsConstants.ENTITY_NOT_FOUND_MSG);

	}
	return new ErrorResponse(false, HttpStatus.INTERNAL_SERVER_ERROR, MrbsConstants.INTERNAL_SERVER_ERROR);
    }

}
