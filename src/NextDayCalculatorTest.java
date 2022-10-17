import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("case 1/1/2018")
    void testDay1Month1Year2018() {
        int dateTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String excepted = "2/1/2018";

        String result = NextDayCalculator.getNextDay(dateTest, monthTest, yearTest);
        assertEquals(excepted, result);

    }
}