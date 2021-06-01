package at.fhj.iit;

/**
 * represents a simple drink liquid which can be used in drinks
 */
public class SimpleDrink extends Drink implements RegisteredDrinks{

    /**
     * uses only one liquid
     */
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     */
    SimpleDrink(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Simple Drink called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }

    /**
     * set Price for SimpleDrink
     */
    @Override
    public double getPrice() {
        double price = 5.90;
        return price;
    }

    /**
     * set Date for SimpleDrink
     */
    @Override
    public String getDate() {
        String date = "01.11.2021";
        return date;
    }


}
