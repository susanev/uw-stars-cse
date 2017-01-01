_CSE 143_
# Quiz Answers
## Week 1

1. Recursive Tracing. Consider the following method:

	| Method Call | Output Produced |
	| :--- | :--- |
	| `mystery(1);` | 1 |
	| `mystery(3);` | 3, 10, 5, 16, 8, 4, 2, 1 |
	| `mystery(4);` | 4, 2, 1 |
	| `mystery(5);` | 5, 16, 8, 4, 2, 1 |
	| `mystery(20);` | 20, 10, 5, 16, 8, 4, 2, 1 |

2. Details of inheritance. Assuming that the following classes have been defined:

	| Statement | Output |
	| :--- | :--- |
	| `var1.method1();` | Water 1 |
	| `var2.method1();` | Earth 1/Fire 1|
	| ` var3.method1();` | Fire 1 |
	| `var4.method1();` | compiler error|
	| `var5.method1();` | Water 1 |
	| `var6.method1();` | Fire 1 |
	| `var1.method2();` | Fire 2/Water 1|
	| `var2.method2();` | Fire 2/Earth 1/Fire 1|
	| `var3.method2();` | Fire 2/Fire 1|
	| `var4.method2();` | compiler error |
	| `var5.method2();` | Fire 2/Water 1|
	| `var6.method2();` | Fire 2/Fire 1|
	| `((Water)var4).method2();` | runtime error |
	| `((Fire)var4).method2();` | Fire 2/Earth 1/Fire 1 |
	| `((Air)var6).method3();` | Air 3 |
	| `((Earth)var1).method3();` | compiler error |
	| `((Water)var1).method3();` | Water 3|
	| `((Water)var2).method3();` | runtime error |
	| `((Earth)var1).method2();` | Fire 2/Water 1|
	| `((Water)var6).method3();` | runtime error |