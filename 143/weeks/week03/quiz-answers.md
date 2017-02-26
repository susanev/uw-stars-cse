_CSE 143_
# Quiz Answers
## Week 3

1. A table of answers is shown below.

	| Call | Output |
	| :--- | :--- |
	| `mystery(6, 3);` | 6 0 3 |
	| `mystery(2, 3);` | 2 0 1 3 |
	| `mystery(5, 8);` | 5 2 0 1 3 8 |
	| `mystery(21, 12);` | 21 9 6 0 3 12 |
	| `mystery(3, 10);` | 3 2 0 1 4 7 10 |

1. One possible answer is shown below.

	```java
	public int parityMatches(Stack<Integer> s1, Stack<Integer> s2) {
		if (s1.size() != s2.size()) {
			throw new IllegalArgumentException();
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int count = 0;
		while (!s1.isEmpty()) {
			int num1 = s1.pop();
			int num2 = s2.pop();
			if (num1 % 2 == num2 % 2) {
				count++;
			}
			q.add(num1);
			q.add(num2);
		}
		while (!q.isEmpty()) {
			s1.push(q.remove());
		}
		while (!s1.isEmpty()) {
			q.add(s1.pop());
		}
		while (!q.isEmpty()) {
			s2.push(q.remove());
			s1.push(q.remove());
		}
		return count;
	}
	```