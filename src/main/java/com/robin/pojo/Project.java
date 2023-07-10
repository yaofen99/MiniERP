package com.robin.pojo;

import java.util.Date;
import java.util.StringTokenizer;

public class Project {
    int id;
    String name;
    java.util.Date startDate;
    java.util.Date endDate;
    int outBalance;
    int contractID;
    int inChargeID;
    int auditAmount;
    int auditDeposit;
    String comment;

    public Project() {
    }

    public Project(int id, String name, Date startDate, Date endDate, int outBalance, int contractID, int inChargeID, int auditAmount, int auditDeposit, String comment) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.outBalance = outBalance;
        this.contractID = contractID;
        this.inChargeID = inChargeID;
        this.auditAmount = auditAmount;
        this.auditDeposit = auditDeposit;
        this.comment = comment;
    }

    public Project(String name, Date startDate, Date endDate, int outBalance, int contractID, int inChargeID, int auditAmount, int auditDeposit, String comment) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.outBalance = outBalance;
        this.contractID = contractID;
        this.inChargeID = inChargeID;
        this.auditAmount = auditAmount;
        this.auditDeposit = auditDeposit;
        this.comment = comment;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getOutBalance() {
        return outBalance;
    }

    public void setOutBalance(int outBalance) {
        this.outBalance = outBalance;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractorID(int contractID) {
        this.contractID = contractID;
    }

    public int getInChargeID() {
        return inChargeID;
    }

    public void setInChargeID(int inChargeID) {
        this.inChargeID = inChargeID;
    }

    public int getAuditAmount() {
        return auditAmount;
    }

    public void setAuditAmount(int auditAmount) {
        this.auditAmount = auditAmount;
    }

    public int getAuditDeposit() {
        return auditDeposit;
    }

    public void setAuditDeposit(int auditDeposit) {
        this.auditDeposit = auditDeposit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
