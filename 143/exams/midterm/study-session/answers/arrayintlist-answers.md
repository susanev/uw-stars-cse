_CSE 143_

# ArrayIntList Answers
## Midterm Study Session

1. removeFront. One possible answer is shown below.

	```java
	public void removeFront(int n) {
		if (n < 0 || n > size) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < n; i++) {
			elementData[i] = elementData[i + n];
		}

		size -= n;
	}
	```

1. collapse. One possible answer is shown below.

	```java
	public void collapse() {
		for (int i = 0; i < size - 1; i ++) {
			elementData[i] = elementData[i * 2] + elementData[i * 2 + 1];
		}
		size = (size + 1) / 2 ;
	}
	```

1. longestSortedSequence. One possible answer is shown below.

	```java
	public int longestSortedSequence() {
		if (size == 0) {
			return 0;
		} else {
			int max = 1;
			int length = 1;
			for (int i = 1; i < size; i++) {
				if (elementData[i - 1] < elementData[i]) {
					length ++;
				} else {
					max = Math.max(max, length);
					length = 1;
				}
			}
			return max;
		}
	}
	```

1. mirror. One possible answer is shown below.

	```java
	public void mirror() {
		for (int i = size; i < size * 2; i++) {
			elementData[i] = elementData[size * 2 - 1 - i];
		}
		size *= 2;
	}
	```

1. removeOddPositions. One possible answer is shown below.

	```java
	public void removeOddPositions() {
		for (int i = 1; i < size - 1; i ++) {
			elementData[i] = elementData[i * 2];
		}
		size = (size + 1) / 2;
	}
	```

1. isPairWiseSorted. One possible answer is shown below.

	```java
	public boolean isPairwiseSorted() {
		for (int i = 0; i < size - 1; i += 2) {
			if (elementData[i] > elementData[i + 1]) {
				return false;
			}
		}
		return true;
	}
	```

1.

	```java
	public void takeMax(ArrayIntList list) {
		int maxSize = Math.max(size, list.size);
		ensureCapacity(maxSize);

		for (int i = 0; i < maxSize; i++) {
			if (i >= size) {
				elementData[i] = list.elementData[i];
			} else if (i < list.size) {
				elementData[i] = Math.max(elementData[i], list.elementData[i]);
			} 
		}

		size = maxSize;
	}
	```