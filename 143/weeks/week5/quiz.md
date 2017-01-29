_CSE 143_
# Quiz
## Week 5

1. Recursive Tracing

	```java
	public static String mystery (String s, char c) {
		if (s.length() == 0) {
			return s;		
		} else if (s.charAt(s.length() - 1) == c) {
			return c + mystery(s.substring(0, s.length() - 1), c);
			
		} else {
			int len =  s.length() - 1;
			return mystery(s.substring(0, len), c) + s.charAt(len);
		}
	}
	```

	| Call | Output |
	| :--- | :--- |
	| `mystery(“sce”, “c”);` | | 
	| `mystery(“static”, “t”);` | |  
	| `mystery(“banana”, “a”);` | |  
	| `mystery(“java”, “j”);` | |  
	| `mystery(“ALL”, “L”);` | | 

1. Write what the method returns, given the specified inputs. If the method will enter an infinite recursion, say "infinite recursion".

	```java
	public static String mystery(int x, int y) {
	    if(x == y)
	        return "!";
	    if(x == y+1)
	        return "**";
	    return mystery(x+1,y) + mystery(x+2,y);
	}
	```
	| Call | Output |
	| :--- | :--- |
	| `mystery(6,5);` | |
	| `mystery(-5,-4)` | |
	| `mystery(3,1)` | |
	| `mystery(4,6)` | |
	| `mystery(3,6)` | |