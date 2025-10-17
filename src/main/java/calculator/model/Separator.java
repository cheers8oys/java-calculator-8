package calculator.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Separator {

    public static final String DEAULT_SAPARATOR = "[,:]";

    public List<Integer> extractNumbers(String inputValue) {

        String[] numbers = inputValue.split(DEAULT_SAPARATOR);

        List<Integer> result = Arrays.stream(numbers)
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return result;

    }
}
