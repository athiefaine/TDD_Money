package fr.ath.kata.multicurrency;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public  Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public Money reduce(Bank bank, String targetCurrency) {
        int rate = bank.rate(this.currency, targetCurrency);
        return new Money(amount / rate, targetCurrency);
    }

    public boolean equals(Object obj) {
        Money anotherMoney = (Money) obj;
        return currency.equals(anotherMoney.currency) &&
                amount == anotherMoney.amount;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money euro(int amount) {
        return new Money(amount, "EUR");
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
