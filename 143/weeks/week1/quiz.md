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