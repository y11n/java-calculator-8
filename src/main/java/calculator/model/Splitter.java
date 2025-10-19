package calculator.model;

import java.util.Arrays;
import java.util.List;

public class Splitter {
    private final String BASIC_DELIMITER = ",|:";

    public List<String> split(String input) {
        if(input == null || input.isEmpty()){
            return List.of("0");
        }
        return splitWithBasicDelimiter(input);
    }

    private List<String> splitWithBasicDelimiter(String input){
        return Arrays.asList(input.split(BASIC_DELIMITER));
    }

}
