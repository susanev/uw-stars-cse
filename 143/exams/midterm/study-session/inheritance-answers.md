_CSE 143_

# Inheritance Answers
## Midterm Study Session

1. Gulp

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method2();` | compiler error |
	| `var2.method2();` | Gulp 2/Gulp 3 |
	| `var3.method2();` | Gulp 2/Sip 3 |
	| `var4.method2();` | Gulp 2/Drink 3 |
	| `var5.method2();` | compiler error |
	| `var6.method2();` | Gulp 2/Drink 3|
	| `var1.method3();` | compiler error |
	| `var2.method3();` | Gulp 3 |
	| `var3.method3();` | Sip 3 |
	| `var4.method3();` | Drink 3 |
	| `var5.method3();` | compiler error |
	| `var6.method3();` | Drink 3 |
	| `((Sip)var6).method1();` | runtime error |
	| `((Gulp)var1).method1();` | compiler error |
	| `((Gulp)var1).method2();` | Gulp 2/Bite 3/Gulp 3 |
	| `((Bite)var1).method3();` | Bite 3/Gulp 3 |
	| `((Bite)var6).method1();` | Bite 1 |
	| `((Drink)var1).method1();` | runtime error |
	| `((Drink)var4).method2();` | Gulp 2/Drink 3 |
	| `((Bite)var3).method1();` | runtime error |

1. Blue 

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method1();` | Blue 1/Blue 2 |
	| `var2.method1();` | Green 1 |
	| `var3.method1();` | compiler error |
	| `var4.method1();` | Green 1 |
	| `var1.method2();` | Blue 2 |
	| `var2.method2();` | Red 2/Blue 2 |
	| `var3.method2();` | compiler error |
	| `var4.method2();` | Red 2/Blue 2 |
	| `var1.method3();` | compiler error |
	| `var2.method3();` | Green 3 |
	| `var3.method3();` | compiler error |
	| `var4.method3();` | compiler error |
	| `((Blue)var3).method1();` | Blue 1/White 2 |
	| `((Red)var3).method2();` | White 2 |
	| `((White)var3).method3();` | White 3 |
	| `((White)var4).method3();` | runtime error |
	| `((Green)var5).method3();` | runtime error |
	| `((Red)var5).method1();` | Blue 1/Red 2/Blue 2 |
	| `((Blue)var6).method3();` | compiler error |
	| `((Green)var6).method3();` | runtime error |

1. Chair

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method2();` | Table 2/Chair 2 |
	| `var2.method2();` | Table 2/Chair 2 |
	| `var3.method2();` | Table 2/Chair 2 |
	| `var4.method2();` | Lamp 2 |
	| `var5.method2();` | Table 2/Chair 2 |
	| `var6.method2();` | complier error |
	| `var1.method1();` | Table 1 |
	| `var2.method1();` | complier error |
	| `var3.method1();` | Couch 1 |
	| `var4.method1();` | complier error |
	| `var1.method3();` | Table 3/Table 1 |
	| `var2.method3();` | complier error |
	| `var3.method3();` | Table 3/Couch 1 |
	| `((Lamp)var4).method1();` | Lamp 1 |
	| `((Lamp)var2).method1();` | runtime error |
	| `((Table)var5).method1();` | Couch 1 |
	| `((Couch)var1).method1();` | runtime error |
	| `((Chair)var6).method2();` | Chair 2 |
	| `((Couch)var5).method3();` | Table 3/Couch 1 |
	| `((Table)var5).method3();` | Table 3/Couch 1 |

1. Gandalf

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method1();` | Frodo 1/Bilbo 1 |
	| `var2.method1();` | Bilbo 1 |
	| `var3.method1();` | Gandalf 1 |
	| `var4.method1();` | compiler error |
	| `var5.method1();` | Frodo 1/Bilbo 1 |
	| `var6.method1();` | compiler error |
	| `var1.method2();` | Gandalf 2/Frodo 1/Bilbo 1 |
	| `var2.method2();` | Gandalf 2/Bilbo 1 |
	| `var3.method2();` | Gandalf 2/Gandalf 1 |
	| `var4.method2();` | compiler error |
	| `var5.method2();` | Gandalf 2/Frodo 1/Bilbo 1 |
	| `var6.method2();` | compiler error |
	| `((Bilbo)var1).method3();` | compiler error |
	| `((Gandalf)var1).method2();` | Gandalf 2/Frodo 1/Bilbo 1 |
	| `((Frodo)var4).method1();` | runtime error |
	| `((Gandalf)var6).method2();` | Gandalf 2/Gandalf 1|
	| `((Gandalf)var4).method1();` | Bilbo 1 |
	| `((Frodo)var6).method3();` | runtime error |
	| `((Frodo)var3).method3();` | runtime error |
	| `((Frodo)var5).method3();` | Frodo 3 |

1. Paper

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method2();` | Pen 2 |	
	| `var2.method2();` | Stapler 2 |
	| `var3.method2();` | Stapler 2 |
	| `var4.method2();` | Paper 2 |
	| `var5.method2();` | compiler error |
	| `var6.method2();` | Clip 2/Paper 2 |
	| `var1.method1();` | compiler error |
	| `var2.method1();` | Stapler 1 |
	| `var3.method1();` | compiler error |
	| `var1.method3();` | Paper 3/Pen 2 |
	| `var2.method3();` | Paper 3/Stapler 2 |
	| `var3.method3();` | Paper 3/Stapler 2 |
	| `var4.method3();` | Paper 3/Paper 2 |
	| `((Pen)var1).method1();` | Pen 1 |
	| `((Stapler)var3).method1();` | Stapler 1 |
	| `((Clip)var3).method3();` | Paper 3/Stapler 2 |
	| `((Clip)var5).method1();` | compiler error |
	| `((Pen)var5).method1();` | runtime error |
	| `((Clip)var6).method2();` | Clip 2/Paper 2 |
	| `((Stapler)var6).method3();` | runtime error |