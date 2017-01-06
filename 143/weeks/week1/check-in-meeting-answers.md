_CSE 143_
# Check-in Meeting Answers
## Week 1

1.

	| Statement | Output |
	| :--- | :--- |
	| `var1.method1();` | Soap 1/Dish 3/Soap 3 |
	| `var2.method1();` | Soap 1/Fork 3 |
	| `var3.method1(); ` | Soap 1/Bowl 3 |
	| `var4.method1();` | Soap 1/Fork 3 |
	| `var5.method1(); ` | Soap 1/Soap 3|
	| `var6.method1(); ` | compiler error |
	| `var1.method2();` | compiler error |
	| `var2.method2();` | Fork 2 |
	| `var3.method2();` | compiler error |
	| `var1.method3();` | Dish 3/Soap 3 |
	| `var2.method3();` | Fork 3 |
	| `var3.method3(); ` | Bowl 3 |

1. One possible answer is shown below.

	```java
	public void insertAt(int index, int n, int value) {
		if (index < 0 || index > size || n < 0) {
			throw new IllegalArgumentException();
		}
		for (int i = size - 1 + n; i >= index + n; i--) {
			elementData[i] = elementData[i - n];
		}
		for (int i = index; i < index + n; i++) {
			elementData[i] = value;
		}
		size += n;
	}
	```