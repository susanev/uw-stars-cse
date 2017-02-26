_CSE 143_
# Lecture Notes
## Week 7

### Recursive Backtracking
* Backtracking and Recursion are different concepts and ideas, but are often used together and named _recursive backtracking_
* An approach to problem solving that is nicely expressed using recursion
* Often described as a _brute force_ algorithm, it checks all possibilities; many people describe it as a _stupid algorithm_ since it tries all possibilities and does not make educated decisions
* In recursive backtracking you often use loops and recursion together
* The general approach to recursive backtracking is _choose_, _explore_, _unchoose_; the idea being that you choose a path, explore to see if its valid, then unchoose and explore a different path
* In backtracking, we explore specific choices until we reach a dead end, once we find that some path is not going to work out, we back up to where we last made a choice and make a different choice
* Recursive backtracking problems are much easier to write and to understand if you separate off the low-level details of the problem
* One of the issues that comes up with recursive programming is that we are often asked to write a method and we discover that we want to have the recursion work in a different way, we might want more parameters or we might want to have a different return type
  * In this situation it's common to introduce a "helper" method that does the actual recursion

#### Problem 1
* Problem: List all of the 3-digit numbers that are composed of the digits 1, 2, and 3
* This can be solved without recursion, using triply-nested loops

  ```java
  for (int d1 = 1; d1 <= 3; d1++) {
    for (int d2 = 1; d2 <= 3; d2++) {
      for (int d3 = 1; d3 <= 3; d3++) {
        System.out.println("" + d1 + d2 + d3);
      }
    }
  }
  ```

  * We are exploring a set of choices to be made (1st digit, 2nd digit, 3rd digit)
  * The image below shows a decision tree representing the problem

    ![alt text][one-two-three]

#### Problem 2
* Problem: Suppose that you are dealing with the Cartesian plane and you want to think about all possible paths from the origin (0, 0) to a particular point. Suppose, for example, that you want to get to the point (1, 2):

  ```
                  ^
                  |
                  |  * (1, 2)
                  |
  <---------------+--------------->
                  |
                  |
                  |
                  V
  ```

* Suppose that you are limited to just three kind of moves:
  * North: moving up one in the y-direction
  * East: moving up one in the x-direction
  * Northeast: moving up one in both directions
  * There are five solutions to this:

    ```
    N, N, E
    N, E, N
    E, N, N
    NE, N
    N, NE
    ```
* How would you write a program to find all such answers?
  * This is a problem where backtracking works nicely
  * The idea is that there is some solution space of possible answers that you want to explore
  * We try to view the problem as a sequence of choices, which allows us to think of the solution space as a decision tree
  * At the top of the tree we have the first choice with all of the possibilities underneath:

    ```
                               choice #1
                                    |
           +----------------+-------+--------+----------------+ ...
           |                |                |                |
    1st possibility  2nd possibility  3rd possibility  4th possibility
    ```

  * Each choice we might make at the top of the tree leaves us in a different part of the solution space
  * From there, we consider all possible second choices we might make
  * Below is a complete decision tree for two possible moves

    ![alt text][ne2]

* Below is a diagram in which we explore all possible choices trying to move from the origin to the point (1, 2)
  * We stop exploring when we get to an x-coordinate or y-coordinate that is beyond the value we are searching for because that is a dead-end

    ![alt text][ne5]

#### 8 Queens Problem
* It is important to study the 8 queens backtracking solution before you attempt to work on the programming assignment, AnagramSolver
* The challenge is to place eight queens on a chessboard so that no two queens threaten each other
  * Queens can move horizontally, vertically or diagonally, so it is a real challenge to find a way to put 8 different queens on the board so that no two of them are in the same row, column or diagonal
* The simplest way to think of this in terms of a decision tree is to imagine all the places you might put a first queen
  * For 8 queens, there are 64 of them because the chess board is an 8 by 8 board
  * At the top of the tree, there are 64 different choices you could make for placing the first queen
  * Then once you've placed one queen, there are 63 squares left to choose from for the second queen, then 62 squares for the third queen and so on
* The backtracking technique we are going to use involves an exhaustive search of all possibilities
* This can take a long time to execute, because there are lots of possibilities to explore
  * We need to be as smart as we can about the choices we explore
* In the case of 8 queens, we can do better than to consider 64 choices followed by 63 choices followed by 62 choices and so on
  * We know that a whole bunch of these aren't worth exploring
* One approach is to observe that if there is any solution at all to this problem, then the solution will have exactly one queen in each row and exactly one queen in each column
  * That's because you can't have two in the same row or two in the same column and there are 8 of them on an 8 by 8 board
  * So we can search more efficiently if we go row by row or column by column.

##### Methods of the Board class
* `public Board(int size)`
* `public boolean safe(int row, int col)`
* `public void place(int row, int col)`
* `public void remove(int row, int col)`
* `public void print()`
* `public int size()`

##### Recursive Backtracking Code

  ```java
  private static void explore(Board b, int col) {
    if (col > b.size()) {
      b.print();
    } else {
      for (int row = 1; row <= b.size(); row++)
        if (b.safe(row, col)) {
          b.place(row, col);
          explore(b, col + 1);
          b.remove(row, col);
        }
    }
  }
  ```

### AnagramSolver
* The program searches for all ways to form anagrams of a particular phrase
  * For example, if the phrase is "george bush", then some combinations of words that constitute anagrams are [bee, go, shrug] or [bugs, go, here] or [go, he, bus, erg]
  * Each of these word combinations has the same set of letters as "george bush"
* The program uses a dictionary of words to find all combinations that are anagrams of the given phrase
* In solving this problem, one of the questions your program will have to consider is whether a particular word is relevant to the problem you're trying to solve
  * For example, if you were trying to find anagrams of "george bush" and you were wondering whether to consider the word "abash", the answer would be no
    * That word is not relevant to the problem of finding anagrams of "george bush" because there are two a's in "abash" but no a's in "george bush"
  * The word "bee" is relevant as all of the letters of "bee" appear in "george bush"
    * So that means that we need to explore this possibility
    * We do that by taking the letters from "bee" away from the letters for "george bush"
    * That leads to a new set of letters that we could use to continue the process
* You must use recursive backtracking to solve this problem
  * Each level of the decision tree (which means each invocation of the recursive method) involves choosing one word
  * Which choices do we pursue? Only those where we can successfully subtract the word's inventory from the current inventory
  * And whenever we get to an empty inventory in our recursive backtracking, we know we've found a solution that should be printed
* The writeup points out two optimizations that you are required to include
  * Pre-process the dictionary to compute a LetterInventory for each word
  * For each word we end up with a LetterInventory and we want to be able to quickly access the LetterInventory for any particular word, use a map for this
  * Remember that a Map is composed of key/value pairs, associating each key with a specific value
  * Here the keys are the words and the values are the LetterInventory objects
  * Prune the dictionary before you begin the recursive backtracking * Go through the dictionary before you begin the recursion and picking out just the words that are relevant, words that could never be part of a solution

#### Relation to Recursive Backtracking
* The potential solution space is the set of all combinations of words from the dictionary
* We can think of this as a decision tree by thinking in terms of picking a first word, then picking a second word, then picking a third word, and so on

##### Example
* Consider a small dictionary
  
  ```
  bee
  go
  gush
  shrug
  ```

* Sample run with "George Bush", gives these answers:

  ```
  [bee, go, shrug]
  [bee, shrug, go]
  [go, bee, shrug]
  [go, shrug, bee]
  [shrug, bee, go]
  [shrug, go, bee]
  ```

* At the top of our decision tree, the choice we are making is what word should come first and the various possibilities are the dictionary of words we've been given:

  ```
           first word?
                |
    +-------+---+---+-------+
    |       |       |       |
  "bee"   "go"   "gush"  "shrug"
  ```

* We will only follow paths that make sense, but with this short dictionary, we're going to try each of these words as a possible first word
* So we first explore choosing "bee". Once we've chosen "bee" as the first word, at the next level of the tree, we consider all possible choices for a second word:

  ```
                       first word?
                            |
                +-------+---+---+-------+
                |       |       |       |
              "bee"   "go"   "gush"  "shrug"
                |
           second word?
                |
    +-------+---+---+-------+
    |       |       |       |
  "bee"   "go"   "gush"  "shrug"
  ```

* At each level, we go through all the words
* Remember that backtracking involves an exhaustive search, so you try all possibilities that make sense
* At this second level, we wouldn't be dealing with the same set of letters as before
  * At the first level we were looking for words that could be used to form the phrase "george bush"
  * At the second level, we've already accounted for the letters in the first word ("bee"), so now we are searching for something that matches what's left ("gorg ush")

###### Low-level details
* Keeping track of how many of each letter we have
* Subtracting the letters for a word from the letters for the phrase * Figuring out whether that subtraction is going to work
* All of these details are handled by the LetterInventory class that we wrote for assignment #1
  * The inventory objects keep track of how many of each letter you have and the "subtract" method sees whether you can subtract one set of letters from another set of letters
* For the anagram problem, finding an empty LetterInventory is like getting to column 9 in the 8 queens problem
  * It means we've found a solution
  * It means that in our various explorations, we've found a sequence of words that we can successfully subtract from the original to get down to an empty inventory
  * That means we've accounted for every letter of the original with the current combination of words that we're exploring, which means this is a solution that we'd want to report
* But we also encounter dead ends along the way
  * Dead ends aren't a problem in backtrack. We just skip them and move on.



[one-two-three]: https://github.com/susanev/UWStarsCSE/blob/master/143/weeks/week07/images/OneTwoThree.png "OneTwoThree"

[ne2]: https://github.com/susanev/UWStarsCSE/blob/master/143/weeks/week07/images/ne2.png "ne2"

[ne5]: https://github.com/susanev/UWStarsCSE/blob/master/143/weeks/week07/images/ne5.png "ne5"