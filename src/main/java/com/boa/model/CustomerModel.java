package com.boa.model;

public class CustomerModel {
    private Integer customerID;
    private String customerName;
    private String customerAddress;

    public CustomerModel(Integer customerID, String customerName, String customerAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
