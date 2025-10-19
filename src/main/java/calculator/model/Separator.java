package calculator.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Separator implements NumberExtractor {

    public static final String DEAULT_SAPARATOR = "[,:]";
    private final NumberExtractor customSeparator = new CustomSeparator();

    @Override
    public List<Integer> extractNumbers(String inputValue) {

        if (inputValue.startsWith("//")) {
            return customSeparator.extractNumbers(inputValue);
        }

        String[] numbers = inputValue.split(DEAULT_SAPARATOR);
        List<Integer> result = Arrays.stream(numbers)
                .map(String::trim)
                .map(NumberValidator::validateNumber)
                .collect(Collectors.toList());
        return result;

    }
}
