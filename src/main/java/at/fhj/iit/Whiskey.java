/**
 *   Konf_B20_Lehner_Menzinger - Beer.java
 *   Extends the Drinks Class for Beer
 *   Author: Christoph Menzinger <christoph.menzinger@edu.campus02.at>
 *   Last Change: 2021-03-11
 */

package at.fhj.iit;

public class Whiskey extends Drink implements RegisteredDrinks{

    private int age;
    private String region;
    private String bottling;

    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     */
    public Whiskey(String name, int age, String region, String bottling) {
        super(name);
        this.age = age;
        this.region = region;
        this.bottling = bottling;
    }

    /**
     * getter for Volume
     * @return always 0.5
     */
    @Override
    public double getVolume() {
        return 0.5;
    }

    /**
     * getter for AlcoholPercent
     * @return always 39
     */
    @Override
    public double getAlcoholPercent() {
        return 39;
    }

    /**
     * boolean value if Drink contains Alcohol
     * @return for whiskey always True
     */
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    /**
     * getter
     * @return age of the Whiskey
     */
    public int getAge(){
        return this.age;
    }

    /**
     * getter
     * @return Region String of the Whiskey
     */
    public String getRegion(){
        return this.region;
    }

    /**
     * getter
     * @return Botlling of the Whiskey
     */
    public String getBottling(){
        return this.bottling;
    }

    /**
     * setter
     * @param age of Whiskey
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * setter
     * @param bottling of Whiskey
     */
    public void setBottling(String bottling){
        this.bottling = bottling;
    }

    /**
     * setter
     * @param region of Whiskey
     */
    public void setRegion(String region){
        this.region = region;
    }

    /**
     * dilute Whiskey
     * @param water amout of water
     * @return dilute value of the Whiskey
     */
    public int dilute(int water){
        int dilute = (int) (this.getAlcoholPercent() - water /2);
        return dilute;
    }

    /**
     * set Price for Whiskey
     */
    @Override
    public double getPrice() {
        double price = 30.90;
        return price;
    }

    /**
     * set Date for Whiskey
     */
    @Override
    public String getDate() {
        String date = "01.06.2021";
        return date;
    }

}





