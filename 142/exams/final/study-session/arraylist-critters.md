# ArrayList and Critters
## Final Study Session

### ArrayList
1. Write a static method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter String in the pair. For example, suppose that an ArrayList called "list" contains the following values:

	```
	("four", "score", "and", "seven", "years", "ago")
	```

	In the first pair of Strings ("four" and "score") the shorter String is "four". In the second pair of Strings ("and" and "seven") the shorter String is "and". In the third pair of Strings ("years" and "ago") the shorter string is "ago". Therefore, the call:

	```java
	removeShorterStrings(list);
	```

	should remove these shorter Strings, leaving the list with the following sequence of values after the method finishes executing:

	```
	("score", "seven", "years")
	```

	If there is a tie (both Strings have the same length), your method should remove the first String in the pair. If there is an odd number of Strings in the list, the final value should be kept in the list. For example, if the list contains the following values:

	```
	("to", "be", "or", "not", "to", "be", "hamlet")
	```

	After calling removeShorterStrings, it should contain the following:

	```
	("be", "not", "be", "hamlet")
	```

	You may assume that the ArrayList you are passed contains only Strings.

2. Write a static method called collapse that takes an ArrayList of Strings as a parameter and that collapses successive pairs into a single String. Each pair should be collapsed into a new String that has the two values inside parentheses and separated by a comma. For example, if a variable called "list" initially stores these values:

	```
	["four", "score", "and", "seven", "years", "ago"]
	```

	and we make the following call:

	```java
	collapse(list);
	```

	Your method should collapse the first pair into "(four, score)", the second pair into "(and, seven)" and the third pair into "(years, ago)" so that list stores the following values:

	```
	["(four, score)", "(and, seven)", "(years, ago)"]
	```

	Notice that the list goes from having 6 elements to having 3 elements because each successive pair is collapsed into a single value. If there are an odd number of values in the list, the final element is not collapsed. For example, if the original list had been:

	```
	["to", "be", "or", "not", "to", "be", "hamlet"]
	```

	It would again collapse pairs of values, but the final value ("hamlet") would not be collapsed, yielding this list:

	```
	["(to, be)", "(or, not)", "(to, be)", "hamlet"]
	```

3. Write a static method called expand that takes an ArrayList of integer values as a parameter and that replaces pairs of integer values with sequences of numbers. In particular, the ArrayList will contain pairs of numbers that indicate the number of occurrences of a particular value (in that order). For example, suppose a variable called list stores this sequence of values:

	```
	[2, 4, 3, 5, 1, 9, 12, 8]
	```

	The first pair indicates that we want 2 occurrences of the number 4. The second pair indicates that we want 3 occurrences of the number 5. The third pair indicates that we want 1 occurrence of the number 9. The final pair indicates that we want 12 occurrences of the number 8.  If we make the call:

	```java
	expand(list);
	```

	We expect that the ArrayList will store these values afterwards:

	```
	[4, 4, 5, 5, 5, 9, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8]
	```

	You may assume that the ArrayList stores a legal sequence of values, which means that it has an even length and all of the counts are greater than or equal to 1.

	You may not construct any extra data structures to solve this problem. You must solve it by manipulating the ArrayList you are passed as a parameter

### Critters
1. Write a class called Ferret that extends the Critter class. The instances of the Ferret class always infect when an enemy is in front of them, otherwise hop if possible, and otherwise randomly choose between turning left and turning right (each choice equally likely). Their appearance changes based on whether they recently attempted to infect. They initially display as `I=0` indicating that they have not attempted to infect recently. After an infect move, they should display as "I=5". As the ferret makes other moves that are not infecting, this display should change to `I=4`, `I=3`, `I=2`, `I=1`, and `I=0`. It should then stay at `I=0`. Notice, however, that it can go back to `I=5` in the middle of this process because it might infect again before reaching "I=0". The ferrets should be blue when they are displaying as "I=0" and red otherwise.

	Use a Random object to make random choices but each Ferret should construct only one such object. As in assignment 8, fields must be declared private, fields initialized to a non-default value must be set in a constructor, and all updates to fields must occur in the getMove method.

2. Write a class called Koala that extends the Critter class according to the following specifications:

	| Method | Description |
	| :--- | :--- |
	| Constructor | public Koala(boolean fighter) |
	| Color | Color.GRAY |
	| toString | default value |
	| getMove | Always infect if an enemy is in front and this koala is a fighter (when fighter is true) otherwise hop three times and then turn left; if hopping is not possible turn right until it is possible |

3. [Repeat form class Exercises] Write a class called Eagle that extends the Critter class. The instances of the Eagle class switch back and forth between red and blue in an increasing pattern. They should be red for one move and then blue for one move. Then they should be red for two moves and then blue for two moves. Then they should be red for three moves and then blue for three moves. Then they should be red for four moves and then blue for four moves. And so on, each time increasing the number of moves at a particular color by one. They should be displayed using a less-than character followed by a greater-than character (<>). They should always hop whenever possible. If they can't hop, they should turn right if there is a wall in front of them and otherwise they should infect.
