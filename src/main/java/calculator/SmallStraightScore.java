package calculator;

import utils.YatzyUtil;

public class SmallStraightScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        if (counts[0] == 1 && counts[1] == 1 && counts[2] == 1 && counts[3] == 1 && counts[4] == 1) {
            return 15;
        }
        return 0;
    }
}