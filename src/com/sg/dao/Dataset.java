package com.sg.dao;

import com.sg.entities.Account;
import com.sg.entities.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Cette Classe va permettre de gérer  le système d'accès aux données,
 * ainsi on n'a pas besoin d'une base de données pendant les développements et
 * les tests.
 * elle dispose d'un trois collections qui permettent de définir les données
 * AccountList : définit la collection des comptes
 * historyList   :  historique du compte
 */
public class Dataset {

    //Collection qui gère la list des comptes
    private final static Map <String, Account> accountList;

    //Collection qui gère l'historique des comptes
    private final static List <Statement> historyList;

    //bloc d'initialisation
    static {
        accountList = new HashMap <>();
        historyList = new ArrayList <>();
    }


    //l'appel du contructeur sans paramètre
    public Dataset() {
        buildData();
    }

    //Collection des comptes
    public static Map <String, Account> getAccountsList() {
        return accountList;
    }

    //collection historique
    public static List <Statement> getHistoriesList() {
        return historyList;
    }

    //génération des data
    private static void buildData() {

        // création  des Comptes
        Account accountA = new Account("01", "User1", 500L);
        Account accountB = new Account("02", "User2", 200L);
        Account accountC = new Account("03", "User3", 0L);

        //initialisation des la liste des comptes
        accountList.put(accountA.getNumber(), accountA);
        accountList.put(accountB.getNumber(), accountB);
        accountList.put(accountC.getNumber(), accountC);
    }
}
