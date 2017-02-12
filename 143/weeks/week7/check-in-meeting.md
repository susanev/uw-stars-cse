_CSE 143_
# Check-in Meeting
## Week 7

1. Binary Search Tree Traversals. Suppose that the following elements are added in the specified order to an empty binary search tree:

	Dodo, Eaglet, Rabbit, Cat, Alice, Jabberwock, Hatter, Tweedledee, Queen, Bill

	Write the elements of the tree above in the order they would be seen by a pre-order, in-order, and post-order traversal.

	| Traversal | Result |
	| :--- | :--- |
	| Preorder traversal | |
	| Inorder traversal | |
	| Postorder traversal | |

1. Binary Search Tree Traversals. Suppose that the following elements are added in the specified order to an empty binary search tree:

	Glinda, Cowardly lion, Dorothy, Toto, Scarecrow, Tin man, Wicked witch, Wizard, Boq, Ozma Write the elements of the tree above in the order they would be seen by a pre-order, in-order, and post-order traversal.

	| Traversal | Result |
	| :--- | :--- |
	| Preorder traversal | |
	| Inorder traversal | |
	| Postorder traversal | |

1. RiggedDice. You have been asked to extend an existing class Dice representing a set of many 6-sided dice that can be rolled by a player. The Dice class includes the following members:

	| Member | Description |
	| :--- | :--- |
	| `public Dice(int count)` | constructs a dice roller to roll the given # of dice; all dice initially have the value of 6 |
	| `public int count()` | returns the number of dice managed by this dice roller, as passed to the constructor |
	| `public int getValue(int index)` | returns the die value (1-6) at the given 0-based index |
	| `public void roll(int index)` | rolls the given die to give it a new random value from 1-6 |
	| `public int total()` | returns the sum of all current dice values in this dice roller |
	| `public String toString()` | returns a string representation of this roller's dice values, such as "[4, 1, 6, 5]" |

	Define a new class called RiggedDice that extends Dice through inheritance. Your class represents dice that let a player "cheat" by ensuring that they will always roll a value that is greater than or equal to a given minimum value. You should provide the same methods as the superclass, as well as the following new behavior.

	| Member | Description |
	| :--- | :--- |
	| `public RiggedDice(int count, int min)` | constructs a rigged dice roller to roll the given number of dice, using the given minimum value for all future rolls; all dice initially have the value 6 (if the min value is not between 1-6, throw an IllegalArgumentException) |
	| `public int getMin()` | returns the minimum roll value as passed to the constructor |

	A RiggedDice should behave like a Dice object except for the following differences. You may need to override or replace existing behavior in order to implement these changes.
	* Every time a die is rolled, you must ensure that the value rolled is greater than or equal to the minimum value passed to your constructor. Do this by re-rolling the die if the value is too small, as many times as necessary.
	* The rigged dice should return a total that lies and claims to be 1 higher than the actual total. For example, if the sum of the values on the dice add up to 13, your rigged dice object's total returned should be 14.
	* When a rigged dice object is printed or used as a string, it should display that the dice are rigged, then the dice values, then the minimum dice value, such as, "rigged [4, 3, 6, 5] min 2"

	Also make RiggedDice objects comparable to each other using the Comparable interface. RiggedDice are compared by total dice value in ascending order, breaking ties by minimum roll value in ascending order. In other words, a RiggedDice with a lower total dice value is considered to be "less than" one with a higher total. If two objects have the same total, the one with a lower min value passed to its constructor is "less than" one with a higher course count. If the two objects have the same total and the same min, they are considered to be "equal."

	You should not only implement the correct behavior, but also appropriately utilize the behavior you have inherited from the superclass rather than re-implementing behavior that already works properly in the superclass. You may assume that the superclass already checks all arguments passed to its constructor and methods to make sure that they are valid.