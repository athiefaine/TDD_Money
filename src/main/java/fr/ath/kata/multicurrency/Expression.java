package fr.ath.kata.multicurrency;

public interface Expression {

    Money reduce(Bank bank, String targetCurrency);

    Expression plus(Expression addend);

}
