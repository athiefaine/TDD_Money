package fr.ath.kata.multicurrency;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MultiCurrencyTest {

    @Test
    public void should_return_ten_dollars_when_asked_twice_five_dollars () {
        // GIVEN
        Dollar fiveDollars = new Dollar(5);

        //WHEN
        fiveDollars.times(2);

        //THEN
        Assertions.assertThat(fiveDollars.amount).isEqualTo(10);

    }

}
