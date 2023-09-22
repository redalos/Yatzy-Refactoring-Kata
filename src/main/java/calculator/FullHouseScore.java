package calculator;

import utils.YatzyUtil;

public class FullHouseScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        int pairValue = 0, tripleValue = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 2) pairValue = i + 1;
            if (counts[i] == 3) tripleValue = i + 1;
        }
        if (pairValue > 0 && tripleValue > 0) {
            return pairValue * 2 + tripleValue * 3;
        }
        return 0;
    }
}