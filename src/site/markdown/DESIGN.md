# Design decisions
The goal of the final task in the subject 'Configuration Management' 
was to implement CashRegister. 
We create an enum witch grouped the alcoholic drinks.

###Interface

We create an interface which gives all alcoholic drinks a price and a date.
All alcoholic drinks implements the **pseudo** getter methods from this interface.

###Selling

-In main we create a new methode were we get a enum...
```java
    .alcoholType.non;
    .alcoholType.weak;
    .alcoholType.strong;
  ````
for our given alcoholic drink.

-with this value we generate the price of our drink an put them in our method with the employee string to get the total revenue
