import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class YatzyTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        assertEquals(15, Yatzy.chance(Arrays.asList(2, 3, 4, 5, 1)));
        assertEquals(16, Yatzy.chance(Arrays.asList(3, 3, 4, 5, 1)));
        assertEquals(0, Yatzy.chance(Arrays.asList(0, 0, 0, 0, 0)));
    }

    @Test public void yatzy_scores_50() {
        assertEquals(50, Yatzy.yatzy(Arrays.asList(4, 4, 4, 4, 4)));
        assertEquals(50, Yatzy.yatzy(Arrays.asList(6, 6, 6, 6, 6)));
        assertEquals(0, Yatzy.yatzy(Arrays.asList(6, 6, 6, 6, 3)));
    }

    @Test public void test_1s() {
        assertEquals(1, Yatzy.ones(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(2, Yatzy.ones(Arrays.asList(1, 2, 1, 4, 5)));
        assertEquals(0, Yatzy.ones(Arrays.asList(6, 2, 2, 4, 5)));
        assertEquals(4, Yatzy.ones(Arrays.asList(1, 2, 1, 1, 1)));
    }

    @Test
    public void test_2s() {
        assertEquals(4, Yatzy.twos(Arrays.asList(1, 2, 3, 2, 6)));
        assertEquals(10, Yatzy.twos(Arrays.asList(2, 2, 2, 2, 2)));
    }

    @Test
    public void test_threes() {
        assertEquals(6, Yatzy.threes(Arrays.asList(1, 2, 3, 2, 3)));
        assertEquals(12, Yatzy.threes(Arrays.asList(2, 3, 3, 3, 3)));
    }

    @Test
    public void fours_test() 
    {
        assertEquals(12, new Yatzy(4, 4, 4, 5, 5).fours());
        assertEquals(8, new Yatzy(4, 4, 5, 5, 5).fours());
        assertEquals(4, new Yatzy(4, 5, 5, 5, 5).fours());
    }

    @Test
    public void fives() {
        assertEquals(10, new Yatzy(4,4,4,5,5).fives());
        assertEquals(15, new Yatzy(4,4,5,5,5).fives());
        assertEquals(20, new Yatzy(4,5,5,5,5).fives());
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new Yatzy(4,4,4,5,5).sixes());
        assertEquals(6, new Yatzy(4,4,6,5,5).sixes());
        assertEquals(18, new Yatzy(6,5,6,6,5).sixes());
    }

    @Test
    public void test_one_pair() {
        assertEquals(6, Yatzy.score_pair(Arrays.asList(3, 4, 3, 5, 6)));
        assertEquals(10, Yatzy.score_pair(Arrays.asList(5, 3, 3, 3, 5)));
        assertEquals(12, Yatzy.score_pair(Arrays.asList(5, 3, 6, 6, 5)));
    }

    @Test
    public void test_two_pair() {
        assertEquals(16, Yatzy.two_pair(Arrays.asList(3, 3, 5, 4, 5)));
        assertEquals(16, Yatzy.two_pair(Arrays.asList(3, 3, 5, 5, 5)));
    }

    @Test
    public void test_three_of_a_kind() {
        assertEquals(9, Yatzy.three_of_a_kind(Arrays.asList(3, 3, 3, 4, 5)));
        assertEquals(15, Yatzy.three_of_a_kind(Arrays.asList(5, 3, 5, 4, 5)));
        assertEquals(9, Yatzy.three_of_a_kind(Arrays.asList(3, 3, 3, 3, 5)));
    }

    @Test
    public void test_four_of_a_kind() {
        assertEquals(12, Yatzy.four_of_a_kind(Arrays.asList(3, 3, 3, 3, 5)));
        assertEquals(20, Yatzy.four_of_a_kind(Arrays.asList(5, 5, 5, 4, 5)));
    }

    @Test
    public void test_small_straight() {
        assertEquals(15, Yatzy.smallStraight(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(15, Yatzy.smallStraight(Arrays.asList(2, 3, 4, 5, 1)));
        assertEquals(0, Yatzy.smallStraight(Arrays.asList(1, 2, 2, 4, 5)));
    }

    @Test
    public void test_large_straight() {
        assertEquals(20, Yatzy.largeStraight(Arrays.asList(6, 2, 3, 4, 5)));
        assertEquals(20, Yatzy.largeStraight(Arrays.asList(2, 3, 4, 5, 6)));
        assertEquals(0, Yatzy.largeStraight(Arrays.asList(1, 2, 2, 4, 5)));
    }

    @Test
    public void test_full_house() {
        assertEquals(18, Yatzy.fullHouse(Arrays.asList(6, 2, 2, 2, 6)));
        assertEquals(0, Yatzy.fullHouse(Arrays.asList(2, 3, 4, 5, 6)));
    }
}
