package calculator.model;

import java.util.List;

public class Calculator {

    private String inputValue;

    public Calculator(String inputValue) {
        this.inputValue = inputValue;
    }

    public int sum() {
        Separator separator = new Separator();
        List<Integer> numbers = separator.extractNumbers(inputValue);
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

    }
}
