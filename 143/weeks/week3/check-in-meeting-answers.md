_CSE 143_
# Check-in Meeting Answers
## Week 3

1. One possible answer is shown below.

	```java
	ListNode temp = p.next;
	p.next = p.next.next;
	p.next.next = q.next;
	q.next = q.next.next;
	p.next.next.next = null;
	temp.next = q;
	q = temp;
	```

2. One possible answer is shown below.

	```java
	ListNode temp = p.next.next;
	q.next.next = p.next;
	temp.next = p;
	temp.next.next = q.next;
	q.next = q.next.next;
	temp.next.next.next = null;
	p = temp;
	q.next.next = null;
	```

3. Two possible answers are shown below.

	```java
	public static int largestDigit(int n) {
		if (n < 0) {
			return largestDigit(-n);
		} else if (n < 10) {
			return n;
		} else {
			int last = n % 10;
			int rest = largestDigit(n / 10);
			if (last > rest) {
				return last;
			} else {
				return rest;
			}
		}
	}
	```

	```
	public static int largestDigit(int n) {
		if (n < 0) {
			return largestDigit(-n);
		}
		if (n < 10) {
			return n;
		} else {
			return Math.max(n % 10, largestDigit(n / 10));
		}
	}
	```