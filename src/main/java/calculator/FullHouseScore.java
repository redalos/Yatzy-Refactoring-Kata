package calculator;

import utils.YatzyUtil;

import java.util.List;
import java.util.stream.Collectors;

public class FullHouseScore implements ScoreCalculatorInterface {

    public int calculate(List<Integer> dice) {
        YatzyUtil.validateDice(dice);
        List<Integer> distinctDice = dice.stream().distinct().collect(Collectors.toList());
        int pairValue = 0, tripleValue = 0;

        for (Integer num : distinctDice) {
            int freq = java.util.Collections.frequency(dice, num);
            if (freq == 2) pairValue = num;
            if (freq == 3) tripleValue = num;
        }

        if (pairValue > 0 && tripleValue > 0) {
            return pairValue * YatzyUtil.FULL_HOUSE_SCORE_MULTIPLIER_TWO + tripleValue * YatzyUtil.FULL_HOUSE_SCORE_MULTIPLIER_THREE;
        }
        return 0;
    }
}