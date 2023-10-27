package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class InputValidationTest {
    @Test
    void 정상_입력() {
        assertDoesNotThrow(() -> InputValidation.containsNumber("tayo"));
    }

    @Test
    void 문자열_처음에_숫자_입력_시_예외_처리() {
        assertThatThrownBy(() -> InputValidation.containsNumber("2tayo"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 문자열_사이에_숫자_입력_시_예외_처리() {
        assertThatThrownBy(() -> InputValidation.containsNumber("ta2yo"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 문자열_마지막에_숫자_입력_시_예외_처리() {
        assertThatThrownBy(() -> InputValidation.containsNumber("tayo2"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}