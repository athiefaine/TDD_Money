package fr.ath.kata.multicurrency;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiCurrencyTest {

    @Test
    public void should_return_ten_dollars_when_asked_twice_five_dollars () {
        Dollar fiveDollars = new Dollar(5);

        Dollar tenDollars = fiveDollars.times(2);
        assertThat(tenDollars.amount).isEqualTo(10);

        Dollar fifteenDollars = fiveDollars.times(3);
        assertThat(fifteenDollars.amount).isEqualTo(15);

    }

    @Test
    public void shoud_two_dollars_with_same_amount_be_equal() {
        assertThat(new Dollar(5)).isEqualTo(new Dollar(5));
        assertThat(new Dollar(5)).isNotEqualTo(new Dollar(6));
    }

}
