# Programming
# Midterm Study Session

1. Programming. Write a static method called balanceCheckbook that takes a console Scanner as a parameter and that prompts a user for information about transactions for a bank account, reporting the new balance after each transaction and the minimum balance at the end and returning whether or not the account was ever overdrawn (true if it was, false if it was not). The user is prompted for an initial balance, the number of transactions to process, and the individual transaction amounts. Deposits to the account are entered as positive numbers and checks and ATM withdrawals are entered as negative numbers. A new balance is reported after each transaction.  For example, the method would be called as follows:

  ```java
  Scanner console = new Scanner(System.in);
  balanceCheckbook(console);
  ```

  Below are two sample logs of execution that might be produced:

  ```java
  initial balance? 48.50                  initial balance? 39.75
  how many transactions? 4                how many transactions? 5
  1/4 amount? -20.00                      1/5 amount? -18.50
  new balance = $28.5                     new balance = $21.25
  2/4 amount? -5.75                       2/5 amount? -7.20
  new balance = $22.75                    new balance = $14.05
  3/4 amount? 138.20                      3/5 amount? -23.10
  new balance = $160.95                   new balance = $-9.05
  4/4 amount? -20.00                      4/5 amount? 50.00
  new balance = $140.95                   new balance = $40.95
  minimum balance = $22.75                5/5 amount? -8.45
                                          new balance = $32.5
                                          minimum balance = $-9.05
  ```
  
  In the log to the left, the user enters 4 different transactions and the minimum balance is not negative, so the method would return false to indicate that the account was never overdrawn. In the log to the right, the user enters 5 transactions and the minimum balance is negative, so the method would return true to indicate that the account was overdrawn. You are to exactly reproduce the format of these logs. You may assume that the number of transactions entered by the user is at least 1.

2. Programming. Write a static method called printTwoDigit that takes a Random object and an integer n as parameters and that prints a series of n randomly generated two-digit numbers. The method should use the Random object to select numbers in the range of 10 to 99 inclusive where each number is equally likely to be chosen. The method should indicate whether the number 42 was selected. For example, given the following code:
  
  ```java
  Random r = new Random();
  printTwoDigit(r, 3);
  ```
   
  You would expect output like the following:

  ```java
  next = 52
  next = 10
  next = 86
  no 42
  ```

  As the final line of output above indicates, that particular sequence did not include the number 42.

  Suppose that we then call the method as follows:

  ```java
  printTwoDigit(r, 5);
  ```

  We might get output like the following where 42 is included in the sequence:

  ```java
  next = 83
  next = 42
  next = 22
  next = 36
  next = 73
  We saw a 42
  ```

  You may assume the integer value passed to your method is greater than or equal to 0.  You are to exactly reproduce the format of these logs.

3. Programming. Write a static method called digitRange that takes an integer n as a parameter and that returns the greatest difference between two digits of n. In particular, the method should report the largest difference (x - y) where x and y are digits of n. For example, the call digitRange(68437) should return 5 because the largest difference that can be formed using digits from the number is (8 - 3). You may assume that the number passed to the method is greater than or equal to 0. If the method is passed a 1-digit number, it should return 0. Below are more examples of calls and the values that should be returned.

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

7. Programming
Write a static method named anglePairs that accepts three angles (integers), measured in degrees, as parameters
and returns whether or not there exists both complementary and supplementary angles amongst the three angles
passed. Two angles are complementary if their sum is exactly 90 degrees; two angles are supplementary if their sum
is exactly 180 degrees. Therefore, the method should return true if any two of the three angles add up to 90 degrees
and also any two of the three angles add up to 180 degrees; otherwise the method should return false. You may
assume that each angle passed is non-negative.
Here are some example calls to the method and their resulting return values.
Call Value Returned
anglePairs(0, 90, 180)
anglePairs(45, 135, 45)
anglePairs(177, 87, 3)
anglePairs(120, 60, 30)
anglePairs(35, 60, 30)
anglePairs(120, 60, 45)
anglePairs(45, 90, 45)
anglePairs(180, 45, 45)
true
true
true
true
false
false
false
false

6. Programming
Write a static method named graduation that takes a student's GPA, total credit count, and honors credit count as
parameters, and returns a String representing that student's graduation status. The total credit count already includes
the honors credits. The graduation status to return is determined by the following rules:
• Students must have completed at least 180 credits with a GPA of at least 2.0 to graduate. A student who does not
meet both of these constraints should receive a return value of "not graduating".
• Students who do have enough credits to graduate and sufficiently high GPAs will receive one of four return
values depending on the GPA and number of honors credits:
o All students with GPAs between 2.0 and 3.6 receive a return value of "graduating".
o Students with fewer than 15 honors credits receive a return of "cum laude" if their GPA is at least 3.6 but
less than 3.8, and a return of "magna cum laude" if their GPA is at least 3.8.
o Students with 15 or more honors credits receive a return of "magna cum laude" if their GPA is at least
3.6 but less than 3.8, and a return of "summa cum laude" if their GPA is at least 3.8.
 Here are some example calls to the method and their resulting return values:
Call Value Returned
graduation(3.87, 178, 16)
graduation(1.5, 199, 30)
graduation(2.7, 380, 50)
graduation(3.6, 180, 14)
graduation(3.62, 200, 20)
graduation(3.93, 185, 0)
graduation(3.85, 190, 15)
"not graduating"
"not graduating"
"graduating"
"cum laude"
"magna cum laude"
"magna cum laude"
"summa cum laude"
 You may assume that the GPA will be between 0.0 and 4.0 and that both credit counts will be non-negative integers. 
 
 7. Programming
Write a static method named cheerleader that accepts two integer parameters lines and cheers and prints a series of
"cheer" lines at increasing levels of indentation. The first parameter represents the number of lines of output to print,
and the second represents the number of "cheers" per line. For example, the call of cheerleader(2, 4) means that
you should print 2 lines of output, each containing 4 "cheers." A "cheer" is an occurrence of the word "Go" in the
output. Neighboring cheers are separated by the word "Team", so 1 cheer is printed as "Go", 2 cheers as "Go Team
Go", 3 cheers are printed as "Go Team Go Team Go", and so on.
The lines you print should be displayed at increasing levels of indentation. The first line displayed should have no
indentation, but each following line should be intended by 3 spaces more than the one before it. In other words, the
2
nd line of output should be indented by 3 spaces, the 3rd line by 6 spaces, and so on.
 You may assume that both parameters passed your method will have values of at least 1.
The following calls demonstrate your method's behavior. Your method should match this output format exactly:
Call cheerleader(2, 1); cheerleader(4, 3); cheerleader(2, 4);
Output Go
 Go
Go Team Go Team Go
 Go Team Go Team Go
 Go Team Go Team Go
 Go Team Go Team Go
Go Team Go Team Go Team Go
 Go Team Go Team Go Team Go 

Programming (15 points)
Write a static method named enoughTimeForLunch that accepts four integers hour1, minute1, hour2, and minute2
as parameters. Each pair of parameters represents a time on the 24-hour clock (for example, 1:36 PM would be
represented as 13 and 36). The method should return true if the gap between the two times is long enough to eat
lunch: that is, if the second time is at least 45 minutes after the first time. Otherwise the method should return false.
 You may assume that all parameter values are valid: the hours are both between 0 and 23, and the minute parameters
are between 0 and 59. You may also assume that both times represent times in the same day, e.g. the first time won't
represent a time today while the second time represents a time tomorrow. Note that the second time might be earlier
than the first time; in such a case, your method should return false.
Here are some example calls to your method and their expected return results:
Call Value Returned
enoughTimeForLunch(11, 00, 11, 59)
enoughTimeForLunch(12, 30, 13, 00)
enoughTimeForLunch(12, 30, 13, 15)
enoughTimeForLunch(14, 20, 17, 02)
enoughTimeForLunch(12, 30, 9, 30)
enoughTimeForLunch(12, 00, 11, 55)
true
false
true
true
false
false 

Programming (15 points)
Write a static method named printGrid that accepts two integer parameters rows and cols. The output is a commaseparated
grid of numbers where the first parameter (rows) represents the number of rows of the grid and the second
parameter (cols) represents the number of columns. The numbers count up from 1 to (rows x cols). The output are
displayed in column-major order, meaning that the numbers shown increase sequentially down each column and wrap
to the top of the next column to the right once the bottom of the current column is reached.
Assume that rows and cols are greater than 0. Here are some example calls to your method and their expected results:
Call printGrid(3, 6); printGrid(5, 3); printGrid(4, 1); printGrid(1, 3);
Output 1, 4, 7, 10, 13, 16
2, 5, 8, 11, 14, 17
3, 6, 9, 12, 15, 18
1, 6, 11
2, 7, 12
3, 8, 13
4, 9, 14
5, 10, 15
1
2
3
4
1, 2, 3 
