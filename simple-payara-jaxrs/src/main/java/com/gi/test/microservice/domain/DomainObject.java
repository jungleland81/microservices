package com.gi.test.microservice.domain;

/**
 *
 */
public class DomainObject {

    private String message;

    private Long millis;

    public DomainObject() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getMillis() {
        return millis;
    }

    public void setMillis(Long millis) {
        this.millis = millis;
    }
}
