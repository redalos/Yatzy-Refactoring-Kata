package calculator;

import utils.YatzyUtil;

import java.util.List;

public class YatzyScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        return dice.stream().distinct()
            .filter(num -> java.util.Collections.frequency(dice, num) == 5)
            .findFirst()
            .map(num -> YatzyUtil.YATZY_SCORE)
            .orElse(0);
    }
}