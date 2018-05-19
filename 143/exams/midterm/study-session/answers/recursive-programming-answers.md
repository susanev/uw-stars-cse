_CSE 143_

# Recursive Programming Answers
## Midterm Study Session

1. indexOf. One possible answer is shown below.

	```java
	public int indexOf(String str, String sub) {
		if (str.length() < sub.length()) {
			return -1;
		} 
		else if (str.substring(0, sub.length()).equals(sub)) {
			return 0;
		} else {
			int index = indexOf(str.substring(1), sub);
			if (index == -1) {
				return -1;
			} else {
				return 1 + index;
			}
		}
	}
	```

1. digitsSorted. One possible answer is shown below.

	```java
	public boolean digitsSorted(int num) {
		if (num < 0) {
			return digitsSorted(num * -1);
		}
		else if (num < 10) {
			return true;
		} else {
			int rest = num / 10;
			return rest % 10 <= num % 10 && digitsSorted(rest);
		}
	}
	```

1. mirrorString. One possible answer is shown below.

	```java
	public void mirrorString(String str) {
		if (str.length() <= 1) {
			System.out.print(str);
		} else {
			System.out.print(str.charAt(0));
			mirrorString(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	```

1. isReversal. One possible answer is shown below.

	```java
	public boolean isReversal(String str1, String str2) {
		if (str1.length() != str2.length()) {
			throw new IllegalArgumentException();
		}

		if (str1.length() <= 1) {
			return str1.equals(str2);
		} else {
			return isReversal(str1.substring(0, 1), str2.substring(str2.length() - 1)) &&
				isReversal(str1.substring(1), str2.substring(0, str2.length() - 1));
		}
	}
	```

1. nthFromEnd. One possible answer is shown below.

	```java
	public int nthFromEnd(int num, int n) {
		if (num < 0 || n < 0) {
			throw new IllegalArgumentException();
		}

		if (n == 0) {
			return num % 10;
		} else {
			return nthFromEnd(num / 10, n - 1);
		}
	}
	```

1. sameDashes. One possible answer is shown below.

	```java
	public boolean sameDashes(String str1, String str2) {
		if (str1.length() != str2.length()) {
			throw new IllegalArgumentException();
		}

		if (str1.length() == 1) {
			return ((str1.equals("-") && str2.equals("-")) || (!str1.equals("-") && !str2.equals("-")));
		} else {
			return sameDashes(str1.substring(0, 1), str2.substring(0, 1)) && 
				sameDashes(str1.substring(1), str2.substring(1));
		}
	}
	```

1. writeSquares. One possible answer is shown below.

	```java
	public void writeSquares(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		if (n == 1) {
			System.out.print(n);
		} else if (n % 2 == 1) {
			System.out.print(n * n + ", ");
			writeSquares(n - 1);
		} else {
			writeSquares(n - 1);
			System.out.print(", " + n * n);
		}
	}
	```

1. countToBy. One possible answer is shown below.

	```java
	public static void countToBy(int n, int m) {
	    if (m <= 0 || n <= 0)
	        throw new IllegalArgumentException();
	    else if (n <= m)
	        System.out.print(n);
	    else {
	        countToBy(n - m, m);
	        System.out.print(", " + n);
	    }
	}
	```

1. digitProduct. One possible answer is shown below. 

	```java
	public int digitProduct(int n) {
		if (n == 0) {
			throw new IllegalArgumentException();
		}

		if (n < 0) {
			return -1 * digitProduct(-n);
		} else if (n < 10) {
			return n;
		} else if (n % 10 != 0) {
			return digitProduct(n % 10) * digitProduct(n / 10);
		} else {
			return digitProduct(n / 10);
		}
	}
	```

1. dedup. One possible answer is shown below.

	```java
	public String dedup(String str) {
		if (str.length() == 0) {
			throw new IllegalArgumentException();
		}

		if (str.length() == 1) {
			return str;
		} else if (str.charAt(0) == str.charAt(1)) {
			return dedup(str.substring(1));
		} else {
			return str.charAt(0) + dedup(str.substring(1));
		}
	}
	```
