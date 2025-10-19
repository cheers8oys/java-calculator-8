package calculator.controller;

import calculator.model.Calculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        String inputValue = readInputValue();
        int sum = calculateSum(inputValue);
        displayResult(sum);
    }

    private String readInputValue() {
        return inputView.readInputValue();
    }

    private int calculateSum(String inputValue) {
        Calculator calculator = new Calculator(inputValue);
        return calculator.sum();
    }

    private void displayResult(int result) {
        outputView.printResult(result);

    }
}
