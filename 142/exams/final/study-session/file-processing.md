# File Processing
## Final Study Session

### Token-Based File Processing
1. Write a static method called reportScore that takes as a parameter a Scanner containing information about a student's performance and that prints a report for that student. 
	
	Students are given gold stars for tasks they solved particularly well and minuses for tasks where they performed poorly. The information for each student is presented as a series of count/type pairs where each count is a positive integer and each type is either "*" or "-". These count/type pairs are followed by the student's name which is guaranteed to be a single word composed entirely of alphabetic characters. Consider this report:

	```
	3 * 2 - 1 * Erica
	```

	It indicates that Erica got 3 stars followed by 2 minuses followed by 1 star. The overall score is computed by giving 1 plus point for each star and one minus point for each minus. The method produces exactly one line of output reporting this score and the total number of tasks. The table below includes several examples.

	You may not construct any extra data structures to solve this problem.

	| Scanner contents | Output produced |
	| :--- | :--- |
	| `3 * 2 - 1 * Erica` |	Erica got 2 of 6 |
	| `2 - 1 * 2 - 1 - 1 * 2 - Fred` | Fred got -5 of 9 |
	| `1 * 1 - 3 * 1 - 2 - Sylvia` | Sylvia got 0 of 8 |
	| `Julia` | Julia got 0 of 0 |

2. Write a static method called switchData that takes as a parameter a Scanner containing a label followed by a sequence of integers and that prints to System.out the same information with each successive pair of integers switched in order. For example, suppose that a Scanner called data contains the following tokens:
	
	```
	Jan 1 2 3 4 5 6
	```

	Here the label is "Jan". The label will always be a single word that appears at the beginning. After the label, we have a series of six integers. If we make the following call:

	```java
	switchData(data);
	```

	the method should produce the following output:

	```
	Jan 2 1 4 3 6 5
	```

	Notice that the first pair of integers (1, 2) has been switched (2, 1), and the second pair of integers (3, 4) has been switched (4, 3), and so on.

	This first example involved sequential integers to make the switching more obvious, but this won't always be the case. You also shouldn't assume that you have an even number of integers. If there is an odd number of integers, then the final value should not be moved. For example, if the Scanner had instead contained these tokens:

	```
	Feb 38 14 79 4 -3
	```

	then the method would have produced the following output:

	```
	Feb 14 38 4 79 -3
	```

	There will always be a one-word label, but the list of integers might be empty, in which case the method simply prints the label on a line by itself. Your method should produce a complete line of output. In other words, if it is called n times, it will produce n lines of output. You may assume that the input is legal (a one-word label followed by 0 or more integer values).

3. Write a static method printWinner that accepts a Scanner holding a sequence of names and numbers. Following each name is a series of one or more numbers. A person's sum is the total of the numbers until the next name. The method will print out the name of the person who has the highest sum less than or equal to 21. If everyone's sum is over 21, then the method will print "Everyone busted!" You may assume that there is at least one name. For example, given the following Scanners:

	```java
	Scanner input1 = new Scanner("alpha 10 5 9 bravo 8 charlie 11 9");
	Scanner input2 = new Scanner("delta 10 3 9 echo 3 1 10 10");
	Scanner input3 = new Scanner("foxtrot 11 5 6");
	Scanner input4 = new Scanner("golf 4 8 hotel 10 6 india 9 8 7");
	```

	Calling printWinner will result in the following output:

	| Call | Output |
	| :--- | :--- |
	| `printWinner(input1);` | charlie is the winner! |
	| `printWinner(input2);` | Everyone busted! |
	| `printWinner(input3);` | Everyone busted! |
	| `printWinner(input4);` | hotel is the winner! |

	In the first example, the respective sums for alpha, bravo, and charlie are 24 (10 + 5 + 9), 8 (8), and 20 (11 + 9). The highest sum that is less than or equal to 21 belongs to charlie. In the second example, the sums are 22 (10 + 3 + 9) and 24 (3 + 1 + 10 + 10). Since no sum is less than or equal to 21, everyone busted.

### Line-Based File Processing
1. Write a static method called processScores that takes as a parameter a Scanner containing a series of lines that represent student records. Each student record takes up two lines of input. The first line has the student's name and the second line has a series of plus and minus characters. Below is a sample input:

	```
	Kane, Erica
	--+-+
	Chandler, Adam
	++-+
	Martin, Jake
	+++++++
	Dillon, Amanda
	++-++-+-
	```

	The number of plus/minus characters will vary, but you may assume that at least one such character appears and that no other characters appear on the second line of each pair.

	For each student you should produce a line of output with the student's name followed by a colon followed by the percent of plus characters. For example, if the input above is stored in a Scanner called input and we make the following call:

	```java
	processScores(input);
	```

	The following output should be produced:

	```
	Kane, Erica: 40.0% plus
	Chandler, Adam: 75.0% plus
	Martin, Jake: 100.0% plus
	Dillon, Amanda: 62.5% plus
	```
	You must exactly reproduce this format.

2. Write a static method named matchIndex that accepts as its parameter a Scanner for an input file. Your method should compare each neighboring pair of lines (the first and second lines, then the third and fourth lines, and so on) looking for places where the character at a given 0-based index from the two lines is the same. For example, in the strings "hello" and "belt", the characters at indexes 1 ('e') and 2 ('l') match. Your code should be case-sensitive; for example, "J" does not match "j".

	For each pair of lines, your method should print output showing the character indexes that match, separated by spaces in the format shown below. If no characters match, print "none" instead as shown below.

	For example, suppose the input file contains the following text. (Line numbers and character indexes are shown around the input and matching characters are shown in bold, but these markings do not appear in the actual file.)

	```
	     0123456789012345678901234567890123456789
	   +------------------------------------------+
	 1 | The quick brown fox                      |
	 2 | Those achy down socks                    |
	 3 | Wheels on the school bus go round        |
	 4 | The wipers go swish swish swish          |
	 5 | His name is Robert Paulson               |
	 6 | So long 'n thanks for all the fish       |
	 7 | Humpty Dumpty sat on a wall              |
	 8 | And then he also had a great fall        |
	 9 | booyakasha                               |
	10 | Bruno Ali G Borat                        |
	   +------------------------------------------+
	```

	When passed the above file, your method would produce the following output:

	```
	lines 1 and 2: 0 1 7 12 13 14 15 17
	lines 3 and 4: 1 2 13 14 23
	lines 5 and 6: none
	lines 7 and 8: 4 14 20 21 22
	lines 9 and 10: none
	```

	Notice that lines are not generally the same length. You may assume that the file contains an even number of lines.

3. Write a static method named mostUnique that accepts as its parameter a Scanner for an input file. The data in the Scanner represents integer quiz scores separated by spaces. Each class period is on its own line and contains a different number of students. Your method should return the highest number of unique scores given in a single class period. The method should also print the number of unique scores given in each period.

	On a given line, repeated scores are always next to each other.

	For example, given a Scanner named input referring to an input file that contains the following text:

	```
	10 10 10 9 9 8 3
	3 3 8 10 9 7 7 6 6
	4 1 9 9 10 7 7 
	10 10 10 10
	```

	The call on mostUnique(input) should return 6 and generate the following output:

	```
	Period 1: 4 unique scores
	Period 2: 6 unique scores
	Period 3: 5 unique scores
	Period 4: 1 unique scores
	```

	On the first line, there are 4 unique scores: 10, 9, 8 and 3. The second line contains 6 unique scores: 3, 8, 10, 9, 7 and 6. The third line contains 5 unique scores: 4, 1, 9, 10 and 7. The fourth line only has one unique score: 10. The value returned is 6 because it is the highest number of unique scores given in a class period.

	Assume that the file exists, that it contains at least one line of data and that each line contains at least one score. 
