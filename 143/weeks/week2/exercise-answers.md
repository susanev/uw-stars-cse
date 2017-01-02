_CSE 143_
# Exercise Answers
## Week 2

1. One possible answer is shown below.

	```java
	public void shift(Stack<Integer> s, int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		int size = s.size();
		    
		for (int i = 0; i < size - n; i++) {
			q.add(s.pop());
		}
		    
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		    
		while (!s.isEmpty()) {
			q.add(s.pop());
		}

		while (!q.isEmpty()) {
			s.push(q.remove());
		}
	}
	```

1. One possible answer is shown below.

	```java
	ListNode q = p;
	p = p.next;
	q.next = null;
	```

1. One possible answer is shown below. 

	```java
	ListNode list2 = list.next.next;
	list.next.next = null;
	list2.next.next = list.next;
	list.next = null;
	list2.next.next.next = list;
	list = list2.next;
	list2.next = list.next.next;
	list.next.next = null;
	```