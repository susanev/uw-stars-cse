# Practice Midterm Answers
## Week 5

1. Expressions, 10 points.

	| __Expression__ | __Value__ |
	| :--- | :--- |
	| `13 + 2 * 5 / 3` | `16` |
	| `2.5 * 2 * 5 / 10 + 1.5` | `4.0` |
	| `85 % 10 + 4 % 10 - 17 % 3` | `7` |
	| `2 + 3 + "." + (3 + 4) + 2 * 3` | `"5.76"` |
	| `482 / 10 / 5 / 2.0 * 2 + 14 / 5` | `11.0` |

2. Parameter Mystery, 12 points.

	```
	skip likes to drive with george
	george likes to work with drive
	george likes to skip with mary
	john likes to dance with mary
	```

3. If/Else Simulation, 12 points.

	| __Method Call__ | __Output Produced__ |
	| :--- | :--- |
	| `ifElseMystery(14, 14);` | `14 13` |
	| `ifElseMystery(4, 5);` | `7 5` |
	| `ifElseMystery(10, 5);` | `12 10` |
	| `ifElseMystery(2, 8);` | `3 8` |

4. While Loop Simulation, 12 points.

	| __Method Call__ | __Output Produced__ |
	| :--- | :--- |
	| `mystery(8);` | `1 8` |
	| `mystery(32);` | `2 5` |
	| `mystery(184);` | `3 13` |
	| `mystery(8239);` | `4 22` |

5. Assertions, 15 points.

	| | `x > y` | `z == 0` | `x == y` |
	| :--- | :---: | :---: | :---: |
	| Point A | S | A | S |
	| Point B | S | S | N |
	| Point C | A | N | N |
	| Point D | N | N | N |
	| Point E | N | S | A |

6. One possible solution appears below. Your solution may be different and still correct, there are many ways to solve these problems.

	```java
	public static void giveProblems(Scanner console, int numProblems) {
	    Random r = new Random();
	    int numRight = 0;
	    for (int i = 1; i <= numProblems; i++) {
	        int x = r.nextInt(12) + 1;
	        int y = r.nextInt(12) + 1;
	        System.out.print(x + " * " + y + " =? ");
	        int answer = x * y;
	        int response = console.nextInt();
	        if (response == answer) {
	            System.out.println("correct");
	            numRight++;
	        } else {
	            System.out.println("incorrect...the answer was " + answer);
	        }
	    }
	    System.out.println(numRight + " of " + numProblems + " correct");
	}
	```
    
7. One possible solution appears below. Your solution may be different and still correct, there are many ways to solve these problems.

	```java
	public static int printSequenceTo(double value) {
	    double sum = 0.5;
	    System.out.print("1/2");
	    int n = 1;
	    while (sum < value) {
	        n++;
	        System.out.print(" + " + n + "/" + (n + 1));
	        sum = sum + (double) n / (n + 1);
	    }
	    System.out.println(" = " + sum);
	    return n;
	}
	```

8. One possible solution appears below. Your solution may be different and still correct, there are many ways to solve these problems.

	```java
	public static int weave(int x, int y) {
	    int result = 0;
	    int multiplier = 1;
	    while (x != 0 || y != 0) {
	        result = result + multiplier * (x % 10 * 10 + y % 10);
	        multiplier = multiplier * 100;
	        x = x / 10;
	        y = y / 10;
	    }
	    return result;
	}
	```
