package calculator.util;

import java.util.List;

public final class ValidatorUtils {
    private static final String BASIC_DELIMITER = ",|:";

    public static void validateBasicDelimiter(String input){
        // 커스텀 구분자("//")로 시작하면 검증 스킵
        if(input.startsWith("//")) {
            return;
        }
        // 기본 구분자 외의 문자가 포함된 경우 예외 발생
        if(!input.matches("[0-9" + BASIC_DELIMITER + "]+")){
            throw new IllegalArgumentException("허용되지 않은 구분자가 포함되어 있습니다.");
        }
    }

    public static void validateAllPositive(List<String> numbers) throws IllegalArgumentException{
        for(String num : numbers){
            if(Integer.parseInt(num) < 0){
                throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
            }
        }
    }
}
