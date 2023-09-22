public class Yatzy {

    // Méthode générique pour compter les occurrences de chaque dé
    private static int[] countDice(int... dice) {
        int[] counts = new int[6];
        for (int die : dice) {
            counts[die - 1]++;
        }
        return counts;
    }

    // Méthode générique pour calculer la somme des dés ayant une certaine valeur
    private static int sumOfDiceWithNumber(int number, int... dice) {
        int sum = 0;
        for (int itDice : dice) {
            if (itDice == number) {
                sum += number;
            }
        }
        return sum;
    }
    // Méthode générique pour calculer la somme de tous les dés
    private static int sumOfAllDice(int... dice) {
        int sum = 0;
        for (int die : dice) {
            sum += die;
        }
        return sum;
    }

    public static int chance(int... dice) {
        return sumOfAllDice(dice);
    }

    public static int yatzy(int... dice) {
        int[] counts = countDice(dice);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 5) {
                return 50;
            }
        }
        return 0;
    }

    public static int ones(int... dice) {
        return sumOfDiceWithNumber(1, dice);
    }

    public static int twos(int... dice) {
        return sumOfDiceWithNumber(2, dice);
    }

    public static int threes(int... dice) {
        return sumOfDiceWithNumber(3, dice);
    }

    protected int[] dice;
    public Yatzy(int d1, int d2, int d3, int d4, int _5)
    {
        dice = new int[5];
        dice[0] = d1;
        dice[1] = d2;
        dice[2] = d3;
        dice[3] = d4;
        dice[4] = _5;
    }

    public int fours() {
        return sumOfDiceWithNumber(4, this.dice);
    }


    public int fives() {
        return sumOfDiceWithNumber(5, this.dice);
    }

    public int sixes() {
        return sumOfDiceWithNumber(6, this.dice);
    }

    public static int score_pair(int... dice) {
        int[] counts = countDice(dice);
        for (int i = 5; i >= 0; i--) {
            if (counts[i] >= 2) {
                return (i + 1) * 2;
            }
        }
        return 0;
    }

    public static int two_pair(int... dice) {
        int[] counts = countDice(dice);
        int pairs = 0, score = 0;
        for (int i = 5; i >= 0; i--) {
            if (counts[i] >= 2) {
                pairs++;
                score += (i + 1);
            }
        }
        if (pairs == 2) {
            return score * 2;
        }
        return 0;
    }

    public static int three_of_a_kind(int... dice) {
        int[] counts = countDice(dice);
        for (int i = 5; i >= 0; i--) {
            if (counts[i] >= 3) {
                return (i + 1) * 3;
            }
        }
        return 0;
    }

    public static int four_of_a_kind(int... dice) {
        int[] counts = countDice(dice);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 4) {
                return (i + 1) * 4;
            }
        }
        return 0;
    }


    public static int smallStraight(int... dice) {
        int[] counts = countDice(dice);
        if (counts[0] == 1 && counts[1] == 1 && counts[2] == 1 && counts[3] == 1 && counts[4] == 1) {
            return 15;
        }
        return 0;
    }

    public static int largeStraight(int... dice) {
        int[] counts = countDice(dice);
        if (counts[1] == 1 && counts[2] == 1 && counts[3] == 1 && counts[4] == 1 && counts[5] == 1) {
            return 20;
        }
        return 0;
    }


    public static int fullHouse(int... dice) {
        int[] counts = countDice(dice);
        int pairValue = 0, tripleValue = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 2) pairValue = i + 1;
            if (counts[i] == 3) tripleValue = i + 1;
        }
        if (pairValue > 0 && tripleValue > 0) {
            return pairValue * 2 + tripleValue * 3;
        }
        return 0;
    }
}



