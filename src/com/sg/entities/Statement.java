package com.sg.entities;

import com.sg.utilities.Operation;

import java.util.Date;

public class Statement {
    private Operation op ;
    private Account account;
    private Date stDate;
    private Long stAmount;
    private Long balance;


    public Statement() {
    }

    Statement(Account account, Date stDate, Long stAmount, Long balance, Operation op ) {
        this.account = account;
        this.stDate = stDate;
        this.stAmount = stAmount;
        this.op= op;
        this.balance = balance;

    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Date getStDate() {
        return stDate;
    }

    public void setStDate(Date stDate) {
        this.stDate = stDate;
    }

    public Long getStAmount() {
        return stAmount;
    }

    public void setStAmount(Long stAmount) {
        this.stAmount = stAmount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Operation getOp() {
        return op;
    }

    public void setOp(Operation op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "Operation type=" + op +
                ", account Number=" + account.getCustomerName() +
                ", Date=" + stDate +
                ", Amount=" + stAmount +
                ", Balance=" + account.getBalance() +
                '}';
    }
}
