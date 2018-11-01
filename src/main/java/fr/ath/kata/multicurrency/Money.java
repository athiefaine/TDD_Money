package fr.ath.kata.multicurrency;

public class Money {
    protected int amount;

    public boolean equals(Object obj) {
        Money anotherMoney = (Money) obj;
        return getClass().equals(anotherMoney.getClass()) &&
                amount == anotherMoney.amount;
    }
}
