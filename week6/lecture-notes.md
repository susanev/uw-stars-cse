# Lecture Notes
## Week 6

### Midterm Review Problems

1. Write a static method called `seven` that takes a `Random` object as a parameter and that uses the random object to generate up to 10 numbers between 1 and 30 inclusive, printing them and stopping if the "lucky numver" 7 comes up and returning whether or not that happened.

    ```java
    public static boolean seven(Random r) {
        for (int i = 0; i < 10; i++) {
            int next = r.nextInt(30) + 1;
            System.out.print(next + " ");
            
            if (next == 7) {
                System.out.println("You got a lucky number 7!");
                return true;
            }
        }
        return false;
    }
    ```

2. Write a static method called `digitSum` that takes an integer `n` as a parameter and that returns the sum of the digits of `n`. You may assume `n` is not negative.

    ```java
    public static int digitSum(int n) {
        int sum = 0;  
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    ```

3. Write a static method called `roll7` that simulates the rolling of two dice until their sum is equal to 7. The method should print each roll and its sum and show a count of how many rolls it took to get to 7, as in:
    
    ```
    3 + 5 = 8
    2 + 1 = 3
    1 + 4 = 5
    3 + 4 = 7
    sum of 7 after 4 rolls
    ```
    
    You must exactly reproduce the format of this sample execution.
    
    ```java
    public static void roll7() {
        Random r = new Random();
        int sum = 0;
        int rolls = 0;   
        while (sum != 7) {
            int roll1 = r.nextInt(6) + 1;
            int roll2 = r.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.printf("%d + %d = %d\n", roll1, roll2, sum);
            rolls++;
        }
        System.out.printf("sum of 7 after %d rolls\n", rolls);
    }
    ```

3. Write a static method called `stutter` that takes a String as a parameter and that returns a new String where each letter of the original String has been replaced with two of that letter. For example, `stutter("hello")` should return `hheelllloo`.

    ```java
    public static String stutter(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            output = output + letter + letter;
        }
        return output;
    }
    ```
    
### Fencepost problems
* Spaces at the end are okay, you do not need to solve the fencepost problem for spaces
    
### Random Numbers
* When deciding on the formula to use with nextInt, first ask yourself how many nummbers do I need, then add the offset to that
 * e.g., random numbers between 1 and 30, so that is 30 numbers, offset by 1, so our forumla is r.nextInt(_num of numbers_) + offset, or in code `r.nextInt(30) + 1`
