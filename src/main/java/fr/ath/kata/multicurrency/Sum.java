package fr.ath.kata.multicurrency;

public class Sum implements Expression {

    public Expression augend;
    public Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String targetCurrency) {
        int amount = augend.reduce(bank, targetCurrency).amount + addend.reduce(bank, targetCurrency).amount;
        return new Money(amount, targetCurrency);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
