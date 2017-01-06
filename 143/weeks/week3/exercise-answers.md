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
	public int countDuplicates() {
    int duplicates = 0;
    ListNode curr = front;    
    while (curr != null && curr.next != null) {
        if (curr.data == curr.next.data) {
            duplicates ++;
        }
        curr = curr.next;
    }
    return duplicates;
	}
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
	    curr.next = null;
	    return value;
	}
	```