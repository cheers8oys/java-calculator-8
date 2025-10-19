package calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @Test
    @DisplayName("음수가 포함된 경우 IllegalArgumentException 발생 테스트")
    void testValidatingNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            NumberValidator.validateNumber("-1:2:6");
        });
    }

    @Test
    @DisplayName("숫자가 아닌 문자가 포함된 경우 IllegalArgumentException 발생 테스트")
    void testValidatingInvalidCharacterT() {
        assertThrows(IllegalArgumentException.class, () -> {
            NumberValidator.validateNumber("1:a:3");
        });
    }

    @Test
    @DisplayName("빈 문자열이거나 null일 경우 0을 반환하는 테스트")
    void testBlankOrNullReturnsZero() {
        assertEquals(0, NumberValidator.validateNumber(""));
        assertEquals(0, NumberValidator.validateNumber("   "));
        assertEquals(0, NumberValidator.validateNumber(null));
    }

    @Test
    @DisplayName("입력값이 Integer.MAX_VALUE를 초과하면 IllegalArgumentException 발생 테스트")
    void testValidatingIntegerOverflow() {
        assertThrows(IllegalArgumentException.class, () -> {
            NumberValidator.validateNumber("2147483648");
        });
    }
}
