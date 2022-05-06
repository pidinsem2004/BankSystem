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
 * Statement   :   la situation du compte
 * orderList   :
 */
public class Dataset {

    /**
     * Collection qui gère la list des comptes
     */
    private final static Map<String, Account> accountsList = new HashMap <>();

    /**
     * Collection qui gère l'historique des comptes
     */
    private final static List<Statement> historiesList = new ArrayList <>();

     /**
     * l'appel du contructeur sans paramètre de la classe Dataset
     * promotionnnelles
     */
    public Dataset() {
        buildData();
    }

    /**
     * Renvoie la liste des Comptes
     *
     * @return productList
     */
    public static Map<String, Account> getAccounts() {
        return accountsList;
    }

    public static Map <String, Account> getAccountsList() {
        return accountsList;
    }

    public static List <Statement> getHistoriesList() {
        return historiesList;
    }

    /**
     * Cette méthode va permmettre de simuler une base de données
     * à partir des collections. elles contruits et charge les collections
     */

    private static void buildData() {


        // Initialisation des Comptes

        Account accountA = new Account("01", "JP NSEM16" , 50000L);
        Account accountB = new Account("02", "JP NSEM17" , 20000L);
        Account accountC= new Account("03", "JP NSEM18" , 0L);

        accountsList.put(accountA.getNumber(), accountA);
        accountsList.put(accountB.getNumber(), accountB);
        accountsList.put(accountC.getNumber(), accountC);




    }


    }
