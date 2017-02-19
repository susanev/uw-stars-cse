_CSE 143_
# Lecture Notes
## Week 9

### 20 Questions Homework Assignment
* The idea is to construct a binary tree that has information about a number of different kinds of things
	* We use yes/no questions to distinguish between them
* Initially it constructs a tree with just one leaf node containing "computer":

	```
	            +---+      +------------+
	overallRoot | +-+-->   | "computer" |
	            +---+      +------------+
	```

* Leaf nodes contain the names of objects and branch nodes contain questions
	* Whenever we get to a leaf node, we have no choice left but to guess that particular thing
	* So if we use the tree above, we'd always start by asking whether the object happens to be computer
	* If the user says yes, then we've correctly guessed the object and we give the message: _Great, I got it right!_
	* When we exit the program, the current tree is written to a file called question.txt
	* With this tree composed of one leaf node, the file looks like this:

		```
		A:
		computer
		```

* When the user thinks of something other than a computer as their object we expand our tree to incorporate the new kind of object as well
* To incorporate something new into our tree, we need to replace the leaf node with a branch node that has a question and we want that node to have two leaves: our old object ("computer") and this new object
	* We start by asking the user what their object is, in this case "table", then we ask the user for a question that distinguishes between their object and our object, in this case "Does it use electricity?"
	* The plan is to replace our old leaf node with a branch node containing this question and with the old and new objects as leaves
	* But we don't know which one to put to the left and which one to put to the right
	* To figure that out, we have to ask the user what the answer is for their object
		* We said that the answer for "table" is no.
* We'll follow the convention that yes answers go to the left and no answers go to the right
	
	```
	            +---+    +---------------------------+
	overallRoot | +-+--> | "Does it use electricity? |
	            +---+    +---------------------------+
	                                 /   \
	                                /     \
	                   +------------+     +---------+
	                   | "computer" |     | "table" |
	                   +------------+     +---------+
	```

	When we exited the program, it wrote this information to question.txt

	```
	Q:
	Does it use electricity?
	A:
	computer
	A:
	table
	```

	* The information is stored using a preorder traversal of the tree
	* When I ran the program again, I told it to read back in this file. I asked people to think of another object and someone said "cat." So the program began by asking if our object uses electricity. I said no. So then it reached the leaf node with "table" in it. Whenever the program reaches a leaf node, it has no choice but to make that guess. So it asked us whether our object is table and we said no. So it asked for a question to distinguish the two. Someone said, "Is it an animal?". Then it asked what the answer is for "cat" and we said yes. So now the tree becomes:

	```
	            +---+    +----------------------------+
	overallRoot | +-+--> | "Does it use electricity?" |
	            +---+    +----------------------------+
	                                 /   \
	                                /     \
	                   +------------+     +--------------------+
	                   | "computer" |     | "Is it an animal?" |
	                   +------------+     +--------------------+
	                                              /   \
	                                             /     \
	                                     +-------+     +---------+
	                                     | "cat" |     | "table" |
	                                     +-------+     +---------+
	```

	* This process continues as long as the user wants to keep guessing
	* When the program finishes executing, you write out the contents to question.txt using a preorder traversal
	* That way, if the user wants to, they can start the next time with this as the initial tree
	* That would allow you to grow this tree bigger and bigger each time the game is played.
	* We saw that after adding this second object, the program wrote the following to question.txt

		```
		Q:
		Does it use electricity?
		A:
		computer
		Q:
		Is it an animal?
		A:
		cat
		A:
		table
		```

	* The zip file for the assignment includes a file called bigquestion.txt that has almost 10 thousand entries for animals. You have to rename the file to question.txt, but then your program should be able to read it in and play the game.

### Angle Comparable Class
* Code
	* [Angle](Angle.java)
	* [AngleTest](AngleTest.java)
* Class that could be used to keep track of the angles that are used to specify latitudes and longitudes
	* For example, Seatac Airport is at a latitude of 47 degrees 39 minutes North and a longitude of 122 degrees 30 minutes West
	* We are only going to keep track of degrees and minutes, so we began with a class that has fields for each and a constructor:

		```java
		public class Angle {
			private int degrees;
			private int minutes;

			public Angle(int degrees, int minutes) {
				this.degrees = degrees;
				this.minutes = minutes;
			}
		}
		```
	
	* We started with some client code that constructed an array of Angle objects and that printed it out:

		```java
		import java.util.*;

		public class AngleTest {
			public static void main(String[] args) {
				Angle a1 = new Angle(23, 26);
				Angle a2 = new Angle(15, 48);
				List<Angle> list = new ArrayList<Angle>();
				list.add(a1);
				list.add(a2);
				System.out.println(list);
			}
		}
		```

#### Including a `toString` method
	* When we ran this program, it produced `[Angle@42719c, Angle@30c221]`
	* We need to add a `toString` method to get better output, ideally we would show something like 23 degrees and 26 minutes using the standard symbols used for degrees and minutes: 23d 26m

		```java
		public String toString() {
			return degrees + "d " + minutes + "m";
		}
		```

	* When we ran the client code again, it produced the following output: `[23d 26m, 15d 48m]`

#### Including an `add` method
* We'd like to be able to say in the client code is something like this:

	```java
	Angle a1 = new Angle(23, 26);
	Angle a2 = new Angle(15, 48);
	Angle a3 = a1 + a2;
	```

* We can't write it that way because the "+" operator is used only for numbers and String concatenation, so instead we'll use a method called "add" that we can use to ask one of these angles to add another one to it:

	```java
	Angle a1 = new Angle(23, 26);
	Angle a2 = new Angle(15, 48);
	Angle a3 = a1.add(a2);
	```

	```java
	public Angle add(Angle other) {
		int d = degrees + other.degrees;
		int m = minutes + other.minutes;
		return new Angle(d, m);
	}
	```

* We're referring to other.degrees and other.minutes, which are private fields
* This works because the understanding of the word private is that it is _private to the class_ not private to the _instance of the class_
* In Java, one Angle object can access private elements of another Angle object because they are both of the same class
* A new version of the client, produced the output `[23d 26m, 15d 48m, 38d 74m]`

	```java
	Angle a1 = new Angle(23, 26);
	Angle a2 = new Angle(15, 48);
	Angle a3 = a1.add(a2);
	List<Angle> list = new ArrayList<Angle>();
	list.add(a1);
	list.add(a2);
	list.add(a3);
	System.out.println(list);
	```

* The program has added the two angles to get a third, but the third angle is listed as having 74 minutes, which isn't right
* We want to guarantee that the values for minutes and seconds are always legal
* We can begin by adding a precondition to the constructor and adding code to throw an exception when the precondition was not satisfied

	```java 
	// pre: minutes <= 59 and minutes >= 0 and degrees >= 0
	//      (throws IllegalArgumentException if not true)
	public Angle(int degrees, int minutes) {
		if (minutes < 0 || minutes > 59 || degrees < 0)
			throw new IllegalArgumentException();
		this.degrees = degrees;
		this.minutes = minutes;
	}
	```
* We fix the case where the minutes become larger than 59, with an if statement (note: an alternative solution could use the mod operator)

	```java
	public Angle add(Angle other) {
		int d = degrees + other.degrees;
		int m = minutes + other.minutes;
		if (m >= 60) {
			m -= 60;
			d++;
		}
		return new Angle(d, m);
	}
	```

#### Implementing Comparable
* We need to tell Java how to compare Angle objects to put them into order
* If you want to use utilities like Arrays.sort and Collections.sort, you have to indicate to Java how to compare values to figure out their ordering
* There is an interface in Java known as the Comparable interface that captures this concept
* Not every class implements Comparable, but many of the standard classes we have seen like String and Integer implement the Comparable interface
* Classes that implement the Comparable interface can be used for many built-in operations like sorting and searching
* The interface contains a single method called compareTo.

	```java
	public interface Comparable<T> {
		public int compareTo(T other);
	}
	```

##### `compareTo` return values
* If compareTo returns a negative integer, we interpret it to mean "less"
* If compareTo returns 0, we interpret it to mean "equal"
* If compareTo returns a positive integer, we interpret it to mean "greater"
* We have to include an appropriate compareTo method and we have to modify the class header to `public class Angle implements Comparable<Angle>`
* `compareTo` implementation

	```java
	public int compareTo(Angle other) {
		if (degrees == other.degrees)
			return minutes - other.minutes;
		else
			return degrees - other.degrees;
	}
	```

### SearchTree
* A client program of the class that will work for any class that implements what is known as the Comparable interface
* The new class is a generic class, so it would be better to describe it as SearchTree<E> (for some element type E)
* The client code constructs a SearchTree<String> that puts words into alphabetical order and a SearchTree<Integer> that puts numbers into numerical order
* It's odd that Java has us use the keyword "extends" because we want it to implement the interface, but that's how generics work in Java
* If we are defining a class, we make a distinction between when it extends another class versus when it implements an interface
* But in generic declarations, we have just the word "extends", so we use it for both kinds of extension
* Code
	* [SearchTree](SearchTree.java)
	* [SearchTreeNode](SearchTreeNode.java)
	* [SearchTreeClient](SearchTreeClient.java)

### Huffman Assignment
* We are going to write a program that compresses a text file by creating something known as a _Huffman tree_
* We are exploring a technique known as _compression_ that involves storing a file in a special format that allows it to take up less space on disk
	* Programs like winzip use sophisticated compression algorithms to do this
	* We are going to examine a basic form of this algorithm that can be implemented with binary trees
* The original ASCII character set had a total of 128 characters that could be stored in 7 bits
	* The eighth bit was often used to indicate "parity" (odd or even), although this so-called parity bit often turned out to be more trouble than it was worth
	* Later we found ourselves wanting more than the 128 standard characters and that led to something known as extended ASCII which has 256 characters
	* The nice thing about extended ASCII is that it fits nicely in 8 bits (what is known as a byte). The different integers we can form with one byte range from 00000000 to 11111111 in binary (which is 0 to 255 in base 10)
	* With one byte we can store 256 different sequences
* Most simple text files are stored as a sequence of bytes each representing one character
* To compress such a file, we need to come up with a different encoding scheme
	* The key idea is to abandon the requirement that the number of bits be a fixed number like 8 
	* Instead we allow ourselves to have variable length codes, that way, we can use short codes for characters that occur often and we can have long codes for characters that appear less frequently
* The Huffman algorithm is a particular approach to finding such an encoding
* We construct a binary tree that indicates how each different character is to be encoded
* The particular tree we build will depend on the frequency of each character in the file we are trying to compress

#### Part 1
* In the first part of the assignment, you are responsible for building up a Huffman tree given an array of frequencies and printing out the codes for each character in the tree
* First you construct a leaf node for each character with a non-zero frequency (we don't need codes for the other characters since they don't appear in the file)
	* This gives us a list of leaf nodes with different frequencies
	* We now pick the two with lowest frequency and combine them into a new subtree whose frequency is the sum of the frequencies of the two we are combining
	* Once you make that subtree, you put it back into the list
	* This process is repeated until you get down to one tree
	* Each time we remove two, combine them, and put the new subtree back into the list
	* That means that each time we get one closer to having a single tree.
* Once the process is complete, we have the root of our HuffmanTree
* We assign character codes by thinking of each left branch as a 0 and each right branch as a 1
* The leaves of the tree each contain the information for a single character
* The path from the root to the leaf tells us what code to use for that character.

#### Part 2
* In the second part of the assignment, you have to reconstruct the tree from the code file
* For this second part of the assignment, the frequencies don't matter, the frequencies are only used in constructing the tree
* That's why the instructions say for the second part that you can use frequencies like 0 or -1 when you reconstruct the nodes

#### `BitOutputStream` and `BitInputStream`
* One problem we run into is trying to create compact files of 0's and 1's, if we write them as characters, they will be written in the standard 8-bit format
	* Since the Huffman algorithm gets about a 50% reduction at best, that's not going to work very well because we'd have a multiplier of 0.5 from the compression and a multiplier of 8 because we are storing each bit as an 8-bit character
	* That means we'd turn a file of n characters into a file of 0.5 * 8 * n, or 4n characters
	* In other words, our compression would quadrulple the size of the file, which isn't very impressive
* To solve this problem, I have written two classes called BitOutputStream and BitInputStream that write and read a series of bits in a compact manner
	* The Encode program uses BitOutputStream to produce the encoded binary file
	* The Decode program opens this file as a BitInputStream and passes it to your HuffmanTree to have it do the actual decoding
	* The only method you'll have to worry about is the readBit method of the BitInputStream class
	* The Decode program constructs the BitInputStream and also closes it
		* It passes it to your HuffmanTree in between when it calls a method to decode the file.

#### Byte Limitation
* When we go to use these codes to compress a file, we have to write a series of bits to an output stream in a compact format
* You are provided with the class BitOutputStream that does so, but it has a significant limitation, the number of bits it writes will always be a multiple of 8
	* For example, suppose that you write a total of 8005 bits to one of these output streams, the actual number of bits written will be 8008
	* Your output will be "padded" with three 0's at the end
	* That's because the underlying input/output mechanisms are all based on bytes
	* You can't write part of a byte to a file.
* This limitation of BitOutputStream causes a potential problem for our compression algorithm. 
* Consider that case where we had written 8005 bits to the output stream, when we read it back in, we'll get those 8005 bits plus we'll get 3 extra 0's at the end
* What if the code "0" represents a letter like "e", then those 3 extra 0's will look like 3 e's

##### Byte Limitation Fix
* To get around this problem, we introduce a "fake" character that we refer to as the pseudo-eof character
	* We make up a character that doesn't actually exist and we write it to the output stream after the actual characters
	* That way, when we read the file back in, we'll know when to stop reading, that means that the "multiple of 8" limitation of BitOutputStream won't be a problem for us because we have a special signal to let us know when to stop reading the file
* For our purposes, we'll use an integer value one higher than the highest character code we've been asked to work with
	* In our case, we're dealing with character codes 0 through 255, so we'll use 256 as the code for the pseudo-eof character
	* You shouldn't include the actual value 256 in your code
	* Your code should be flexible enough that we could use a different maximum value
	* You can use the array length to determine this maximum value

###### Byte Limitation for Part 1
* For the first part of the assignment, the only place this enters into things is that you have to manually add this character to the initial set of leaves for the Huffman algorithm
	* You're given the frequencies of each of the real characters from the input file and you will make a leaf node for each character with a nonzero count
	* You should also make a leaf node for the pseudo-eof character and give it a frequency of 1 since it will appear exactly once at the end of the file

###### Byte Limitation for Part 2
* In decoding the file, you'll have to know when to stop processing, that's where the pseudo-eof character comes in
		* The Encode program writes the characters of the original file to the bit stream and then it writes the code for the pseudo-eof character, so as you are processing characters, eventually you will come across this eof character, when you do, you should stop decoding
		* You should not write this character to the PrintStream because it is not an actual character from the original file, it's a fictitious character that we made up to signal the end of the input.
* The operation you perform repeatedly is to go to the top of your tree and to read bits from the input file, going left or right in the tree depending upon whether you see a 0 or 1 in the input stream
* When you hit a leaf, you know that you've found the next character from the original file and you write it to the PrintStream object you've been passed
* Then you go back to the top of the tree and descend again until you hit a leaf and you print that character
* Then go back to the top of the tree and start all over.

#### Running your program
* You begin with some file to compress, we are using text files, although you can also compress other kinds of files
	* So you would typically start with a file with a name like hamlet.txt that someone else created
* When you run the MakeCode program, it prompts for the input file (#1) and it produces as output a file that shows what codes to use for each character in the original file
	* I use the extension ".code" for these files, so if you are compressing hamlet.txt, I'd call the code file hamlet.code
* The Encode program uses the text file (#1) and the code file (#2) to create a compressed file
	* I use the extension ".short" for these files. You can think of them as being like a zip file
	* So if I was compressing hamlet.txt using hamlet.code, I would refer to the output as hamlet.short
* The Decode program takes the compressed file (#3) and the code file (#2) to recreate the original file
	* Think of this as an unzip operation
	* You would want to use a new file name for the file it generates
	* If you were working with hamlet.txt, you might call the new file hamlet2.txt
	* I've been using the extension "new" as a way to recognize these files
	* So I'd create the file hamlet.new in this step.
* The file you create after decoding should exactly match the file that you started with in the beginning

### Abstract Classes
* Note: This topic will not be covered on the Final Exam
* An abstract class sits somewhere in the middle, typically having some methods that are filled in and some methods that are abstract
* You can think of this as a spectrum from concrete to purely abstract, with abstract classes in the middle:

	```
	concrete <---+-----------------------+------------------------+----> abstract
	             |                       |                        |
	      concrete class          abstract class              interface
	```

* Consider the classes defined below
	* See the finished code, in [shape-code](code/shape-code)

	```java
	public class Circle {
		private double radius;

		public Circle(double radius) {
			this.radius = radius;
		}

		public double area() {
			return Math.PI * radius * radius;
		}

		public String toString() {
			return "circle of area " + area();
		}
	}

	public class Rectangle {
		private double length;
		private double width;

		public Rectangle(double length, double  width) {
			this.length = length;
			this.width = width;
		}

		public double area() {
			return length * width;
		}

		public String toString() {
			return "rectangle of area " + area();
		}
	}

	public class Square {
		private double length;

		public Square(double length) {
			this.length = length;
		}

		public double area() {
			return length * length;
		}

		public String toString() {
			return "square of area " + area();
		}
	}
	```

* And a client program that sets up an array of shapes and that attempts to sort them by calling the built-in Arrays.sort method

	```java
	import java.util.*;

	public class ShapeTest {
		public static void main(String[] args) {
			Object[] data = { new Square(12), new Rectangle(15, 3.2), new Circle(8.4),
					new Circle(1.5), new Square(8.7), new Rectangle(7.2, 3.2), new Square(2.4),
					new Circle(3.7), new Circle(7.9) };
			for (Object s : data)
				System.out.println(s);
			System.out.println();
			Arrays.sort(data);
			for (Object s : data)
				System.out.println(s);
		}
	}
	```

* The array stores a combination of Circle, Square and Rectangle objects, which is why we had to declare it to be of type Object[]
* The client code uses a foreach loop to print the shapes before and after the call on Arrays.sort:

	```java
	for (Object s : data)
		System.out.println(s);
	```

* When we executed this program, it properly printed the various shapes but then it reached an execution error when we called Arrays.sort
* The error message reported was ClassCastException for the Square class
* The problem is that we never had our shape classes implement the Comparable interface
* To fix this we had the `Square` class implement `Comparable`, `public class Square implements Comparable<Square>` and wrote a `compareTo` method

	```java
	public int compareTo(Square other) {
		double difference = area() - other.area();
		if (difference < 0)
			return -1;
		else if (difference == 0)
			return 0;
		else // difference > 0
			return 1;
	}
	```

* We tried compiling with this definition and we ran the client program again
* It failed again, but this time it failed on a ClassCastException on Rectangle, that's because we only modified the Square class, not the Rectangle class
* We have defined a compareTo method that allows a Square to compare itself to another Square, but we need one that allows a Square to compare itself to any shape, including a Circle or Rectangle
* To solve this we need a `Shape` interface, `public interface Shape`, so our `Square` class header becomes `public class Square implements Comparable<Shape>` and the `compareTo` header becomes `public int compareTo(Shape other)`
* The interface is shown below, note that we need to include the `area` header to explicitly let Java know that any class that implements it must have this method

	```java
	public interface Shape {
		public double area();
	}
	```
* The current Square class is shown below

	```java
	public class Square implements Shape, Comparable<Shape> {
		private double length;

		public Square(double length) {
			this.length = length;
		}

		public double area() {
			return length * length;
		}

		public String toString() {
			return "square of area " + area();
		}

		public int compareTo(Shape other) {
			double difference = area() - other.area();
			if (difference < 0)
				return -1;
			else if (difference == 0)
				return 0;
			else // difference > 0
				return 1;
		}
	}
	```

* We could have repeated this pattern in each of the other classes, but it seems somewhat redundant to always have to say that a class implements both Shape and Comparable<Shape>, and we don't want to have some Shape classes that fail to implement the Comparable interface
* Java provides us a nice alternative
* We can elevate this restriction to the Shape interface itself

	```java
	public interface Shape extends Comparable<Shape> {
		public double area();
	}
	```

* It may seem odd that use the keyword "extends" rather than the keyword "implements"
* That's because in this case we have an interface extending another interface and in Java you specify that with the keyword "extends" rather than the keyword "implements"
* This allowed us to simplify the Square class header to `public class Square implements Shape`
* We then changed each of the different shape classes to say that they implement this interface as well
* But this still wasn't very satisfying because we have three copies of the compareTo method, one in each of the different shape classes, this kind of redundancy is a bad idea
* The keyword "abstract" is a modifier that can be applied to methods and classes like the keywords "public" and "static", so we just added this extra modifier to the method header:

	```java
	public abstract class Shape implements Comparable<Shape> {
		public abstract double area();

		public int compareTo(Shape other) {
			...
		}
	}
	```

* After this change the class finally compiled. We then had to change the individual shape classes to say that they extend this class rather than implementing an interface called Shape
* Because the Shape class is an abstract class, it can't be directly instantiated, as in, `Shape s = new Shape();  // illegal`, you aren't allowed to create instances of an abstract class
* But that doesn't mean you can't have variables of type Shape, as in `Shape s = new Rectangle(20, 30);  // legal`

#### `final`
* You can include the access modifier "final" to a method or class to prevent it from being overridden through inheritance
* The final version of the shape hierarchy makes both the compareTo and toString methods final, which means that subclasses can't override this shared behavior of shape objects
* This can be useful to prevent malicious or careless errors
	* For example, you wouldn't want to have most of your shape objects comparing themselves in one way while some others are comparing in some other way
	* You also wouldn't want to let a shape subclass modify the toString method because then it could masquerade as something other than what it is.