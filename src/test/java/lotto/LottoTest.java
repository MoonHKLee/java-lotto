package lotto;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    @Test
    @DisplayName("로또는 중복된 번호가 없다.")
    void createLotto_duplicate() {
        //given
        Lotto lotto = new Lotto();

        //when
        List<Integer> numbers = lotto.getNumbers();

        //then
        assertThat(numbers).doesNotHaveDuplicates();
    }

    @Test
    @DisplayName("로또는 1~45의 번호를 갖는다.")
    void createLotto_range() {
        //given
        Lotto lotto = new Lotto();

        //when
        List<Integer> numbers = lotto.getNumbers();

        //then
        assertThat(numbers)
                .allMatch(number -> number >= 1)
                .allMatch(number -> number <= 45);
    }

    @Test
    @DisplayName("로또는 6개의 번호를 갖는다.")
    void createLotto_count() {
        //given
        Lotto lotto = new Lotto();

        //when
        List<Integer> numbers = lotto.getNumbers();

        //then
        assertThat(numbers).hasSize(6);
    }
}
