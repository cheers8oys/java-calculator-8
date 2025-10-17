package calculator;

import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        inputView.readInputValue();

        OutputView outputView = new OutputView();
        outputView.printResult(1);

    }
}
