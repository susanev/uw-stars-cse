_CSE 143_
# Check-in Meeting Answers
## Week 7

1. Binary Search Tree Traversals.

	| Traversal | Result |
	| :--- | :--- |
	| Preorder traversal | Dodo, Cat, Alice, Bill, Eaglet, Rabbit, Jabberwock, Hatter, Queen, Tweedledee |
	| Inorder traversal | Alice, Bill, Cat, Dodo, Eaglet, Hatter, Jabberwock, Queen, Rabbit, Tweedledee |
	| Postorder traversal | Bill, Alice, Cat, Hatter, Queen, Jabberwock, Tweedledee, Rabbit, Eaglet, Dodo |

1. Binary Search Tree Traversals.

	| Traversal | Result |
	| :--- | :--- |
	| Preorder traversal | Glinda, Cowardly lion, Boq, Dorothy, Toto, Scarecrow, Ozma, Tin man, Wicked witch, Wizard |
	| Inorder traversal | Boq, Cowardly lion, Dorothy, Glinda, Ozma, Scarecrow, Tin man, Toto, Wicked witch, Wizard |
	| Postorder traversal | Boq, Dorothy, Cowardly lion, Ozma, Tin man, Scarecrow, Wizard, Wicked witch, Toto, Glinda |

1. RiggedDice.

	```java
	public class RiggedDice extends Dice implements Comparable<RiggedDice> {
		private int min;

		public RiggedDice(int count, int min) {
			super(count);
			if (min < 1 || min > 6) {
				throw new IllegalArgumentException();
			}
			this.min = min;
		}

		public int compareTo(RiggedDice other) {
			int myTotal = total();
			int hisTotal = other.total();
			if (myTotal != hisTotal) {
				return myTotal - hisTotal;
			} else {
				return min - other.min;
			}
		}

		public int getMin() {
			return min;
		}

		public void roll(int index) {
			super.roll(index);
			while (getValue(index) < min) { // do/while is okay
				super.roll(index);
			}
		}

		public int total() {
			return super.total() + 1;
		}

		public String toString() {
			return "rigged " + super.toString() + " min " + min;
		}
	}
	```