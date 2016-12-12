import java.util.*;

public class FinalHardProgramming {
	public static void main(String[] args) {
		// Tests for blackjack
		// for (int i = 0; i < 5; i++) {
		// 	System.out.println("output for blackjack: " + blackjack());
		// }

		// Tests for hasTwoPair
		// System.out.println(hasTwoPair(new int[] {2, 4, 2, 2, 4}));
		// System.out.println(hasTwoPair(new int[] {3, 4, 3, 6, 6}));
		// System.out.println(hasTwoPair(new int[] {4, 1, 4, 4, 2}));
		// System.out.println(hasTwoPair(new int[] {5, 5, 3, 3, 4}));
		// System.out.println(hasTwoPair(new int[] {6, 2, 6, 5, 3}));
		// System.out.println(hasTwoPair(new int[] {1, 3, 5, 3, 1}));
		// System.out.println(hasTwoPair(new int[] {3, 1, 3, 1}));
		// System.out.println(hasTwoPair(new int[] {1, 2, 3, 1, 2, 3}));

		// Tests for count
		// System.out.println(count("i", "Mississippi"));
		// System.out.println(count("iss", "MISSISSIPPI"));
		// System.out.println(count("EE", "EeEeE"));

		// Tests for indexOf
		// System.out.println(indexOf(new int[] {}, new int[] {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6}));
		// System.out.println(indexOf(new int[] {1, 3, 6}, new int[] {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6}));
		// System.out.println(indexOf(new int[] {1, 3, 6}, new int[] {1, 3, 5, 8, 12, 1, 3, 17, 1, 2, 6, 9, 1, 3, 6}));
		// System.out.println(indexOf(new int[] {1, 3, 6}, new int[] {1, 3, 6, 8, 12, 1, 3, 17, 1, 2, 6, 9, 1, 3, 6}));
		// System.out.println(indexOf(new int[] {12, 1, 3, 6}, new int[] {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6}));

		// Tests for isMatch
		// System.out.println(isMatch("hello", "hello"));
		// String[] a = {"and", "ant", "but", "cat", "cow", "hat", "sat", "tap", "ten", "the", "tot"};
		// for (int i = 0; i < a.length; i++) {
		// 	System.out.println(isMatch("...", a[i]));
		// }
		// String[] b = {"atom", "army", "aunt", "aura"};
		// for (int i = 0; i < b.length; i++) {
		// 	System.out.println(isMatch("a...", b[i]));
		// }
		// String[] c = {"bats", "task", "yard", "saga", "lava"};
		// for (int i = 0; i < c.length; i++) {
		// 	System.out.println(isMatch(".a..", c[i]));
		// }
		// String[] d = {"tot", "that", "trot", "tiniest"};
		// for (int i = 0; i < d.length; i++) {
		// 	System.out.println(isMatch("t*t", d[i]));
		// }
		// String[] e = {"saga", "lava", "saliva", "tarantula", "nausea"};
		// for (int i = 0; i < e.length; i++) {
		// 	System.out.println(isMatch(".a*a", e[i]));
		// }
		// String[] f = {"poem", "token", "wolves", "voucher", "toothbrushes"};
		// for (int i = 0; i < f.length; i++) {
		// 	System.out.println(isMatch(".o*e.", f[i]));
		// }

		// Tests for rearrange
		// int[] a = {23, 12, 8, 0, 4, 80, 9, 7, 30, 99, 50, 42, 13, 47, 2, 16, 87, 75};
		// rearrange(a);
		// System.out.println(Arrays.toString(a));
		// int[] b = {1, 2, 3};
		// rearrange(b);
		// System.out.println(Arrays.toString(b));
		// int[] c = {5, 4, 4};
		// rearrange(c);
		// System.out.println(Arrays.toString(c));
	}

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
}