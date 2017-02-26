_CSE 143_
# Lecture Notes
## Week 5

### Recursion
* Defining an operation in terms of itself
* When solving a problem using recursion you break the problem down into smaller versions of itself
* Recursive programming is when you write a method that calls itself
* Solve a large task by breaking it up into a series of smaller tasks that are all the same
* The opposite of recursion is iteration (i.e., loops)

#### Recursive data structures
* A data structure made up of smaller versions of the same data structure (e.g., LinkedList)

#### Solving problems with recursion
* When writing a recursive method, pretend you already wrote the method correctly and use it whenever possible
* If you need to keep track of something then it should be a parameter
* Suggested programming process
	1. Ask yourself, "what is the smallest piece of the problem I can solve?"
	2. Code the answer to this question (the base case)
	3. Use a recursive call to solve whatever is left
* Note: Recursion is a new way of thinking, and you will need to __practice a lot__ in order to get good (and fast) at it

#### Examples
1. Produce a line of output with `n` stars

	#### Iteration

	```java
	public void writeStars(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("*");
		System.out.println();
	}
	```

	#### Recursion

	```java
	public void writeStars2(int n) {
		if (n == 0)
			System.out.println();
		else {
			System.out.print("*");
			writeStars2(n - 1);
		}
	}
	```

1. Recursively reverse the lines of text in a file

	```java
	// post: reads a file, writing the lines to System.out in reverse order
	public void reverse(Scanner input) {
		if (input.hasNextLine()) {
			String line = input.nextLine();
			reverse(input);
			System.out.println(line);
		}
	}
	```

1. `stutter`:  A recursive method that takes an integer value like 348 and returns the integer 334488 (the value you get by replacing each digit with two of that digit)

	```java
	// returns the integer obtained by replacing every digit of n with two of
	// that digit.  For example, stutter(348) returns 334488.
	public static int stutter(int n) {
		if (n < 0)
			return -stutter(-n);
		else if (n < 10)
			return n * 11;
		else
			return 100 * stutter(n / 10) + stutter(n % 10);
	}
	```

1. `writeBinary`: A recursive method that takes an int in base-10 (decimal) notation and converts it to base-2 (binary) notation

	```java
	public void writeBinary(int n) {
		if (n < 0) {
			System.out.print("-");
			writeBinary(-n);
		} else if (n < 2)
			System.out.print(n);
		else {
			writeBinary(n / 2);
			System.out.print(n % 2);
		}
	}
	```

1. `sum`: A recursive method that returns the sum of the integers stored in an array

	In this problem, we need extra parameters so we create a private helper method that will do the recursion. This technique is called a __public private pair__ usually abbreviated as __public/private__

	```java
	// returns the sum of the numbers in the given array
	public int sum(int[] list) {
		return sum(list, 0);
	}

	// computes the sum of the list starting at the given index
	private int sum(int[] list, int index) {
		if (index == list.length) {
			return 0;
		}
		else {
			return list[index] + sum(list, index + 1);
		}
	}
	```

1. Using a recursive solution prompt the user for the name of a file or directory and to print out that name along with any files that are underneath it. In particular, if it's a directory, we want to include everything inside the directory.

	```java
	// This program prompts the user for a file or directory name and shows
	// a listing of all files and directories that can be reached from it
	// (including subdirectories).

	import java.io.*;
	import java.util.*;

	public class DirectoryCrawler {
		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			System.out.print("directory or file name? ");
			String name = console.nextLine();
			File f = new File(name);
			if (!f.exists()) {
				System.out.println("That file or directory does not exist");
			} else {
				print(f, 0);
			}
		}

		// pre : f.exists()
		// post: prints a directory listing for the given file using the given
		// 		level of indentation. Prints just the file name for a file.
		// 		For a directory, prints the name and a complete listing of all
		// 		files/directories under this directory, using indentation to
		// 		indicate the level. 
		public static void print(File f, int level) {
			for (int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(f.getName());
			if (f.isDirectory()) {
				for (File subF : f.listFiles()) {
					print(subF, level + 1);
				}
			}
		}
	}
	```

### Regular Expressions
* Used to describe text patterns
* [Splitter.java](code/Splitter.java) contains the code used in class
* Can be used with a Scanner object (e.g., `input.useDelimiter("[^a-zA-Z']+");`)

| Regular Expression | Description |
| :--- | :--- |
| `m`	| Matches a single character, `m` |
| `\t`	| Matches a single tab character |
| `mn` | Matches two characters, `mn` |
| `[mn]` | Matches either `m` or `n` |
| `m+` | Matches 1 or more `m` characters |
| `[ \t]+` | Matches 1 or more spaces or tabs |
| `m*` | Matches 0 or more `m` characters |
| `[a-z]` | Matches any 1 character in the range a – z |
| `[A-Z]` | Matches any 1 character in the range A – Z |
| `^[a-z]` | Matches any 1 character not in the range a – z |
| `^[a-zA-Z']+` | Matches 1 or more characters that are not in the range a – z or A – Z or an apostrophe |

### Backus-Naur Form (BNF) Grammars
* Describes the rules for a particular nonterminal symbol
* The nonterminal appears first followed by the symbol `::=` which is usually read as _is composed of_
* On the right-hand side of the `::=` we have a series of rules separated by the vertical bar character which we read as _or_
* The idea is that the nonterminal symbol can be replaced by any of the sequences of symbols appearing between vertical bar characters

#### English Grammars
* Sentence
	`<s>::= <np> <vp>`
	
	We would read this as, "A sentence (<s>) is composed of a noun phrase (<np>) followed by a verb phrase (<vp>)." The symbols <s>, <np> and <vp> are known as "nonterminals" in the grammar

* Nouns
	`<n>::= goat | donkey | elephant | country | lecture | president`

* Proper nouns
	`<pn>::= Stuart | Seattle | Java | Reges | Bart Simpson | Texas | Washington | Oracle`

* Articles
	`<article>::= the | a | an | some`

* Adjectives
	`<adj>::= slow | pretty | disgusting | purple | ugly | lovable | capricious`

* Adjective Phrase
	`<adjp>::= <adj> | <adj> <adjp>`

* Adverbs
	`<adv>::= slowly | suddenly | quickly | really | eventually | quietly | softly`

* Noun phrase
	`<np>::= <pn> | <article> <n> | <article> <adjp> <n>`

* Transitive verb
	`<tv>::= bombed | hacked | deported | banged | became | used`

* Intransitive veb
	`<iv>::= lost | cried | exploded | died | laughed | jumped`

* Verb phrase
	`<vp>::= <tv> <np> | <iv> | <adv><vp>`

	Values on the right-hand side are examples of _terminals_ 