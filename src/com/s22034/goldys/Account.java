package com.s22034.goldys;

public class Account {

    private double balance;
    private double dailyDebet;
    private double credit;
    private Card card;

    public Account(double balance, double dailyDebt, double credit, Card card) {
        this.balance = balance;
        this.dailyDebet = dailyDebt;
        this.credit = credit;
        this.card = card;
    }

    public void withdrawMoney(double amount){

        try {
            if(amount > this.dailyDebet || amount > this.balance){
                throw new NotEnoughFundsException(this.dailyDebet-amount);
            }else
            {
                System.out.println(
                        "Wyplacono: " + amount + ", pozostaly dzienny limit: " + (this.dailyDebet-amount) + ", stan konta: " + this.balance
                );
            }
        } catch (NotEnoughFundsException e){
            e.printStackTrace();
        }

    }
}