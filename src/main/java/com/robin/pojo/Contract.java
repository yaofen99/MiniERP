package com.robin.pojo;

import java.util.Date;

public class Contract {
    private int id;
    private String name;
    private int contractorID;
    
    private int counterPartyID;
    private java.util.Date date;
    private java.util.Date dueDate;
    private int amount;
    private int deposit;

    public int getCustomer() {
        return counterPartyID;
    }

    public void setCustomer(int counterPartyID) {
        this.counterPartyID = counterPartyID;
    }

    private String description;

    public Contract() {
    }

    public Contract(int id, String name, int contractorID, int counterParty, Date date, Date dueDate, int amount, int deposit, String description) {
        this.id = id;
        this.name = name;
        this.contractorID = contractorID;
        this.counterPartyID = counterParty;
        this.date = date;
        this.dueDate = dueDate;
        this.amount = amount;
        this.deposit = deposit;
        this.description = description;
    }

    public Contract(String name, int contractorID, int counterParty, Date date, Date dueDate, int amount, int deposit, String description) {
        this.name = name;
        this.contractorID = contractorID;
        this.counterPartyID = counterParty;
        this.date = date;
        this.dueDate = dueDate;
        this.amount = amount;
        this.deposit = deposit;
        this.description = description;
    }

    public int getCounterPartyID() {
        return counterPartyID;
    }

    public void setCounterPartyID(int counterPartyID) {
        this.counterPartyID = counterPartyID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContractorID() {
        return contractorID;
    }

    public void setContractorID(int contractorID) {
        this.contractorID = contractorID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
