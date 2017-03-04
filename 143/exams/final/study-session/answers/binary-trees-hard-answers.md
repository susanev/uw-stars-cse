_CSE 143_

# Binary Trees Hard Answers
## Final Study Session

1. limitPathSum. One possible answer is shown below.

	```java
	public void limitPathSum(int max) {
		overallRoot = limitPathSum(overallRoot, max, 0);
	}

	private IntTreeNode limitPathSum(IntTreeNode root, int max, int current) {
		if (root != null) {
			current += root.data;
			if (current > max) {
				root = null;
			} else {
				root.left  = limitPathSum(root.left,  max, current);
				root.right = limitPathSum(root.right, max, current);
			}
		}
		return root;
	}
	```

1. tighten. One possible answer is shown below.

	```java
	public void tighten() {
		overallRoot = tighten(overallRoot);
	}

	private IntTreeNode tighten(IntTreeNode root) {
		if (root != null) {
			root.left = tighten(root.left);
			root.right = tighten(root.right);
			if (root.left != null && root.right == null) {
				root = root.left;
			} else if (root.left == null && root.right != null) {
				root = root.right;
			}
		}
		return root;
	}
	```

1. combineWith. One possible answer is shown below.

	```java
	public IntTree combineWith(IntTree other) {
		IntTree result = new IntTree();
		result.overallRoot = combine(this.overallRoot, other.overallRoot);
		return result;
	}

	private IntTreeNode combine(IntTreeNode root1, IntTreeNode root2) {
		if (root1 == null) {
			if (root2 == null) {
				return null;
			} else {
				return new IntTreeNode(2, combine(null, root2.left), combine(null, root2.right));
			}
		} else {
			if (root2 == null) {
				return new IntTreeNode(1, combine(root1.left, null), combine(root1.right, null));
			} else {
				return new IntTreeNode(3, combine(root1.left, root2.left), combine(root1.right, root2.right));
			}
		}
	}
	```

1. stretch. One possible answer is shown below.

1. flip. One possible answer is shown below.

	```java
	public void flip() {
		overallRoot = flip(overallRoot);
	}

	private IntTreeNode flip(IntTreeNode node) {
		if (node == null) {
			return null;
		} else {
			IntTreeNode temp = node.left;
			node.left = flip(node.right);
			node.right = flip(temp);
			return node;
		}
	}
	```

1. swapChildrenAtLevel. One possible answer is shown below.

	```java
	public void swapChildrenAtLevel(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		swapChildrenAtLevel(n, 1, overallRoot);
	}

	private void swapChildrenAtLevel(int n, int currentLevel, IntTreeNode root) {
		if (root != null) {
			if (currentLevel == n) {
				IntTreeNode temp = root.left;
				root.left = root.right;
				root.right = temp;
			} else if (currentLevel < n) {
				swapChildrenAtLevel(n, currentLevel + 1, root.left);
				swapChildrenAtLevel(n, currentLevel + 1, root.right);
			}
		}
	}
	```