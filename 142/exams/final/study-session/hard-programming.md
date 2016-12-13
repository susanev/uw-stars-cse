# Hard Programming
## Final Study Session

1. Write a static method blackjack that prints random numbers in the range of 1—10 until the sum of all integers generated are greater than or equal to 17. Then the sum is printed. If the sum is greater than 21, then the method prints out "Busted!"; if the sum is equal to 21, then the method prints out "BLACKJACK!". The method returns whether the sum was less than or equal to 21.

	Here are some example calls on blackjack():

	| Prints | Returns |
	| :--- | :--- |
	| 2 4 6 10 = 22 Busted! | `false` |
	| 2 2 1 5 7 = 17 | `true` |
	| 9 5 7 = 21 BLACKJACK! | `true` |
	| 5 6 3 2 10 = 26 Busted! | `false` |
	| 10 5 4 = 19 | `true` |

	As this method has an element of randomness to it, you are to copy the format of the output, not the exact output of the sample calls.

2. Write a static method called hasTwoPair that takes an array of integers in the range of 1 to 6 as a parameter and that returns whether or not the array contains two values that appear twice (true if it does, false if it does not). This is a problem from the game of Yahtzee in which players roll five dice and look for various combinations, but your solution should not depend on the array containing five values. You can, however, make use of the fact that all of the numbers will be in the range of 1 to 6.

	Your method should return true when exactly two values appearing in the array occur exactly two times. If one value appears two times and another appears three times, that would not count as two pairs. Similarly, if there are three numbers that appear two times, that would not count as two pairs. There must be exactly two such numbers and each must occur exactly two times. Below are examples of arrays and the value that should be returned for each by hasTwoPair:

	| Contents of array | Value returned |
	| :--- | :--- |
	| `{2, 4, 2, 2, 4}` | `false`
	| `{3, 4, 3, 6, 6}` | `true`
	| `{4, 1, 4, 4, 2}` | `false`
	| `{5, 5, 3, 3, 4}` | `true`
	| `{6, 2, 6, 5, 3}` | `false`
	| `{1, 3, 5, 3, 1}` | `true`
	| `{3, 1, 3, 1}` | `true`
	| `{1, 2, 3, 1, 2, 3}` | `false`

3. Write a static method called count that takes as parameters a target string and a source string and that returns a count of the number of occurrences of the target string in the source string. For example, the following call:

	```java
	count("i", "Mississippi");
	```

	should return 4 because there are 4 occurrences of the string "i" in the string "Mississippi". Your method should ignore case when comparing strings. For example, the call:

	```java
	count("iss", "MISSISSIPPI");
	```

	should return 2 because there are two occurrences of "iss" in "MISSISSIPPI". Your method should consider all possible starting positions for the target string. For example, given the following call:

	```java
	count("EE", "EeEeE");
	```

	Your method should return the value 4 because there are 4 different locations where the string "ee" occurs in the string "EeEeE" (starting at index 0, index 1, index 2, and index 3).

	You may assume that the target string is not empty.

4. Write a static method indexOf that takes two arrays of integers and that returns the index of the first occurrence of the first list in the second list or -1 if the first list does not appear in the second list. For example, suppose that you have two integer arrays called list1 and list2 that store the following values:

	```
	list1: (1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6)
	list2: (1, 3, 6)
	```

	then the call:

	```java
	indexOf(list2, list1);
	```

	should return 8 because the sequence of values stored in list2 appears in list1 starting with index 8. Notice that list2 actually appears twice in list1, starting at position 8 and starting at position 12. Your method is to return the first such position.

	If the second list is not contained in the first list, then the method should return the value -1. For example, if list1 had the same value as before but list2 stored (12, 1, 3, 6), then the call indexOf(list2, list1) should return -1 because list2 is not contained in list1. If the first list is empty, your method should return 0.

5. Write a static method called isMatch that takes a pattern string and a target string as parameters and that returns whether or not the given target matches the pattern. Patterns can contain special wildcard characters dot (`.`) and star (`*`). If a pattern does not contain any wildcards, then the target has to be the same string, as in isMatch("and", "and"). A dot can match any single character. For example, the pattern "a.." matches any 3-letter string beginning with the letter "a". A star can match any sequence of characters (including no characters). For example, the pattern "a*t" matches any string that begins with "a" and ends with "t", including "at". There will be at most one star in any given pattern, although a pattern can contain several dots and a star. Below are examples of patterns and matching strings (note that your method compares a pattern against a single string, not a list of strings).

	| Pattern | Matching strings |
	| :--- | :--- |
	| `"hello"` | hello |
	| `"..."` | and, ant, but, cat, cow, hat, sat, tap, ten, the, tot |
	| `"a..."` | atom, army, aunt, aura |
	| `".a.."` | bats, task, yard, saga, lava |
	| `"...a"` | tuna, soda, coma, aura, saga, lava |
	| `"....th"` | growth, zenith, health |
	| `"a*"` | a, an, at, and, ant, atom, aunt, apple, army, aura |
	| `"t*t"` | tot, that, trot, tiniest |
	| `"the*"` | the, then, there, therefore, thermal, thespians |
	| `".a*a"` | saga, lava, saliva, tarantula, nausea |
	| `"t.e.p*"` | twerp, trespass, thespians |
	| `".o*e."` | poem, token, wolves, voucher, toothbrushes |

	You are allowed to create new strings, but otherwise you are not allowed to construct extra data structures to solve this problem (no array, ArrayList, Scanner, etc). You are limited to the string methods listed on the cheat sheet.

6. Write a static method rearrange that takes an array of integers as an argument and that rearranges the values so that all of the multiples of 3 come first followed by numbers that are one greater than a multiple of 3 followed by numbers that are two greater than a multiple of 3. For example, if a variable called "list" stores this sequence of values:

	```
	(23, 12, 8, 0, 4, 80, 9, 7, 30, 99, 50, 42, 13, 47, 2, 16, 87, 75)
	```

	Then the following call:

	```java
	rearrange(list);
	```

	Should rearrange the values to look something like this:

	```
	(12, 0, 9, 30, 99, 42, 87, 75, 4, 13, 16, 7, 23, 47, 2, 50, 8, 80)
	-----------------------------  ------------  --------------------
	multiples of 3                1 more than a     2 more than a
	                              multiple of 3     multiple of 3
	````

	This is only one possible arrangement. Any arrangement that puts the multiples of 3 first followed by the values that are one more than a multiple of 3 followed by the values that are two more than a multiple of 3 is acceptable. You are not allowed to use an auxiliary data structure such as a temporary array or ArrayList to solve this problem. You may assume that all values in the array are greater than or equal to 0.
