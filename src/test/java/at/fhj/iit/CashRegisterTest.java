package at.fhj.iit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

/**
*   <h1>Konf_B20_Lehner_Menzinger - CashRegisterTest.java</h1>
*   Testing CashRegister.java (100% Coverage)
*   @author Robert LEHNER <a href="mailto:robert.lehner@edu.campus02.at">robert.lehner@edu.campus02.at</a>
*   @version 2021-06-01
*/

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
    void testTotalRevenue() throws Exception
    {
        c3.sell(w.getPrice(),getType(w.getAlcoholPercent()));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date currentTime = new Date();
        assertEquals(19.5,c3.totalRevenue(formatter.format(currentTime),""));
        assertEquals(19.5,c3.totalRevenue(formatter.format(currentTime),"Christian"));
        assertEquals(0,c3.totalRevenue(formatter.format(currentTime),"Christoph"));
        assertEquals(0,c3.totalRevenue(formatter.format(currentTime),"Robert"));
        assertEquals(19.5,c3.totalRevenue("","Christian"));
        assertThrows(Exception.class,()-> c3.totalRevenue("",""));
    }

    @Test
    void getEmployee()
    {
        assertEquals("Christoph",c1.getEmployee());
        assertEquals("Robert",c2.getEmployee());
        assertEquals("Michael",c3.getEmployee());
    }

    @Test
    void setEmployee()
    {
        c3.setEmployee("Michael");
        assertEquals("Michael",c3.getEmployee());
    }
    private CashRegister.alcoholType getType(double percent)
    {
        CashRegister.alcoholType var;
        if(percent==0)
            var = CashRegister.alcoholType.non;
        else if(percent<=16)
            var = CashRegister.alcoholType.weak;
        else
            var = CashRegister.alcoholType.strong;
        return var;
    }
}
