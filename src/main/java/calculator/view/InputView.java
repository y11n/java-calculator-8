package calculator.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.NoSuchElementException;

public class InputView {
    public String getInput() {
        System.out.println("콘솔에 덧셈할 문자열을 입력해 주세요.");
        try {
            return Console.readLine();
        } catch (NoSuchElementException e) {
            // 입력이 없으면 빈 문자열 반환
            return "";
        }
    }
}
