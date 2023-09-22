package calculator;

import utils.YatzyUtil;

public class YatzyScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(int... dice) {
        int[] counts = YatzyUtil.countDice(dice);
        for (int count : counts) {
            if (count == 5) {
                return 50;
            }
        }
        return 0;
    }
}