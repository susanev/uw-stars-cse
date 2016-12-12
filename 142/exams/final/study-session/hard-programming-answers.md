# Hard Programming Answers
## Final Study Session

1. blackjack. One possible answer is shown below.

	```java
	public static boolean blackjack() {
		Random r = new Random();
		int sum = 0;
		while (sum < 17) {
			int next = r.nextInt(10) + 1;
			sum += next;
			System.out.printf("%d ", next);
		}
		System.out.printf("= %d", sum);
		if (sum <= 21) {
			if (sum == 21) {
				System.out.println(" BLACKJACK!");
			} else {
				System.out.println();
			}
			return true;
		} else { // (sum > 21)
			System.out.println(" Busted!");
			return false;
		} 
	}
	```

2. hasTwoPair. One possible answer is shown below.

	```java
	public static boolean hasTwoPair(int[] list) {
		int[] sums = new int[6];
		int pairs = 0;
		for (int i = 0; i < list.length; i++) {
			sums[list[i] - 1]++;
		}
		for (int i = 0; i < sums.length; i++) {
			if (sums[i] == 2) {
				pairs++;
			}
		}
		return pairs == 2;
	}
	```

3. count. One possible answer is shown below.

	```java
	public static int count(String target, String source) {
		int count = 0;
		target = target.toLowerCase();
		source = source.toLowerCase();
		for (int i = 0; i <= source.length() - target.length(); i++) {
			if (source.substring(i, i + target.length()).equals(target)) {
				count++;
			}
		}
		return count;
	}
	```

4. indexOf. One possible answer is shown below.

	```java
	public static int indexOf(int[] list1, int[] list2) {
		if (list1.length == 0) {
			return 0;
		}

		for (int i = 0; i < list2.length - list1.length + 1; i++) {
			int subIndex = 0;
			boolean isSub = list1[subIndex] == list2[i];
			while (isSub && subIndex < list1.length - 1) {
				subIndex++;
				isSub = list1[subIndex] == list2[i + subIndex];
			}
			if (isSub) {
				return i;
			}
		}
		return -1;
	}
	```

5. isMatch. One possible answer is shown below.

	```java
	public static boolean isMatch(String pattern, String target) {
		boolean seenStar = false;
		int patternIndex = 0;
		int targetIndex = 0;
		while (patternIndex < pattern.length() && targetIndex < target.length()) {
			if (pattern.charAt(patternIndex) == '*') {
				seenStar = true;
				patternIndex++;
			} else { 
				if (pattern.charAt(patternIndex) == target.charAt(targetIndex) ||
									pattern.charAt(patternIndex) == '.') {
					patternIndex++;
				} else if (!seenStar) {
					return false;
				}
				targetIndex++;
			}
		}
		return patternIndex == pattern.length();
	}
	```

6. rearrange. One possible answer is shown below.

	```java
	public static void rearrange(int[] list) {
		int mod = 0;
		int i = 0;
		while (i < list.length && mod < 3) {
			if (list[i] % 3 != mod) {
				int j = i + 1;
				while (j < list.length && list[j] % 3 != mod) {
					j++;
				}
				if (j == list.length && list[i] % 3 != mod) {
					mod += 1;
				} else {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
					i += 1;
				}
			} else {
				i += 1;
			}
		}
	}
	```