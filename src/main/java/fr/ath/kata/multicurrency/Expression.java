package fr.ath.kata.multicurrency;

public interface Expression {

    Money reduce(String targetCurrency);

}
