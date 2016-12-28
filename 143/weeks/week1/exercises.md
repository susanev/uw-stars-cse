_CSE 143_
# Exercises
## Week 1

1. Write a method called stutter that doubles the size of a list of integers by replacing every integer in the list with two of that integer. For example, if a variable called list stores the following:

	```
	[1, 8, 19, 4, 17]
	```

	and we make the following call:

	```
	list.stutter();
	```

	then it should store the following sequence of integers after the call:

	```
	[1, 1, 8, 8, 19, 19, 4, 4, 17, 17]
	```

	You are writing a method for the ArrayIntList class discussed in lecture.

	You may not call any other methods of the ArrayIntList class to solve this problem, you are not allowed to define any auxiliary data structures (no array, String, ArrayList, etc), and your solution must run in O(n) time. You may assume that elementData is large enough to fit the longer list.

1. Write a method called mirror that doubles the size of a list of integers by appending the mirror image of the original sequence to the end of the list. The mirror image is the same sequence of values in reverse order. For example, if a variable called list stores this sequence of values:

	```
	[1, 3, 2, 7]
	```

	and you make the following call:

	```java
	list.mirror();
	```

	then it should store the following values after the call:

	```
	[1, 3, 2, 7, 7, 2, 3, 1]
	```

	Notice that it has been doubled in size by having the original sequence appearing in reverse order at the end of the list.

	You are writing a method for the ArrayIntList class discussed in lecture.

	You are not to call any other ArrayIntList methods to solve this problem, you are not allowed to define any auxiliary data structures (no array, ArrayList, etc). You may assume that the array has sufficient capacity to store the new values.