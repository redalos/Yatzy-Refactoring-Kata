package calculator;

import utils.YatzyUtil;

public class ThreeOfAKindScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        for (int i = 5; i >= 0; i--) {
            if (counts[i] >= 3) {
                return (i + 1) * 3;
            }
        }
        return 0;
    }
}