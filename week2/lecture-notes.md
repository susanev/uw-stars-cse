# Lecture Notes
## Week 2

### Data types
* Three main data types (you will learn more later)

 | __Data type__   | __Description__                                           |
 | :-----------|-------------------------------------------------------------- |
 | int         | integers, pos, zero, neg, up to 2^31-1                        |
 | double      | floating point numbers (real), pos, zero, neg, up to 10^308   |
 | String      | text characters                                               |
 
* Literals
* int literal: number without a decimal, e.g., -7, 0, 103
* double literal: number with a decimal, e.g., -7.0, 0.2, 103.5
* String literal: characters surrounded by quotes, e.g., "hello world"

### Variables
* In Java we need to declare variables with a type and a name before they can be used
* Once a variable is declared you cannot redeclare it (with a type)

### Assignment statements
* `=` is the assignment operator, it has nothing to do with equality
* Assignment statements should be read right-to-left
```
  // 1 is stored in the int variable named x
  int x = 1;
  // 1 is added to the current value of x (in this case 1), resulting in 2, and that is stored back into x
  x = x + 1;  
```
