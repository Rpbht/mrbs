package com.cignex.mrbs.response;

import org.springframework.http.HttpStatus;

/**
 * The Interface MrbsResponse.
 *
 * @author rahul.panchal
 */
public interface MrbsResponse {

    /**
     * Gets status.
     *
     * @return status
     */
    public boolean getStatus();

    /**
     * Sets status.
     *
     * @param status new status
     */
    public void setStatus(boolean status);

    /**
     * Gets status code.
     *
     * @return status code
     */
    public HttpStatus getStatusCode();

    /**
     * Sets status code.
     *
     * @param statusCode new status code
     */
    public void setStatusCode(HttpStatus statusCode);

    /**
     * Gets message.
     *
     * @return message
     */
    public String getMessage();

    /**
     * Sets message.
     *
     * @param message new message
     */
    public void setMessage(String message);

}
