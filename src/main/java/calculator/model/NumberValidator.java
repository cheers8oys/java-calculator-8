package calculator.model;

import java.util.regex.Pattern;

public class NumberValidator {

    private static final Pattern DIGIT_PATTERN = Pattern.compile("^-?\\d+$");

    public static int validateNumber(String inputValue) {
        if (inputValue == null || inputValue.isBlank()) {
            return 0;
        }

        if (!DIGIT_PATTERN.matcher(inputValue.trim()).matches()) {
            throw new IllegalArgumentException("숫자가 아닌 문자가 포함되어 있습니다.");
        }

        int number = Integer.parseInt(inputValue);
        if (number < 0) {
            throw new IllegalArgumentException("음수는 허용되지 않습니다.");
        }

        if (number > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("최대 2147483647까지 계산 가능합니다. 더 작은 수만 입력해주세요.");
        }
        return number;
    }
}
