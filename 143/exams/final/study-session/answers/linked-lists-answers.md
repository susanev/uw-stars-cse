_CSE 143_

# Linked Lists Answers
## Final Study Session

1. isSortedByN. One possible answer is shown below.

	```java
	public boolean isSortedBy(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		ListNode current1 = front;
		ListNode current2 = front;
		while (current2 != null && n > 0) {
			current2 = current2.next;
			n--;
		}
		while (current2 != null) {
			if (current1.data > current2.data) {
				return false;
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		return true;
	} 
	```

1. evenSum. One possible answer is shown below.

	```java
	public int evenSum() {
		int sum = 0;
		boolean even = true;
		ListNode current = front;
		while (current != null) {
			if (even) {
				sum += current.data;
			}
			even = !even;
			current = current.next;
		}
		return sum;
	}
	```

1. rotate. One possible answer is shown below.

	```java
	public void rotate() {
		if (front != null && front.next != null) {
			ListNode temp = front;
			front = front.next;
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
			temp.next = null;
		}
	}
	```

1. lastIndexOf. One possible answer is shown below.

	```java
	public int lastIndexOf(int value) {
		int index = -1;
		ListNode curr = front;
		for (int i = 0; i < size(); i++) {
			if (curr.data == value) {
				index = i;
			}
			curr = curr.next;
		}
		return index;
	}
	```

1. compress. One possible answer is shown below.

	```java
	public void compress(int factor) {
		ListNode current = front;
		while (current != null) {
			int i = 1;
			ListNode current2 = current.next;
			while (current2 != null && i < factor) {
				current.data += current2.data;
				current.next = current.next.next;
				i++;
				current2 = current2.next;
			}
			current = current.next;
		}
	}
	```

1. interleave. One possible answer is shown below.

	```java
	public void interleave(LinkedIntList other) {
		ListNode list1 = front;
		ListNode list2 = other.front;

		while (list1 != null && list2 != null) {
			ListNode temp1 = list1.next;
			ListNode temp2 = list2.next;
			list1.next = list2;
			list2.next = temp1;
			list1 = temp1;
			list2 = temp2;
		}
	}
	```