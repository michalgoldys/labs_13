package com.s22034.goldys;

public class Main {

    public static void main(String[] args) throws NotEnoughFundsException {

        JavaFileReader javaFileReader = new JavaFileReader();
        javaFileReader.runJavaFileReader();

        Account account = new Account(2000, 250, 0, new DebetCard());

        account.withdrawMoney(300);

        Account account1 = new Account(500, 100, 0, new CreditCard());

        account1.withdrawMoney(101);
    }
}
