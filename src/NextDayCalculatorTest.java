import org.junit.jupiter.api.BeforeEach;
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

    @Test
    @DisplayName("case 31/1/2018")
    void testDay31Month1Year2018() {
        int dateTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String excepted = "1/2/2018";

        String result = NextDayCalculator.getNextDay(dateTest, monthTest, yearTest);
        assertEquals(excepted, result);
    }
    @Test
    @DisplayName("case 30/4/2018")
    void testDay30Month4Year2018() {
        int dateTest = 30;
        int monthTest = 4;
        int yearTest = 2018;
        String excepted = "1/5/2018";

        String result = NextDayCalculator.getNextDay(dateTest, monthTest, yearTest);
        assertEquals(excepted, result);
    }@Test
    @DisplayName("case 28/2/2018")
    void testDay28Month2Year2018() {
        int dateTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String excepted = "1/3/2018";

        String result = NextDayCalculator.getNextDay(dateTest, monthTest, yearTest);
        assertEquals(excepted, result);
    }
    @Test
    @DisplayName("case 29/2/2020")
    void testDay29Month2Year2020() {
        int dateTest = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String excepted = "1/3/2020";

        String result = NextDayCalculator.getNextDay(dateTest, monthTest, yearTest);
        assertEquals(excepted, result);
    }

}