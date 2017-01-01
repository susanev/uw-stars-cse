_CSE 143_
# Lecture Notes
## Week 5

### Recursion
* Defining an operation in terms of itself
* When solving a problem using recursion you break the problem down into smaller versions of itself
* Recursive programming is when you write a method that calls itself
* Solve a large task by breaking it up into a series of smaller tasks that are all the same
* The opposite of recursion is iteration (i.e., loops)

### Recursive data structures
* A data structure made up of smaller versions of the same data structure (e.g., LinkedList)

### Solving problems with recursion
* When writing a recursive method, pretend you already wrote the method correctly and use it whenever possible
* If you need to keep track of something then it should be a parameter
* Suggested programming process
	1. Ask yourself, "what is the smallest piece of the problem I can solve?"
	2. Code the answer to this question (the base case)
	3. Use a recursive call to solve whatever is left
* Note: Recursion is a new way of thinking, and you will need to __practice a lot__ in order to get good (and fast) at it


### Examples
1. Produce a line of output with `n` stars

	#### Iteration

	```java
	public void writeStars(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("*");
		System.out.println();
	}
	```

	#### Recursion

	```java
	public void writeStars2(int n) {
		if (n == 0)
			System.out.println();
		else {
			System.out.print("*");
			writeStars2(n - 1);
		}
	}
	```

1. Reverse the lines of text in a file

	#### Recursion

	```java
	// post: reads a file, writing the lines to System.out in reverse order
	public void reverse(Scanner input) {
		if (input.hasNextLine()) {
			String line = input.nextLine();
			reverse(input);
			System.out.println(line);
		}
	}
	```

1. `stutter`:  Takes an integer value like 348 and returns the integer 334488 (the value you get by replacing each digit with two of that digit)

	#### Recursion

	```java
	// returns the integer obtained by replacing every digit of n with two of
	// that digit.  For example, stutter(348) returns 334488.
	public static int stutter(int n) {
		if (n < 0)
			return -stutter(-n);
		else if (n < 10)
			return n * 11;
		else
			return 100 * stutter(n / 10) + stutter(n % 10);
	}
	```
