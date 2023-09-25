package calculator;

import utils.YatzyUtil;

import java.util.List;
import java.util.stream.IntStream;

public class SmallStraightScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        boolean smallStraight = IntStream.rangeClosed(1, 5)
            .allMatch(dice::contains);

        return smallStraight ? YatzyUtil.SMALL_STRAIGHT_SCORE : 0;
    }

}