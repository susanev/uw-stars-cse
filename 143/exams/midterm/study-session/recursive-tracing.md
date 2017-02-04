_CSE 143_

# Recursive Tracing
# Midterm Study Session

1. Consider the following method:

	```java
	public int mystery(int x, int y) {
		if (x % 2 == 1 || y % 2 == 1) {
			return 1;
		} else {
			return 2 * mystery(x / 2, y / 2);
		}
	}
	```

	For each call below, indicate what value is returned:

	| Method Call | Output |
	| :--- | :--- |
	| `mystery(4, 19);` | |
	| `mystery(32, 56);` | |
	| `mystery(12, 20);` | |
	| `mystery(4, 18);` | |
	| `mystery(48, 128);` | |

1. For each call to the following recursive method, indicate what output is produced:

	```java
	public void mystery(int n) {
		if (n < 0) {
			System.out.print("-");
			mystery(-n);
		} else if (n < 10) {
			System.out.println(n);
		} else {
			int two = n % 100;
			System.out.print(two / 10);
			System.out.print(two % 10);
			mystery(n / 100);
		}
	}
	```

	| Method Call | Output |
	| :--- | :--- |
	| `mystery(7);` | |
	| `mystery(825);` | |
	| `mystery(38947);` | |
	| `mystery(612305);` | |
	| `mystery(-12345678);` | |

1. For each of the calls to the following recursive method below, indicate what value is returned:

	```java
	public static int mystery(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		} else if (k > n) {
			return 0;
		} else {
			return mystery(n - 1, k - 1) + mystery(n - 1, k);
		}
	}
	```

	| Method Call | Output |
	| :--- | :--- |
	| `mystery(7, 1)` | |
	| `mystery(4, 2)` | |
	| `mystery(4, 3)` | |
	| `mystery(5, 3)` | |
	| `mystery(5, 4)` | | 