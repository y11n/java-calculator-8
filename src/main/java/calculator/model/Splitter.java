package calculator.model;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitter {
    private final String BASIC_DELIMITER = ",|:";

    public List<String> split(String input) {
        if(input == null || input.isEmpty()){
            return List.of("0");
        }
        if (input.startsWith("//")) {
            return splitWithCustomDelimiter(input);
        } else {
            return splitWithBasicDelimiter(input);
        }
    }

    private List<String> splitWithBasicDelimiter(String input){
        return Arrays.asList(input.split(BASIC_DELIMITER));
    }

    private List<String> splitWithCustomDelimiter(String input) {
        Pattern pattern = Pattern.compile("//(.*)\\\\n(.*)");
        Matcher matcher = pattern.matcher(input);

        if(!matcher.matches()){
            throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
        }
        String delimiter = matcher.group(1);
        String numbers = matcher.group(2);
        return Arrays.asList(numbers.split(delimiter));
    }
}
