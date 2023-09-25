package calculator;

import utils.YatzyUtil;

import java.util.List;
import java.util.stream.IntStream;

public class LargeStraightScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        boolean largeStraight = IntStream.rangeClosed(2, 6)
            .allMatch(num -> dice.contains(num));

        return largeStraight ? YatzyUtil.LARGE_STRAIGHT_SCORE : 0;
    }
}