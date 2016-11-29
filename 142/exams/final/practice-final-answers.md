# Practice Final Answers
## Week 10

1. 

	```
	11 [21] 30,41
	10 [21] 30,41
	11 [23] 31,42
	10 [23] 31,42
	```

2. 

	| Original List | Final List |
	| :--- | :--- |
	| `{2, 5, 8}` | `{2, 5, 10}` |
	| `{3, 4, 7, 5}` | `{3, 4, 10, 5}` |
	| `{2, 4, 6, 2, 6}` | `{2, 4, 8, 2, 14}` |
	| `{4, 5, 8, 9, 3}` | `{4, 5, 12, 9, 15}` |
	| `{1, 2, 8, 5, 10, 5, 4}` | `{1, 2, 9, 5, 19, 5, 23}` |

3. 

	```
	a				c				a				c
	a 1			c 1			a 1			d 1
	b 2			c 2			c 2			c 2
	```

4. One possible answer shown below.

	```java
	public static void printStrings(Scanner pairs) {
		while(pairs.hasNext()) {
			int times = pairs.nextInt();
			String phrase = pairs.next();

			for(int i = 0; i < times; i++) {
				System.out.print(phrase);
			}
			System.out.println();
		}
	}
	```

5. One possible answer is shown below.

	```java
	public static int analyzeParagraphs(Scanner input) {
		int max = 0;
		int lineCount = 0;

		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (!line.equals("")) {
				lineCount++;
			}

			if (line.equals("") || !input.hasNextLine()) {
				System.out.printf("%d-line paragraph\n", lineCount);
				max = Math.max(max, lineCount);
				lineCount = 0;
			} 
		}

		return max;
	}

6. 