_CSE 143_
# Practice Midterm 2 Answers

1. Recursive Tracing, 15 points. 

	| Call | Output produced |
	| :--- | :--- |
	| `mystery(10, 28)` | |
	| `mystery(5, 17)` | |
	| `mystery(2, 10)` | |
	| `mystery(4, -15)` | |
	| `mystery(-3, -23)` | |

1. Recursive Programming, 15 points.

	```java

	```

1. Details of inheritance, 20 points.

	| Statement | Output |
	| :--- | :--- |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var5.method2();` | |
	| `var6.method2();` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3();` | |
	| `var4.method3();` | |
	| `((Cup)var1).method1();` | |
	| `((Jar)var2).method1();` | |
	| `((Cup)var3).method1();` | |
	| `((Cup)var4).method1();` | |
	| `((Jar)var4).method2();` | |
	| `((Box)var5).method2();` | |
	| `((Pill)var5).method3();` | |
	| `((Jar)var2).method3();` | |
	| `((Cup)var3).method3();` | |
	| `((Cup)var5).method3();` | |


1. Linked Lists, 15 points. 

	```
		     before                   after                      code
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 p->[1]->[2]           | p->                   |
		               			 |                       |
		               			 |                       |
	 q->[3]                | q->[1]->[2]->[3]      |
		               			 |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	 p->[1]->[2]->[3]      | p->[1]->[3]           |
	                       |                       |
	                       |                       |
	 q->                   | q->[2]                |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |
	 p->[1]->[2]           | p->[1]->[4]           |
	                       |                       |
	                       |                       |
	 q->[3]->[4]           | q->[2]->[3]           |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	                       |                       |
	                       |                       |
	 p->[1]->[2]->[3]      | p->[5]->[1]           |
	                       |                       |
	                       |                       |
	 q->[4]->[5]           | q->[2]->[3]->[4]      |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	                       |                       |
	-----------------------+-----------------------+-------------------------------
	```

1. Array Programming, 10 points. 

	```java

	```

1. Stacks/Queues, 25 points. 

	```java

	```

