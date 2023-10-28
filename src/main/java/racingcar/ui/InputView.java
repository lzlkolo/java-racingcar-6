package racingcar.ui;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.InputValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class InputView {
    public List<String> getCarNames() {
        List<String> carNames = new ArrayList<>();
        String inputCarNames = Console.readLine();
        InputValidation.validateInput(inputCarNames);

        StringTokenizer st = new StringTokenizer(inputCarNames, ",");
        while (st.hasMoreTokens()) {
            carNames.add(st.nextToken());
        }
        InputValidation.validateCarNames(carNames);

        return carNames;
    }

    public int getMoveCount() {
        String inputMoveCount = Console.readLine();
        InputValidation.validateMoveCount(inputMoveCount);
        int moveCount = Integer.parseInt(inputMoveCount);

        return moveCount;
    }
}