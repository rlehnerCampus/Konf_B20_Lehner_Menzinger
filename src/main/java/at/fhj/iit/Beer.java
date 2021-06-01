/**
*   Konf_B20_Lehner_Menzinger - Beer.java
*   Extends the Drinks Class for Beer
*   Author: Robert LEHNER <robert.lehner@edu.campus02.at>
*   Last Change: 2021-03-11
*/

package at.fhj.iit;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;

public class Beer extends Drink implements RegisteredDrinks
{
    private double volume = 0.5;
    private double percent = 5.134;

    /**
     * Creates a Beer object with given name, e.g. Budweiser or Freistaedter
     *
     * @param name name of the drink
     */
    public Beer(String name)
    {
        super(name);
    }

    /**
     * Creates a Beer object with given name, e.g. Budweiser or Freistaedter
     *
     * @param name name of the drink
     * @param volume volume of the drink in l
     */
    public Beer(String name,double volume)
    {
        super(name);
        this.volume=volume;
    }

    /**
     * Creates a Beer object with given name, e.g. Budweiser or Freistaedter
     *
     * @param name name of the drink
     * @param volume volume of the drink in l
     * @param percent alcohol percentage
     */
    public Beer(String name,double volume,double percent)
    {
        super(name);
        this.volume=volume;
        this.percent=percent;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume()
    {
        return this.volume;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent()
    {
        return this.percent;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic()
    {
        return true;
    }

    /**
     *
     * @param country (DE or AT)
     * @return List of common brands in the country
     * @throws Exception if country is not DE or AT
     */
    public String[] commonBrands(String country) throws InvalidPropertiesFormatException
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
        switch(country)
        {
            case "DE": return brandsDE;
            case "AT": return brandsAT;
            default: throw new InvalidPropertiesFormatException("No valid country");
        }
    }

    /**
     * Checks if member var title is a common brand in a certain country
     * @param country
     * @return true if it is, false if it's not
     * @throws Exception to check if catch block works
     */
    public boolean isCommonIn(String country) throws Exception
    {
        try
        {
            ArrayList<String> cmn = new ArrayList<> (Arrays.asList(this.commonBrands(country)));
            if(cmn.contains(this.name))
                return true;
        }
        catch(Exception e)
        {
            throw new Exception("An Error occurred.");
        }
        return false;
    }

    /**
     * set Price for Beer
     */
    @Override
    public void setPrice() {
        double price = 4.50;
    }

    /**
     * set Date for Beer
     */
    @Override
    public void setDate() {
        String date = "28.05.2021";
    }

    /**
     * set Date for Beer
     */
    @Override
    public void setEmployee() {
        String employee = "Bernhard";
    }
}
