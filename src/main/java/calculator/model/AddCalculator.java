package calculator.model;

import calculator.util.ValidatorUtils;

import java.util.List;

public class AddCalculator {
    public int add(String input) {
        // 기본 구분자 사용 시, 기본 구분자 외의 문자가 포함되었는지 검증
        ValidatorUtils.validateBasicDelimiter(input);

        Splitter splitter = new Splitter();
        List<String> numbers = splitter.split(input);

        // numbers 배열의 모든 값이 양수인지 확인
        ValidatorUtils.validateAllPositive(numbers);

        return numbers.stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
