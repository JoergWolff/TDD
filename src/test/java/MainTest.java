import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test() {
        int result = Calculator.add(2, 3);
        assertEquals(5, result);
    }
}