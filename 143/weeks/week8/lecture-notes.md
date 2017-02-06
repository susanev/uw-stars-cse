_CSE 143_
# Lecture Notes
## Week 8

### Binary Tress
* __root__: Top node in the tree
* __leaves__: Bottom nodes of the tree
* __node__: A particular value in the tree

#### Example

	```
	    12
	   /  \
	  /    \
	18      7
	       / \
	      /   \
	     4    13
	```

	* The root node is storing `12`
	* The nodes storing `12` and `7` are called __branch nodes__ because they have values stored under them
	* The nodes storing `18`, `4`, and `13` are __leaf nodes__ because there is nothing stored underneath them
	* We also say, that the node storing `12` is the __parent node__ of `18` and `7` and that `18` and `7` are the __children__ of `12`
	* Nodes on the same level are referred to as __sibilings__, so `18` and `7` 

#### Recursive definition
* A tree is either ..
	* An empty tree
	* Or a root node with left and right subtrees

	```
	       +-----------+
	       | root node |
	       +-----------+
	           /   \
	         /       \
	       /           \
	     /\             /\
	    /  \           /  \
	   /    \         /    \
	  / left \       / right\
	 / subtree\     / subtree\
	+----------+   +----------+
	```

* The simplest possible tree is an empty tree

#### Node Class for Binary Tress of ints
* Note: This class is not encapsulated (with private fields) because we'll have a second object for storing a tree; any external client will deal with the IntTree object and won't ever the tree node objects
* Note: Proper style when using multiple constructors, is for the additional constructors to call other constructors when possible using `this()`

```java
public class IntTreeNode {
	public int data;
	public IntTreeNode left;
	public IntTreeNode right;

	public IntTreeNode(int data) {
		this(data, null, null);
	}

	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
```

#### [IntTree Class](code/IntTree.java)
	* See the full [IntTreeClass](code/IntTree.java)

	```java
	public class IntTree {
		private IntTreeNode overallRoot;

		...
	}
	```

##### IntTree Class Printing Methods
* Note that these recursive methods use the public/private pair approach

```java
// post: prints the tree contents using a preorder traversal
public void printPreorder() {
	System.out.print("preorder:");
	printPreorder(overallRoot);
	System.out.println();
}

// post: prints in preorder the tree with given root
private void printPreorder(IntTreeNode root) {
	if (root != null) {
		System.out.print(" " + root.data);
		printPreorder(root.left);
		printPreorder(root.right);
	}
}

// post: prints the tree contents using an inorder traversal
public void printInorder() {
	System.out.print("inorder:");
	printInorder(overallRoot);
	System.out.println();
}

// post: prints in inorder the tree with given root
private void printInorder(IntTreeNode root) {
	if (root != null) {
		printInorder(root.left);
		System.out.print(" " + root.data);
		printInorder(root.right);
	}
}

// post: prints the tree contents using a postorder traversal
public void printPostorder() {
	System.out.print("postorder:");
	printPostorder(overallRoot);
	System.out.println();
}

// post: prints in postorder the tree with given root
private void printPostorder(IntTreeNode root) {
	if (root != null) {
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(" " + root.data);
	}
}
```

#### [IntTreeClient](code/IntTreeClient.java)

```java
// Short program that demonstrates the use of the IntTree class.

public class IntTreeClient {
    public static void main(String[] args) {
        IntTree t = new IntTree(12);
        System.out.println("Tree structure:");
        t.printSideways();
        System.out.println();
        t.printPreorder();
        t.printInorder();
        t.printPostorder();
    }
}
```

#### Tree Traversals
* The idea is to "traverse" the tree in such a way that you visit each node exactly once
* We generally prefer recursive approaches, so we want to traverse the entire left subtree without dealing with anything from the right and in a separate operation, traverse the entire right subtree without dealing with anything from the left
* That leads to the classic binary tree traversals
* Three types of traversals
	* _Note: You will need to demonstrate that you understand these three types of traversals on the final exam_
	* Preorder: process the root before you traverse either subtree
	* Inorder: process the root after you traverse both subtrees
	* Postorder: process the root in between traversing the two subtrees

	* Example:
		* Preorder traversal: `2, 0, 7, 6, 5, 3, 1, 8, 9, 4`
		* Inorder traversal: `6, 7, 5, 0, 2, 8, 1, 3, 9, 4`
		* Postorder traversal: `6, 5, 7, 0, 8, 1, 4, 9, 3, 2`

		```
	                     +---+
	                     | 2 |
	                     +---+
	                   /       \
	                 /           \
	           +---+               +---+
	           | 0 |               | 3 |
	           +---+               +---+
	          /                   /     \
	         /                   /       \
	      +---+               +---+     +---+
	      | 7 |               | 1 |     | 9 |
	      +---+               +---+     +---+
	     /     \              /              \
	    /       \            /                \
	 +---+     +---+      +---+              +---+
	 | 6 |     | 5 |      | 8 |              | 4 |
	 +---+     +---+      +---+              +---+
	 ```

### Binary Search Trees
* Binary Search Trees a particular kind of binary tree that have a special property that is sometimes referred to as the binary search tree property
* Binary Search Trees store nodes in sorted order
* In particular, we want to guarantee that for every subtree, the following relationship holds:

	```
	             +-----------+
	             | root data |
	             +-----------+
	                 /   \
	               /       \
	             /           \
	+----------------+   +---------------+
	| values <= data |   | values > data |
	+----------------+   +---------------+
	```

	* The tree is structured so that values that appear in the left subtree are all less than or equal to the root data and values that appear in the right subtree are all greater than the root data
	* This property is preserved throughout the tree, not just for the overall root.
	* If you encounter duplicate values, you can pick any convention, but be consistent
		* You might decide that duplicates aren't allowed
		* You might decide that they are inserted into the left subtree
		* You might decide that duplicates go into the right subtree
* Traversing a binary search tree with in inorder traversal, will result in the data being in order when printing

#### [IntSearchTreeClient](code/IntSearchTreeClient.java)

```java
import java.util.*;

public class IntSearchTreeClient {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		IntTree numbers = new IntTree();
		System.out.print("Next int (0 to quit)? ");
		int number = console.nextInt();
		while (number != 0) {
			numbers.add(number);
			System.out.print("Next int (0 to quit)? ");
			number = console.nextInt();
		}
		System.out.println();

		System.out.println("Tree Structure:");
		numbers.printSideways();
		System.out.println("Sorted list:");
		numbers.printInorder();
	}
}
```

#### add method in [IntTreeNode](code/IntTreeNode.java)

	```java
	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}

	```java
	private IntTreeNode add(IntTreeNode root, int value) {
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (value <= root.data) {
			root.left = add(root.left, value);
		} else {
			root.right = add(root.right, value);
		}
		return root;
	}
	```

#### `x = change(x)`
* An approach to recording the change of `x` back into the `x` variable
* This technique will update the value of x, whereas if you just had `change(x)` it would not change the value of `x`
* You can see this modeled above with the lines of code `overallRoot = add(overallRoot, value);`, `root.left = add(root.left, value);` and `root.right = add(root.right, value);`