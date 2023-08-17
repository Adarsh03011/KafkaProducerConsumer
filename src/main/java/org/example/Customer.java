package org.example;

public class Customer {
    private int customerId;
    private String customerName;

    public Customer(){

    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
}
