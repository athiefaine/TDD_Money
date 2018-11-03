package fr.ath.kata.multicurrency;

import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class MultiCurrencyTest {

    @Test
    public void should_test_dollar_multiplication() {
        Money fiveDollars = Money.dollar(5);

        assertThat(fiveDollars.times(2)).isEqualTo(Money.dollar(10));

        assertThat(fiveDollars.times(3)).isEqualTo(Money.dollar(15));
    }

    @Test
    public void should_test_dollar_addition() {
        Bank bank = new Bank();

        Expression sum = Money.dollar(5).plus(Money.dollar(3));
        Money reduced = bank.reduce(sum, "USD");
        assertThat(reduced).isEqualTo(Money.dollar(8));
    }

    @Test
    public void should_test_plus_returns_sum() {
        Money fiveDollars = Money.dollar(5);
        Money threeDollars = Money.dollar(3);
        Expression result = fiveDollars.plus(threeDollars);
        Sum sum = (Sum) result;
        assertThat(sum.augend).isEqualTo(fiveDollars);
        assertThat(sum.addend).isEqualTo(threeDollars);
    }

    @Test
    public void should_test_reduce_with_sum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertThat(result).isEqualTo(Money.dollar(7));
    }

    @Test
    public void should_test_reduce_with_money() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertThat(result).isEqualTo(Money.dollar(1));
    }

    @Test
    public void should_test_reduce_with_different_currencies() {
        Bank bank = new Bank();
        bank.addRate("USD", "EUR", 2);
        Money result = bank.reduce(Money.dollar(4), "EUR");
        assertThat(result).isEqualTo(Money.euro(2));
    }

    @Test
    public void should_test_currency() {
        assertThat(Money.dollar(1).getCurrency()).isEqualTo("USD");
        assertThat(Money.euro(1).getCurrency()).isEqualTo("EUR");
    }

    @Test
    public void should_test_identity_rate() {
        assertThat(new Bank().rate("USD", "USD")).isEqualTo(1);
    }

    @Test
    public void should_test_equality() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.euro(5));
    }


}
