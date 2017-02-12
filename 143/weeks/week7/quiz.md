_CSE 143_
# Quiz
## Week 7

### Do these on your own

1. Collections Mystery, 5 points. Consider the following method:

	```java
	public int mystery(int[][] data, int pos) {
		int sum = 0;
		for (int i = 0; i < data.length - pos; i++) {
			sum += data[i][i + pos];
		}
		return sum;
	}
	```
	Suppose that a variable called grid has been declared as follows:

	```java
	int[][] grid = {{2, 2, 6, 7, 7, 5}, {6, 3, 4, 7, 9, 3},
									{7, 6, 1, 2, 3, 6}, {9, 3, 6, 6, 9, 4},
									{3, 1, 8, 8, 2, 7}, {5, 7, 9, 2, 1, 6}};
	```java

	which means it will store the following 6-by-6 grid of values:

	```
	2       2       6       7       7       5       
	6       3       4       7       9       3       
	7       6       1       2       3       6       
	9       3       6       6       9       4       
	3       1       8       8       2       7       
	5       7       9       2       1       6  
	```     

	For each call below, indicate what value is returned. If the method call results in an exception being thrown, write "exception" instead.

	| Method Call | Value Returned |
	| :--- | :--- |
	| `mystery(grid, 5);` | | 
	| `mystery(grid, 3);` | | 
	| `mystery(grid, 1);` | | 

1. Collections Programming, 5 points. Write a method called acronymFor that takes a list of strings as a parameter and that returns the corresponding acronym. You form an acronym by combining the capitalized first letter of a series of words. For example, the list [laughing, out, loud] produces the acronym "LOL".  The list [Computer, Science and, Engineering] produces the acronym "CSE". You may assume that all of the strings are nonempty. Your method is not allowed to change the list passed to it as a parameter. If passed an empty list, your method should return the empty string.

	You may construct iterators and strings, but you are not allowed to construct other structured objects (no set, list, stack, queue, etc.).

### We will do these together

1. Binary Tree Traversals, 6 points. Consider the following tree.

	```
	               +---+
	               | 0 |
	               +---+
	             /       \
	           /           \
	     +---+               +---+
	     | 3 |               | 9 |
	     +---+               +---+
	    /     \                   \
	   /       \                   \
	+---+     +---+               +---+
	| 1 |     | 2 |               | 4 |
	+---+     +---+               +---+
	         /     \             /     \
	        /       \           /       \
	     +---+     +---+     +---+     +---+
	     | 5 |     | 8 |     | 7 |     | 6 |
	     +---+     +---+     +---+     +---+
	```

	Fill in each of the traversals below:

	| Traversal | Result |
	| :--- | :--- |
	| Preorder traversal | |
	| Inorder traversal | |
	| Postorder traversal | |

1. Binary Search Tree, 4 points. Draw a picture below of the binary search tree that would result from inserting the following words into an empty binary search tree in the following order: Ephraim, Ben, Dan, Frank, Caleb, Gideon, Adam. Assume the search tree uses alphabetical ordering to compare words.