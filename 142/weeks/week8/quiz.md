# Quiz
## Week 8

1. The following program produces 4 lines of output. Write each line of output below as it would appear on the console.

	```java
	import java.util.*;   // for Arrays class
	​
	public class ReferenceMystery2 {
	    public static void main(String[] args) {
	        int x = 1;
	        int[] a = new int[2];
	        mystery(x, a);
	        System.out.println(x + " " + Arrays.toString(a));
	        x--;
	        a[1] = a.length;
	        mystery(x, a);
	        System.out.println(x + " " + Arrays.toString(a));
	    }
	    
	    public static void mystery(int x, int[] list) {
	        list[x]++;
	        x++;
	        System.out.println(x + " " + Arrays.toString(list));
	    }
	}
	```

2. You are to simulate the execution of a method that manipulates an array of integers. Consider the following method:

	```java
	public static void mystery(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
			if (i % 2 == 0) {
			    list[i]++;
			} else {
			    list[i]--;
			}
    }
	}
	```

	In the left-hand column below are specific lists of integers. You are to indicate in the right-hand column what values would be stored in the list after method mystery executes if the integer list in the left-hand column is passed as a parameter to mystery.

	| Original List | Final List |
	| :--- | :--- |

	| `{6, 3}` | |

	| `{{2, 4, 6}` | |

	| `{{1, 2, 3, 4}` | |

	| `{{2, 2, 2, 2, 2}` | |

	| `{{7, 3, 2, 0, 5, 1}` | |

3. Assume the following classes have been defined:

	```java
	public class Mammal extends SeaCreature {
	    public void method1() {
	        System.out.println("warm-blooded");
	    }
	}

	public class SeaCreature {
	    public void method1() {
	        System.out.println("creature 1");
	    }

	    public void method2() {
	        System.out.println("creature 2");
	    }

	    public String toString() {
	        return "ocean-dwelling";
	    }
	}

	public class Whale extends Mammal {
	    public void method1() {
	        System.out.println("spout");
	    }

	    public String toString() {
	        return "BIG!";
	    }
	}

	public class Squid extends SeaCreature {
	    public void method2() {
	        System.out.println("tentacles");
	    }

	    public String toString() {
	        return "squid";
	    }
	}
	```

	Consider the following code fragment:

	```java
	SeaCreature[] elements = { new Squid(), new Whale(), new SeaCreature(), new Mammal() };
	for (int i = 0; i < elements.length; i++) {
	    System.out.println(elements[i]);
	    elements[i].method1();
	    elements[i].method2();
	    System.out.println();
	}
	```

	What output is produced by this code?

4. [Optional]  Write a static method called acronym that takes as a parameter a String containing a phrase and that returns an acronym for the phrase. For example, the following call:

	```java
	acronym("self-contained underwater breathing apparatus")
	```

	should return "SCUBA". The acronym is formed by combining the capitalized first letters of each word in the phrase.  Words in the phrase will be separated by some combination of dashes and spaces. There might be extra spaces or dashes at the beginning or end of the phrase.  The String will not contain any characters other than dashes, spaces, and letters, and is guaranteed to contain at least one word.  Below are several sample calls.

	| Method Call | Value Returned |
	| `acronym("   automatic   teller   machine  ")` | "ATM" |
	| `acronym("personal identification number")` | "PIN" |
	| `acronym("computer science")` | "CS" |
	| `acronym("merry-go-round")` | "MGR" |
	| `acronym("All my Children")` | "AMC" |
	| `acronym("Troubled Assets Relief Program")` | "TARP" |
	| `acronym("--quite-- confusing - punctuation-")` | "QCP" |
	| `acronym("  loner  ")` | "L" |