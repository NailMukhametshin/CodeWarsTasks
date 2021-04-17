package kata678;

import kata678.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }

}