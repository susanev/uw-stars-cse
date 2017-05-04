_CSE 142_
# Quiz Answers
## Week 6
_It is important to note that these are examples of correct solutions; there are many correct solutions that will not match these solutions exactly._

1. __randomWalk (15 points)__

	```java
	public static void randomWalk(Random r, int goal) {
		int pos = 0;
		int min = 0;
		int max = 0;
		System.out.printf("goal = %d, pos = %d\n", goal, pos);
		while (goal != pos) {
			int value = r.nextInt(5) - 2;
			pos = pos + value; 
			System.out.printf("adding %d, pos = %d\n", value, pos);
			if (pos < min) {
				min = pos;
			} else if (pos > max) {
				max = pos;
			}
		}
		System.out.printf("min = %d, max = %d\n", min, max);
	}
	```

2. __highLow (15 points)__

	```java
	public static boolean highLow(int num) { 
	  int lowHigh;
	  if (num % 10 <= 4) {
	     lowHigh = 1;
	  } else {
	     lowHigh = 0;
	  }      
	  
	  while (num != 0) {
	     int digit = num % 10;
	     if (digit <= 4) {
	        lowHigh--;
	     } else {
	        lowHigh++;
	     }
	     if (lowHigh < 0 || lowHigh > 1) {
	        return false;
	     }
	     num = num / 10;	
	  }
	  return true;
	}
	```

3. __isBalanced (9 points)__

	```java
	public static boolean isBalanced(String parens) {
	  int open = 0;
	  int closed = 0;
	  for (int i = 0; i < parens.length(); i++) {
	     if (parens.charAt(i) == '(') {
	        open++;
	     } else {
	        closed++;
	     }	     
	     if (closed > open) {
	        return false;
	     }
	  }  
	  return open == closed;
	}
	```

