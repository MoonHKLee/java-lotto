package lotto;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    void createLotto() {
        //given
        Lotto lotto = new Lotto();

        //when
        List<Integer> numbers = lotto.getNumbers();

        //then
        assertThat(numbers).doesNotHaveDuplicates();
    }
}
