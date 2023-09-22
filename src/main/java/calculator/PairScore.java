package calculator;

import utils.YatzyUtil;

public class PairScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        for (int i = 5; i >= 0; i--) {
            if (counts[i] >= 2) {
                return (i + 1) * 2;
            }
        }
        return 0;
    }
}