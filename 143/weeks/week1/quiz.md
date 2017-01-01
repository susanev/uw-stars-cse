_CSE 143_
# Quiz
## Week 1

1. Recursive Tracing. Consider the following method:

	```java
	public void mystery(int n) {
		if (n == 1) {
			System.out.print(n);
		} else {
			System.out.print(n + ", ");
			if (n % 2 == 0) {
				mystery(n / 2);
			} else {
				mystery(3 * n + 1);
			}
		}
	}
	```
	For each call below, indicate what output is produced:

	| Method Call | Output Produced |
	| :--- | :--- |
	| `mystery(1);` | |
	| `mystery(3);` | |
	| `mystery(4);` | |
	| `mystery(5);` | |
	| `mystery(20);` | |

2. Details of inheritance. Assuming that the following classes have been defined:

	```java
	public class Water extends Earth {
		public void method1() {
			System.out.println("Water 1");
		}

		public void method3() {
			System.out.println("Water 3");
		}
	}

	public class Fire {
		public void method1() {
			System.out.println("Fire 1");
		}

		public void method2() {
			System.out.println("Fire 2");
			method1();
		}
	}

	public class Earth extends Fire {
		public void method1() {
			System.out.println("Earth 1");
			super.method1();
		}
	}

	public class Air extends Fire {
		public void method3() {
			System.out.println("Air 3");
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Fire var1 = new Water();
	Fire var2 = new Earth();
	Fire var3 = new Fire();
	Object var4 = new Earth();
	Earth var5 = new Water();
	Fire var6 = new Air();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected (you may abbreviate these as "ce" and "re" or "c.e." and "r.e.").

	| Statement | Output |
	| :--- | :--- |
	| `var1.method1();` | |
	| `var2.method1();` | |
	| ` var3.method1();` | |
	| `var4.method1();` | |
	| `var5.method1();` | |
	| `var6.method1();` | |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var5.method2();` | |
	| `var6.method2();` | |
	| `((Water)var4).method2();` | |
	| `((Fire)var4).method2();` | |
	| `((Air)var6).method3();` | |
	| `((Earth)var1).method3();` | |
	| `((Water)var1).method3();` | |
	| `((Water)var2).method3();` | |
	| `((Earth)var1).method2();` | |
	| `((Water)var6).method3();` | |