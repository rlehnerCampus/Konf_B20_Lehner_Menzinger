/**
 *   Konf_B20_Lehner_Menzinger - Beer.java
 *   Extends the Drinks Class for Beer
 *   Author: Christoph Menzinger <christoph.menzinger@edu.campus02.at>
 *   Last Change: 2021-03-11
 */

package at.fhj.iit;

public interface RegisteredDrinks {

     double price = 0.0;
     String date = "20.02.1995";

     public abstract double getPrice();

     public abstract String getDate();

}
