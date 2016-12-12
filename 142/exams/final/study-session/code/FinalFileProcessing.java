import java.util.*;

public class FinalFileProcessing {
	public static void main(String[] args) {
		// Tests for reportScore
		// reportScore(new Scanner("3 * 2 - 1 * Erica"));
		// reportScore(new Scanner("2 - 1 * 2 - 1 - 1 * 2 - Fred"));
		// reportScore(new Scanner("1 * 1 - 3 * 1 - 2 - Sylvia"));
		// reportScore(new Scanner("Julia"));

		// Tests for switchData
		// switchData(new Scanner("Jan 1 2 3 4 5 6"));
		// switchData(new Scanner("Feb 38 14 79 4 -3"));
		// switchData(new Scanner("Mar 38"));
		// switchData(new Scanner("Apr"));

		// Tests for printWinner
		// printWinner(new Scanner("alpha 10 5 9 bravo 8 charlie 11 9"));
		// printWinner(new Scanner("delta 10 3 9 echo 3 1 10 10"));
		// printWinner(new Scanner("foxtrot 11 5 6"));
		// printWinner(new Scanner("golf 4 8 hotel 10 6 india 9 8 7"));

		// Test for processScores
		// processScores(new Scanner("Kane, Erica\n--+-+\nChandler, Adam\n++-+\nMartin, Jake\n+++++++\nDillon, Amanda\n++-++-+-"));

		// Test for matchIndex
		// matchIndex(new Scanner("The quick brown fox\nThose achy down socks\nWheels on the school bus go round\nThe wipers go swish swish swish\nHis name is Robert Paulson\nSo long 'n thanks for all the fish\nHumpty Dumpty sat on a wall\nAnd then he also had a great fall\nbooyakasha\nBruno Ali G Borat"));

		// Test for mostUnique
		// System.out.printf("mostUnique returned %d\n", mostUnique(new Scanner("	10 10 10 9 9 8 3\n3 3 8 10 9 7 7 6 6\n4 1 9 9 10 7 7\n10 10 10 10")));
	}

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
}