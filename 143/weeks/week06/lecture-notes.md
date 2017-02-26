_CSE 143_
# Lecture Notes
## Week 6

### Inheritance
* Polymorphism is all about (poly for "many" and morphism for "forms") methods taking on "many" forms
* To establish an inheritance relationship between two classes use the _extends_ keyword in the class header:

	```java
	// Object
	//	 |
	//	 A
	//	 |
	//	 B
	// B is a subclass of A
	// A is the superclass of B
	class B extends A {
		...
	}
	```

* Every class extends the Object class, either directly or indirectly
* A subclass can do two things
	* Add new state and behavior (new data fields and methods)
	* Override inherited methods.
* The most generic or simple description appears high in the hierarchy
* The more complex, more sophisticated objects appear low in the hierarchy
* At each level we are adding potentially more and more state and behavior

#### Substitutability
_When can one object substitute for another?_

* Inheritance should be used only when there is an _is-a_ relationship where the more specialized object can substitute for the less specialized one
* We cannot substitute across
* An object can fill many roles
* An object call fill every role that appears as you go up the inheritance chain to the top.
* Using the example above ...

	```java
	// valid
	A x = new A();
	B y = new B();
	A x = new B(); // okay, B can fill A role

	// invalid
	B y = new A(); // A cannot fill B role
	```

##### Java Contracts
* `A x = new B();` is valid, a B object can substitute when we were expecting an A object, but Java expects that we will only request _A type_ behaviors when we use this variable
	* If there is a particular method that B objects have that isn't include in the A class, then it will result in a compiler error
	* Even though the actual object has that behavior, if it is not included in the A class, then we can't call the method

##### Casting
* A way to tell Java .. _Trust me, the object will be of this other type_; this delays the check until after compiling
* We can in effect renegotiate our contract with Java and let it know that we expect the actual object to be of a different type than what the variable would indicate
* `((B)x).behaviorOfB();` tells Java that you are substituting B-like behavior in place of the original contract
* The cast does not affect anything other than this one specific method call; the variable isn't changed

#### Errors
* First compiler errors are considered, and then runtime errors

##### Compiler Errors
* If the type involved does not include the method you are calling then you get a compiler error
	* If there is no cast, the compiler looks at the type of the variable
	* If there is a cast, it looks at the type you are casting to 

##### Runtime Errors
* Only happen when casting is involved
* If the actual object turns out to not be something that can fill the role as described, then you get a runtime error
* If the cast is inappropriate for the actual object involved, then you get a runtime error (a ClassCastException)

#### Example

Assuming that the following classes have been defined:

```java
public class One {
	public void method1() {
		System.out.println("One1");
	}
}

public class Two extends One {
	public void method3() {
		System.out.println("Two3");
	}
}

public class Three extends One {
	public void method2() {
		System.out.println("Three2");
		method1();
	}
}

public class Four extends Three {
	public void method1() {
		System.out.println("Four1");
		super.method1();
	}

	public void method3() {
		System.out.println("Four3");
	}
}
```
        
And assuming the following variables have been defined:

```java
One var1 = new Two();
One var2 = new Three();
One var3 = new Four();
Three var4 = new Four();
Object var5 = new Three();
Object var6 = new One();
```

##### Step 1: Draw the Diagram

```
    One
   /   \
Two    Three
         |
        Four
```

##### Step 2: Fill in a Table

| | method1 | method2 | method3 |
| :--- | :--- | :--- | :--- |
| One | One1 | | |
| Two | One1 | | Two3 |
| Three | One1 | Three2/method1() | |
| Four | Four1/One1 | Three2/method1() | Four3 |

###### One Class
* Defines method1 as printing "One1"
* It has no definition for method2 and method3

###### Two Class
* Defines method3 as printing "Two3"
* It has no other definitions, but it inherits a method1 from One that prints "One1"
* It has no method2

###### Three Class
* Defines method2 as printing "Three2" and then calls method1
* The Three class had no definition for method3

###### Four Class
* method1 of the Four class we call super, so method1 of the Three class Three which has no method1 so we keep looking up the inheritance chain until we find the definition in the class One
* method2 is the inherited method that prints out "Three2" and then calls method1
* method3 prints out "Four3"

* Pay attention to what kind of object you have
	* The variable type and the cast don't matter at all
	* All that matters is what kind of object you have
	* Objects always behave in the same way no matter what the variable type is and no matter what kind of casting you've done

##### Step 3: Consider Errors
* The first question you have to consider is whether you pass the compiler check
	* To figure that out, you have to look at the types of the variables
* The types of the objects don't matter to the compiler
* The variables determine the contract
* The variables of type One and Three are okay because both the One class and the Three class include a method1
* The two variables of type Object are a problem because the Object class does not include a method1
	* Even though the objects themselves can do this, the contract was for a generic Object, so the compiler is going to complain

##### Step 4: Consider Casting
* `((Two)var1).method2();`
	* The variable var1 is declared to be of type "One", so in the absence of a cast, we'd be looking at the One role to figure out this contract
	* But there is a cast, so we use that instead
	* We are casting to Two, which means we have renegotiated the contract
	* So the question becomes, does the Two role include a method2, no
	* So even with this cast, we get a compiler error (the role we have contracted for does not include this method)

* `((Three)var1).method2();`
	* Here we are using a cast to Three to renegotiate the contract
	* So the question becomes, does the Three role include a method2, yes
	* So we pass the compiler (step 1)
	* Then we ask whether the cast is actually legal
	* What kind of object do we have? 
		* The variable var1 is referring to a Two object
	* Can a Two object be cast to a Three? In other words, can a Two substitute for a Three, no
	* So even though we pass the compiler, we don't pass the runtime system, we generate a runtime error

* `((Four)var5).method2();`
	* We have a cast, so we look at the Four role to determine whether this is legal as far as the compiler is concerned, the answer is yes
	* The Four role includes a method2, so we pass the compiler
	* We have to consider whether the cast is legal
	* The actual object is a Three object
	* Can a Three object substitute for a Four object, no
	* A Four object can substitute for a Three, but not the other way around
	* So this generates a runtime error because of the illegal cast

* `((Three)var5).method2();`
	* We have "overcast", we didn't need to claim that it will be a Four
	* We only needed to claim that it was a Three
	* But if you overclaim, Java will call you on it
	* It will make sure that all of your casts actually work out.

| Call | Output | Explanation |
| :--- | :--- | :--- |
| `var1.method1();` | One1 | variable is of type One, One role includes method1, no cast, actual object is a Two which writes out "One1" when method1 is called |
| `var2.method1();` | One1 | variable is of type One, One role includes method1, no cast, actual object is a Three which writes out "One1" when method1 is called |
| `var3.method1();` | Four1/One1 | variable is of type One, One role includes method1, no cast, actual object is a Four which writes out "Four1/One1" when method1 is called |
| `var4.method1();` | Four1/One1 | variable is of type Three, Three role includes method1, no cast, actual object is a Four which writes out "Four1/One1" when method is called |
| `var5.method1();` | compiler error | variable is of type Object, Object role does not include method1 |
| `var6.method1();` | compiler error | variable is of type Object, Object role does not include method1 |
| `var4.method2();` | Three2/Four1/One1 | variable is of type Three, Three role includes method2, no cast, actual object is a Four which writes out "Three2/Four1/One1" when method2 is called (note that method2 calls its method1 polymorphically, which is why this output includes "Four1") |
| `var4.method3();` | compiler error | variable is of type Three, Three role does not include method3 (even though the object itself is a Four that is capable of performing this action) |
| `((Two)var1).method2();` | compiler error | because of cast we pay attention to it rather than the variable type (because we have renegotiated the contract), cast is to Two, Two role does not include method2 |
| `((Three)var1).method2();` | runtime error | cast is to Three, Three role includes method2 so we pass the compiler, but actual object is a Two which can't fill the Three role (casting across the hierarchy, like asking someone to accept a bike when they were expecting a car), so we get a runtime error |
| `((Two)var1).method3();` | Two3 | cast is to Two, Two role includes method3, actual object is a Two which cal fill the Two role, so the cast is okay, and a Two object writes "Two3" when its method3 is called |
| `((Four)var2).method1();` | runtime error | cast is to Four, Four role includes method1, actual object is a Three which can't fill the Four role; this was, in essence, a stupid cast to do because it isn't necessary, but if you tell this kind of lie, Java will complain |
| `((Four)var3).method1();` | Four1/One1 | cast is to Four, Four role includes method1, actual object is a Four which can fill the Four role, so cast is okay and a Four object writes "Four1/One1" when method1 is called |
| `((Four)var4).method3();` | Four3 | cast is to Four, Four role includes method3, actual Object is a Four, which can fill the Four role, so cast is okay and a Four object writes "Four3" when method3 is called |
| `((One)var5).method1();` | One1 | cast is to One, One role includes method1, actual object is a Three, which can fill the One role, so cast is okay and a Three object writes "One1" when method1 is called |
| `((Four)var5).method2();` | runtime error | cast is to Four, Four role includes method2, actual object is a Three which can't fill the Four role |
| `((Three)var5).method2();` | Three2/One1 | cast is to Three, Three role includes method2, actual object is a Three which can fill the Three role and a Three object writes "Three2/One1" when method2 is called |
| `((One)var6).method1();` | One1 | cast is to One, One role includes method1, actual object is a One which can fill the One role, so cast is okay and a One object writes "One1" when method1 is called |
| `((One)var6).method2();` | compiler error | cast is to One, One role does not include method2 |
| `((Two)var6).method3();` | runtime error | cast is to Two, Two role includes method3, actual object is a One, which can't fill the Two role |

### Merge sort

* Both insertion sort and selection sort are O(n^2) sorting techniques
	* They work fine for small values of n, but they become far too expensive for large values of n
* The idea of merge sort is to divide the list in half, then sort each half, and then merge the two sorted halves back together
	* This is often referred to as _divide and conquer_ by computer scientists
	* Usually written recursively 
	* Merge sort is a stable sort
		* A stable sort has the property that it preserves the relative order of data values that are considered equal
		* Excel uses a stable sorting algorithm and the sorting routine in the Java class libraries is also a stable sort
	* Merge sort by definition is the log to the base 2 of n
		* The total number of levels will be on the order of log n; each level requires work on the order of n, so the total work will be n times log n, or O(n log n)
		* This is much faster than O(n^2)

#### Visual Example

```
     [13, 42, 97, -3, 53, 18, 92, 50]
          /                       \
         /                         \
  [13, 42, 97, -3]         [53, 18, 92, 50]
     /          \            /          \
    /            \          /            \
 [13, 42]    [97, -3]    [53, 18]    [92, 50]
   /   \       /   \      /   \       /   \
  /     \     /     \    /     \     /     \
[13]  [42]  [97]  [-3]  [53]  [18]  [92]  [50]
  \    /      \    /      \    /      \    /
   \  /        \  /        \  /        \  /
 [13, 42]   [-3, 97]    [18, 53]    [50, 92]
     \         /            \          /
      \       /              \        /
  [-3, 13, 42, 97]         [18, 50, 53, 92]
          \                       /
           \                     /
     [-3, 13, 18, 42, 50, 53, 92, 97]
```

#### `compareTo`
* Method of the Object class
* Example: `obj1.equals(obj2);`
	* Returns a negative value, if obj1 is less than obj2
	* Returns zero, if obj1 is equal to obj2
	* Returns a positive value if obj1 is greater than obj2

#### Mergesort Code

```java
// post: list is in sorted (nondecreasing) order
public static void sort(Queue<String> list) {
	if (list.size() > 1) {
		Queue<String> half1 = new LinkedList<String>();
		Queue<String> half2 = new LinkedList<String>();
		int size1 = list.size() / 2;
		int size2 = list.size() - size1;
		for (int i = 0; i < size1; i++)
			half1.add(list.remove());
		for (int i = 0; i < size2; i++)
			half2.add(list.remove());
		sort(half1);
		sort(half2);
		mergeInto(list, half1, half2);
	}
}

// pre : result is empty; list1 is sorted; list2 is sorted
// post: result contains the result of merging the sorted lists;
//       list1 is empty; list2 is empty
private static void mergeInto(Queue<String> result,
	Queue<String> list1,
	Queue<String> list2) {
	while (!list1.isEmpty() && !list2.isEmpty()) {
		if (list1.peek().compareTo(list2.peek()) <= 0)
			result.add(list1.remove());
		else
			result.add(list2.remove());
	}
	while (!list1.isEmpty())
		result.add(list1.remove());
	while (!list2.isEmpty())
		result.add(list2.remove());
}
```