package com.sg.entities;

import com.sg.dao.Dataset;
import com.sg.utilities.Operation;

import java.util.Date;

public class Account {
    private String  number;
    private String  customerName;
    private Long    balance;

    public Account() { }

    public Account(String number, String customerName, Long balance) {
        this.number = number;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void processOperation(Operation op, Long amount) {

        if (op == Operation.DEPOSIT) {
            deposit(amount);
        } else if (op == Operation.WITHDRAWAL) {
            try {
                withdrawal(amount);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (op == Operation.HISTORY) {
            printAccountStatement();
        }
    }

    private void deposit(Long amount){
        balance += amount;
        //create a statement object to reflect the new operation en update history
        Statement st = new Statement(this, new Date() , amount, balance, Operation.DEPOSIT);
        Dataset.getHistoriesList().add(st);
        System.out.println("Versement effectué avec Succès");
    }

    private void withdrawal(Long amount) throws Exception{
        if (balance < amount)
              throw  new Exception("Solde Insuffisant") ;
        balance -= amount;
        //create a statement object to reflect the new operation en update history
        Statement st = new Statement(this, new Date() , amount, balance , Operation.WITHDRAWAL );
        Dataset.getHistoriesList().add(st);
        System.out.println("Retrai effectué avec Succès");
    }

    private void printStatement(){
        //System.out.println("Historique du Compte "+ this.getNumber());
        for (Statement st  : Dataset.getHistoriesList()) {
            System.out.print(st.toString());
        }
    }

    private void printAccountStatement(){
        System.out.println("Historique du Compte "+ this.getNumber());
        Dataset.getHistoriesList().stream().filter(st-> st.getAccount().getNumber().equals(this.getNumber()))
                .forEach(System.out::println);
    }
}
