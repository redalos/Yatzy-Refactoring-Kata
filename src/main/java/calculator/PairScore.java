package calculator;

import utils.YatzyUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PairScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        Optional<Integer> maxPair = dice.stream()
            .sorted(Comparator.reverseOrder() )
            .distinct()
            .filter( num -> java.util.Collections.frequency(dice, num) >= 2)
            .findFirst();

        return maxPair.map(value -> value * 2).orElse(0);
    }
}