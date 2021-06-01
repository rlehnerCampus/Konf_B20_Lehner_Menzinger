/**
*   <h1>Konf_B20_Lehner_Menzinger - CashRegisterTest.java</h1>
*   <description>
*   @author Robert LEHNER <a href="mailto:robert.lehner@edu.campus02.at">robert.lehner@edu.campus02.at</a>
*   @version 2021-06-01
*/

package at.fhj.iit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashRegisterTest
{
    static Beer b1,b2,b3;
    static Whiskey w;
    static CashRegister c1,c2,c3;
    @BeforeAll
    static void setUp()
    {

        b1=new Beer("Freistaedter",0.5);
        b2=new Beer("Warsteiner",0.2,4.8);
        b3=new Beer("Stiegl",0.33,4.9);
        w = new Whiskey("whiskey", 12,"ireland","oak");
        c1=new CashRegister("Christoph");
        c2=new CashRegister("Robert");
        c3=new CashRegister("Christian");
    }

    @Test
    void sell()
    {
        assertTrue(c1.sell(b1.getPrice(),getType(b1.getAlcoholPercent())));
        assertTrue(c2.sell(b2.getPrice(),getType(b2.getAlcoholPercent())));
    }

    @Test
    void totalRevenue()
    {
        assertEquals(7,c3.totalRevenue(CashRegister.alcoholType.weak));
    }

    @Test
    void testTotalRevenue()
    {
    }

    @Test
    void getEmployee()
    {
    }

    @Test
    void setEmployee()
    {
    }
    private CashRegister.alcoholType getType(double percent)
    {
        CashRegister.alcoholType var;
        if(!b1.isAlcoholic())
            var = CashRegister.alcoholType.non;
        else if(b1.getAlcoholPercent()<=16)
            var = CashRegister.alcoholType.weak;
        else
            var = CashRegister.alcoholType.strong;
        return var;
    }
}
