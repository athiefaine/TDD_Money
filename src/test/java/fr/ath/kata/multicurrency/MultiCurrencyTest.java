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
    public void should_test_euro_multiplication() {
        Money fiveEuros = Money.euro(5);

        assertThat(fiveEuros.times(2)).isEqualTo(Money.euro(10));

        assertThat(fiveEuros.times(3)).isEqualTo(Money.euro(15));
    }

    @Test
    public void should_test_currency() {
        assertThat(Money.dollar(1).getCurrency()).isEqualTo("USD");
        assertThat(Money.euro(1).getCurrency()).isEqualTo("EUR");
    }

    @Test
    public void should_test_equality() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(6));
        assertThat(Money.euro(5)).isEqualTo(Money.euro(5));
        assertThat(Money.euro(5)).isNotEqualTo(Money.euro(6));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.euro(5));
    }

}
