# Mechanical
## Final Study Session

### Reference Mystery
1. The following program produces 4 lines of output. Write the output below, as it would appear on the console.

	```java
	import java.util.*; // for Arrays class
	public class ReferenceMystery {
		public static void main(String[] args) {
			int x = 0;
			int[] a = new int[2];
			mystery(x, a);
			System.out.println(x + " " + Arrays.toString(a));
			x++;
			a[1] = a.length;
			mystery(x, a);
			System.out.println(x + " " + Arrays.toString(a));
		}

		public static void mystery(int x, int[] list) {
			list[x]--;
			x++;
			System.out.println(x + " " + Arrays.toString(list));
		}
	}
	```

2. The following program produces 4 lines of output. Write the output below, as it would appear on the console.

	```java
	public class Pokemon {
		int level;
		public Pokemon(int level) {
			this.level = level;
		}
	}
	
	public class ReferenceMystery {
		public static void main(String[] args) {
			int hp = 10;
			Pokemon squirtle = new Pokemon(5);

			battle(squirtle, hp);
			System.out.println("Level " + squirtle.level + ", " + hp + " hp");

			hp = hp + squirtle.level;

			battle(squirtle, hp + 1);
			System.out.println("Level " + squirtle.level + ", " + hp + " hp");
		}

		public static void battle(Pokemon poke, int hp) {
			poke.level++;
			hp -= 5;
			System.out.println("Level " + poke.level + ", " + hp + " hp");
		}
	}
	```

### Array Simulation
1. Consider the following method:

	```java
	public static void arrayMystery(int[] a) {
		for (int i = a.length - 2; i > 0; i--) {
			if (a[i + 1] <= a[i - 1]) {
				a[i]++;
			}
		}
	}
	```
	
	Indicate in the right-hand column what values would be stored in the array after the method arrayMystery executes if the integer array in the left-hand column is passed as a parameter to it.

	| Original Contents of Array | Final Contents of Array |
	| :--- | :--- |
	| `{42}` | |
	| `{1, 8, 3, 6}` | |
	| `{5, 5, 5, 5, 5}` | |
	| `{10, 7, 9, 6, 8, 5}` | |
	| `{1, 0, 1, 0, 0, 1, 0}` | |

2. Consider the following method:

	```java
	public static void arrayMystery(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == a[a.length - i - 1]) {
				a[i]++;
				a[a.length - i - 1]++;
			}
		}
	}
	```

	Indicate in the right-hand column what values would be stored in the array after the method arrayMystery executes if the integer array in the left-hand column is passed as a parameter to it.

	| Original Contents of Array | Final Contents of Array |
	| :--- | :--- |
	| `{1, 8, 3, 8, 7}` | |
	| `{4, 0, 0, 4, 0, 0, 4, 0}` | |
	| `{9, 8, 7, 6, 4, 6, 2, 9, 9}` | |
	| `{42}` | |
	| `{5, 5, 5, 6, 5, 5, 5}` | |

### Inheritance
1. Assume that the following classes have been defined:

	```java
	public class Pen extends Sock {
		public void method1() {
			System.out.print("pen 1 ");
		}
	}

	public class Lamp {
		public void method1() {
			System.out.print("lamp 1 ");
		}

		public void method2() {
			System.out.print("lamp 2 ");
		}

		public String toString() {
			return "lamp";
		}
	}

	public class Book extends Sock {
		public void method2() {
			System.out.print("book 2 ");
		}
	}
	public class Sock extends Lamp {
		public void method1() {
			System.out.print("sock 1 ");
		}
		public String toString() {
			return "sock";
		}
	}
	```

	Given the classes above, what output is produced by the following code?

	```java
	Lamp[] elements = {new Book(), new Pen(), new Lamp(), new Sock()};
	for (int i = 0; i < elements.length; i++) {
		System.out.println(elements[i]);
		elements[i].method1();
		System.out.println();
		elements[i].method2();
		System.out.println();
	} 
	```

2. Assume the following classes have been defined:

	```java
	public class A extends B {
		public void method2() {
			System.out.println("a 2");
		}
	}

	public class B extends C {
		public String toString() {
			return "b";
		}

		public void method2() {
			System.out.println("b 2");
		}
	}

	public class C {
		public String toString() {
			return "c";
		}

		public void method1() {
			System.out.println("c 1");
		}

		public void method2() {
			System.out.println("c 2");
		}
	}

	public class D extends B {
		public void method1() {
			System.out.println("d 1");
		}
	}
	```

	Consider the following code fragment:

	```java
	C[] elements = {new A(), new B(), new C(), new D()};
	for (int i = 0; i < elements.length; i++) {
		System.out.println(elements[i]);
		elements[i].method1();
		elements[i].method2();
		System.out.println();
	}
	```

	What output is produced by this code?