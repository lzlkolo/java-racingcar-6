package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    public List<String> getCarNames() {
        List<String> carNames = new ArrayList<>();
        String inputCarNames = Console.readLine();
        return carNames;
    }
}