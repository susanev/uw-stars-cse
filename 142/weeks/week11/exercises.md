# Exercises
## Week 11

_This week you will be completing the whiteboard problems in pairs. Work together to solve the problems. You may complete the problems in any order._

__Partners__: Edward+Jonny, Marie+Cheyenne, Vanessa+Jorge, Kevin+Connor, Jayden+Lisa, Courtney+Donavan

1. Critters. Write a class called Eagle that extends the Critter class. The instances of the Eagle class switch back and forth between red and blue in an increasing pattern. They should be red for one move and then blue for one move. Then they should be red for two moves and then blue for two moves. Then they should be red for three moves and then blue for three moves. Then they should be red for four moves and then blue for four moves. And so on, each time increasing the number of moves at a particular color by one.  

	They should be displayed using a less-than character followed by a greater-than character (&#60;&#62;).

	They should always hop whenever possible. If they can't hop, they should turn right if there is a wall in front of them and otherwise they should infect.

2. ArrayList. Write a static method manyStrings that takes an ArrayList of Strings and an integer n as parameters and that replaces every String in the original list with n of that String. For example, suppose that an ArrayList called "list" contains the following values:

	```
	("squid", "octopus") 
	```

	And you make the following call:

	```java
	manyStrings(list, 2);
	```

	Then list should store the following values after the call:

	```
	("squid", "squid", "octopus", "octopus")
	```

	As another example, suppose that list contains the following:

	```
	("a", "a", "b", "c")
	```

	and you make the following call:

	```java
	manyStrings(list, 3);
	```

	Then list should store the following values after the call:

	```
	("a", "a", "a", "a", "a", "a", "b", "b", "b", "c", "c", "c")
	```

	You may assume that the ArrayList you are passed contains only Strings and that the integer n is greater than 0.

3. Write a static method named allPlural that accepts an array of strings as a parameter and returns true only if every string in the array is a plural word, and false otherwise. For this problem a plural word is defined as any string that ends with the letter S, case-insensitively. The empty string "" is not considered a plural word, but the single-letter string "s" or "S" is. Your method should return true if passed an empty array (one with 0 elements).

	The table below shows calls to your method and the expected values returned:

	| Array | Call and Value Returned |
	| :--- | :--- |
	| `String[] a1 = {"snails", "DOGS", "Cats"};` | allPlural(a1) returns true |
	| `String[] a2 = {"builds", "Is", "S", "THRILLs", "CS"};` | allPlural(a2) returns true |
	| `String[] a3 = {};` | allPlural(a3) returns true |
	| `String[] a4 = {"She", "sells", "sea", "SHELLS"};` | allPlural(a4) returns false |
	| `String[] a5 = {"HANDS", "feet", "toes", "OxEn"};` | allPlural(a5) returns false |
	| `String[] a6 = {"shoes", "", "socks"};` | allPlural(a6) returns false |

	Your method should not modify the array's elements.