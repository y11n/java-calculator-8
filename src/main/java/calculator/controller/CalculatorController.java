package calculator.controller;

import calculator.model.AddCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    private final AddCalculator addCalculator;

    public CalculatorController(InputView inputView, OutputView outputView, AddCalculator addCalculator){
        this.inputView = inputView;
        this.outputView = outputView;
        this.addCalculator = addCalculator;
    }

    public void run() {
        String input = inputView.getInput();
        int result = addCalculator.add(input);
        outputView.printResult(result);
    }
}
