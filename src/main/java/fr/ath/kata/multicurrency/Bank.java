package fr.ath.kata.multicurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bank {

    private Map<Pair, Integer> rates = new HashMap<>();

    public int rate(String sourceCurrency, String targetCurrency) {
        if (sourceCurrency.equals(targetCurrency)) {
            return  1;
        }
        return rates.get(new Pair(sourceCurrency, targetCurrency));
    }

    public Money reduce(Expression sourceExpression, String targetCurrency) {
       return sourceExpression.reduce(this, targetCurrency);
    }

    public void addRate(String sourceCurrency, String targetCurrency, int rate) {
        rates.put(new Pair(sourceCurrency, targetCurrency), rate);
    }


    private class Pair {
        private String sourceCurrency;
        private String targetCurrency;

        public Pair(String sourceCurrency, String targetCurrency) {
            this.sourceCurrency = sourceCurrency;
            this.targetCurrency = targetCurrency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Objects.equals(sourceCurrency, pair.sourceCurrency) &&
                    Objects.equals(targetCurrency, pair.targetCurrency);
        }

        @Override
        public int hashCode() {

            return Objects.hash(sourceCurrency, targetCurrency);
        }
    }

}
