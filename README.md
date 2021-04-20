# Konf_B20_Lehner_Menzinger

## Changelog

### Christoph Menzinger:

#### Description: 

##### Task 1:
- extends new class "Whiskey.java" extends from Drink.java

- initialization of age, region and bottling of Whiskey.java

- implement new getter and setter of Whiskey.java

- create Whisky Jameson in main

- definition of the new whiskey in new main

- print information of the new whiskey "Jameson"

##### Task 2:

###### Change pom.xml for JUnit Test
- copied the pom.xml from the calculator example

###### Create new method in whiskey (dilute) 
- **to change the alcohol**
- the parameters of the method are a amount of alcohol and a amount of water
- the water gets divide by two
- then the alc gets subtract by water
- the method returns the new amount of alcohol

  ```java
    public int dilute(int alc, int water){}
  ````
###### Create the "test" folder" 
- in maven-standard

###### Create my Test class
  ```java
     class WhiskeyTest{}
  ```
- create/declare all tests
- init the ``` @BeforeEach```
  method for working with the same constructed object
- declare all test-methods 
- for my ```
          void testDilute(){} 
          ```
  i pre-calculated some tasks which i have passed the ``` @ParameterizedTest```
- init all tests an reached the 100% (**14 Tests**)

###### Used Sources:

[makeareadme](https://www.makeareadme.com "first steps in Docs")
 
[Markdown tutorial](https://www.youtube.com/watch?v=6A5EpqqDOdk "practical use")


##### Robert Lehner

- extends Drink.java with Beer.java

- initialization of super methods with override

- added javadoc informations 

- added a new Method 

- ```java
  public String[] commonBrands(String country [AT|DE]) throws Exception [if country is not from list]
      returns primitive String Array with the 10 most common brands
  ```

- added file header

- fixed bug in Beer.java isCommonIn - before "AT" was used instead of the parameter

- implemented in Main.java with output of the main facts

### Used sources

- Years of experience through training with recognised alcoholics
