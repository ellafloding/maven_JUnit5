import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("3 + 2 = 5")
   void addsTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(3,2), "3+2 should equal 5");
    }

    @Test
    @DisplayName("3 - 2 = 1")
    void subtractsTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3,2), "3-2 should equal 1");
    }

}