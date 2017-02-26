// Program that demonstrates some stack/queue operations

import java.util.*;

public class StackQueue {
	public static void main(String[] args) {
		Queue<Integer> q = makeQueueOfMultiples(6, 3);
		System.out.println("initial queue = " + q);
		System.out.println("sum = " + sum(q));
		System.out.println("after sum queue = " + q);
		System.out.println();

		Stack<Integer> s = new Stack<Integer>();
		queueToStack(q, s);
		System.out.println("after queueToStack:");
		System.out.println("    queue = " + q);
		System.out.println("    stack = " + s);
		System.out.println();

		s = makeStackOfMultiples(6, 5);
		System.out.println("initial stack = " + s);
		System.out.println("sum = " + sum(s));
		System.out.println("after sum stack = " + s);
		System.out.println();

		stackToQueue(s, q);
		System.out.println("after stackToQueue:");
		System.out.println("    stack = " + s);
		System.out.println("    queue = " + q);
	}

	// pre : count >= 0
	// post: returns a queue of count multiples of n
	public static Queue<Integer> makeQueueOfMultiples(int count, int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= count; i++)
		 	q.add(i * n);
		return q;
	}

	// pre : count >= 0
	// post: returns a stack of count multiples of n
	public static Stack<Integer> makeStackOfMultiples(int count, int n) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 1; i <= count; i++)
			s.push(i * n);
		return s;
	}

	// post: Values from q moved to s (added in queue order, front to back);
	//       q is empty
	public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
		while (!q.isEmpty()) {
			int n = q.remove();
			s.push(n);
		}
	}

	// post: Values from s moved to q (added in stack order, top to bottom);
	//       s is empty
	public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
		while (!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
		}
	}

	// post: returns the sum of the values in q
	public static int sum(Queue<Integer> q) {
		int sum = 0;
		for (int i = 0; i < q.size(); i++) {
			int n = q.remove();
			sum = sum + n;
			q.add(n);
		}
		return sum;
	}

	// post: returns the sum of the values in s
	public static int sum(Stack<Integer> s) {
		int sum = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		while (!s.isEmpty()) {
			int n = s.pop();
			sum = sum + n;
			q.add(n);
		}
		queueToStack(q, s);
		stackToQueue(s, q);
		queueToStack(q, s);
		return sum;
	}
}