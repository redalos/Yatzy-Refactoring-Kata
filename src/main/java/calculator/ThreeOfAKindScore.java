package calculator;

import utils.YatzyUtil;

import java.util.List;
import java.util.Optional;

public class ThreeOfAKindScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        Optional<Integer> threeOfAKind = dice.stream()
            .filter( num -> java.util.Collections.frequency(dice, num) >= 3)
            .findFirst();

        return threeOfAKind.map(value -> value * 3).orElse(0);
    }
}