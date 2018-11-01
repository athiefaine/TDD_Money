package fr.ath.kata.multicurrency;

public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    public boolean equals(Object obj) {
        Money anotherMoney = (Money) obj;
        return getClass().equals(anotherMoney.getClass()) &&
                amount == anotherMoney.amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money euro(int amount) {
        return new Euro(amount);
    }
}
