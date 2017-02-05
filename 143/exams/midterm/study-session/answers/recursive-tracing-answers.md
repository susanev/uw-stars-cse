_CSE 143_

# Recursive Tracing Answers
## Midterm Study Session

1. Recursive Tracing 1

	For each call below, indicate what value is returned:

	| Method Call | Output |
	| :--- | :--- |
	| `mystery(4, 19);` | `1` |
	| `mystery(32, 56);` | `8` |
	| `mystery(12, 20);` | `4` |
	| `mystery(4, 18);` | `2` |
	| `mystery(48, 128);` | `16` |

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
	| `mystery(7);` | `7` |
	| `mystery(825);` | `258` |
	| `mystery(38947);` | `47893` |
	| `mystery(612305);` | `0523610` |
	| `mystery(-12345678);` | `-785634120` |

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
	| `mystery(7, 1);` | `7` |
	| `mystery(4, 2);` | `6` |
	| `mystery(4, 3);` | `4` |
	| `mystery(5, 3);` | `10` |
	| `mystery(5, 4);` | `5` | 