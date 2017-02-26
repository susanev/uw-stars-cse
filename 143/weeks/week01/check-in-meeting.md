_CSE 143_
# Check-in Meeting
## Week 1

1. Assuming that the following classes have been defined:

	```java
	public class Fork extends Dish {
		public void method2() {
			System.out.println("Fork 2");
		}

		public void method3() {
			System.out.println("Fork 3");
		}
	}

	public class Bowl extends Soap {
		public void method2() {
			System.out.println("Bowl 2");
		}

		public void method3() {
			System.out.println("Bowl 3");
		}
	}

	public class Soap {
		public void method1() {
			System.out.println("Soap 1");
			method3();
		}

		public void method3() {
			System.out.println("Soap 3");
		}
	}

	public class Dish extends Soap {
		public void method3() {
			System.out.println("Dish 3");
			super.method3();
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Soap var1 = new Dish();
	Fork var2 = new Fork();
	Soap var3 = new Bowl();
	Soap var4 = new Fork();
	Soap var5 = new Soap();
	Object var6 = new Dish();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c".  If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected.

	| Statement | Output |
	| :--- | :--- |
	| `var1.method1();` | |
	| `var2.method1();` | |
	| `var3.method1(); ` | |
	| `var4.method1();` | |
	| `var5.method1(); ` | |
	| `var6.method1(); ` | |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3(); ` | |

2. Write a method called insertAt that takes an index, an integer n, and a value as parameters, and that inserts n copies of the given value at the given index in a list of integers. For example, if a variable called list stores this sequence:

	```
	[12, 42, 8, 934]
	```

	and the following call is made:

	```java
	list.insertAt(2, 4, 98);
	```

	then it should store the following values after the call:

	```
	[12, 42, 98, 98, 98, 98, 8, 934]
	```

	Notice that there are now four occurrences of the value 98 starting at index 2 and that later values are in the same order as in the original.

	You are writing a method for the ArrayIntList class discussed in lecture.

	Your method should throw an IllegalArgumentException if the index is less than 0 or greater than the number of elements in the list or if the value of n is less than 0.

	You are not to call any other ArrayIntList methods to solve this problem, you are not allowed to define any auxiliary data structures (no array, ArrayList, etc), and your solution must run in O(n) time where n is the length of the list. You may assume that the array has sufficient capacity to store the new values.