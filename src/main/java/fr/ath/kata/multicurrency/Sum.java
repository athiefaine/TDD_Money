package fr.ath.kata.multicurrency;

public class Sum implements Expression {

    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String targetCurrency) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, targetCurrency);
    }
}
