_CSE 143_
# Quiz Answers
## Week 2

1. _boolean zen_ is a word used to describe if code using booleans is written in the most concise way possible. If something evaluates to a boolean value you should return that value instead of using an if/else structure to determine whether to return `true` or `false`.

1. No, a _boolean zen_ version is shown below.

	```java
	return width > 0 && width < 100 && height > 0 && height < 100;
	```

1. No, a _boolean zen_ version is shown below.

	```java
	return list.isEmpty();
	```

1. One possible answer is shown below.

	```java
	public boolean equals(Stack<Integer> s1, Stack<Integer>s2) {
		Stack<Integer> temp = new Stack<Integer>();
		boolean isEqual = true;

		while (isEqual && !s1.isEmpty() && !s2.isEmpty()) {
			int element1 = s1.pop();
			int element2 = s2.pop();
			isEqual = isEqual && element1 == element2;
			temp.push(element1);
			temp.push(element2);
		}

		isEqual = isEqual && s1.isEmpty() && s2.isEmpty();

		while (!temp.isEmpty()) {
			s2.push(temp.pop());
			s1.push(temp.pop());
		}

		return isEqual;
	}
	```