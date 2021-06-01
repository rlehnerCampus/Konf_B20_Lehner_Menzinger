package at.fhj.iit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InvalidPropertiesFormatException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>Konf_B20_Lehner_Menzinger - BeerTest.java</h1>
 * Testing all methods of the beer class
 *
 * @author Robert LEHNER <a href="mailto:robert.lehner@edu.campus02.at">robert.lehner@edu.campus02.at</a>
 * @version 2021-04-21
 */

class BeerTest
{
    Beer b1,b2,b3,b4;

    /**
     * Creates Beer Objects before each Test
     */
    @BeforeEach
    void createObject()
    {
       b1=new Beer("Freistaedter",0.5);
       b2=new Beer("Warsteiner",0.2,4.8);
       b3=new Beer("Stiegl",0.33,4.9);
       b4=new Beer("Becks");
    }
    @Test
    void getVolume()
    {
        assertEquals(0.5,b1.getVolume());
        assertEquals(0.2,b2.getVolume());
        assertEquals(0.33,b3.getVolume());
        assertEquals(0.5,b4.getVolume());
    }

    @Test
    void getAlcoholPercent()
    {
        assertEquals(5.134,b1.getAlcoholPercent());
        assertEquals(4.8,b2.getAlcoholPercent());
        assertEquals(4.9,b3.getAlcoholPercent());
        assertEquals(5.134,b4.getAlcoholPercent());
    }

    @Test
    void isAlcoholic()
    {
        assertTrue(b1.isAlcoholic());
        assertTrue(b2.isAlcoholic());
        assertTrue(b3.isAlcoholic());
        assertTrue(b4.isAlcoholic());
    }

    @Test
    void commonBrands() throws InvalidPropertiesFormatException
    {
        String[] brandsAT = new String[10];
        brandsAT[0]="Goesser";
        brandsAT[1]="Stiegl";
        brandsAT[2]="Ottakringer";
        brandsAT[3]="Zipfer";
        brandsAT[4]="Hirter";
        brandsAT[5]="Puntigamer";
        brandsAT[6]="Schwechater";
        brandsAT[7]="Wieselburger";
        brandsAT[8]="Freistaedter";
        brandsAT[9]="Murauer";
        String[] brandsDE = new String[10];
        brandsDE[0]="Krombacher";
        brandsDE[1]="Oettinger";
        brandsDE[2]="Bittburger";
        brandsDE[3]="Veltins";
        brandsDE[4]="Becks";
        brandsDE[5]="Paulaner";
        brandsDE[6]="Warsteiner";
        brandsDE[7]="Hasseroeder";
        brandsDE[8]="Radeberger";
        brandsDE[9]="Erdinger";
        assertArrayEquals(brandsAT,b1.commonBrands("AT"));
        assertArrayEquals(brandsDE,b2.commonBrands("DE"));
        assertThrows(InvalidPropertiesFormatException.class,()-> b3.commonBrands("XY"));
    }

    @Test
    void isCommonIn() throws Exception
    {
        assertTrue(b1.isCommonIn("AT"));
        assertFalse(b1.isCommonIn("DE"));
        assertTrue(b2.isCommonIn("DE"));
        assertFalse(b2.isCommonIn("AT"));
        assertFalse(b3.isCommonIn("DE"));
        assertTrue(b3.isCommonIn("AT"));
        assertTrue(b4.isCommonIn("DE"));
        assertFalse(b4.isCommonIn("AT"));
        assertThrows(Exception.class,()-> b3.isCommonIn(""));
    }
}