_CSE 143_
# Quiz
## Week 2

1. What is boolean zen?

1. Does the code below have boolean zen? If not, rewrite it with boolean zen.

	```java
	if (width > 0 && width < 100 && height > 0 && height < 100) {
		return true;
	} else {
		return false;
	}
	```

1. Does the code below have boolean zen? If not, rewrite it with boolean zen.

	```java
	if (list.isEmpty() == true) {
		return true;
	} else {
		return false;
	}
	```

1. Write a method equals that takes as parameters two stacks of integers and returns true if the two stacks are equal and that returns false otherwise. To be considered equal, the two stacks would have to store the same sequence of integer values in the same order. Your method is to examine the two stacks but must return them to their original state before terminating. You may use one stack as auxiliary storage.