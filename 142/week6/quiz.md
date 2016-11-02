# Quiz
## Week 6

### Quiz Problems
1. __randomWalk (15 points)__

	Write a static method called randomWalk that takes a Random object and a target position as parameters and that simulates a random walk. Your method should keep track of a current position that is initialized to 0. It should use the provided Random object to generate numbers to be added to the position that are between -2 and 2 inclusive with all possible values being equally likely. The simulation should end when the position reaches the provided target value and should report the maximum and minimum positions seen. For example, the following call:

  ```java
  Random r = new Random();
  randomWalk(r, 2); // indicates that the goal is 2
  ```

	It should produce output like the following:

	```
  goal = 2, pos = 0
  adding -1, pos = -1
  adding 2, pos = 1
  adding 2, pos = 3
  adding 1, pos = 4
  adding 0, pos = 4
  adding -2, pos = 2
  min = -1, max = 4
  ```
	Your method must exactly reproduce the format of this log.

2. __highLow (15 points)__

	Write a method highLow that takes a number, an integer, as a parameter and returns whether or not the number has alternating "high" and "low" digits. 0 through 4 are "low" digits and 5 through 9 are "high" digits. Your method should return true if the number passed alternates between "high" and "low" digits, and false if not. You may assume the number passed is positive. If the number passed consists of a single digit, highLow should return true.

	Note: highLow returns true if the number alternates starting with a "high" digit or starting with a "low" digit. What is important is that the digits alternate. For example, both 9292 and 2929 passed to highLow should return true.


3. __isBalanced (9 points)__

	Write a static method named isBalanced that accepts a String of parentheses and returns whether the parentheses in the String are balanced or not. To be balanced:
	* Every opening parenthesis must have a matching closing parenthesis after (to the right of) it.
	* Every closing parenthesis must have a matching opening parenthesis before (to the left of) it.

	You may assume that the String parameter only has opening and closing parentheses.

	Here are some example calls to the method:

	| __Call__ | __Returns__ |
	| :--- | :--- |
	| `isBalanced("")` | `true` |
	| `isBalanced("()")` | `true` |
	| `isBalanced("(")` | `false` |
	| `isBalanced(")")` | `false` |
	| `isBalanced("()(())")` | `true` |
	| `isBalanced("(())(())()")` | `true` |
	| `isBalanced(")()(")` | `false` |
	| `isBalanced(")(")` | `false` |
	| `isBalanced("())")` | `false` |
	| `isBalanced("((())")` | `false` |
	| `isBalanced("(())")` | `true` |
	
	Hint: You will want to do some counting.

### Extra Practice Problems

1. __eights (15 points)__
	
	Write a method called eights that takes a Random object and an integer n as parameters and that prints a series of sevens and eights separated by commas. Your method should use the Random object to produce a sequence of sevens and eights. Each time your method chooses a value, it should be equally likely to choose a seven or an eight. Your method should stop generating numbers when you see n eights in a row (where n is the second value passed as a parameter to the method).

	For example, if we construct a Random object and make the following calls:

	```java
	Random r = new Random();
	eights(r, 2);
	eights(r, 4);
	```

	We expect to get output like the following:

	```
	8, 7, 7, 7, 7, 7, 7, 8, 8
	8, 8, 7, 8, 7, 8, 7, 8, 8, 8, 7, 7, 7, 7, 7, 8, 7, 8, 8, 8, 8
	```

	Notice that we output the numbers "7" and "8", not the words "seven" and "eight". You must exactly reproduce the format of the log above, although the specific output produced will vary on different executions because of the use of the Random object to produce different sequences. You may assume that the integer passed as a parameter to your method is greater than 0.

2. __war (15 points)__

	Write a static method called war that takes a console Scanner and an integer n as parameters and simulates the twoplayer card game “war.” Each player starts the game with n cards. On each turn, the user is prompted for two values, each representing the value of the top card from Player 1 and Player 2’s deck, respectively. The player with the highest card takes both cards and puts them in their deck. If both cards are of equal value, there is a tie and each player keeps their card. Your method should continue prompting for cards until one of the players no longer has cards in their deck, at which point the game ends. You should then print out which player (Player 1 or Player 2) won the game.

	For example, below is a sample call on the method:

	```java
	Scanner console = new Scanner(System.in);
	war(console, 3);
	```

	This call would produce an interaction like the following (user input is in bold and underlined):

	```
	[3/3 card split] Top cards? 8 2
	[4/2 card split] Top cards? 7 7
	[4/2 card split] Top cards? 11 4
	[5/1 card split] Top cards? 2 7
	[4/2 card split] Top cards? 8 2
	[5/1 card split] Top cards? 7 7
	[5/1 card split] Top cards? 11 7
	Player 1 wins!
	```

	Notice that the method indicates how many cards each player has at the beginning of the turn and then prompts for the next set of cards. You may assume the user will always type valid input and the integer passed to your method is greater than 0.

3. __printListMin (15 points)__

	Write a static method called printListMin that takes a Random object and an integer n as a parameter and produces two lines of output, where the first line contains n randomly generated two-digit numbers, separated by a comma and a space, and the second line contains a phrase indicating the minimum value from the previous line. The method should use the Random object to select numbers in the range of 10 to 99 (inclusive) where each number is equally likely to be chosen. For example, given the following lines of code:

	```java
	Random r = new Random();
	printListMin(r, 3);
	printListMin(r, 5);
	```

	You would expect output like the following:

	```
	46, 32, 77
	min was 32
	88, 47, 54, 62, 19
	min was 19
	```

	You may assume that the value passed to your method is greater than or equal to 1. You are to exactly reproduce the format of these logs, though due to the randomness, your method is unlikely to produce the same values. Write your solution to printListMin below.

4. __largerDigits (9 points)__

	Write a static method named largerDigits that accepts two integer parameters a and b and returns a new integer c where each digit of c gets its value from the larger of a's and b's digit in the same place. That is, the ones digit of c is the larger of the ones digit of a and the ones digit of b, and the tens digit of c is the larger of the tens digit of a and the tens digit of b, and so on. You may assume that a and b are positive integers (greater than 0).

	For example, suppose a is 603452384 and b is 921782. Their digits would be combined as follows to produce c:

	```
	a        603452380
	b           920784
	------------------
	c           952784     (return value)
	```

	Notice that if a particular digit place is absent from one number or the other, such as the 603 at the start of a above, no digit is carried over to c. The following table lists some more calls to your method and their expected return values:

	| __Call__ | __Value Returned__ |
	| :--- | :--- |
	| `largerDigits(172, 312)` | 372 |
	| `largerDigits(21, 3)` | 3 |
	| `largerDigits(90, 38906735)` | 95 |
	| `largerDigits(56002, 123321)` | 56322 |
	| `largerDigits(11223, 4466)` | 4466 |
	| `largerDigits(12345, 12345)` | 12345 |
	| `largerDigits(1, 34892)` | 2 |

	Hint: If you are building a result number, you may need to use Math.pow or accumulate a multiplier with each digit.

	You may not use a String to solve this problem.

5. __areReversals (9 points)__

	Write a static method named areReversals that accepts two strings and returns true if the strings are reversals of each other, i.e. if one word is equal to the other word spelled backwards. Case does not matter.

	Here are some example calls to the method and their expected return results:

	| __Call__ | __Value Returned__ |
	| :--- | :--- |
  | `areReversals("hello", "goodbye")` | `false`
  | `areReversals("hello", "olleh")` | `true`
  | `areReversals("HELLO", "olleh")` | `true`
  | `areReversals("hello", "aolleh")` | `false`

  Write a method called isConsecutive that takes an integer n as a parameter and that returns true if the digits of n are consecutive. Recall that consecutive digits come one after another (1 followed by 2 followed by 3, and so on). Your method should return true for a one-digit number.

	The table below shows sample calls and the value that should be returned.

  | __Method Call__ | __Value Returned__ |  __Method Call__ | __Value Returned__ |
  | :--- | :--- | :--- | :--- |
  | `isConsecutive(0)` | `true` | `isConsecutive(8)` | `true` |
  | `isConsecutive(11)` | `false` | `isConsecutive(12)` | `true` |
  | `isConsecutive(21)` | `false` | `isConsecutive(22)` | `false` |
  | `isConsecutive(23)` | `true` | `isConsecutive(1235)` | `false` |
  | `isConsecutive(1234)` | `true` | `isConsecutive(89)` | `true` |
  | `isConsecutive(890)` | `false` | `isConsecutive(987)` | `false` |

	You may not use a String or other object to solve this problem. You may assume that the number passed to your method is not negative, but it might be 0.
