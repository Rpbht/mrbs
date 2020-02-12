package com.cignex.mrbs.response.impl;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.cignex.mrbs.response.MrbsResponse;

/**
 * The Class SuccessResponse.
 *
 * @author rahul.panchal
 */
public class SuccessResponse implements MrbsResponse, Serializable {

    /**
     * Parameterized Constructor.
     *
     * @param status     boolean
     * @param statusCode {@link HttpStatus}
     * @param message    string
     * @param result     object
     */
    public SuccessResponse(boolean status, HttpStatus statusCode, String message, Object result) {
	super();
	this.status = status;
	this.statusCode = statusCode;
	this.message = message;
	this.result = result;
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
     * Field result Object.
     */
    private Object result;

    /**
     * Field serialVersionUID. (value is 5633725919087346901L) Long
     */
    private static final long serialVersionUID = 5633725919087346901L;

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
     * Gets the field result Object.
     *
     * @return the field result Object
     */
    public Object getResult() {
	return this.result;
    }

    /**
     * Sets the field result Object.
     *
     * @param result the new field result Object
     */
    public void setResult(Object result) {
	this.result = result;
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
		this.statusCode, this.message, this.result);
    }

}
