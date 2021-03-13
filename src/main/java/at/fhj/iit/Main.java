package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);
        System.out.println();

        Whiskey j = new Whiskey("Jameson");
        System.out.println("New Whiskey: " + j.name);
        j.setAge(10);
        System.out.println("Age in years " + j.getAge());
        j.setBottling("Oak");
        System.out.println("Whiskey is bottled in: " + j.getBottling() + " barrels");
        j.setRegion("Irish");
        System.out.println("Region of the Whiskey: " + j.getRegion());
    }
}
