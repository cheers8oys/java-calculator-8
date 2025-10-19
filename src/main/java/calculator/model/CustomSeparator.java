package calculator.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSeparator implements NumberExtractor {

    @Override
    public List<Integer> extractNumbers(String inputValue) {

        int separatorIndex = inputValue.indexOf("\\n");
        if (separatorIndex == -1) {
            throw new IllegalArgumentException("잘못된 입력 형식입니다.");
        }

        String customSeparator = inputValue.substring(2, separatorIndex);
        String numbersPart = inputValue.substring(separatorIndex + 2);
        String[] numbers = numbersPart.split(java.util.regex.Pattern.quote(customSeparator));

        List<Integer> result = Arrays.stream(numbers)
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return result;

    }
}
