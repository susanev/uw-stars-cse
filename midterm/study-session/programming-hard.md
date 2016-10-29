# Programming (Hard)
## Midterm Study Session

1. Programming. Write a static method called sameDashes that takes two strings as parameters and that returns whether or not they have dashes in the same places (returning true if they do and returning false otherwise).  For example, below are four pairs of strings of equal length that have the same pattern of dashes.  Notice that the last pair has no dashes at all.

   ```
   string1:    "hi--there-you."    "-15-389"    "criminal-plan"    "abc"
   string2:    "12--(134)-7539"    "-xy-zzy"    "(206)555-1384"    "9.8"
   ```

   To be considered a match, the strings must have exactly the same number of dashes in exactly the same positions.  The strings might be of different length.  For example, the following calls should each return true because the strings each have two dashes and they are in the same positions.

   ```java
   sameDashes("1st-has-more characters", "2nd-has-less")
   sameDashes("1st-has-less", "2nd-has-more characters")
   ```

    But the following calls should each return false because the longer string has a third dash where the shorter string does not:
   
   ```java
   sameDashes("1st-has-more-characters", "2nd-has-less")
   sameDashes("1st-has-less", "2nd-has-more-characters")
   ```

   In solving this problem you may use only methods listed on the cheat sheet.

2. Programming. Write a static method called printStripped that takes a string as a parameter and that prints a complete line of output with any comments stripped from the string.  Comments are defined to be characters enclosed in the characters "<" and ">".  More precisely, text is "normal" until you encounter a "<" character.  From that point on the text is considered a comment until you encounter a ">" character, at which point you return to normal text.  This definition allows for "<" inside a comment and ">" outside a comment.  You may assume that there are no unclosed comments in the string.

   For example, the following sequence of calls:

   ```java
   printStripped("this is plain text");
   printStripped("this has a normal comment <right here> to be removed");
   printStripped("this has multiple less-than in a comment <<<<<see?>");
   printStripped("this > has <comment>greater-than outside a comment >>");
   printStripped("<hi>this has <foo> multiple <bar> comments<baz><>.");
   ```

   should produce the following output:

   ```
   this is plain text
   this has a normal comment  to be removed
   this has multiple less-than in a comment 
   this > has greater-than outside a comment >>
   this has  multiple  comments.
   ```

3. Programming. Write a static method named randomRects that calculates and displays the area of randomly-generated rectangles. The width and height of each rectangle should be a randomly generated integer between 1 and 10 inclusive. Your method should keep generating random rectangles until an increasing sequence of four areas is printed. In other words, if the last four rectangles generated have areas of a1, a2, a3 and a4 such that a1 < a2 < a3 < a4, the method should print the final message and stop. So your method will generate at least 4 total rectangles but possibly many more, stopping only when it sees 4 in a row with areas in increasing order.

   The following calls demonstrate your method's behavior. Your method should match this output format exactly:

   __Call__
   
   ```java
   randomRects(); 
   ```
   
   __Output__
   
   ```
   Output w: 5, h: 6, area: 30
   w: 10, h: 5, area: 50
   w: 2, h: 8, area: 16
   w: 4, h: 4, area: 16
   w: 2, h: 9, area: 18
   w: 8, h: 3, area: 24
   w: 7, h: 2, area: 14
   w: 3, h: 10, area: 30
   w: 7, h: 9, area: 63
   w: 9, h: 8, area: 72
   Four rectangles of increasing area.
   ```

   __Call__
   ```java
   randomRects(); 
   ```
   
   ```
   w: 5, h: 2, area: 10
   w: 6, h: 5, area: 30
   w: 7, h: 6, area: 42
   w: 8, h: 10, area: 80
   Four rectangles of increasing area.
   ```

4. Programming. Write a static method named countEvenDigits that accepts an integer as its parameter and returns the number of even-valued digits in that number. An even-valued digit is either 0, 2, 4, 6, or 8. For example, the number 8546587 has four even digits (the two 8s, the 4, and the 6),   so the call countEvenDigits(8346387) should return 4. You may assume that the value passed to your method is non-negative. 
 
5. Programming. Write a static method named favoriteLetter that accepts two parameters: a Scanner for the console, and a favorite letter represented as a one-letter String. The method repeatedly prompts the user until two consecutive words are entered that start with that letter. The method then prints a message showing the last word typed.

   You may assume that the user will type a single-word response to each prompt. Your code should be case-sensitive; for example, if the favorite letter is a, you should not stop prompting if the user types words that start with an A. For example, the following logs represent the output from two calls to your method: 
   
   ```java
   Call Scanner console = new Scanner(System.in);
   favoriteLetter(console, "y");
   Scanner console = new Scanner(System.in);
   favoriteLetter(console, "A");
   Output Looking for two "y" words in a row.
   Type a word: hi
   Type a word: bye
   Type a word: yes
   Type a word: what?
   Type a word: yellow
   Type a word: yippee
   "y" is for "yippee"
   Looking for two "A" words in a row.
   Type a word: I
   Type a word: love
   Type a word: CSE142!
   Type a word: AND
   Type a word: PROGRAMS
   Type a word: are
   Type a word: always
   Type a word: Absolutely
   Type a word: Awesome
   "A" is for "Awesome" 
   ```

6. Programming. Write a static method called digitRange that takes an integer n as a parameter and that returns the greatest difference between two digits of n. In particular, the method should report the largest difference (x - y) where x and y are digits of n. For example, the call digitRange(68437) should return 5 because the largest difference that can be formed using digits from the number is (8 - 3). You may assume that the number passed to the method is greater than or equal to 0. If the method is passed a 1-digit number, it should return 0. Below are more examples of calls and the values that should be returned.

  | __Method Call__ | __Value Returned__ |
  | :--- | :--- |
  | `digitRange(0)` | `0` |        
  | `digitRange(5)` | `0` |  
  | `digitRange(26)` | `4` |   
  | `digitRange(42)` | `2` |   
  | `digitRange(725)` | `5` |   
  | `digitRange(888)` | `0` |   
  | `digitRange(1234)` | `3` |  
  | `digitRange(24680)` | `8` |   
  | `digitRange(857492)` | `7` |   
  | `digitRange(3876254)` | `6` |   

  You are not allowed to use a String to solve this problem.
