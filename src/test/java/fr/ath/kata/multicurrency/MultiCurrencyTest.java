package fr.ath.kata.multicurrency;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiCurrencyTest {

    @Test
    public void should_test_dollar_multiplication() {
        Dollar fiveDollars = new Dollar(5);

        assertThat(fiveDollars.times(2)).isEqualTo(new Dollar(10));

        assertThat(fiveDollars.times(3)).isEqualTo(new Dollar(15));
    }

    @Test
    public void should_test_euro_multiplication() {
        Euro fiveEuros = new Euro(5);

        assertThat(fiveEuros.times(2)).isEqualTo(new Euro(10));

        assertThat(fiveEuros.times(3)).isEqualTo(new Euro(15));
    }

    @Test
    public void should_test_equality() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }

}
