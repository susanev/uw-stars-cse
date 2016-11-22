# Practice Final
## Week 10

### Exam Information
Actual Final: Wednesday, December 14, 12:30 - 2:20PM

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

1. Reference Mystery, 5 points. The following program produces 4 lines of output. Write each line of output below as it would appear on the console.

	```java
	import java.util.*;   // for Arrays class
	​
	public class BasicPoint {
	    int x;
	    int y;
	​
	    public BasicPoint(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	}   
	​
	public class ReferenceMystery {
	    public static void main(String[] args) {
	        int n = 10;
	        int[] a = {20};  // an array with just one element
	        BasicPoint p = new BasicPoint(30, 40);
	​
	        mystery(n, a, p);
	        System.out.println(n + " " + Arrays.toString(a) + " " + p.x + "," + p.y);
	​
	        a[0]++;
	        p.x++;
	        mystery(n, a, p);
	        System.out.println(n + " " + Arrays.toString(a) + " " + p.x + "," + p.y);
	    }
	​
	    public static int mystery(int n, int[] a, BasicPoint p) {
	        n++;
	        a[0]++;
	        p.y++;
	        System.out.println(n + " " + Arrays.toString(a) + " " + p.x + "," + p.y);
	        return n;
	    }
	}
	```

2. Array Simulation, 10 points. You are to simulate the execution of a method that manipulates an array of integers. Consider the following method:

	```java
	public static void mystery(int[] list) {
	    for (int i = 2; i < list.length; i++) {
	        if (i % 2 == 0) {
	            list[i] = list[i] + list[i - 2];
	        }
	    }
	}
	```

	In the left-hand column below are specific lists of integers. You are to indicate in the right-hand column what values would be stored in the list after method mystery executes if the integer list in the left-hand column is passed as a parameter to mystery.

	| Original List | Final List |
	| :--- | :--- |
	| `{2, 5, 8}` | |
	| `{3, 4, 7, 5}` | |
	| `{2, 4, 6, 2, 6}` | |
	| `{4, 5, 8, 9, 3}` | |
	| `{1, 2, 8, 5, 10, 5, 4}` | |

3. Inheritance, 6 points.  Assume the following classes have been defined:

	```java
	public class D extends C {
	    public void method1() {
	        System.out.println("d 1");
	    }
	}

	public class C {
	    public void method1() {
	        System.out.println("c 1");
	    }

	    public void method2() {
	        System.out.println("c 2");
	    }

	    public String toString() {
	        return "c";
	    }
	}

	public class A extends C {
	    public void method1() {
	        System.out.println("a 1");
	    }

	    public String toString() {
	        return "a";
	    }
	}

	public class B extends A {
	    public void method2() {
	        System.out.println("b 2");
	    }
	}
	```

	Consider the following code fragment:

	```java
	C[] elements = {new B(), new C(), new A(), new D()};
	for (int i = 0; i < elements.length; i++) {
	    System.out.println(elements[i]);
	    elements[i].method1();
	    elements[i].method2();
	    System.out.println();
	}
	```

	What output is produced by this code?  Write the output as a series of 3-line columns in order from left to right (do not label columns or rows).

4. Token-Based File Processing, 10 points. Write a static method called printStrings that takes as a parameter a Scanner holding a sequence of integer/String pairs and that prints to System.out one line of output for each pair with the given String repeated the given number of times. For example if the Scanner contains the following data:

	```
	6 fun. 3 hello 10 <> 4 wow!
	```

	your method should produce the following output:

	```
	fun.fun.fun.fun.fun.fun.
	hellohellohello
	<><><><><><><><><><>
	wow!wow!wow!wow!
	```

	Notice that there is one line of output for each integer/String pair. The first line has 6 occurrences of "fun.", the second line has 3 occurrences of "hello", the third line has 10 occurrences of "<>" and the fourth line has 4 occurrences of "wow!". Notice that there are no extra spaces included in the output. You are to exactly reproduce the format of this sample output. You may assume that the input values always come in pairs with an integer followed by a String. If the Scanner is empty (no integer/String pairs), your method should produce no output.

5. Line-Based File Processing, 9 points. Write a static method called analyzeParagraphs that takes as a parameter a Scanner containing a text file and that produces output that describes the paragraph structure of the file, returning the maximum number of lines in any given paragraph. Each paragraph in the input file will be terminated by the text "" on a line by itself.  For example, consider the following input file:

	```
	This is an example of an input file
	with four different paragraphs.

	The second paragraph is the longest
	with three lines, so your method should
	return 3 when processing this file.


	The third paragraph was empty.  This one is just short.
	```
        

	The method should count the number of lines in each paragraph and report that information to System.out.  For example, if the input above is stored in a Scanner called input and we make the following call:

	```java
	int max = analyzeParagraphs(input);
	```

	It should produce the following output:

	```
	2-line paragraph
	3-line paragraph
	0-line paragraph
	1-line paragraph
	```

	It would assign max the value 3 because the method returns the maximum number of lines in any given paragraph. You must exactly reproduce the format of this output.  You may assume that the input file has no blank lines, that it contains at least one paragraph, and that each paragraph is terminated by a line containing just "".

6. Arrays, 10 points.  Write a static method called minToFront that takes an array of integers as a parameter and that moves the minimum value in the list to the front by swapping its position with whatever is currently at the front of the list. For example, if a variable called list stores the following values:

	```
	[3, 8, 92, 4, 2, 17, 9]
	```

	and you make the following call:

	```java
	minToFront(list);
	```

	The value 2 is the minimum, so the list should store the following values after the call:

	```
	[2, 8, 92, 4, 3, 17, 9]
	```
 
	Notice that the value 3 which used to be at the front of the list is now at index 4 where the value 2 was before. If there is more than one occurrence of the minimum value, your method should move the first occurrence to the front of the list. If the minimum value is already at the front of the array or if the array is empty, then the array should be unchanged after the method executes.

	You may not construct any extra data structures to solve this problem (not even a string).

7. ArrayList, 10 points.  Write a static method called reverse3 that takes an ArrayList of integer values as a parameter and that reverses each successive sequence of three values in the list.  For example, suppose that a variable called list stores the following sequence of values:

	```
	[3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4]
	```

	and we make the following call:

	```java
	reverse3(list);
	```

	Afterwards the list should store the following sequence of values:

	```
	[19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204]
	```

	The first sequence of three values (3, 8, 19) has been reversed to be (19, 8, 3). The second sequence of three values (42, 7, 26) has been reversed to be (26, 7, 42). And so on. If the list has extra values that are not part of a sequence of three, those values are unchanged. For example, if the list had instead stored:

	```
	[3, 8, 19, 42, 7, 26, 19, -8, 193, 204, 6, -4, 99, 2]
	```

	The result would have been:

	```
	[19, 8, 3, 26, 7, 42, 193, -8, 19, -4, 6, 204, 99, 2]
	```

	Notice that the values (99, 2) are unchanged in position because they were not part of a sequence of three values. You may not construct any extra data structures to solve this problem. You must solve it by manipulating the ArrayList you are passed as a parameter.

8. Critters, 15 points.  Write a class called Raccoon that extends the Critter
   class.  The instances of the Raccoon class always infect when an enemy is in
   front of them and otherwise randomly choose between turning left and turning
   right, with each choice being equally likely.  Their appearance changes over
   time. Each Raccoon initially displays as a less-than followed by a dash
   followed by a greater-than ("<->").  Then as each Raccoon chooses a move, it
   changes its appearance to match that move. If its most recent move was an
   infect, it displays as "<I>". If its most recent move was to turn left, it
   displays as "<L>". And if its most recent move was to turn right, it
   displays as "<R>".  Its color should alternate between blue and red.  It
   should be blue initially when it is displayed as "<->" and then it should
   alternate between the two colors (red after the first move, blue after the
   second move, etc.).

   As in assignment 8, all fields must be declared private and fields that need
   to be initialized to a non-default value must be set in a constructor.  If
   you want to use a Random object, you should make it a field so that you only
   construct it once for each Raccoon.

9. Arrays, 15 points.  Write a static method called collapse that takes an
   array of integers as a parameter and that returns a new array that contains
   the result of collapsing the original list by replacing each successive pair
   of integers with the sum of the pair.  For example, if a variable called
   list stores this sequence of values:

        [7, 2, 8, 9, 4, 13, 7, 1, 9, 10]

    Then the following call:

        collapse(list)

    Should return a new array containing the following values:

        [9, 17, 17, 8, 19]

    The first pair from the original list is collapsed into 9 (7 + 2), the
    second pair is collapsed into 17 (8 + 9), the third pair is collapsed into
    17 (4 + 13) and so on.

    If the list stores an odd number of elements, the final element is not
    collapsed.  For example, if the list had been:

        [1, 2, 3, 4, 5]

   Then the call on collapse would produce the following list:

        [3, 7, 5]

   with the 5 at the end of the list unchanged.  The method should not
   construct any extra data structures other than the array to be returned and
   it should not alter its parameter.

10.   Write a static method called printReversed that
    takes a String as a parameter and that prints a line of output to
    System.out with all words in the String reversed.  For this problem, we
    will define words as nonempty sequences of characters separated by one or
    more spaces.  For example, if we make the following calls:

	printReversed("four score and seven years ago");
	printReversed("our fathers brought forth on this continent");

    We should get the following output:

        ruof erocs dna neves sraey oga
        ruo srehtaf thguorb htrof no siht tnenitnoc

    Notice that the words appear in the same order as in the Strings that were
    passed as parameters, but each individual word is reversed ("four" has
    become "ruof", "score" has become "erocs" and so on).

    The String you are passed might have leading or trailing spaces which
    should be printed exactly as they appear in the String.  For example, if we
    make the following call:

	printReversed("   merry-go-round    is    one    word  ");

    the following output should be produced:

           dnuor-og-yrrem    si    eno    drow  

    This output has 3 spaces at the beginning of the line and 2 spaces at the
    end of the line, just as in the String.

    You are allowed to call the toCharArray method on the String to convert the
    entire String into a char[] if you prefer to use array notation rather than
    String notation in solving the problem.

    Write your solution to printReversed below.