package com.company;

public class BunkAccount {
    Integer clientID = 1;
    String Name = "Petr";
    String Surname = "Ivanov";
    double Balance = 100.0;

    void popolnenie(double summa) {
        Balance += summa;
    }

    void snyatie(double summa) {
        Balance -= summa;
    }
}

class BunkAccountTest {
    public static void main(String[] args) {
        BunkAccount myAccount = new BunkAccount();

        myAccount.popolnenie(20.4);

        System.out.println("Schet: " + myAccount.Balance);
        myAccount.snyatie(25.0);
        System.out.println("Schet: " + myAccount.Balance);
    }

}