import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddition() {
        int result = Calculator.add(2, 3);
        assertEquals(5, result);
    }
}