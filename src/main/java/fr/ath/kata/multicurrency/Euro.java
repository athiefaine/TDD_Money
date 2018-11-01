package fr.ath.kata.multicurrency;

public class Euro extends Money {

    public Euro(int  amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
         return new Euro(amount * multiplier);
    }

}
