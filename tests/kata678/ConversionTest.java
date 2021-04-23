package kata678;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {

    @Test
    public void shouldConvertToRoman() {
        assertEquals("I", Conversion.solution(1));
        assertEquals("IV", Conversion.solution(4));
        assertEquals("VI", Conversion.solution(6));
    }
}
