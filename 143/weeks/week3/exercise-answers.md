_CSE 143_
# Exercise Answers
## Week 3

1. One possible answer is shown below.

	```java
	q.next = p.next;
	p.next = q;
	```

1. One possible answer is shown below.

	```java
	public int deleteBack() {
	    ListNode curr = front;
	    if (curr == null) {
	        throw new NoSuchElementException();
	    }
	    if (curr.next == null) {
	        int value = front.data;
	        front = null;
	        return value;
	    }
	    while (curr.next.next != null) {
	        curr = curr.next;
	    }
	    int value = curr.next.data;
	    curr.next = null;
	    return value;
	}
	```

1. One possible answer is shown below.

	```java
	public String starString(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0) {
			return "*";
		} else {
			return starString(n-1) + starString(n - 1);
		}
	}
	```

1. One possible answer is shown below.

	```java
	public int digitMatch (int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException();
		}
		if (x < 10 || y < 10) {
			if (x % 10 == y % 10) {
				return 1;
			} else {
				return 0;
			}
		} else if (x % 10 == y % 10) {
			return 1 + digitMatch(x / 10, y / 10);
		} else {
			return digitMatch(x / 10, y / 10);
		}
	}
	```