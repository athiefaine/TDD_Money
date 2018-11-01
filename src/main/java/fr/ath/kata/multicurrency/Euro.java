package fr.ath.kata.multicurrency;

public class Euro {
    private int amount;

    public Euro(int  amount) {
        this.amount = amount;
    }

    public Euro times(int multiplier) {
         return new Euro(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Euro anotherEuro = (Euro) obj;
        return amount == anotherEuro.amount;
    }
}
