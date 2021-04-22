package at.fhj.iit;

public class Whiskey extends Drink{

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

    @Override
    public double getVolume() {
        return 0.5;
    }

    @Override
    public double getAlcoholPercent() {
        return 39;
    }

    @Override
    public boolean isAlcoholic() {
        return true;
    }

    public int getAge(){
        return this.age;
    }

    public String getRegion(){
        return this.region;
    }

    public String getBottling(){
        return this.bottling;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBottling(String bottling){
        this.bottling = bottling;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public int dilute(int alc, int water){
        int dilute = alc - water /2;
        return dilute;
    }
}





