_CSE 143_
# Practice Midterm Answers
## Week 4

1. Recursive Tracing, 15 points. 

	| Call | Output produced |
	| :--- | :--- |
	| `mystery(18, 0);` | 0 |
	| `mystery(8, 18);` | 1 |
	| `mystery(25, 21);` | 1 |
	| `mystery(305, 315);` | 2 |
	| `mystery(20734, 1724);` | 2 |

2. Recursive Programming, 15 points.

	```java
	public static String separate(String str) {
		if (str.length() == 1) {
			return str.toLowerCase();
		}
		return str.substring(0, 1).toLowerCase() + "-" + separate(str.substring(1));
	}

3. Details of inheritance, 20 points.

	| Statement | Output |
	| :--- | :--- |
	| `var1.a();` | Vegetable a |
	| `var1.b();` | Computer b/Mineral b/Vegetable a |
	| `var1.c();` | compiler error |
	| `var2.a();` | Animal a |
	| `var2.b();` | Mineral b/Animal a |
	| `var3.a();` | Vegetable a |
	| `var3.b();` | Mineral b/Vegetable a |
	| `var4.a();` | compiler error |
	| `((Computer) var1).b();` | Computer b/Mineral b/Vegetable a |
	| `((Computer) var1).c();` | Computer c |
	| `((Computer) var2).c();` | runtime error |
	| `((Animal) var2).c();` | Mineral b/Animal a/Animal c |
	| `((Computer) var3).b();` | runtime error |
	| `((Vegetable) var4).b();` | Mineral b/Vegetable a |
	| `((Animal) var4).c();` | runtime error |

4. Linked Lists, 15 points. 

        before                   after                      code
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |	q = p;
 p->[1]->[2]->[3]      | p->[2]->[3]           |	p = q.next;
                       |                       |	q.next = null;
                       |                       |
 q                     | q->[1]                |
                       |                       |
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |	q = p.next;
 p->[1]->[2]->[3]      | p->[1]->[3]           |	p.next = q.next;
                       |                       |	q.next = null;
                       |                       |
 q                     | q->[2]                |
                       |                       |
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |	ListNode temp = q;
 p->[1]->[2]           | p->[3]->[2]->[1]      |	q = q.next;
                       |                       |	temp.next = p.next;
                       |                       |	temp.next.next = p;
 q->[3]->[4]           | q->[4]                |	temp.next.next.next = null;
                       |                       |	p = temp;
                       |                       |
                       |                       |
                       |                       |
-----------------------+-----------------------+-------------------------------
                       |                       |
                       |                       |	q.next.next = p.next.next;
 p->[1]->[2]->[3]      | p->[2]->[5]->[3]      |	p.next.next = q.next;
                       |                       |	q.next = p;
                       |                       |	p = q.next.next;
 q->[4]->[5]           | q->[4]->[1]           |	q.next.next = null;
                       |                       |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
                       |                       |
-----------------------+-----------------------+-------------------------------

5. Stacks/Queues, 25 points. 

	```java
	public static boolean isReverseAlphabetical(Stack<Character> s) {
		if (s.size() < 2) {
			return true;
		}
		Queue<Character> queue = new Linkedlist<Character>();
		boolean sorted = true;
		char prev = s.pop();
		queue.add(prev);
		while (!s.isEmpty()) {
			char curr = s.pop();
			queue.add(curr);
			if (prev − 1 != curr) {
				sorted = false;
			}
			prev = curr;
		}

		while (!queue.isEmpty()) {
			s.push(queue.remove());
		}

		while (!s.isEmpty()) {
			queue.add(s.pop());
		}

		while (!queue.isEmpty()) {
			s.push(queue.remove());
		}

		return sorted;
	}
	```

6. Array Programming, 10 points. 

	```java
	public void moreSevens(int n) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == n) {
				elementData[i] = 7;
			}
		}
	}
	```