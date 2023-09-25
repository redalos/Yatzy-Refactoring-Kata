package utils;

import java.util.List;

public class YatzyUtil {

    public static final int NUM_SIDES_ON_DIE = 6;
    public static final int FULL_HOUSE_SCORE_MULTIPLIER_THREE = 3;
    public static final int FULL_HOUSE_SCORE_MULTIPLIER_TWO = 2;
    public static final int SMALL_STRAIGHT_SCORE = 15;
    public static final int LARGE_STRAIGHT_SCORE = 20;
    public static final int YATZY_SCORE = 50;

    public static int sumOfDiceWithNumber(int number, List<Integer> dice) {
        return dice.stream().filter(die -> die == number).mapToInt(Integer::intValue).sum();
    }

    public static int sumOfAllDice(List<Integer> dice) {
        return dice.stream().mapToInt(Integer::intValue).sum();
    }

    public static void validateDice(List<Integer> dice) {
        if (dice.size() != 5) {
            throw new IllegalArgumentException("Invalid number of dice");
        }
        if (dice.stream().anyMatch(die -> die < 1 || die > NUM_SIDES_ON_DIE)) {
            throw new IllegalArgumentException("Die value out of bounds");
        }
    }
}