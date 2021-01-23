package com.s22034.goldys;

public class NotEnoughFundsException extends
    Exception{

    public NotEnoughFundsException(Double amount){
        super("Nie mozna wyplacic pieniedzy, limit przekroczony o: " + amount);
    }
}
