package calculator.model;

import java.util.List;

public class AddCalculator {
    public int add(String input) {
        Splitter splitter = new Splitter();
        List<String> numbers = splitter.split(input);

        return numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
