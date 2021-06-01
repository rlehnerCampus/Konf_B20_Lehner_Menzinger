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
 public CashRegister(String employee)
        {
        this.employee=employee;
        }
```
At startup of the cash register an employee has to log in. The user can be changed through getter and setter.

The most important function is sell with true as return value if the transaction was done.
With the parameters given and data the cash register gets by itself as the today's date or the logged in employee.
The alcohol Type is an enum, explained in the next paragraph.
```java
 /**
 * Sell a product
 * @param price Price of the product
 * @param val enum Alcohol Type Value
 * @return true if sale was done
 */
public boolean sell(double price,alcoholType val)
        {
        SimpleDateFormat formatter = new SimpleDateFormat(
        "yyyy-MM-dd");
        Date currentTime = new Date();
        HashMap<String,String> sale = new HashMap<>();
        sale.put("employee",this.employee);
        sale.put("price",String.valueOf(price));
        sale.put("day",formatter.format(currentTime));
        sale.put("alcoholType",val.toString());
        return sales.add(sale);
        }
```

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
