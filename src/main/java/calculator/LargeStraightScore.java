package calculator;

import utils.YatzyUtil;

public class LargeStraightScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        if (counts[1] == 1 && counts[2] == 1 && counts[3] == 1 && counts[4] == 1 && counts[5] == 1) {
            return 20;
        }
        return 0;
    }
}