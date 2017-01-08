_CSE 143_
# Quiz Answers
## Week 5

1. One possible answer is shown below.

	```java
	public static int indexOf(String str, String sub) {
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
	public static boolean digitsSorted(int num) {
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