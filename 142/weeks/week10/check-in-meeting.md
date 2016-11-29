# Check-in Meeting
## Week 10

1. The following program produces 4 lines of output. Write each line of output below as it would appear on the console.

	```java
	public class ReferenceMystery {
		public static void main(String[] args) {
			int a = 7;
			int b = 9;
			Point p1 = new Point(2, 2);
			Point p2 = new Point(2, 2);
			addToXTwice(a, p1);
			System.out.println(a + " " + b + " " + p1.x + " " + p2.x);
			addToXTwice(b, p2);
			System.out.println(a + " " + b + " " + p1.x + " " + p2.x);
		}
		​
		public static void addToXTwice(int a, Point p1) {
			a = a + a;
			p1.x = a;
			System.out.println(a + " " + p1.x);
		}
	}
	```

2. Assume the following classes have been defined

	```java
	public class D extends C {
		public String toString() {
			return "d";
		}

		public void method2() {
			System.out.println("d 2");
		}
	}

	public class B {
		public String toString() {
			return "b";
		}

		public void method1() {
			System.out.println("b 1");
		}

		public void method2() {
			System.out.println("b 2");
		}
	}

	public class A extends D {
		public String toString() {
			return "a";
		}
	}

	public class C extends B {
		public void method1() {
			System.out.println("c 1");
		}
	}
	```

	Consider the following code fragment:

	```java
	B[] elements = {new C(), new A(), new D(), new B()};
	for (int i = 0; i < elements.length; i++) {
		System.out.println(elements[i]);
		elements[i].method1();
		elements[i].method2();
		System.out.println();
	}
	```

	What output is produced by this code?

3.	Write a static method called removeZeros that takes an array of integers as a parameter and that moves any zeros in the array to the end of the array, otherwise preserving the order of the list. For example, if a variable called "list" stores the following values:

	```java
	[7, 2, 3, 0, 4, 6, 0, 0, 13, 0, 78, 0, 0, 19, 14]
	```

	then the call:

	```java
	removeZeros(list);
	```

 	should rearrange the values in the array so that it stores the following:

	```java
	[7, 2, 3, 4, 6, 13, 78, 19, 14, 0, 0, 0, 0, 0, 0]
	```

	Notice that the six zeros have been moved to the end of the array and the other values are in the same order as in the original list.

	You are not allowed to use an auxiliary data structure such as a temporary array or ArrayList to solve this problem and you are not allowed to call any methods of the Arrays class or the Collections class.

4. Write a static method called insert that takes as parameters a short array of integers, a long array of integers and an index and that inserts the values from the short array into the long array starting at the given index, shifting existing values in the long array to the right to make room for the new values.

	For example, suppose that the following two arrays have been declared:

	```java
	int[] bigList = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
	int[] shortList = {2, 4, 6, 8};
	```

	Then the following call:

	```java
	insert(shortList, bigList, 2);
	```

	indicates that the values from the short list should be inserted into the big list starting at index 2. After the call, bigList should store the following sequence of values:

  ```java
  (1, 3, 2, 4, 6, 8, 5, 7, 9, 11)
  ```

	Notice that the values in the short list (2, 4, 6, 8) now appear in the big list starting at index 2.  Also notice that the values that used to be in those positions have been shifted right (5, 7, 9, 11).  As a result of this shifting, some values are no longer in the big list (13, 15, 17, 19).

	You may assume that there is room in the longer array to insert the values	from the shorter array starting at the given index.

	You are not allowed to use an auxiliary data structure such as a temporary array or ArrayList to solve this problem.

	Write your solution to insert below.