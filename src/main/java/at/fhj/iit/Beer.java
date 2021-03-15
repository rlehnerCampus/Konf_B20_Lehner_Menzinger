/**
*   Konf_B20_Lehner_Menzinger - Beer.java
*   Extends the Drinks Class for Beer
*   Author: Robert LEHNER <robert.lehner@edu.campus02.at>
*   Last Change: 2021-03-11
*/

package at.fhj.iit;
public class Beer extends Drink
{
    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     */
    public Beer(String name)
    {
        super(name);
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume()
    {
        return 13.5;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent()
    {
        return 5.0;
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
    public String[] commonBrands(String country) throws Exception
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
            default: throw new Exception("No valid country");
        }
    }
}
