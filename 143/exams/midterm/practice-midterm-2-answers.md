_CSE 143_
# Practice Midterm 2 Answers

1. Recursive Tracing, 15 points. 

	| Call | Output produced |
	| :--- | :--- |
	| `mystery(10, 28);` | `2` |
	| `mystery(5, 17);` | `3` |
	| `mystery(2, 10);` | `5` |
	| `mystery(4, -15);` | `-3` |
	| `mystery(-3, -23);` | `7` |

1. Recursive Programming, 15 points.

	```java
	public void printTwos(int n) {
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		
		if (n % 2 == 1) {
			System.out.print(n);
		} else if ((n / 2) % 2 == 1) {
			System.out.print("2 * ");
			printTwos(n / 2);
		} else {
			System.out.print("2 * ");
			printTwos(n / 4);
			System.out.print(" * 2");
		}
	}
	```

1. Details of inheritance, 20 points.

	| Statement | Output |
	| :--- | :--- |
	| `var1.method2();` | Box 2 |
	| `var2.method2();` | Jar 2 |
	| `var3.method2();` | Cup 2/Box 2 |
	| `var4.method2();` | Jar 2 |
	| `var5.method2();` | compiler error |
	| `var6.method2();` | Pill 2 |
	| `var1.method3();` | Box 2/Box 3 |
	| `var2.method3();` | compiler error |
	| `var3.method3();` | Cup 2/Box 2/Box 3 |
	| `var4.method3();` | Jar 2/Box 3 |
	| `((Cup)var1).method1();` | runtime error |
	| `((Jar)var2).method1();` | Jar 1 |
	| `((Cup)var3).method1();` | Cup 1 |
	| `((Cup)var4).method1();` | runtime error |
	| `((Jar)var4).method2();` | Jar 2 |
	| `((Box)var5).method2();` | Box 2 |
	| `((Pill)var5).method3();` | compiler error |
	| `((Jar)var2).method3();` | Jar 2/Box 3 |
	| `((Cup)var3).method3();` | Cup 2/Box 2/Box 3 |
	| `((Cup)var5).method3();` | runtime error |


1. Linked Lists, 15 points. 

	```
		     before                   after                      code
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 p->[1]->[2]           | p->                   |	p.next.next = q;
		              	   |                       |	q = p;
		              	   |                       |	p = null;
	 q->[3]                | q->[1]->[2]->[3]      |
		               	   |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 p->[1]->[2]->[3]      | p->[1]->[3]           |	q = p.next;
	                       |                       |	p.next = p.next.next;
	                       |                       |	q.next = null;
	 q->                   | q->[2]                |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |	p.next.next = q;
	 p->[1]->[2]           | p->[1]->[4]           |	q = p.next;
	                       |                       |	p.next = q.next.next;
	                       |                       |	q.next.next = null;
	 q->[3]->[4]           | q->[2]->[3]           |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |	q.next.next = p;
	 p->[1]->[2]->[3]      | p->[5]->[1]           |	p.next.next.next = q;
	                       |                       |	p = q.next;
	                       |                       |	q = p.next.next;
	 q->[4]->[5]           | q->[2]->[3]->[4]      |	q.next.next.next = null;
	                       |                       |	p.next.next = null;
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	```

1. Array Programming, 10 points. 

	```java
	public int removeLast(int n) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (elementData[i] == n) {
				index = i;
			}
		}

		if (index == -1) {
			return -1;
		} else {
			for (int i = index; i < size - 1; i++) {
				elementData[i] = elementData[i + 1];
			}
			size -= 1;
			return index;
		}
	}
	```

1. Stacks/Queues, 25 points. 

	```java
	public int removeMin(Stack<Integer> s) {
		Queue<Integer> q = new LinkedList<Integer>();  
		int min = s.pop();
		q.add(min);
		while( !s.isEmpty()) {
			int next = s.pop();
			if (next < min) {
				min = next;
			}
			q.add(next);
		}
		while (!q.isEmpty()) {
			int next = q.remove();
			if (next != min) {
				s.push(next);
			}
		}
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		return min;
	}
	```

