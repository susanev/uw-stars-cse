_CSE 143_
# Check-in Meeting Answers
## Week 8

1. trim.

	```java
	public void trim(int min, int max) {
		overallRoot = trim(overallRoot, min, max);
	}

	private IntTreeNode trim(IntTreeNode root, int min, int max) {
		if (root != null) {
			if (root.data < min) {
				root = trim(root.right, min, max);
			} else if (root.data > max) {
				root = trim(root.left, min, max);
			} else {
				root.left  = trim(root.left,  min, max);
				root.right = trim(root.right, min, max);
			}
		}
		return root;
	}
	```

1. completeToLevel.

	```java
	public void completeToLevel(int target) {
		if (target < 1) {
			throw new IllegalArgumentException();
		}
		overallRoot = complete(overallRoot, target, 1);
	}

	private IntTreeNode complete(IntTreeNode root, int target, int level) {
		if (level <= target) {
			if (root == null) {
				root = new IntTreeNode(-1);
			}
			root.left  = complete(root.left,  target, level + 1);
			root.right = complete(root.right, target, level + 1);
		}
		return root;
	}
	```