_CSE 143_
# Quiz Answers
## Week 6

1. Recursive Tracing

	| Method Call | Output Produced |
	| :--- | :--- |
	| `mystery(3);` | `3` |
	| `mystery(42);` | `242` |
	| `mystery(293);` | `39293` |
	| `mystery(402);` | `20402` |
	| `mystery(2468);` | `8642468` |

1. Recursive Programming

	One possible answer is shown below.

	```java
	public static boolean isPalindrome(String str) {
		if (str.length() <= 1) {
			return true;
		} else {
			return str.charAt(0) == str.charAt(str.length() - 1) && 
					isPalindrome(str.substring(1, str.length() - 1));
		}
	}
	```

1. Inheritance

	| Statement | Output |
	| :--- | :--- |
	| `var2.method1();` | compiler error |
	| `var3.method1();` | Rasp 1 |
	| `var1.method2();` | Marion 2 |
	| `var2.method2();` | Rasp 2/Marion 2 |
	| `var3.method2();` | Rasp 2/Marion 2 |
	| `var4.method2();` | Salmon 2/Rasp 1 |
	| `var5.method2();` | compiler error |
	| `var1.method3();` | Marion 2/Marion 3 |
	| `var2.method3();` | Rasp 2/Marion 2/Marion 3 |
	| `var3.method3();` | Rasp 2/Marion 2/Marion 3 |
	| `var4.method3();` | Salmon 2/Rasp 1/Marion 3 |
	| `var5.method3();` | compiler error |
	| `((Salmon)var4).method2();` | Salmon 2/Rasp 1 |
	| `((Object)var3).method3();` | compiler error |
	| `((Salmon)var2).method2();` | runtime error |
	| `((Rasp)var5).method3();` | runtime error |
	| `((Marion)var3).method2();` | Rasp 2/Marion 2 |
	| `((Huckle)var5).method1();` | Huckle 1 |
	| `((Salmon)var6).method1();` | Rasp 1 |
	| `((Marion)var5).method1();` | compiler error |