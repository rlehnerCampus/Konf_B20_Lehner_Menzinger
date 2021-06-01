#Test

###WhiskeyTest

we used the
```@ParameterizedTest``` for the dilute Methode do test different test cases

for the void methods we used ```assertEquals()``` to give the test an expected value an check if it works

###Beer

we used different assert methods

```assertTrue() assertFalse() assertThrows```

for each method.

###CashRegisterTest
for methods with return values we used ```assertEquals()``` to give the test an expected value and check if it is the correct return value.
It's important to calculate with all adaptions of the in the setup defined objects. As the sell function returns true if the transaction is saved this is checked with ```assertTrue()``` 
If both parameters of the Revenue function (2 parameter signature) are empty, an exception should be thrown which is checked by ```assertThrows```




