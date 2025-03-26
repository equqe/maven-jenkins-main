import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.Main;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(5, Main.add(2, 3), "2 + 3 should equal 5");
    }
}