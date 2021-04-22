package at.fhj.iit;

/*Project: Drinks
 *Package: at.fhj.iit
 *Description: TestClass of Whiskey.java
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

    @BeforeEach
    void setup(){
        w = new Whiskey("whiskey", 12,"ireland","oak");
    }
    @Test
    @DisplayName("Testing getVolume")
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

    @ParameterizedTest
    @CsvSource({
            " 40,  10,  35",
            " 38,  12,  32",
            " 56,  12,  50",
            " 60,  10,  55",
            " 35,  18,  26",
    })
    @DisplayName("Testing dilute")
    void testAdd(int addend1, int addend2, int expected) {
        // EXERCISE PHASE
        int actual = w.dilute(addend1,addend2);

        // VERIFY PHASE
        assertEquals(expected, actual);
    }
}