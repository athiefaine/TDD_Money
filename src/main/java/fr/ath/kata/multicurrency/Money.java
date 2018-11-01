package fr.ath.kata.multicurrency;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public abstract Money times(int multiplier);

    public boolean equals(Object obj) {
        Money anotherMoney = (Money) obj;
        return getClass().equals(anotherMoney.getClass()) &&
                amount == anotherMoney.amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money euro(int amount) {
        return new Euro(amount, "EUR");
    }
}
