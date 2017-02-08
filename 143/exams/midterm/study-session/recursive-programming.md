_CSE 143_

# Recursive Programming
## Midterm Study Session

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

1. Write a method writeSquares that takes an integer n as a parameter and that writes the first n squares to System.out separated by commas with the odd squares in descending order followed by the even squares in ascending order. For example, the call:

	```java
	writeSquares(5);
	```

	should produce the following output:

	```
	25, 9, 1, 4, 16
	```

	The odd squares (25, 9, and 1) appear first in descending order followed by the even squares (4 and 16) in ascending order. Notice that commas are used to separate consecutive values in the list. Your method should send its output to System.out and should not call println. For example, the following calls:

	```java
	writeSquares(5);
	System.out.println();  // to complete the line of output
	writeSquares(1);
	System.out.println();  // to complete the line of output
	writeSquares(8);
	System.out.println();  // to complete the line of output
	```

	should produce exactly three lines of output:

	```
	25, 9, 1, 4, 16
	1
	49, 25, 9, 1, 4, 16, 36, 64
	```

	You must exactly reproduce the format of these examples. Your method should throw an IllegalArgumentException if passed a value less than 1. You may NOT use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

1. Write a method countToBy that takes integer parameters n and m and that produces output indicating how to count to n in increments of m. For example, to count to 10 by 1 you'd say:

	```java
	countToBy(10, 1);
	```

	which should produce the following output:

	```
	1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	```

	The increment does not have to be 1. For example, the following call indicates that we want to count to 25 in increments of 4:

	```java
	countToBy(25, 4);
	```

	which produces this output:

	```
	1, 5, 9, 13, 17, 21, 25
	```

	It will not always be possible to start counting at 1. The first number should always be in the range of 1 to m inclusive. So if you instead count to 30 by 4, you have to start with 2. So this call:

	```java
	countToBy(30, 4);
	```

	produces this output:

	```
	2, 6, 10, 14, 18, 22, 26, 30
	```

	It is possible that only one number will be printed. All output should appear on the same line. For example, the following calls:

	```java
	countToBy(34, 5);
	System.out.println(); // to complete the line of output 
	countToBy(3, 6); 
	System.out.println(); // to complete the line of output
	countToBy(17, 3);
	System.out.println(); // to complete the line of output
	```

	should produce the following output:

	```
	4, 9, 14, 19, 24, 29, 34
	3
	2, 5, 8, 11, 14, 17
	```

	You must exactly reproduce the format of the examples above. Your method should throw an IllegalArgumentException if either m or n is less than 1.

	You may NOT use a while loop, for loop or do/while loop to solve this problem; you must use recursion.

1. Write a recursive method called digitProduct, that takes an integer n as a parameter and returns the product of all non-zero digits of n. For example, digitProduct(384) should return 96, which is 3 * 8 * 4. Because zeros are not included, digitProduct(3084) should also be 96.

	If passed a negative number, the method should return the negative product of the digits. For example, digitProduct(-384) should return -96.

	Below are more examples of calls and the value returned.

	| Method Call | Value Returned |
	| :--- | :--- |
	| `digitProduct(1);` | `1` |
	| `digitProduct(19);` | `9` |
	| `digitProduct(108);` | `8` |
	| `digitProduct(62);` | `12` |
	| `digitProduct(-151);` | `-5` |
	| `digitProduct(12345);` | `120` |
	| `digitProduct(-30551);` | `-75` |
	| `digitProduct(-192);` | `-18` |

	The method should throw an IllegalArgumentException if passed 0.

1. Write a recursive method called dedup that takes a string as a parameter and that returns a new string obtained by replacing every sequence of repeated adjacent letters with one of that letter. For example, the string "bookkkkkeeper" has three repeated adjacent letters ("oo", "kkkkk", and "ee"), so dedup("bookkkkkeeper") should return the string "bokeper". Below are more sample calls:

	| Method Call | Value Returned |
	| :--- | :--- |
	| `dedup("odegaard");` | `"odegard"` |
	| `dedup("ooops");` | `"ops"` |
	| `dedup("baz");` | `"baz"` |
	| `dedup("apple");` | `"aple"` |
	| `dedup("hissssssss");` | `"his"` |
	| `dedup("theses");` | `"theses"` |
	| `dedup("zzzzzzz");` | `"z"` |
	| `dedup("shellless");` | `"sheles"` |
	| `dedup("mississippi");` | `"misisipi"` |
	| `dedup("puppy");` | `"pupy"` |

	You may assume that the string is composed entirely of lowercase letters, as in the examples above. If you are passed an empty string ("") you should throw an IllegalArgumentException. You are not allowed to construct any structured objects other than Strings (no array, ArrayList, StringBuilder, Scanner, etc) and you may not use a while loop, for loop or do/while loop to solve this problem; you must use recursion.