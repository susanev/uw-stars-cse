_CSE 143_

# Recursive Programming Answers
## Midterm Study Session

1. One possible answer is shown below.

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

1. One possible answer is shown below.

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

1. One possible answer is shown below.

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

1. One possible answer is shown below.

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

1. One possible answer is shown below.

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

1. One possible answer is shown below.

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