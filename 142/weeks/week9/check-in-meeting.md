_CSE 142_
# Check-in Meeting
## Week 9

1. In a few sentences, explain what is meant by the phrase Client (or Client Code).
2. Create a class called Name that represents a person’s name. The class should have encapsulated fields representing the person’s first name, last name, and middle initial. Add appropriate accessor methods to the class. Add methods called setFirstName, setMiddleInitial, and setLastName to your Name class. Give the parameters the same names as your fields, and use the this keyword in your solution. Then add the methods listed below to complete the class.

  | Method | Description |
  | :--- | :--- |
  | `public String getNormalOrder()` | Returns the person’s name in normal order, with the first name followed by the middle initial and last name. For example,if the first name is "John", the middle initial is "Q", and the last name is "Public", returns "John Q. Public". |
  | `public String getReverseOrder()` | Returns the person’s name in reverse order, with the last name preceding the first name and middle initial. For example, if the first name is "John", the middle initial is "Q", and the last name is "Public", returns "Public, John Q.". |

3. Write a class called RationalNumber that represents a fraction with an integer numerator and denominator. A RationalNumber object should have the following methods:

  | Method | Description |
  | :--- | :--- |
  | `public RationalNumber(int numerator, int denominator)` | Constructs a new rational number to represent the ratio (numerator/denominator). The denominator cannot be 0, so throw an IllegalArgumentException if 0 is passed |
  | `public RationalNumber()` | Constructs a new rational number to represent the ratio (0/1) |
  | `public int getDenominator()` | Returns this rational number’s denominator value; for example, if the ratio is (3/5), returns 5 |
  | `public int getNumerator()` | Returns this rational number’s numerator value; for example, if the ratio is (3/5), returns 3 |
  | `public String toString()` | Returns a String representation of this rational number, such as "3/5". You may wish to omit denominators of 1, returning "4" instead of "4/1" |
  
  [Optional] For an extra challenge, maintain your RationalNumber objects in reduced form, avoiding rational numbers such as 3/6 in favor of 1/2, or avoiding 2/–3 in favor of –2/3. Consider adding methods to add, subtract, multiply, and divide two rational numbers.
