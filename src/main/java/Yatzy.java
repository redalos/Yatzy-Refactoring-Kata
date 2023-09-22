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

public class Yatzy {

    private static ScoreCalculatorInterface pairCalculator = new PairScore();
    private static ScoreCalculatorInterface twoPairCalculator = new TwoPairScore();
    private static ScoreCalculatorInterface threeOfAKindCalculator = new ThreeOfAKindScore();
    private static ScoreCalculatorInterface fourOfAKindCalculator = new FourOfAKindScore();
    private static ScoreCalculatorInterface smallStraightCalculator = new SmallStraightScore();
    private static ScoreCalculatorInterface largeStraightCalculator = new LargeStraightScore();
    private static ScoreCalculatorInterface fullHouseCalculator = new FullHouseScore();



    public static int chance(int... dice) {
        return YatzyUtil.sumOfAllDice(dice);
    }

    public static int yatzy(int... dice) {
        return new YatzyScore().calculate(dice);
    }

    public static int ones(int... dice) {
        return YatzyUtil.sumOfDiceWithNumber(1, dice);
    }

    public static int twos(int... dice) {
        return YatzyUtil.sumOfDiceWithNumber(2, dice);
    }

    public static int threes(int... dice) {
        return YatzyUtil.sumOfDiceWithNumber(3, dice);
    }

    protected int[] dice;

    public Yatzy(int d1, int d2, int d3, int d4, int d5) {
        this.dice = new int[]{d1, d2, d3, d4, d5};
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

    public static int score_pair(int... dice) {
        return pairCalculator.calculate(dice);
    }

    public static int two_pair(int... dice) {
        return twoPairCalculator.calculate(dice);
    }

    public static int three_of_a_kind(int... dice) {
        return threeOfAKindCalculator.calculate(dice);
    }

    public static int four_of_a_kind(int... dice) {
        return fourOfAKindCalculator.calculate(dice);
    }


    public static int smallStraight(int... dice) {
        return smallStraightCalculator.calculate(dice);
    }

    public static int largeStraight(int... dice) {
        return largeStraightCalculator.calculate(dice);
    }

    public static int fullHouse(int... dice) {
        return fullHouseCalculator.calculate(dice);
    }
}



