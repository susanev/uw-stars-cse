_CSE 143_

# Recursive Programming
# Midterm Study Session

1. Write a recursive method indexOf that accepts two Strings as parameters and that returns the starting index of the first occurrence of the second String inside the first String (or -1 if not found). The table below lists several calls to your method and their expected return values. Notice that case matters, as in the last example that returns -1.

	| Call | Value returned |
	| :--- | :--- |
	| `indexOf("Barack Obama", "Bar")` | `0` |
	| `indexOf("Barack Obama", "ck")` | `4` |
	| `indexOf("Barack Obama", "a")` | `1` |
	| `indexOf("Barack Obama", "McCain")` | `-1` |
	| `indexOf("Barack Obama", "BAR")` | `-1` |

	Strings have an indexOf method, but you are not allowed to call it. You are limited to these methods:

	| Method | Description |
	| :--- | :--- |
	| `equals(other)` | returns true if the two strings contain the same characters |
	| `length()` | returns the number of characters in the string
	| `substring(fromIndex, toIndex)` `substring(fromIndex)` | returns a new string containing the characters from this string from fromIndex (inclusive) to toIndex (exclusive), or to the end of the string if toIndex is omitted |

	You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion.

1. Write a recursive method called digitsSorted that takes an integer as a parameter and returns true if the digits of the integer are sorted and false otherwise. The digits must be sorted in non-decreasing order (i.e. increasing order with duplicate digits allowed) when read from left to right. An integer that consists of a single digit is sorted by definition. The method should be also able to handle negative numbers. Negative numbers are also considered sorted if their digits are in non-decreasing order. The following table shows several calls to your method and their expected return values

	| Call | Value returned |
	| :--- | :--- |
	| `digitsSorted(0)` | `true` |
	| `digitsSorted(2345)` | `true` |
	| `digitsSorted(-2345)` | `true` |
	| `digitsSorted(22334455)` | `true` |
	| `digitsSorted(-5)` | `true` |
	| `digitsSorted(4321)` | `false` |
	| `digitsSorted(24378)` | `false` |
	| `digitsSorted(21)` | `false` |
	| `digitsSorted(-33331)` | `false` |

	You are not allowed to construct any structured objects other than strings (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion.

1. For this problem, write a method, mirrorString, that prints the parameter string both forward and backward on the same line as shown below. Notice in all cases that the final character in the string is only printed once (at the exact middle of the mirrored string) whereas all other characters are printed twice. If mirrorString is passed an empty string, it should not print anything.

	| Method call | Output produced |
	| :--- | :--- |
	| `mirrorString("");` | |
	| `mirrorString("a")` | `a` |
	| `mirrorString("bo")` | `bob` |
	| `mirrorString("How are you?")` | `How are you?uoy era woH` |

	You may assume that the String you are passed is not null. The String can contain any combination of characters and be of any length.

	You must use recursion for this problem; you may not use any loops.

1. Write a recursive method isReversal that takes two strings as parameters. The method should return true if the second string is the first string reversed. Your method should throw an IllegalArgumentException if the input strings are not the same length.

	You are not allowed to construct any structured objects other than Strings (no array, StringBuilder, ArrayList, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

	`isReversal("foo","oof");` returns true
	`isReversal("foaob","boqof");` returns false

1. Write a recursive method nthFromEnd that takes two nonnegative integers, num and n, as parameters and returns the digit that is n places before the rightmost digit in num. (This is like we are treating the ones digit as index 0, the tens digit as index 1, etc. If n refers to a place in num that does not exist, then the method should return 0 (as if num is padded with invisible zeros in the front). So nthFromEnd(12, 5) should return 0.

	| Method Call | Value Returned |
	| :--- | :--- |
	| `nthFromEnd(2801, 3)` | `2` |
	| `nthFromEnd(5, 2)` | `0` |
	| `nthFromEnd(14978, 1)` | `7` |
	| `nthFromEnd(458, 0)` | `8` |
	| `nthFromEnd(0, 0)` | `0` |
	| `nthFromEnd(56, 2)` | `0` |
	| `nthFromEnd(1234567890, 9)` | `1` |

	Your method should throw an IllegalArgumentException if either of the two parameters is negative. You are not allowed to construct any structured objects to solve this problem (no array, String, StringBuilder, ArrayList, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

1. Write a recursive method called sameDashes that takes two equal length strings as parameters and that returns whether or not they have dashes in the same positions (returning true if they do and returning false otherwise). For example, below are four pairs of strings that have the same pattern of dashes.

	```
	string1:    "hi--there-you."    "-15-389"    "criminal-plan"    "abc"
	               ||     |          |  |                 |   
	string2:    "12--(134)-7539"    "-xy-zzy"    "(206)555-1384"    "9.8"
	```

	Below are examples where the dashes don't match, sometimes because the number of dashes is different and sometimes because the positions of the dashes are different:

	```
	string1:    "is-this-okay?"     "1-2-3-4"    "a--b--c--d"    "384.5"
	string2:    "78--3421789!!"     "9876543"    "---1234---"    "718-3"
	```

	Your method should throw an IllegalArgumentException if the two strings are not of the same length.

	You are not allowed to construct any structured objects other than Strings (no array, ArrayList, StringBuilder, Scanner, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.