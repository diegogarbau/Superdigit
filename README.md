# Super Digit problem

We define super digit of an integer _**x**_ using the following rules:

- If _**x**_ has only **1** digit, then its super digit is _**x**_.
- Otherwise, the super digit of _**x**_ is equal to the super digit of the digit-sum of _**x**_. Here, digit-sum of a number is defined as the sum of its digits.
  
For example, super digit of _**9875**_ will be calculated as:

```
super_digit(9875) = super_digit(9+8+7+5) 
                  = super_digit(29) 
                  = super_digit(2+9)
                  = super_digit(11)
                  = super_digit(1+1)
                  = super_digit(2)
                  = 2.
```
You are given two numbers _**n**_ and _**k**_. You have to calculate the super digit of _**P**_.

_**P**_ is created when number _**n**_ is concatenated _**k**_ times. That is, if _**n = 123**_ and _**k = 3**_, then _**P = 123123123**_.

               
#### Input Constraints

1 <= _**n**_ < 10<sup>100000</sup>

1 <= _**k**_ < 10<sup>5</sup>

**Note:** Assume these constraints mandatory for any function call, thus removing the need for checking

#### Sample
Given _**n = 148**_ and _**k = 3**_, super digit is _**3**_

Explanation

Here _**P = 148148148**_ that is _**148**_ concatenated _**3**_ times.

```
super_digit(P) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3.
``` 

#### Function Description

Implement the _**public int apply(String n, String k)**_ method in the SuperDigit interface. 
It must return the super-digit of P as described above.
