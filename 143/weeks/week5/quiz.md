_CSE 143_
# Quiz
## Week 5

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