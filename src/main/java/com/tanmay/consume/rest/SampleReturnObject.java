package com.tanmay.consume.rest;

import org.springframework.stereotype.Component;

@Component
public class SampleReturnObject {

    private long ID;
    private String message;

    @Override
    public String toString() {
        return "SampleReturnObject{" +
                "ID=" + ID +
                ", message='" + message + '\'' +
                '}';
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
