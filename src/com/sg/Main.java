package com.sg;


import com.sg.dao.Dataset;
import com.sg.entities.Account;
import com.sg.utilities.Operation;
import com.sg.utilities.Utilities;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account account;
        Long amount = 0L;
        String accountNumber;
        String opAmount;

        //initialisation des données
        Dataset ds = new Dataset();

        Utilities.menu();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        while (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") ||
                choice.equals("5")) {

            if (choice.equals("1")) {


                Utilities.requestAccount();
                accountNumber = sc.nextLine();
                //check the existence of the Account
                if (!Dataset.getAccountsList().containsKey(accountNumber)) {
                    System.out.println("Compte inexistant");

                } else {
                    account = Dataset.getAccountsList().get(accountNumber);
                    //request the Amount
                    Utilities.requestAmount();
                    opAmount = sc.nextLine();
                    try {
                        amount = Long.parseLong(opAmount);
                    } catch (Exception e) {
                        System.out.println("Montant invalide");
                      System.exit(0);
                    }
                    account.processOperation(Operation.DEPOSIT, amount);
                }
            } else if (choice.equals("2")) {
                Utilities.requestAccount();
                accountNumber = sc.nextLine();
                //check the existence of the Account
                if (!Dataset.getAccountsList().containsKey(accountNumber)) {
                    System.out.println("Compte inexistant");

                } else {
                    account = Dataset.getAccountsList().get(accountNumber);
                    //request the Amount
                    Utilities.requestAmount();
                    opAmount = sc.nextLine();
                    try {
                        amount = Long.parseLong(opAmount);
                    } catch (Exception e) {
                        System.out.println("Montant invalide");
                        System.exit(0);
                    }
                    account.processOperation(Operation.WITHDRAWAL, amount);

                }
            } else if (choice.equals("3")) {
                Utilities.requestAccount();

                accountNumber = sc.nextLine();
                //check the existence of the Account
                if (!Dataset.getAccountsList().containsKey(accountNumber)) {
                    System.out.println("Compte inexistant");

                } else {
                    account = Dataset.getAccountsList().get(accountNumber);
                    //request the Amount
                    account.processOperation(Operation.HISTORY, 0L);

                }
            } else if (choice.equals("4")) {

            } else if (choice.equals("5")) {
                System.exit(0);
            }
            Utilities.menu();
            choice = sc.nextLine();
        }


    }
}
