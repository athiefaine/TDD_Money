package fr.ath.kata.multicurrency;

public class Bank {


    public Money reduce(Expression sourceExpression, String targetCurrency) {
       return sourceExpression.reduce(targetCurrency);
    }

}
