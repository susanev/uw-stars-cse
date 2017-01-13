_CSE 143_
# Check-in Meeting Answers
## Week 2

1. One possible answer is shown below.

	```java
	public boolean isConsecutive(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        boolean isConsecutive = true;
        while (!s.isEmpty()) {
            int value = s.pop();
            if (!s.isEmpty()) {
                isConsecutive &= value - 1 == s.peek();
            }
            q.add(value);
        }
        
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
        return isConsecutive;
	}
	```

1. One possible answer is shown below.

	```java
	ListNode temp = q.next;
	q.next = q.next.next;
	q.next.next = p.next.next;
	p.next.next = null;
	temp.next = p.next;
	p.next = null;
	temp.next.next = p;
	p = temp;
	```