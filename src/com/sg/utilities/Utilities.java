package com.sg.utilities;

import com.sg.dao.Dataset;

public  class Utilities {

    public static void  menu (){
        System.out.println("*******Le Journal de la Banque*******");
        Dataset.getAccountsList().entrySet().stream().forEach(System.out::println);

        System.out.println("*********************************************");
        System.out.println("( 1=> Deposit                                 )");
        System.out.println("( 2=> Withdrawal                              )");
        System.out.println("( 3=> Print History                           )");
        System.out.println("( 4=> Exit                                    )");
        System.out.println("*********************************************");
        System.out.println("Choisir une Opération entre 1 et 4 : ");
    }

    public static void requestAccount(){

        System.out.println("Entrer le numéro  de Compte: ");
    }
    public static void requestAmount(){

        System.out.println("Entrer le montant de l'opération: ");
    }

}
