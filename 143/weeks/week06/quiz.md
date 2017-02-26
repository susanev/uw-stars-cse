_CSE 143_
# Quiz
## Week 6

1. Recursive Tracing

	Consider the following method:

	```java
	public void mystery(int x) {
		if (x < 10)
			System.out.print(x);
		else {
			int y = x % 10;
			System.out.print(y);
			mystery(x / 10);
			System.out.print(y);
		}
	}
	```

	For each call below, indicate what output is produced:

	| Method Call | Output Produced |
	| :--- | :--- |
	| `mystery(3);` | |
	| `mystery(42);` | |
	| `mystery(293);` | |
	| `mystery(402);` | |
	| `mystery(2468);` | |

1. Recursive Programming

	Write a recursive method called isPalindrome that takes a string as a parameter and that returns true if the string is a palindrome and false if it is not. A palindrome is a string like "racecar" that has the same sequence of characters when written forwards and backwards. Notice that in a palindrome, the first and last characters match, as do the second and second-to-last, the third and third-to-last, and so on. The table below includes various method calls and the value returned:

	| Method Call | Result |
	| :--- | :--- |
	| `isPalindrome("radar")` | `true` |
	| `isPalindrome("123321")` | `true` |
	| `isPalindrome("hah")` | `true` |
	| `isPalindrome("peep")` | `true` |
	| `isPalindrome("")` | `true` |
	| `isPalindrome("x")` | `true` |
	| `isPalindrome("a ba")` | `false` |
	| `isPalindrome("ABba")` | `false` |
	| `isPalindrome("peer")` | `false` |
	| `isPalindrome("ab")` | `false` |

	You are restricted to the following String methods:

	```
	charAt(index)                  returns the character at the given index
	length()                       returns the length of the string
	substring(fromIndex, toIndex)  returns a new string that is a substring
	                               of this string from startIndex
	                               (inclusive) to stopIndex (exclusive)
	```

	You are not allowed to construct any structured objects (no array, ArrayList, String, StringBuilder, etc) and you may not use a while loop, for loop, or do/while loop to solve this problem; you must use recursion.

1. Inheritance

	Assuming that the following classes have been defined:

	```java
	public class Rasp extends Marion {
		public void method1() {
			System.out.println("Rasp 1");
		}

		public void method2() {
			System.out.println("Rasp 2");
			super.method2();
		}
	}

	public class Marion {
		public void method2() {
			System.out.println("Marion 2");
		}

		public void method3() {
			method2();
			System.out.println("Marion 3");
		}
	}

	public class Salmon extends Rasp {
		public void method2() {
			System.out.println("Salmon 2");
			super.method1();
		}
	}

	public class Huckle {
		public void method1() {
			System.out.println("Huckle 1");
		}

		public void method3() {
			System.out.println("Huckle 3");
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Marion var1 = new Marion();
	Marion var2 = new Rasp();
	Rasp var3 = new Rasp();
	Rasp var4 = new Salmon();
	Object var5 = new Huckle();
	Marion var6 = new Salmon();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected (you may abbreviate these as "ce" and "re" or "c.e." and "r.e.").

	| Statement | Output |
	| :--- | :--- |
	| `var2.method1();` | |
	| `var3.method1();` | |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var5.method2();` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3();` | |
	| `var4.method3();` | |
	| `var5.method3();` | |
	| `((Salmon)var4).method2();` | |
	| `((Object)var3).method3();` | |
	| `((Salmon)var2).method2();` | |
	| `((Rasp)var5).method3();` | |
	| `((Marion)var3).method2();` | |
	| `((Huckle)var5).method1();` | |
	| `((Salmon)var6).method1();` | |
	| `((Marion)var5).method1();` | |