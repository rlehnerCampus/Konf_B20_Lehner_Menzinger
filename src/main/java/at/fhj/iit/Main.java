package at.fhj.iit;

public class Main {

    private static CashRegister.alcoholType getType(double percent)
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


    public static void main(String[] args) throws Exception
    {

        Liquid l = new Liquid("Wein", 0.125, 13);
        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);
        System.out.println();

        Whiskey j = new Whiskey("whiskey", 12,"ireland","oak");
        System.out.println("New Whiskey: " + j.name);
        j.setAge(10);
        System.out.println("Age in years " + j.getAge());
        j.setBottling("Oak");
        System.out.println("Whiskey is bottled in: " + j.getBottling() + " barrels");
        j.setRegion("Irish");
        System.out.println("Region of the Whiskey: " + j.getRegion());

        Beer b = new Beer("Freistaedter",0.5);
        System.out.println("\nNew Beer: " + b.name);
        System.out.printf("Volume: %.1f%n",b.getVolume());
        System.out.printf("Percent: %.2f%n",b.getAlcoholPercent());
        System.out.printf("Is common in AT: %b%n",b.isCommonIn("AT"));
        System.out.printf("Is common in DE: %b%n",b.isCommonIn("DE"));

        CashRegister register = new CashRegister("Christoph");
        register.sell(j.getPrice(),getType(j.getAlcoholPercent()));

        System.out.println();
        System.out.println("Total Revenue: "+register.totalRevenue(j.getDate(),register.getEmployee()));

    }
}
