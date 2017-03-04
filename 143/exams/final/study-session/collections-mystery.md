_CSE 143_

# Collections Mystery
## Final Study Session

1. Consider the following method:

	```java
	public Set<Integer> mystery(int[][] data, int pos, int n) {
		Set<Integer> result = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result.add(data[i + pos][j + pos]);
			}
		}
		return result;
	}
	```

	Suppose that a variable called grid has been declared as follows:

	```java
	int[][] grid = {{8, 2, 7, 8, 2, 1}, {1, 5, 1, 7, 4, 7},
					{5, 9, 6, 7, 3, 2}, {7, 8, 7, 7, 7, 9},
					{4, 2, 6, 9, 2, 3}, {2, 2, 8, 1, 1, 3}};
	````

	which means it will store the following 6-by-6 grid of values:

	```
	8       2       7       8       2       1       
	1       5       1       7       4       7       
	5       9       6       7       3       2       
	7       8       7       7       7       9       
	4       2       6       9       2       3       
	2       2       8       1       1       3  
	```     

	For each call below, indicate what value is returned. If the method call results in an exception being thrown, write "exception" instead.

	| Method Call | Contents of Set Returned |
	| :--- | :--- |
	| `mystery(grid, 2, 2)` | |
	| `mystery(grid, 0, 2)` | |
	| `mystery(grid, 3, 3)` | |

1. Consider the following method:

	```java
	public static Map<String, Integer> mystery(String[][] a) {
		Map<String, Integer> result = new TreeMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result.put(a[i][j], j);
			}
		}
		return result;
	} 
	```  

	In the left-hand column below are specific two-dimensional arrays. Indicate in the right-hand column what values would be stored in the map returned by method mystery if the array in the left-hand column is passed as a parameter to mystery. Recall that maps print in a key=value format. Your answer should display the right keys and values in the right order

	| Map | Output |
	| :--- | :--- |
	| `[["a", "b"], ["c", "d", "e"], ["f"]]` | |
	| `[["y", "a", "y"], ["b", "r", "e", "a", "k"]]` | |
	| `[["n", "e", "v", "e", "r"], ["o", "d", "d"], ["o", "r"], ["e", "v", "e", "n"]]` | |

1. Consider the following method:

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
	```

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

1. Consider the following method:

	```java
	public void mystery(int[][] data, int pos, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			int sum = 0;
			for (int j = 0; j < cols; j++) {
				sum = sum + data[pos + i][pos + j];
			}
			System.out.print(sum + " ");
		}
		System.out.println();
	}
	```

	Suppose that a variable called grid has been declared as follows:

	```java
	int[][] grid = {{4, 6, 8, 8, 2, 1}, {7, 4, 8, 8, 7, 7},
					{7, 8, 6, 6, 7, 2}, {1, 2, 2, 7, 5, 7},
					{8, 3, 6, 6, 1, 1}, {9, 7, 9, 6, 6, 1}};
	```

	which means it will store the following 6-by-6 grid of values:

	```
	4       6       8       8       2       1       
	7       4       8       8       7       7       
	7       8       6       6       7       2       
	1       2       2       7       5       7       
	8       3       6       6       1       1       
	9       7       9       6       6       1     
	```  

	For each call below, indicate what output is produced:

	| Method Call | Output Produced |
	| :--- | :--- |
	| `mystery(grid, 0, 2, 2);` | |
	| `mystery(grid, 2, 3, 2);` | |
	| `mystery(grid, 1, 4, 1);` | |
