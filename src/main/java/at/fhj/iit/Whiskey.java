package at.fhj.iit;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Whiskey extends Drink{

    private int age;
    private String region;
    private String bottling;

    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     */
    public Whiskey(String name) {
        super(name);
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 39;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
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
}



