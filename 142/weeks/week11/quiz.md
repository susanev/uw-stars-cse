# Quiz
## Week 11

1. Write a class called Chameleon that extends the Critter class. The instances of the Chameleon class cycle through three different ways of displaying themselves. On their first move they should appear as a red R. On their second move they should appear as a white W. On their third move they should appear as a blue B. Then this pattern repeats itself (red R, white W, blue B, red R, white W, blue B, etc).

	They should always infect on moves when they are red no matter what is in front of them. On moves when they are white or blue, they should hop when they can and turn right when they can't hop.

2. Write a static method called removeAdjacentMatches that removes extra copies of a value that are adjacent to it in an ArrayList of integers. For example, if a variable called list contains the following:

	```
	[1, 3, 3, 15, 2, 2, 2, 2, 1, 19, 3, 42, 42, 42, 7, 42, 1]
	```

	and we make the following call:

	```java
	removeAdjacentMatches(list);
	```

	Then list should store the following values after the call:

	```
	[1, 3, 15, 2, 1, 19, 3, 42, 7, 42, 1]
	```

	Notice that the two occurrences of 3 that appear next to each other have been replaced with a single occurrence of 3, the four occurrences of 2 that appear next to each other have been replaced with a single 2, and the three occurrences of 42 that appear next to each other have been replaced with a single 42. Notice, however, that the list still contains three occurrences of 1, two occurrences of 3, and two occurrences of 42. That is because those duplicate values do not appear right next to each other in the list.

	You may not construct any extra data structures to solve this problem. You must solve it by manipulating the ArrayList you are passed as a parameter.