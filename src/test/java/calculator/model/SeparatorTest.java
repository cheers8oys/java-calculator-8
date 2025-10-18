package calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SeparatorTest {

    @Test
    @DisplayName("입력받은 문자열 기본 구분자로 숫자만 구분하기")
    void testDefalutSeparator() {
        Separator separator = new Separator();
        List<Integer> numbers = separator.extractNumbers("1,2,3");
        assertEquals(List.of(1, 2, 3), numbers);
    }

    @Test
    @DisplayName("입력받은 문자열 커스텀 구분자로 숫자만 구분하기")
    void testCustomSeparator() {
        CustomSeparator customSeparator = new CustomSeparator();
        List<Integer> numbers = customSeparator.extractNumbers("//*\n1*2*3");
        assertEquals(List.of(1, 2, 3), numbers);

    }
}
