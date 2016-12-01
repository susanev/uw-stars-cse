# Practice Final Answers
## Week 10

1. __Reference Mystery (5 points)__

	```
	11 [21] 30,41
	10 [21] 30,41
	11 [23] 31,42
	10 [23] 31,42
	```

2. __Array Simulation (10 points)__

	| Original List | Final List |
	| :--- | :--- |
	| `{2, 5, 8}` | `{2, 5, 10}` |
	| `{3, 4, 7, 5}` | `{3, 4, 10, 5}` |
	| `{2, 4, 6, 2, 6}` | `{2, 4, 8, 2, 14}` |
	| `{4, 5, 8, 9, 3}` | `{4, 5, 12, 9, 15}` |
	| `{1, 2, 8, 5, 10, 5, 4}` | `{1, 2, 9, 5, 19, 5, 23}` |

3. __Inheritance (6 points)__

	```
	a			c			a			c
	a 1			c 1			a 1			d 1
	b 2			c 2			c 2			c 2
	```

4. __Token-Based Processing (10 points)__

	One possible answer shown below.

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

5. __Line-Based File Processing (9 points)__ 

	One possible answer is shown below.

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
	```

6. __Arrays (10 points)__

	One possible answer is shown below.

	```java
	public static void minToFront(int[] list) {
		if (list.length != 0) {
			int minIndex = 0;
			for (int i = 1; i < list.length; i++) {
				if (list[i] < list[minIndex]) {
					minIndex = i;
				}
			}

			int temp = list[0];
			list[0] = list[minIndex];
			list[minIndex] = temp;
		}
	}
	```

7. __ArrayList (10 points)__ 

	One possible answer is shown below.

	```java
	public static void reverse3(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 2; i+=3) {
			int temp = list.get(i);
			list.set(i, list.get(i + 2));
			list.set(i + 2, temp);
		}
	}
   ```

8. __Critters (15 points)__ 

	One possible answer is shown below.

	```java
	public class Raccoon extends Critter {
		private Random r;
		private String appearance;
		private Color c;

		public Raccoon() {
			r = new Random();
			appearance = "<->";
			c = Color.BLUE;
		}

		public Color getColor() {
			return c;
		}

		public Action getMove(CritterInfo info) {
			toggleColor();
			if (info.getFront() == Neighbor.OTHER) {
				appearance = "<I>";
				return Action.INFECT;
			} else if(r.nextInt(2) == 0) {
				appearance = "<R>";
				return Action.RIGHT;
			} else {
				appearance = "<L>";
				return Action.LEFT;
			}
		}

		public String toString() {
			return appearance;
		}

		private void toggleColor() {
			if (c == Color.RED) {
				c = Color.BLUE;
			} else {
				c = Color.RED;
			}
		}
	}
	```

9. __Arrays (15 points)__ 

	One possible answer is shown below.

	```java
	public static int[] collapse(int[] list) {      
		int[] output = new int[(list.length + 1) / 2];

		for (int i = 0; i < list.length; i++) {
			output[i / 2] += list[i];
		}
		  
		return output;
	}
	```

10. __Programming (10 points)__ 

	One possible answer is shown below.

	```java
	public static void printReversed(String phrase) {
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				String reverse = "";
				while (i < phrase.length() && phrase.charAt(i) != ' ') {
					reverse = phrase.charAt(i) + reverse;
					i++;
				}
				i--;
				System.out.print(reverse);
			}
		}
		System.out.println();
	}
	```