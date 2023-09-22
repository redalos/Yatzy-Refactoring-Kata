package utils;

public class YatzyUtil {

    public static int[] countDice(int... dice) {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }
        return counts;
    }

    public static int sumOfDiceWithNumber(int number, int... dice) {
        int sum = 0;
        for (int die : dice) {
            if (die == number) {
                sum += number;
            }
        }
        return sum;
    }

    public static int sumOfAllDice(int... dice) {
        int sum = 0;
        for (int die : dice) {
            sum += die;
        }
        return sum;
    }
}