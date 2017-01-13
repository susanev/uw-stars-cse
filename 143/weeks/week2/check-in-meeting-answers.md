_CSE 143_
# Check-in Meeting Answers
## Week 2

1. One possible answer is shown below.

	```java
    public boolean isConsecutive(Stack<Integer> s) {
        if (s.size() < 2) {
            return false;
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        boolean isConsecutive = true;
        
        int curr = s.pop();
        while (!s.isEmpty()) {
            int next = s.pop();
            isConsecutive &= curr - 1 == next;
            q.add(curr);
            curr = next;
        }
        
        q.add(curr);
        
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        
        return isConsecutive;
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