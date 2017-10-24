# Practice Midterm
## Week 5

### Exam Information
Actual Midterm: Friday, November 4, 5:30-6:45PM

#### Actual Exam Rules and Information
* You will have an assigned seat and you must sit in that seat. If you arrive for the exam and find someone else in your seat, ask them to move because we will move students to their assigned seats. We will take pictures of the room to help us verify that students sit in their assigned seats (please contact us if you have a concern about this). Students are expected to make a reasonable effort to sit in their assigned seat. Students who demonstrate an egregious disregard for the seating assignments will receive a 5-point penalty (e.g., if a student goes to the wrong room or refuses to move when asked to).
* We may ask to check your UW ID card during the exam so please have it ready.
* We will distribute the exam early and you can read and fill out the cover page of the exam, but you should not look at the exam questions until you are told to begin. At the end when time is called, you are required to stop writing and close your exam. Students who look at the exam before being told to begin and students who make changes to their exam after time is called will receive a 10-point penalty. Students who do not close their exam booklet when time is called may also receive a 10-point penalty.
* The exam is closed-book and closed-note. You must work alone and may not use any computing devices of any kind including calculators or digital copies of the textbook. Cell phones, music players, and other electronic devices may NOT be out during the exam for any reason.
* There will be a cheat sheet included as the last page of the exam. You may remove this from your exam if you wish once the exam begins, but be sure to hold the staple when you remove the exam because otherwise your exam is likely to come apart. Space will be provided for your answers and you may use the back of the cheat sheet as scratch paper. If you need additional scratch paper, raise your hand and a TA will give it to you. You are not allowed to use your own paper during the exam.
* Unless a question specifically mentions otherwise, the code you write will be graded purely on external correctness (proper behavior and output) and not on internal correctness (style). So, for example, redundancy or lack of comments will not reduce your score.
* You are allowed to abbreviate "Always", "Never," and "Sometimes" as "A", "N", and "S" for the assertions question, but you should otherwise NOT use any abbreviations on the exam.
* You don't need to write any import statements in your exam code.
* You are not allowed to use advanced material to solve exam problems. For the midterm, you are limited to the constructs described in chapters 1 through 5 of the textbook. For the final, you are limited to the constructs described in chapters 1 through 10 of the textbook.
* You are not allowed to use break statements or to have a return from a void method.
* For standard Java classes such as Math and String, you are limited to the methods listed on the cheat sheet. You are not allowed to use the Arrays class or other standard classes and methods that aren't included on the cheat sheet.
* Please be sure that your answer is clearly indicated. This is particularly important if you provide more than one answer or if you have notes in addition to your answer. You can draw a box around the answer you want to have graded and you can draw an "X" through anything that you do not want to have graded.
* You may remove the exam cheat sheet from the test. You do not need to turn in scratch paper or the exam cheat sheet unless you have all or part of an answer on that sheet of paper (you can take these sheets of paper with you). If you have a sheet of paper with all or part of an answer, please write your name on that sheet of paper, staple it to your test (a stapler will be available), and clearly indicate under the corresponding problem that your answer is attached on an extra sheet of paper.
* Please be quiet during the exam. If you have a question or need assistance, please raise your hand.
* When you have finished the exam, please turn in your exam quietly and leave the room.

1. Expressions, 10 points.  For each expression in the left-hand column, indicate its value in the right-hand column.  Be sure to list a constant of appropriate type (e.g., 7.0 rather than 7 for a double, Strings in quotes).

	| __Expression__ | __Value__ |
	| :--- | :--- |
	| `13 + 2 * 5 / 3` | |
	| `2.5 * 2 * 5 / 10 + 1.5` | |
	| `85 % 10 + 4 % 10 - 17 % 3` | |
	| `2 + 3 + "." + (3 + 4) + 2 * 3` | |
	| `482 / 10 / 5 / 2.0 * 2 + 14 / 5` | |

2. Parameter Mystery, 12 points.  Consider the following program.

	```java
	public class Mystery {
	    public static void main(String[] args) {
	        String john = "skip";
	        String mary = "george";
	        String george = "mary";
	        String fun = "drive";
	    
	        statement(mary, john, fun);
	        statement(fun, "george", "work");
	        statement(george, mary, john);
	        statement(george, "john", "dance");
	    }
	            
	    public static void statement(String mary, String john, String fun) {
	        System.out.println(john + " likes to " + fun + " with " + mary);
	    }
	}
	```

	List below the output produced by this program.

3. If/Else Simulation, 12 points.  Consider the following method.

	```java
	public static void ifElseMystery(int a, int b) {
	    if (a == b) {
	        b--;
	    } else if (a < b) {
	        a++;
	    } else {
	        b = b + 5;
	    }
	    if (a == b) {
	        a = a + 2;
	    }
	    System.out.println(a + " " + b);
	}
	```

	For each call below, indicate what output is produced.

	| __Method Call__ | __Output Produced__ |
	| :--- | :--- |
	| `ifElseMystery(14, 14);` | |
	| `ifElseMystery(4, 5);` | |
	| `ifElseMystery(10, 5);` | |
	| `ifElseMystery(2, 8);` | |

4. While Loop Simulation, 12 points.  Consider the following method:

	```java
	public static void mystery(int y) {
	    int x = 0;
	    int z = 0;
	    while (y > 0) {
	        x++;
	        z = z + y % 10;
	        y = y / 10;
	    }
	    System.out.println(x + " " + z);
	}
	```

	For each call below, indicate what output is produced.

	| __Method Call__ | __Output Produced__ |
	| :--- | :--- |
	| `mystery(8);` | |
	| `mystery(32);` | |
	| `mystery(184);` | |
	| `mystery(8239);` | |

5. Assertions, 15 points.  You will identify various assertions as being either always true, never true or sometimes true/sometimes false at various points in program execution.  The comments in the method below indicate the points of interest.

	```java
	public static void mystery(int x, int y) {
	    int z = 0;
	    // Point A
	    while (x != y) {
	        // Point B
	        z++;
	        if (x > y) {
	            // Point C
	            x = x / 10;
	        } else {
	            // Point D
	            y = y / 10;
	        }
	    }
	    // Point E
	    System.out.println(x + " " + y + " " + z);
	}
	```

	Fill in the table below with the words ALWAYS, NEVER or SOMETIMES.

	| | `x > y` | `z == 0` | `x == y` |
	| :--- | :--- | :--- | :--- |
	| Point A | | | |
	| Point B | | | |
	| Point C | | | |
	| Point D | | | |
	| Point E | | | |

6. Programming, 15 points. Write a static method called giveProblems that takes a console scanner and an integer n as parameters and that makes up n multiplication problems for the user to solve.  Each multiplication problem involves choosing two numbers that are each between 1 and 12 inclusive. The user should be prompted for the answer and should be told whether their answer was correct or incorrect. The method should also report the number of problems solved correctly and the number of problems given.

	For example, if the following calls are made:

	```java
	Scanner console = new Scanner(System.in);
	giveProblems(console, 5);
	```

	We would expect interaction like the following:

	```java
	10 * 6 =? 60
	correct
	9 * 9 =? 82
	incorrect...the answer was 81
	4 * 10 =? 40
	correct
	3 * 4 =? 13
	incorrect...the answer was 12
	8 * 5 =? 40
	correct
	3 of 5 correct
	```

	In this log, the user entered 5 answers (60, 82, 40, 13, 40).  All other text was produced as output by the method. Notice that there is a final line of output indicating the overall results. Your method must exactly reproduce the format of this log.

	Your method should construct a Random object to use for making up random problems.  You may assume that the integer passed to your method is greater than 0 and that the user always enters an integer when prompted.

7. Programming, 15 points.  Write a static method called printSequenceTo that takes a target value as a parameter and that prints terms from a particular numerical sequence until they add up to a value greater than or equal to the target and that returns the number of terms that were included. For example, if the following calls are made:

	```java
	int n1 = printSequenceTo(3.0);
	int n2 = printSequenceTo(5.5);
	```

  	The following output should be produced:

	```java
	1/2 + 2/3 + 3/4 + 4/5 + 5/6 = 3.5500000000000003
	1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 = 6.171031746031746
	```

	The variable n1 is set to 5 because it took 5 terms from the sequence to get a sum that is at least 3.0. The variable n2 would be set to 8 because it took 8 terms to get a sum that is at least 5.5. You are to exactly reproduce the format of this output. Notice that the sum is not rounded.

8. Programming, 9 points. Write a static method called weave that that takes two integers as parameters and that returns the result of weaving their digits together to form a single integer. Two numbers x and y are weaved together as follows.  The last pair of digits in the result should be the last digit of x followed by the last digit of y. The second-to-the-last pair of digits in the result should be the second-to-the-last digit of x followed by the second-to-the-last digit of y. And so on.

	For example, consider weaving 128 with 394. The last pair of digits in the result should be 84 (because the original numbers end in 8 and 4). The second-to-the-last pair of digits in the result should be 29 (because the second-to-the-last digits of the original numbers are 2 and 9). The third-to-the-last pair of digits in the result should be 13 (because the third-to-the-last digits of the original numbers are 1 and 3).  Thus:

	```java
	weave(128, 394);
	```

	should return 132984. Notice that the order of the arguments is important. The call weave(394, 128) would return 319248.

	If one of the numbers has more digits than the other, you should imagine that leading zeros are used to make the numbers have equal length.  For example, weave(2384, 12) should return 20308142 (as if it were a call on weave(2384, 0012)).  Similarly, weave(9, 318) should return 30198 (as if it were a call on weave(009, 318)).

	You may assume that the numbers passed to weave are non-negative. You may not use Strings to solve this problem; you must solve it using integer arithmetic.
