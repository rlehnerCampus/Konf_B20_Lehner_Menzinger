#Tutorial

###Whiskey
```java
 public Whiskey(String name, int age, String region, String bottling) {
        super(name);
        this.age = age;
        this.region = region;
        this.bottling = bottling;
    }
```
create a new whiskey to get an alcoholic Drink (extends Drink)
###Beer
```java
 public Beer(String name,double volume)
        {
        super(name);
        this.volume=volume;
        }
```
create a new Beer to get an alcoholic Drink (extends Drink)

###CashRegister
```java
 public Beer(String name,double volume)
        {
        super(name);
        this.volume=volume;
        }
```
#Hier beschreibung einfügen Robert

###Main
in main we call all constructors, and the CashRegister to use our methods
additionally we made a class to get the enums of the alcoholic drink
```java
enum alcoholType
{
    non,
    weak,
    strong
}
```
