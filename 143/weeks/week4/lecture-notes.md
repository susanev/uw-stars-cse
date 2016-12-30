_CSE 143_
# Lecture Notes
## Week 4

### Searching
#### Binary search
* With binary search, you can quickly locate a value in a sorted list of numbers
* Guess in the middle, than eliminate half and repeat until the value is found

	```
	n / 2 / 2 / 2 ... / 2 = 1
	n / 2^? = 1
	n = 2^?
	? = log2(n)
	```

* Faster than linear search


#### Linear search
* Looking for an item by starting at the beginning and going one-by-one until it is found

### Complexity
* The resources (time and space) required to execute a piece of code
	* Time: How long the algorithm/code takes to execute
	* Space: How much computer memory the algorithm/code consumes
* We can generally make a program work with less memory if we're willing to have it take more time to run
* We can also generally get programs to run faster if we're willing to allocate some extra memory to the task
* The resource that computer scientists most often refer to when talking about complexity is time (sepcifically the growth rate as the input size increases)
* When calculating the complexity, ignore constant multipliers and lower order terms—focus on the main term

| Complexity | Description |
| :--- | :--- |
| `O(1)` | Constant time algorithms that don't depend on `n` |
| `O(log n)` | Logarithmic algorithms like binary search |
| `O(n)` | Linear algorithms like linear search |
| `O(n log n)` | Log-linear algorithms like merge sort |
| `O(n&#178;)` | Quadratic algorithms; n insertions that each take on average O(n) work) |
| `O(n&#179;)` | Cubic algorithms  |
| `O(2<sup>n</sup>)` | Exponential algorithms; usually not practical |

#### Example
Suppose you have an array that stores these values:

```
  [0]   [1]   [2]   [3]   [4]   [5]   [6]   [7]   [8]   [9]
+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
|  14 |  8  | -23 |  4  |  6  |  10 | -18 |  5  |  5  |  11 |
+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
```

The maximum sum is obtained by adding up the values from index [3] through [9]:

```
4 + 6 + 10 + -18 + 5 + 5 + 11 = 23
```

##### O(n&#179;) Solution

```java
int max = list[0];
int maxStart = 0;
int maxStop = 0;
for (int start = 0; start < list.length; start++)
	for (int stop = start; stop < list.length; stop++) {
		int sum = 0;
		for (int i = start; i <= stop; i++) {
			sum += list[i];
		}
		if (sum > max) {
			max = sum;
			maxStart = start;
			maxStop = stop;
		}
	}
}
```

##### O(n&#178;) solution

```java
int max = list[0];
int maxStart = 0;
int maxStop = 0;
for (int start = 0; start < list.length; start++) {
	int sum = 0;
	for (int stop = start; stop < list.length; stop++) {
		sum += list[stop];
		if (sum > max) {
			max = sum;
			maxStart = start;
			maxStop = stop;
		}
	}
}
```

##### O(n) solution

```java
int max = list[0];
int maxStart = 0;
int maxStop = 0;
int start = 0;
int sum = 0;
for (int i = 0; i < list.length; i++) {
	if (sum < 0) {
		start = i;
		sum = 0;
	}
	sum += list[i];
	if (sum > max) {
		max = sum;
		maxStart = start;
		maxStop = i;
	}
}
```
