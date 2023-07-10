package com.robin.pojo;

public class Employee {
    private int id;
    private String name;
    private String phone;
    private String pwd;
    private int balance;

    public Employee() {
    }

    public Employee(String name, String phone, String pwd, int balance) {
        this.name = name;
        this.phone = phone;
        this.pwd = pwd;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
