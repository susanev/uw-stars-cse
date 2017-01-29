_CSE 143_
# Check-in Meeting Answers
## Week 4

_CSE 143_
# Check-in Meeting Answers
## Week 4

1. One possible answer is shown below.

	```java
	public static String collapseSequence(String str, char ch) {
		if (str.length() < 2) {
			return str;
		}
		else {
			if (str.charAt(0) == ch && str.charAt(1) == ch) {
				return collapseSequence(str.substring(1), ch);
			} else {
				return str.charAt(0) + collapseSequence(str.substring(1), ch);
			}
			
		}
	}
	```

1. Possible answers are shown in the table below.

	```
	        before                   after                      code
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |	q = p.next.next;
	 p->[1]->[2]->[3]      | p->[1]->[2]           |	p.next.next = null;
	                       |                       |
	                       |                       |
	 q                     | q->[3]                |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |	q.next = p.next;
	 p->[1]->[3]           | p->[1]->[2]->[3]      |	p.next = q;
	                       |                       |	q = null;
	                       |                       |
	 q->[2]                | q                     |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |	p.next.next = q.next;
	 p->[1]->[2]           | p->[2]->[4]           |	q.next = p;
	                       |                       |	p = p.next;
	                       |                       |	q.next.next = null;
	 q->[3]->[4]           | q->[3]->[1]           |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |	ListNode temp = p.next.next;
	 p->[1]->[2]->[3]      | p->[2]->[1]->[4]      |	temp.next = q.next;
	                       |                       |	p.next.next = p;
	                       |                       |	p = p.next;
	 q->[4]->[5]           | q->[3]->[5]           |	q.next = null;
	                       |                       |	p.next.next = q;
	                       |                       |	q = temp;
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	```