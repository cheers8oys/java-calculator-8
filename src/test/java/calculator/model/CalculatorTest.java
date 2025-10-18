package calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("더하기 기능 테스트")
    void testAddCalculator() {
        Calculator calculator = new Calculator("1, 2, 3");
        int sum = calculator.sum();
        assertEquals(6, sum);

    }
}