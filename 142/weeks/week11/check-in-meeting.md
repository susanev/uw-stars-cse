# Check-in Meeting
## Week 11

1. Write a class called Orca that extends the Critter
   class. The instances of the Orca class follow a pattern of moving forward four times, then turning around, then moving back four times and turning around again so that they return to their original position and direction.
   
	Each Orca is always either in moving-mode or in turning-mode. They start out in moving-mode. While in moving-mode, they try to hop forward if possible until they have hopped four times, at which point they switch into turning-mode. If it is not possible to hop while in moving-mode, an Orca instead infects whatever is in front of it. When in turning-mode, the Orca turns left twice and then switches back to moving-mode.

	Don't worry about the fact that if the Orca encounters a wall while in moving-mode, it gets stuck trying to infect the wall indefinitely.

	The Orca displays itself as "M" while in moving-mode and as "T" while in turning-mode. Its color should be the default color for critters.

2. Write a static method called doubleSize that takes an array of integers as an argument and that returns a new array twice as large as the original that replaces every integer from the original list with a pair of integers, each half the original.  

	If a number in the original list is odd, then the first number in the new pair should be one higher than the second so that the sum equals the original number. For example, if a variable called list stores this sequence of values:

	```
	[18, 7, 4, 24, 11]
	```

  The number 18 is split into the pair (9, 9), the number 7 is split into (4,3), the number 4 is split into (2, 2), the number 24 is split into (12, 12) and the number 11 is split into (6, 5). Thus, the call:

	```java
	int[] result = doubleSize(list);
	```

	should return an array containing this sequence:

	```
	[9, 9, 4, 3, 2, 2, 12, 12, 6, 5]
	```

	Your method should not change the array passed as a parameter. You are not allowed to solve this problem using an ArrayList or Scanner and you are not allowed to call any methods of the Arrays class or the Collections class.