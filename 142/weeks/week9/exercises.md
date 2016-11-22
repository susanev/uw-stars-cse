# Exercises
## Week 9

### From Week 8 [Quiz](../week8/quiz.md)
1. Write a static method called acronym that takes as a parameter a String containing a phrase and that returns an acronym for the phrase. For example, the following call:

	```java
	acronym("self-contained underwater breathing apparatus")
	```

	should return "SCUBA". The acronym is formed by combining the capitalized first letters of each word in the phrase.  Words in the phrase will be separated by some combination of dashes and spaces. There might be extra spaces or dashes at the beginning or end of the phrase.  The String will not contain any characters other than dashes, spaces, and letters, and is guaranteed to contain at least one word.  Below are several sample calls.

	| Method Call | Value Returned |
	| :--- | :--- |
	| `acronym("   automatic   teller   machine  ")` | "ATM" |
	| `acronym("personal identification number")` | "PIN" |
	| `acronym("computer science")` | "CS" |
	| `acronym("merry-go-round")` | "MGR" |
	| `acronym("All my Children")` | "AMC" |
	| `acronym("Troubled Assets Relief Program")` | "TARP" |
	| `acronym("--quite-- confusing - punctuation-")` | "QCP" |
	| `acronym("  loner  ")` | "L" |

### From Week 8 [Exercies](../week8/exercises.md)
1. Write a static method canGo that accepts 3 parameters: a Scanner holding a sequence of strings representing sequential bus stops, a string representing a start location, and a string representing an end destination. The method should return true if the start location appears before the end location in the sequence of bus stops; otherwise, it should return false.

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

2. Write a static method maxWord that accepts a Scanner for an input file. Each line of input has a word followed by some positive numbers. The method should return the word with the maximum sum of numbers. You may assume that the input file is properly formatted and has at least one line.

	For example, given the following input file:

	```
	cse 142 176 148 561
	rocks 937 889
	computer 654 27878
	science 583
	4life 864 747
	```

	For a Scanner variable named input referring to the file above, the call of maxWord(input) would return computer, since it is followed by numbers whose sum is 28,532 (654 + 27878), which is more than any of the other sums.
  
3. Write a static method called hasTwoPair that takes an array of integers in the range of 1 to 6 as a parameter and that returns whether or not the array contains two values that appear twice (true if it does, false if it does not).  This is a problem from the game of Yahtzee in which players roll five dice and look for various combinations, but your solution should not depend on the array containing five values.  You can, however, make use of the fact that all of the numbers will be in the range of 1 to 6.

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

### New Problems
1. Write a static method called switchPairs that switches the order of elements in an array of integers in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, suppose that a variable called list stores the following:

  ```
  [12, 4, 8, 7, 9, -3]
  ```

  This list has three pairs: (12, 4), (8, 7), and (9, -3).  Thus, the call:

  ```java
  switchPairs(list);
  ```

  should leave the list with these values:

  ```
  [4, 12, 7, 8, -3, 9]
  ```

  Notice that each pair has been switched. If there are an odd number of values in the list, the final element should not be moved.  For example, if the original list had been:

  ```
  [12, 4, 8, 7, 9, -3, 42]
  ```

  It would again switch pairs of values, but the final value (42) would not be moved, yielding this list:

  ```
  [4, 12, 7, 8, -3, 9, 42]
  ```

  You may not construct any extra data structures to solve this problem.

2. Write a static method called splitPairs that takes an array of integers as a parameter and that returns a new array containing the result of splitting successive pairs of numbers so that the first values from each pair appear first followed by the second values from each pair. For example, suppose that a variable called list stores the following:

  ```
  [3, 8, 4, 9, 7, 2]
  ```

  This list has three pairs: (3, 8), (4, 9), and (7, 2). Thus, the call splitPairs(list) should return the following array:

  ```
  [3, 4, 7, 8, 9, 2]
  ```

  Notice that this list contains the first values from each pair (3, 4, 7) followed by the second values from each pair (8, 9, 2).  If there is an extra value that is not part of a pair, then it should be included with the first set of values in the new array.  For example, if list stores:

  ```
  [7, 5, 3, 2, 8, 4, 6]
  ```

  then the call splitPairs(list) should return:

  ```
  [7, 3, 8, 6, 5, 2, 4]
  ```

  The value 6 in the original list is not part of a pair.  Notice that the new array has the first values from each pair (7, 3, 8) followed by 6 followed by the second values from each pair (5, 2, 4). The method should not construct any extra data structures other than the array to be returned and it should not alter its parameter.

3. Write a static method called encode that takes a string s and an integer n as parameters and that returns a new string that scrambles the order of the characters from s in a particular way. Taking the characters from s in order, imagine filling a grid of n rows column by column.  When s is "abcdefghijklmnopqrstuvwxyz" and n is 3, you get:

  ```
  row 1:       a d g j m p s v y
  row 2:       b e h k n q t w z
  row 3:       c f i l o r u x
  ```

  The method should return the result of concatenating these characters together with row 1 first, then row 2, and then row 3. Notice that the final column will not necessarily be complete, as in the example above where the final column has only two characters.  So if you make the call:

  ```java
  encode("abcdefghijklmnopqrstuvwxyz", 3);
  ```

  You should get back the string "adgjmpsvybehknqtwzcfilorux". The string might contain any characters, including spaces.  For example, the call:

  ```java
  encode("four score and seven", 4);
  ```

  returns "f rneosedvuc eroasn" because the following grid would be produced:

  ```
  row 1:       f   r n e
  row 2:       o s e d v
  row 3:       u c     e
  row 4:       r o a s n
  ```

  You may assume that the string passed as a parameter is not empty and that the integer passed as a parameter is greater than or equal to 1 and less than the length of the string. You are not allowed to construct any structured objects other than strings to solve this problem (no array, ArrayList, etc).
