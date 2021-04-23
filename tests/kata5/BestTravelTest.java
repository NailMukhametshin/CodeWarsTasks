package kata5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTravelTest {
    List<Integer> ts;
    int n;

    @Test
    public void BasicTests1() {
        ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        n = BestTravel.chooseBestSum(163, 3, ts);
        assertEquals(163, n);
    }

    @Test
    public void BasicTests2() {
        ts = new ArrayList<>(Arrays.asList(50));
        Integer m = BestTravel.chooseBestSum(163, 3, ts);
        assertEquals(null, m);
    }

    @Test
    public void BasicTests3() {
        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        n = BestTravel.chooseBestSum(230, 3, ts);
        assertEquals(228, n);
    }
}