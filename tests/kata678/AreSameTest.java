package kata678;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreSameTest {

    @Test
    public void test() {
        assertEquals(true, AreSame.comp(new int[]{0, 1, 6, 7, 6, 5, 8, 8, 4, 0, 7, 10, 2, 9, 10, 6, 3, 7, 5, 2, 0, 4, 0, 1, 1, 2, -3},
                new int[]{0, 64, 16, 16, 0, 36, 0, 36, 25, 81, 49, 36, 100, 1, 4, 1, 49, 1, 64, 4, 0, 4, 49, 9, 100, 25, 9}));
    }

}