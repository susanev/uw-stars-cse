# Lecture Notes
## Week 6

### Midterm Review Problems

1. Write a static method called `seven` that takes a `Random` object as a parameter and that uses the random object to generate up to 10 numbers between 1 and 30 inclusive, printing them and stopping if the "lucky numver" 7 comes up and returning whether or not that happened.

    ```java
    public static boolean seven(Random r) {
        for (int i = 0; i < 10; i++) {
            int next = r.nextInt(30) + 1;
            System.out.println(next);
            
            if (next == 7) {
                System.out.println("You got a lucky number 7!");
                return true;
            }
        }
        return false;
    }
    ```
    
### Random Numbers
* When deciding on the formula to use with nextInt, first ask yourself how many nummbers do I need, then add the offset to that
 * e.g., random numbers between 1 and 30, so that is 30 numbers, offset by 1, so our forumla is r.nextInt(<num of numbers>) + offset, or in code `r.nextInt(30) + 1`
