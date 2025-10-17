package calculator.model;

import java.util.ArrayList;
import java.util.List;

public class Separator {

    public List<Integer> extractNumbers(String inputValue) {

        String separator = "[,:]";
        String[] numbers = inputValue.split(separator);
        List<Integer> result = new ArrayList<>();
        for (String num : numbers) {
            num = num.trim();
            int number = Integer.parseInt(num);
            result.add(number);
        }
        return result;

    }
}
