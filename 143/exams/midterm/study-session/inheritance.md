_CSE 143_

# Inheritance
## Midterm Study Session

1. Assuming that the following classes have been defined:

	```java
	public class Drink extends Bite {
		public void method3() {
			System.out.println("Drink 3");
		}
	}

	public class Sip extends Gulp {
		public void method1() {
			System.out.println("Sip 1");
		}

		public void method3() {
			System.out.println("Sip 3");
		}
	}

	public class Bite extends Gulp {
		public void method1() {
			System.out.println("Bite 1");
		}

		public void method3() {
			System.out.println("Bite 3");
			super.method3();
		}
	}

	public class Gulp {
		public void method2() {
			System.out.println("Gulp 2");
			method3();
		}

		public void method3() {
			System.out.println("Gulp 3");
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Object var1 = new Bite();
	Gulp var2 = new Gulp();
	Gulp var3 = new Sip();
	Bite var4 = new Drink();
	Object var5 = new Gulp();
	Gulp var6 = new Drink();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected.

	| Method Call | Output |
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
	| `var5.method3();` | |
	| `var6.method3();` | |
	| `((Sip)var6).method1();` | |
	| `((Gulp)var1).method1();` | |
	| `((Gulp)var1).method2();` | |
	| `((Bite)var1).method3();` | |
	| `((Bite)var6).method1();` | |
	| `((Drink)var1).method1();` | |
	| `((Drink)var4).method2();` | |
	| `((Bite)var3).method1();` | |

1. Assuming that the following classes have been defined:

	```java
	public class Green extends Red {
		public void method1() {
			System.out.println("Green 1");
		}

		public void method3() {
			System.out.println("Green 3");
		}
	}

	public class White extends Red {
		public void method2() {
			System.out.println("White 2");
		}

		public void method3() {
			System.out.println("White 3");
		}
	}

	public class Blue {
		public void method1() {
			System.out.println("Blue 1");
			method2();
		}

		public void method2() {
			System.out.println("Blue 2");
		}
	}

	public class Red extends Blue {
		public void method2() {
			System.out.println("Red 2");
			super.method2();
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Blue var1 = new Blue();
	Green var2 = new Green();
	Object var3 = new White();
	Red var4 = new Green();
	Blue var5 = new Red();
	Blue var6 = new White();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected.

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method1();` | |
	| `var2.method1();` | |
	| `var3.method1();` | |
	| `var4.method1();` | |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3();` | |
	| `var4.method3();` | |
	| `((Blue)var3).method1();` | |
	| `((Red)var3).method2();` | |
	| `((White)var3).method3();` | |
	| `((White)var4).method3();` | |
	| `((Green)var5).method3();` | |
	| `((Red)var5).method1();` | |
	| `((Blue)var6).method3();` | |
	| `((Green)var6).method3();` | |

1. Assuming that the following classes have been defined:

	```java
	public class Couch extends Table {
		public void method1() {
			System.out.println("Couch 1");
		}
	}

	public class Table extends Chair {
		public void method1() {
			System.out.println("Table 1");
		}

		public void method2() {
			System.out.println("Table 2");
			super.method2();
		}

		public void method3() {
			System.out.println("Table 3");
			method1();
		}
	}

	public class Chair {
		public void method2() {
			System.out.println("Chair 2");
		}
	}

	public class Lamp extends Chair {
		public void method1() {
			System.out.println("Lamp 1");
		}

		public void method2() {
			System.out.println("Lamp 2");
		}
	}

	```

	And assuming the following variables have been defined:

	```java
	Table var1 = new Table();
	Chair var2 = new Table();
	Table var3 = new Couch();
	Chair var4 = new Lamp();
	Chair var5 = new Couch();
	Object var6 = new Chair();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected.

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var5.method2();` | |
	| `var6.method2();` | |
	| `var1.method1();` | |
	| `var2.method1();` | |
	| `var3.method1();` | |
	| `var4.method1();` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3();` | |
	| `((Lamp)var4).method1();` | |
	| `((Lamp)var2).method1();` | |
	| `((Table)var5).method1();` | |
	| `((Couch)var1).method1();` | |
	| `((Chair)var6).method2();` | |
	| `((Couch)var5).method3();` | |
	| `((Table)var5).method3();` | |

1. Assuming that the following classes have been defined:

	```java
	public class Frodo extends Bilbo {
		public void method1() {
			System.out.println("Frodo 1");
			super.method1();
		}

		public void method3() {
			System.out.println("Frodo 3");
		}
	}

	public class Gandalf {
		public void method1() {
			System.out.println("Gandalf 1");
		}

		public void method2() {
			System.out.println("Gandalf 2");
			method1();
		}
	}

	public class Bilbo extends Gandalf {
		public void method1() {
			System.out.println("Bilbo 1");
		}
	}

	public class Gollum extends Gandalf {
		public void method3() {
			System.out.println("Gollum 3");
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Gandalf var1 = new Frodo();
	Gandalf var2 = new Bilbo();
	Gandalf var3 = new Gandalf();
	Object var4 = new Bilbo();
	Bilbo var5 = new Frodo();
	Object var6 = new Gollum();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected.

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method1();` | |
	| `var2.method1();` | |
	| `var3.method1();` | |
	| `var4.method1();` | |
	| `var5.method1();` | |
	| `var6.method1();` | |
	| `var1.method2();` | |
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var5.method2();` | |
	| `var6.method2();` | |
	| `((Bilbo)var1).method3();` | |
	| `((Gandalf)var1).method2();` | |
	| `((Frodo)var4).method1();` | |
	| `((Gandalf)var6).method2();` | |
	| `((Gandalf)var4).method1();` | |
	| `((Frodo)var6).method3();` | |
	| `((Frodo)var3).method3();` | |
	| `((Frodo)var5).method3();` | |

1. Assuming that the following classes have been defined:

	```java
	public class Clip extends Paper {
		public void method2() {
			System.out.println("Clip 2");
			super.method2();
		}
	}

	public class Paper {
		public void method2() {
			System.out.println("Paper 2");
		}

		public void method3() {
			System.out.println("Paper 3");
			method2();
		}
	}

	public class Stapler extends Clip {
		public void method1() {
			System.out.println("Stapler 1");
		}

		public void method2() {
			System.out.println("Stapler 2");
		}
	}

	public class Pen extends Paper {
		public void method1() {
			System.out.println("Pen 1");
		}

		public void method2() {
			System.out.println("Pen 2");
		}
	}
	```

	And assuming the following variables have been defined:

	```java
	Paper var1 = new Pen();
	Stapler var2 = new Stapler();
	Paper var3 = new Stapler();
	Paper var4 = new Paper();
	Object var5 = new Stapler();
	Paper var6 = new Clip();
	```

	In the table below, indicate in the right-hand column the output produced by the statement in the left-hand column. If the statement produces more than one line of output, indicate the line breaks with slashes as in "a/b/c" to indicate three lines of output with "a" followed by "b" followed by "c". If the statement causes an error, fill in the right-hand column with either the phrase "compiler error" or "runtime error" to indicate when the error would be detected (you may abbreviate these as "ce" and "re" or "c.e." and "r.e.").

	| Method Call | Output |
	| :--- | :--- |
	| `var1.method2();` | |	
	| `var2.method2();` | |
	| `var3.method2();` | |
	| `var4.method2();` | |
	| `var5.method2();` | |
	| `var6.method2();` | |
	| `var1.method1();` | |
	| `var2.method1();` | |
	| `var3.method1();` | |
	| `var1.method3();` | |
	| `var2.method3();` | |
	| `var3.method3();` | |
	| `var4.method3();` | |
	| `((Pen)var1).method1();` | |
	| `((Stapler)var3).method1();` | |
	| `((Clip)var3).method3();` | |
	| `((Clip)var5).method1();` | |
	| `((Pen)var5).method1();` | |
	| `((Clip)var6).method2();` | |
	| `((Stapler)var6).method3();` | |