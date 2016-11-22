# Exercises
## Week 8

_This week you will be completing the whiteboard problems in pairs. Work together to solve the problems. You may complete the problems in any order._

__Partners__: Edward+Jonny, Kevin+Cheyenne, Vanessa+Courtney, Marie+Connor, Jorge+Lisa, Jayden+Donavan

1. Assume that the following method exists:

	```java
	// returns the order number of each letter (case-insensitive)
	public static int charToIndex(char letter)
	```

	For example:

	| Call | Returns |
	| :---  | :--- |
	| `charToIndex('a')` | 1 |
	| `charToIndex('A')` | 1 |
	| `charToIndex('e')` | 5 |
	| `charToIndex('Z')` | 26 |

	Write a static method isAnagram that accepts two words as parameters and returns whether the words are anagrams of each other. An anagram of a word is another word that uses the exact same letters. For example, "asleep" and "please" are anagrams as are "dad" and "add".

	| Call | Returns |
	| :--- | :--- |
	| `isAnagram("asleep", "please")` | `true` |
	| `isAnagram("dad", "add")` | `true` |
	| `isAnagram("yes", " no")` | `false` |
	| `isAnagram("yes", "yea")` | `false` |

	Hint: Tally letters

2. Write a static method canGo that accepts 3 parameters: a Scanner holding a sequence of strings representing sequential bus stops, a string representing a start location, and a string representing an end destination. The method should return true if the start location appears before the end location in the sequence of bus stops; otherwise, it should return false.

	For example, suppose a Scanner variable named stops contained the following bus stops:

	```
	UVillage   HUB    UW-Medical   MeanyHall   UW
	```

	Here are some example calls to the method and their expected return results

	| Call | Return Value |
	| :--- | :--- |
	| `canGo(stops, "UVillage", "MeanyHall")` | `true` |
	| `canGo(stops, "UW-Medical", "UW")  ` | `true` |
	| `canGo(stops, "MeanyHall", "UVillage")` | `false` |
	| `canGo(stops, "Earth", "UW-Medical") ` | `false` |

3. Write a static method maxWord that accepts a Scanner for an input file. Each line of input has a word followed by some positive numbers. The method should return the word with the maximum sum of numbers. You may assume that the input file is properly formatted and has at least one line.

	For example, given the following input file:

	```
	cse 142 176 148 561
	rocks 937 889
	computer 654 27878
	science 583
	4life 864 747
	```

	For a Scanner variable named input referring to the file above, the call of maxWord(input) would return computer, since it is followed by numbers whose sum is 28,532 (654 + 27878), which is more than any of the other sums.

4. Assume the following method exists:

	```java
	// returns true if the two integers are mirrors of each other
	// (i.e. one has the same digits in reverse order of the other)
	public static boolean areMirrors(int num1, int num2)
	```

	For example:

	| Call  | Returns |
	| :--- | :--- |
	| `areMirrors(3, 3)` | `true` |
	| `areMirrors(321, 123)` | `true` |
	| `areMirrors(25, 50)`   | `false` |
	| `areMirrors(101, 101)` | `true` |

	Write a static method areDeepMirrors that takes two integer arrays as parameters and returns true if the two arrays are deep mirrors of each other. Two integer arrays are deep mirrors of each other if each contains the mirrors of the elements of the other in reverse order. The following table shows some sample calls to areDeepMirrors, assume the call is areDeepMirrors(arr1, arr2):

	| arr1 value | arr2 value | Return Value |
	| :--- | :--- | :--- |
	| [ 123, 321 ] | [ 123, 321 ] | `true` |
	| [ 1, 2, 3 ] | [ 3, 2, 1 ] | `true` |
	| [ 12, 5, 71 ] | [ 17, 5, 21 ] | `true` |
	| [ 15, 10 ] | [ 10, 15 ] | `false` |
	| [ 12, 11, 13 ] | [ 21, 11, 31 ] | `false` |
	| [ 7 ] | [ 7 ] | `true` |

5. Write a static method called hasTwoPair that takes an array of integers in the range of 1 to 6 as a parameter and that returns whether or not the array contains two values that appear twice (true if it does, false if it does not).  This is a problem from the game of Yahtzee in which players roll five dice and look for various combinations, but your solution should not depend on the array containing five values.  You can, however, make use of the fact that all of the numbers will be in the range of 1 to 6.

	Your method should return true when exactly two values appearing in the array occur exactly two times.  If one value appears two times and another appears three times, that would not count as two pairs.  Similarly, if there are three numbers that appear two times, that would not count as two pairs.  There must be exactly two such numbers and each must occur exactly two times.  Below are examples of arrays and the value that should be returned for each by hasTwoPair:

	| Contents of array | Value returned |
	| :--- | :--- |
	| {2, 4, 2, 2, 4} | `false` |
	| {3, 4, 3, 6, 6} | `true` |
	| {4, 1, 4, 4, 2} | `false` |
	| {5, 5, 3, 3, 4} | `true` |
	| {6, 2, 6, 5, 3} | `false` |
	| {1, 3, 5, 3, 1} | `true` |
	| {3, 1, 3, 1} | `true` |
	| {1, 2, 3, 1, 2, 3} | `false` |

