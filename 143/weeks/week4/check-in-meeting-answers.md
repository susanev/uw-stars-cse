_CSE 143_
# Check-in Meeting Answers
## Week 4

1. One possible answer is shown below.

	```java
	public static String collapseSequence(String str, char ch) {
		if (str.length() < 2) {
			return str;
		}
		else {
			if (str.charAt(0) == ch && str.charAt(1) == ch) {
				return collapseSequence(str.substring(1), ch);
			} else {
				return str.charAt(0) + collapseSequence(str.substring(1), ch);
			}
			
		}
	}
	```