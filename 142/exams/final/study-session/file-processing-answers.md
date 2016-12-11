# File Processing Answers
## Final Study Session

1. reportScore. One possible answer is shown below.

	```java
	public static void reportScore(Scanner input) {
		int stars = 0;
		int minuses = 0;

		while (input.hasNextInt()) {
			int score = input.nextInt();
			String type = input.next();
			if (type.equals("*")) {
				stars += score;
			} else { // type.equals("-")
				minuses += score;
			}
		}

		System.out.printf("%s got %d of %d\n", input.next(), stars - minuses, stars + minuses);
	}
	```

2. switchData. One possible answer is shown below.

	```java
	public static void switchData(Scanner input) {
		System.out.print(input.next());
		while (input.hasNextInt()) {
			int first = input.nextInt();
			if (input.hasNextInt()) {
				System.out.print(" " + input.nextInt() + " " + first);
			} else {
				System.out.print(" " + first);
			}
		}
		System.out.println();
	}
	```

3. printWinner. One possible answer is shown below.

	```java
	public static void printWinner(Scanner input) {
		int max = -1;
		String maxName = "";

		while (input.hasNext()) {
			String name = input.next();
			int total = 0;
			while (input.hasNextInt()) {
				total += input.nextInt();
			}

			if (total > max && total <= 21) {
				max = total;
				maxName = name;
			}
		}

		if (max == -1) {
			System.out.println("Everyone busted!");
		} else {
			System.out.printf("%s is the winner!\n", maxName);
		}
	}
	```

### Line-Based File Processing
1. processScores. One possible answer is shown below.

	```java
	public static void processScores(Scanner input) {
		while (input.hasNextLine()) {
			String name = input.nextLine();
			String record = input.nextLine();
			int plus = 0;
			int total = 0;
			for (int i = 0; i < record.length(); i++) {
				if (record.charAt(i) == '+') {
					plus++;
				}
				total++;
			}
			System.out.printf("%s: %.1f%% plus\n", name, 100.0 * plus / total);
		}
	}
	```

2. matchIndex. One possible answer is shown below.

	```java
	public static void matchIndex(Scanner input) {
		int lines = 1;
		while (input.hasNextLine()) {
			System.out.printf("Lines %d and %d:", lines, lines + 1);
			String line1 = input.nextLine();
			String line2 = input.nextLine();
			int min = Math.min(line1.length(), line2.length());
			boolean matched = false;
			
			for (int i = 0; i < min; i++) {
				if (line1.charAt(i) == line2.charAt(i)) {
					System.out.printf(" %d", i);
					matched = true;
				}
			}

			if (!matched) {
				System.out.println(" none");
			} else {
				System.out.println();
			}

			lines += 2;
		}
	}
	```

3. mostUnique. One possible answer is shown below.

	```java
	public static int mostUnique(Scanner input) {
		int max = 0;
		int period = 1;
		while (input.hasNextLine()) {
			Scanner line = new Scanner(input.nextLine());
			int unique = 1;
			int prev = line.nextInt();
			while (line.hasNextInt()) {
				int current = line.nextInt();
				if (current != prev) {
					unique++;
					prev = current;
				}
			}
			max = Math.max(max, unique);
			System.out.printf("Period %d: %d unique scores\n", period, unique);
			period++;
		}
		return max;
	}
	```