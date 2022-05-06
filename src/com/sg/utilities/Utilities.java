package com.sg.utilities;

public  class Utilities {

    public static void  menu (){

        System.out.println("*********************************************");
        System.out.println("( 1=> Deposit                                 )");
        System.out.println("( 2=> Withdrawal                              )");
        System.out.println("( 3=> Statement                               )");
        System.out.println("( 4=> Printing                                )");
        System.out.println("( 5=> Exit                                    )");
        System.out.println("*********************************************");
        System.out.println("Choisir Opération entre 1 et 5 : ");
    }

    public static void requestAccount(){

        System.out.println("Entrer le numéro  de Compte: ");
    }
    public static void requestAmount(){

        System.out.println("Entrer le montant de l'opération: ");
    }

}
