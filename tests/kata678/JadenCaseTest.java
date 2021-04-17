package kata678;

import kata678.JadenCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JadenCaseTest {


    JadenCase jadenCase = new JadenCase();

    @Test
    public void test() {
        assertEquals( "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testEmptyArg() {
        assertNull(null, jadenCase.toJadenCase(""));
    }

    @Test
    public void testNullArg() {
        assertNull(null, jadenCase.toJadenCase(null));
    }
}

