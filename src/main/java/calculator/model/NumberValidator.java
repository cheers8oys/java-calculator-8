package calculator.model;

import java.util.regex.Pattern;

public class NumberValidator {

    private static final Pattern DIGIT_PATTERN = Pattern.compile("^-?\\d+$");
    private static final String NEGATIVE_NUMBER_MSG = "음수는 허용되지 않습니다.";
    private static final String INAPPROPRIATE_CHARACTERS_MSG = "부적절한 문자가 포함되어 있습니다.";
    private static final String MAX_VALUE_MSG = "최대 2147483647까지 계산 가능합니다. 더 작은 수만 입력해주세요.";

    public static int validateNumber(String inputValue) {
        if (inputValue == null || inputValue.isBlank()) {
            return 0;
        }

        if (!DIGIT_PATTERN.matcher(inputValue.trim()).matches()) {
            throw new IllegalArgumentException(INAPPROPRIATE_CHARACTERS_MSG);
        }

        int number = Integer.parseInt(inputValue);
        if (number < 0) {
            throw new IllegalArgumentException(NEGATIVE_NUMBER_MSG);
        }

        if (number > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(MAX_VALUE_MSG);
        }
        return number;
    }
}
