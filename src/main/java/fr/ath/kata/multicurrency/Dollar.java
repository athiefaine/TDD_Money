package fr.ath.kata.multicurrency;

public class Dollar {
    public int amount;

    public Dollar(int  amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
         return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Dollar anotherDollar = (Dollar) obj;
        return amount == anotherDollar.amount;
    }
}
