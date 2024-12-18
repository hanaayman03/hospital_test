package com.example.mongo.doctor.model;

public class Response<T> {
    private T data;
    private String message;
    private String status;
    public Response(T data, String message, String status) {
        this.data = data;
        this.message = message;
        this.status = status;

    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
