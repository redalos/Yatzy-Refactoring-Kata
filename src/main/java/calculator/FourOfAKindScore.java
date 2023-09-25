package calculator;

import utils.YatzyUtil;

import java.util.List;
import java.util.Optional;

public class FourOfAKindScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        Optional<Integer> fourOfAKind = dice.stream()
            .filter(num -> java.util.Collections.frequency(dice, num) >= 4)
            .findFirst();

        return fourOfAKind.map(value -> value * 4).orElse(0);
    }
}