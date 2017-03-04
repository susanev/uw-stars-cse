_CSE 143_

# Collections Programming
## Final Study Session

1. Write a method called extractEqual that takes a set of Point objects and that returns a new set that contains all of the Point objects where the x and y values are equal to each other. For example, if a set called points contains the following values:

	```
	[[x=42,y=3], [x=4,y=2], [x=18,y=1], [x=7,y=8], [x=-2,y=-2], [x=3,y=3],
	 [x=7,y=7], [x=0,y=82], [x=14,y=14], [x=3,y=13], [x=-3,y=4], [x=1,y=3]]
	```

	then the call extractEqual(points) should return the following set:

	```
	[[x=-2,y=-2], [x=3,y=3], [x=7,y=7], [x=14,y=14]]
	```

	The original set should be unchanged and you should not construct any new Point objects in solving this problem. As a result, both sets will end up referring to the Point objects in which the x and y coordinates are equal. Your method is expected to have reasonable efficiency in that it shouldn't lead to more set operations than it needs to.

1. Write a method called convert that takes an array of integers as a parameter and that returns a map that contains the nonzero elements of the array (mapping an integer index to an integer value). For example, if an array called list stores these values:

	```
	[0, 19, 4, 0, 0, 0, 12, 0, 0, 0, 9, 18]
	```

	then the call convert(list) should return the following map:

	```
	{1=19, 2=4, 6=12, 10=9, 11=18}
	```

	Your map should store the keys in increasing numerical order. The array passed as a parameter should be not be changed.