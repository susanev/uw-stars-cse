# Arrays Answers
## Final Study Session

### Medium
1. isPairwiseSorted. One possible answer is shown below.

	```java
	public static boolean isPairwiseSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i+=2) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}
	```

2. sameGap. One possible answer is shown below.

	```java
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
	```

3. isSumArray. One possible answer is shown below.

	```java
	public static boolean isSumArray(int [] list) {
		if (list.length % 3 != 0) {
			return false;
		}
		for (int i = 0; i < list.length; i+=3) {
			if (list[i] + list[i + 1] != list[i + 2]) {
				return false;
			}
		}
		return true;
	}
	```

### Hard
1. delta. One possible answer is shown below.

	```java
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
	```

2. append. One possible answer is shown below.

	```java
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
	```

3. splice. One possible answer is shown below.

	```java
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
	```