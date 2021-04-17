package kata678;

import kata678.DRoot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrootTest {
    @Test
    public void Test1() {
        assertEquals(7, DRoot.digital_root(16));
    }

    @Test
    public void Test2() {
        assertEquals(6, DRoot.digital_root(456));
    }
}