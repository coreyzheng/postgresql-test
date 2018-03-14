package com.corey.message;

/**
 * Created by haibinzheng on 2018-03-13.
 */

public class CustomersResponse {
    private String status;
    private Object data;

    public CustomersResponse() {

    }

    public CustomersResponse(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}