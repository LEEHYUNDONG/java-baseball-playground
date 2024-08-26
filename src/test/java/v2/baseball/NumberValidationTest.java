package v2.baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : lhd
 * @packageName : baseball.v2
 * @fileName : java-baseball-playground
 * @description :
 * <p>
 * ====================================================
 * DATE            AUTHOR              NOTE
 * ====================================================
 * 2024-08-23         lhd
 */
public class NumberValidationTest {

    @Test
    void validateTheNumberIsBetween0And9() {
        assertThat(NumberValidationUtils.validate(1)).isTrue();
        assertThat(NumberValidationUtils.validate(9)).isTrue();
    }
}
