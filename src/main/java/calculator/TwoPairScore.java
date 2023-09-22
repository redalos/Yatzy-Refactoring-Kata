package calculator;

import utils.YatzyUtil;

public class TwoPairScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        int pairs = 0, score = 0;
        for (int i = 5; i >= 0; i--) {
            if (counts[i] >= 2) {
                pairs++;
                score += (i + 1);
            }
        }
        if (pairs == 2) {
            return score * 2;
        }
        return 0;
    }
}