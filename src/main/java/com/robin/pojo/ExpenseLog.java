package com.robin.pojo;

import java.util.Date;
public class ExpenseLog {
    int id;
    String name;
    int unitPrice;
    int quantity;
    String unit;
    int totalPrice;
    int projectID;
    int applicantID;
    int auditorID;
    String comment;
    java.util.Date date;

    public ExpenseLog() {
    }

    public ExpenseLog(String name, int unitPrice, int quantity, String unit, int totalPrice, int projectID, int applicantID, int auditorID, String comment, Date date) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.unit = unit;
        this.totalPrice = totalPrice;
        this.projectID = projectID;
        this.applicantID = applicantID;
        this.auditorID = auditorID;
        this.comment = comment;
        this.date = date;
    }

    public ExpenseLog(int id, String name, int unitPrice, int quantity, String unit, int totalPrice, int projectID, int applicantID, int auditorID, String comment, Date date) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.unit = unit;
        this.totalPrice = totalPrice;
        this.projectID = projectID;
        this.applicantID = applicantID;
        this.auditorID = auditorID;
        this.comment = comment;
        this.date = date;
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

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(int applicantID) {
        this.applicantID = applicantID;
    }

    public int getAuditorID() {
        return auditorID;
    }

    public void setAuditorID(int auditorID) {
        this.auditorID = auditorID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
