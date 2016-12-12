import java.util.*;

public class FinalArrays {
	public static void main(String[] args) {
		// Tests for isPairwiseSorted
		// System.out.println(isPairwiseSorted(new int[] {3, 8, 2, 15, -3, 5, 2, 3, 4, 4}));
		// System.out.println(isPairwiseSorted(new int[] {}));
		// System.out.println(isPairwiseSorted(new int[] {6}));
		// System.out.println(isPairwiseSorted(new int[] {4, 12}));
		// System.out.println(isPairwiseSorted(new int[] {8, 5}));
		// System.out.println(isPairwiseSorted(new int[] {3, 8, 2, 15, -3, 5, 2, 3, 4, 4, 3, 1}));
		// System.out.println(isPairwiseSorted(new int[] {8, 13, 92, 92, 4, 4}));
		// System.out.println(isPairwiseSorted(new int[] {1, 3, 5, 7, 9, 8}));

		// Tests for sameGap
		// System.out.println(sameGap(new int[] {}));
		// System.out.println(sameGap(new int[] {42}));
		// System.out.println(sameGap(new int[] {10, 15}));
		// System.out.println(sameGap(new int[] {1, 4, 7, 10, 13, 10, 13, 10, 7, 4}));
		// System.out.println(sameGap(new int[] {1, 4, 10, 13, 10, 13, 10, 7, 4}));
		// System.out.println(sameGap(new int[] {2, 4, 6, 8, 10}));
		// System.out.println(sameGap(new int[] {2, 4, 6, 8, 10, 11}));
		// System.out.println(sameGap(new int[] {1, 2, 3, 4, 5, 6}));
		// System.out.println(sameGap(new int[] {1, 2, 3, 2, 3, 4, 5, 6}));
		// System.out.println(sameGap(new int[] {1, 2, 3, 2, 4, 5, 6}));
		// System.out.println(sameGap(new int[] {3, 3, 3}));

		// Tests for isSumArray
		// System.out.println(isSumArray(new int[] {1, 2, 3, 8, 7, 15, 9, 3, 12}));
		// System.out.println(isSumArray(new int[] {1, 2, 3, 4, 5}));
		// System.out.println(isSumArray(new int[] {6, 11, 2008}));
		// System.out.println(isSumArray(new int[] {-4, 7, 3, 8, -2, 6}));

		// Tests for delta
		// System.out.println(Arrays.toString(delta(new int[] {})));
		// System.out.println(Arrays.toString(delta(new int[] {3})));
		// System.out.println(Arrays.toString(delta(new int[] {3, 2})));
		// System.out.println(Arrays.toString(delta(new int[]{3, 8, 15})));
		// System.out.println(Arrays.toString(delta(new int[] {3, 8, 2, 5, 1, 9})));

		// Tests for append
		// System.out.println(Arrays.toString(append(new int[] {2, 4, 6}, new int[] {1, 2, 3, 4, 5})));
		// System.out.println(Arrays.toString(append(new int[] {1, 2, 3, 4, 5}, new int[] {2, 4, 6})));

		// Tests for splice
		// System.out.println(Arrays.toString(splice(new int[] {7, 5, 8, 5, 9, 7, 2, 3}, 2, 4)));
	}

	public static boolean isPairwiseSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i += 2) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean sameGap(int[] list) {
		if (list.length < 2) {
			return true;
		}

		int gap = Math.abs(list[0] - list[1]);
		for (int i = 1; i < list.length - 1; i++) {
			if (Math.abs(list[i] - list[i + 1]) != gap) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSumArray(int [] list) {
		if (list.length % 3 != 0) {
			return false;
		}
		for (int i = 0; i < list.length; i += 3) {
			if (list[i] + list[i + 1] != list[i + 2]) {
				return false;
			}
		}
		return true;
	}

	public static int[] delta(int[] list) {
		if (list.length == 0) {
			return new int[0];
		}

		int[] deltaList = new int[list.length * 2 - 1];
		for (int i = 0;  i < list.length - 1; i ++) {
			deltaList[i * 2] = list[i];
			deltaList[i * 2 + 1] = list[i + 1] - list[i];
		}
		deltaList[deltaList.length - 1] = list[list.length - 1];
		return deltaList;
	}

	public static int[] append(int[] list1, int[] list2) {
		int[] appendList = new int[list1.length + list2.length];
		for (int i = 0; i < list1.length; i++) {
			appendList[i] = list1[i];
		}
		for (int i = 0; i < list2.length; i++) {
			appendList[list1.length + i] = list2[i];
		}
		return appendList;
	}

	public static int[] splice(int[] list, int from, int to){
		int[] spliceList = new int[list.length];
		int spliceIndex = 0;
		for (int i = to; i < list.length; i++) {
			spliceList[spliceIndex] = list[i];
			spliceIndex++;
		}
		for (int i = from; i < to; i++) {
			spliceList[spliceIndex] = list[i]; 
			spliceIndex++;
		}
		for (int i = 0; i < from; i++) {
			spliceList[spliceIndex] = list[i];
			spliceIndex++;
		}
		return spliceList;
	}
}
