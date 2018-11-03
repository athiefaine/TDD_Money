package fr.ath.kata.multicurrency;

public interface Expression {

    Money reduce(Bank bank, String targetCurrency);

}
