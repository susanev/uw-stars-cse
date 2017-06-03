# Arrays
## Final Study Session

### Medium
1. Write a static method called isPairwiseSorted that takes an array of integers as a parameter and that returns whether or not the array is pairwise sorted. An array is considered to be pairwise sorted if it contains a sequence of pairs where each pair is in sorted (nondecreasing) order. For example, if a variable list is defined as follows:

	```java
	int[] list = {3, 8, 2, 15, -3, 5, 2, 3, 4, 4};
	```

	then the call isPairwiseSorted(list) would return true because the array is composed of a sequence of pairs that are each in sorted order ((3, 8) followed by (2, 15), followed by (-3, 5), and so on). If the array has an odd length, then your method should ignore the value at the end. Below are several examples of what value would be returned for a given array.

	| Array passed as parameter | Value Returned |
	| :--- | :--- |
	| `{}` | `true` |
	| `{6}` | `true` |
	| `{4, 12}` | `true` |
	| `{8, 5}` | `false` |
	| `{3, 8, 2, 15, -3, 5, 2, 3, 4, 4, 3, 1}` | `false` |
	| `{8, 13, 92, 92, 4, 4}` | `true` |
	| `{1, 3, 5, 7, 9, 8}` | `false` |

	You may not construct any extra data structures to solve this problem.

2. Write a static method called sameGap that takes an array of integers as a parameter and that returns whether or not the gap between successive values in the array is always the same. The gap between successive values is defined to be the absolute value of the difference between the two values. For example, consider the following sequence:

	```
	[1, 4, 7, 10, 13, 10, 13, 10, 7, 4]
	```

	Each successive pair of values has a gap of 3. The first pair of values is 1 and 4, which are 3 apart. The second pair of values is 4 and 7, which are 3 apart. The third pair of values is 7 and 10, which are 3 apart. Notice that sometimes the first value is larger, as in the pair of values 13 followed by 10 or 10 followed by 7. These still have a gap of 3 because we use the absolute value of the difference.

	Your method should return true if passed an array with fewer than 2 values. Below are examples of arrays and the value that should be returned for each:

	| Contents of array passed | Value returned |
	| :--- | :--- |
	| `{}` | `true`
	| `{42}` | `true`
	| `{10, 15}` | `true`
	| `{1, 4, 7, 10, 13, 10, 13, 10, 7, 4}` | `true`
	| `{1, 4, 10, 13, 10, 13, 10, 7, 4}` | `false`
	| `{2, 4, 6, 8, 10}` | `true`
	| `{2, 4, 6, 8, 10, 11}` | `false`
	| `{1, 2, 3, 4, 5, 6}` | `true`
	| `{1, 2, 3, 2, 3, 4, 5, 6}` | `true`
	| `{1, 2, 3, 2, 4, 5, 6}` | `false`
	| `{3, 3, 3}` | `true`

3. Write a static method isSumArray that accepts an array of integers and returns whether for every group of three elements in the array, the first two elements sum up to the third. If the size of the array cannot be divided into groups of three, then the array does not pass the test.

	For example, given the following arrays:

	```java
	int[] array1 = { 1, 2, 3, 8, 7, 15, 9, 3, 12 };
	int[] array2 = { 1, 2, 3, 4, 5 };
	int[] array3 = { 6, 11, 2008 };
	int[] array4 = { -4, 7, 3, 8, -2, 6 };
	```

	Calling isSumArray will result in the following values:

	| Call | Value Returned |
	| :--- | :--- |
	| `isSumArray(array1);` | `true` |
	| `isSumArray(array2);` | `false` |
	| `isSumArray(array3);` | `false` |
	| `isSumArray(array4);` | `true` |

	In the first array, for every group of three numbers (1-2-3, 8-7-15, and 9-3-12), the first two numbers add up to the third. The second array cannot be divided into groups of three. The third array can be divided, but the first two numbers do not add up to the third.

### Hard
1. Write a static method named delta that accepts an array of integers as a parameter and returns a new array formed by inserting between each pair of values the difference between those values. For example, given this array:

	```java
	int[] numbers = {3, 8, 15};
	```

	The call of delta(numbers) should return the following array:

	```
	{3, 5, 8, 7, 15}
	```

	In this example, 5 is inserted between 3 and 8 because (8 - 3) is 5, and 7 is inserted between 8 and 15 because (15 - 8) is 7. The difference should always be computed as the second value minus the first, so you can get negative values. For example, given the following array:

	```java
	int[] numbers2 = {3, 8, 2, 5, 1, 9};
	```

	The call of delta(numbers2) should return the array:

	```
	{3, 5, 8, -6, 2, 3, 5, -4, 1, 8, 9}
	```

	You may assume that the array passed is not null. If the array is empty, return an empty array.

2. Write a static method called append that takes two integer arrays as parameters and that returns a new array that contains the result of appending the values of the second array at the end of the first array. For example, suppose that arrays list1 and list2 have been declared as follows:

	```java
	int[] list1 = {2, 4, 6};
	int[] list2 = {1, 2, 3, 4, 5};
	```

	If we make the following call:

	```java
	append(list1, list2);
	```

	The method will return a new array that contains the following values:

	```
	[2, 4, 6, 1, 2, 3, 4, 5]
	```

	If the call instead had been:

	```java
	append(list2, list1);
	```

	Then the method would return a new array that contains:

	```
	[1, 2, 3, 4, 5, 2, 4, 6]
	```

	Your method should not change either of the arrays passed as parameters.

3. Write a static method called splice that takes as parameters an array of integers and a "from index" (inclusive) and "to index" (exclusive) and that returns a new array containing the result of splicing together three segments of the array. The from and to indexes specify a sublist. For example, if list stores the following:

	```
	[7, 5, 8, 5, 9, 7, 2, 3]
	```

	then the call splice(list, 2, 4) indicates that the array should be rearranged using the sublist from 2 to 4:

	```
	  [7, 5]       		 [8, 5]    [9, 7, 2, 3]
	  before sublist         sublist   after sublist
	  ```

	The new array should contain the values after the sublist followed by the values in the sublist followed by the values before the sublist. For this example, it would return [9, 7, 2, 3, 8, 5, 7, 5]. You may assume that the indexes passed as parameters specify a legal sublist of the list, although it might be empty. The method should not construct any extra data structures other than the array to be returned and it should not alter its array parameter. You are not allowed to call methods of the Arrays class to solve this problem.
