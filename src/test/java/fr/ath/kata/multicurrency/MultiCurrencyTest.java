package fr.ath.kata.multicurrency;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiCurrencyTest {

    @Test
    public void should_return_ten_dollars_when_asked_twice_five_dollars () {
        Dollar fiveDollars = new Dollar(5);

        assertThat(fiveDollars.times(2)).isEqualTo(new Dollar(10));

        assertThat(fiveDollars.times(3)).isEqualTo(new Dollar(15));
    }

    @Test
    public void shoud_two_dollars_with_same_amount_be_equal() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }

}
