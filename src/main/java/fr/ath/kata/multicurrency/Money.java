package fr.ath.kata.multicurrency;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public  Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public boolean equals(Object obj) {
        Money anotherMoney = (Money) obj;
        return currency.equals(anotherMoney.currency) &&
                amount == anotherMoney.amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money euro(int amount) {
        return new Euro(amount, "EUR");
    }
}
