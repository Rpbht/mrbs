package com.cignex.mrbs.response.impl;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.cignex.mrbs.response.MrbsResponse;

/**
 * The Class ErrorResponse.
 *
 * @author rahul.panchal
 */
public class ErrorResponse implements MrbsResponse, Serializable {

    /**
     * Parameterized Constructor.
     *
     * @param status     boolean
     * @param statusCode {@link HttpStatus}
     * @param message    string
     */
    public ErrorResponse(boolean status, HttpStatus statusCode, String message) {
	super();
	this.status = status;
	this.statusCode = statusCode;
	this.message = message;
    }

    /**
     * Field status boolean.
     */
    private boolean status;

    /**
     * Field statusCode HttpStatus.
     */
    private HttpStatus statusCode;

    /**
     * Field message String.
     */
    private String message;

    /**
     * Field serialVersionUID long.
     */
    private static final long serialVersionUID = 7353761154155400844L;

    /**
     * @see com.cignex.mrbs.response.MrbsResponse#getStatus()
     **/
    @Override
    public boolean getStatus() {
	return this.status;
    }

    /**
     * @see com.cignex.mrbs.response.MrbsResponse#setStatus(boolean)
     **/
    @Override
    public void setStatus(boolean status) {
	// TODO Auto-generated method stub

    }

    /**
     * @see com.cignex.mrbs.response.MrbsResponse#getStatusCode()
     **/
    @Override
    public HttpStatus getStatusCode() {
	return this.statusCode;
    }

    /**
     * @see com.cignex.mrbs.response.MrbsResponse#setStatusCode(org.springframework.http.HttpStatus)
     **/
    @Override
    public void setStatusCode(HttpStatus statusCode) {
	this.statusCode = statusCode;
    }

    /**
     * @see com.cignex.mrbs.response.MrbsResponse#getMessage()
     **/
    @Override
    public String getMessage() {
	return this.message;
    }

    /**
     * @see com.cignex.mrbs.response.MrbsResponse#setMessage(java.lang.String)
     **/
    @Override
    public void setMessage(String message) {
	this.message = message;
    }

    /**
     * Method toString.
     * 
     * @return string
     * 
     * @see java.lang.Object#toString()
     **/
    @Override
    public String toString() {
	return String.format("SuccessResponse [status=%s, statusCode=%s, message=%s, result=%s]", this.status,
		this.statusCode, this.message);
    }

}
