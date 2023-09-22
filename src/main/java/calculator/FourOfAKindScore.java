package calculator;

import utils.YatzyUtil;

public class FourOfAKindScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 4) {
                return (i + 1) * 4;
            }
        }
        return 0;
    }
}