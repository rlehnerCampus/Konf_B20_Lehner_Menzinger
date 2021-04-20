package at.fhj.iit;

/*Project: Drinks
 *Package: at.fhj.iit
 *Description: TestFile for Whiskey.java
 *Author: Christoph Menzinger
 *Last Change:  20.04.2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyTest {
    Whiskey w;


    /**
     * inits the Whiskey for each test
     */
    @BeforeEach
    void setup(){
        w = new Whiskey("whiskey", 12,"ireland","oak");
    }

    /**
     * testing all getter methods by using the constructor of Whiskey w
     * and compared it with the solution i expect
     */
    @Test
    void getVolume() {
        assertEquals(0.5,w.getVolume());
    }

    @Test
    void getAlcoholPercent() {
        assertEquals(39,w.getAlcoholPercent());
    }

    @Test
    void isAlcoholic() {
        assertEquals(true,w.isAlcoholic());
    }

    @Test
    void getAge() {
        assertEquals(12,w.getAge());
    }

    @Test
    void getRegion() {
        assertEquals("ireland",w.getRegion());
    }

    @Test
    void getBottling() {
        assertEquals("ireland",w.getRegion());
    }


    /**
     * test all setter methods
     * use the setter method and use the "set" for my "expected"-part
     * the associated getter method is my correct result
     */
    @Test
    void setAge() {
        w.setAge(15);
        assertEquals(15,w.getAge());
    }

    @Test
    void setBottling() {
        w.setBottling("sherry");
        assertEquals("sherry",w.getBottling());
    }

    @Test
    void setRegion() {
        w.setRegion("scotland");
        assertEquals("scotland",w.getRegion());
    }

    /**
     *
     * @param number1 is my amount of alcohol
     * @param number2 is my amount of water (is divided by 2 in the method)
     * @param expected is the pre-calculated solution
     * create 5 test cases
     * Exercise phase: calling the method an use my parameters from the case
     * Verify compares the expected solution with the actual solution
     *                 ("actual" is the solution of the method)
     */
    @ParameterizedTest
    @CsvSource({
            " 40,  10,  35",
            " 38,  12,  32",
            " 56,  12,  50",
            " 60,  10,  55",
            " 35,  18,  26",
    })
    @DisplayName("Testing dilute")
    void testDilute(int number1, int number2, int expected) {
        // EXERCISE
        int actual = w.dilute(number1,number2);

        // VERIFY
        assertEquals(expected, actual);
    }
}