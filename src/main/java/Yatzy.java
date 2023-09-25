import calculator.FourOfAKindScore;
import calculator.FullHouseScore;
import calculator.LargeStraightScore;
import calculator.PairScore;
import calculator.ScoreCalculatorInterface;
import calculator.SmallStraightScore;
import calculator.ThreeOfAKindScore;
import calculator.TwoPairScore;
import calculator.YatzyScore;
import utils.YatzyUtil;

import java.util.Arrays;
import java.util.List;

public class Yatzy {

    private static ScoreCalculatorInterface pairCalculator = new PairScore();
    private static ScoreCalculatorInterface twoPairCalculator = new TwoPairScore();
    private static ScoreCalculatorInterface threeOfAKindCalculator = new ThreeOfAKindScore();
    private static ScoreCalculatorInterface fourOfAKindCalculator = new FourOfAKindScore();
    private static ScoreCalculatorInterface smallStraightCalculator = new SmallStraightScore();
    private static ScoreCalculatorInterface largeStraightCalculator = new LargeStraightScore();
    private static ScoreCalculatorInterface fullHouseCalculator = new FullHouseScore();


    public static int chance(List<Integer> dice) {
        return YatzyUtil.sumOfAllDice(dice);
    }


    public static int yatzy(List<Integer> dice) {
        return new YatzyScore().calculate(dice);
    }

    public static int ones(List<Integer> dice) {
        return YatzyUtil.sumOfDiceWithNumber(1, dice);
    }

    public static int twos(List<Integer> dice) {
        return YatzyUtil.sumOfDiceWithNumber(2, dice);
    }

    public static int threes(List<Integer> dice) {
        return YatzyUtil.sumOfDiceWithNumber(3, dice);
    }

    protected List<Integer> dice;

    public Yatzy(Integer... dice) {
        this.dice = Arrays.asList(dice);
    }

    public int fours() {
        return YatzyUtil.sumOfDiceWithNumber(4, this.dice);
    }


    public int fives() {
        return YatzyUtil.sumOfDiceWithNumber(5, this.dice);
    }

    public int sixes() {
        return YatzyUtil.sumOfDiceWithNumber(6, this.dice);
    }

    public static int score_pair(List<Integer> dice) {
        return pairCalculator.calculate(dice);
    }

    public static int two_pair(List<Integer> dice) {
        return twoPairCalculator.calculate(dice);
    }

    public static int three_of_a_kind(List<Integer> dice) {
        return threeOfAKindCalculator.calculate(dice);
    }

    public static int four_of_a_kind(List<Integer> dice) {
        return fourOfAKindCalculator.calculate(dice);
    }


    public static int smallStraight(List<Integer> dice) {
        return smallStraightCalculator.calculate(dice);
    }

    public static int largeStraight(List<Integer> dice) {
        return largeStraightCalculator.calculate(dice);
    }

    public static int fullHouse(List<Integer> dice) {
        return fullHouseCalculator.calculate(dice);
    }
}



