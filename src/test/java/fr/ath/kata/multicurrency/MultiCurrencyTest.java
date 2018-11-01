package fr.ath.kata.multicurrency;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MultiCurrencyTest {

    @Test
    public void should_return_ten_dollars_when_asked_twice_five_dollars () {
        Dollar fiveDollars = new Dollar(5);

        Dollar tenDollars = fiveDollars.times(2);
        Assertions.assertThat(tenDollars.amount).isEqualTo(10);

        Dollar fifteenDollars = fiveDollars.times(3);
        Assertions.assertThat(fifteenDollars.amount).isEqualTo(15);

    }

}
