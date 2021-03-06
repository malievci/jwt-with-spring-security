package com.mali.authmodul.domain;

import org.springframework.http.HttpStatus;

/**
 * This class represent of HttpResponse
 * Provide control of HttpResponse
 * For example:
 *
 * {
 * code: 200
 * httpStatus: OK
 * reason :OK
 * message: "Your request was successful"
 * }
 */
public class HttpResponse {
    /**
     * that's gonna represent real http status code
     */
    private int httpStatusCode; //200, 201, .. 500
    private HttpStatus httpStatus;
    private String reason;

    /**
     * It is developer message
     */
    private String message;

    public HttpResponse() { }

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
