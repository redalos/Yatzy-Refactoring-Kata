package calculator;

import utils.YatzyUtil;

import java.util.List;
import java.util.stream.Collectors;

public class TwoPairScore implements ScoreCalculatorInterface {
    @Override
    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        List<Integer> pairs = dice.stream()
            .filter(num -> java.util.Collections.frequency(dice, num) >= 2)
            .distinct()
            .collect(Collectors.toList());

        if (pairs.size() == 2) {
            return pairs.stream().mapToInt(Integer::intValue).sum() * 2;
        }

        return 0;
    }
}