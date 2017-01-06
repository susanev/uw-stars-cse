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

3. One possible answer is shown below.

	```java
	public boolean hasTwoConsecutive() {
    ListNode curr = front;
    while (curr != null && curr.next != null) {
        if (curr.data + 1 == curr.next.data) {
            return true;
        }
        curr = curr.next;
    }
    return false;
	}
	```