_CSE 143_

# Binary Trees Answers
## Final Study Session

1. evenBranches. One possible answer is shown below.

	```java
	public int evenBranches() {
		return evenBranches(overallRoot);
	}

	private int evenBranches(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 0;
		} else if (root.data % 2 == 0) {
			return 1 + evenBranches(root.left) + evenBranches(root.right);
		} else {
			return evenBranches(root.left) + evenBranches(root.right);
		}
	}
	```

1. countMultiples. One possible answer is shown below.

	```java
	public int countMultiples(int value) {
		if (value == 0) {
			throw new IllegalArgumentException();
		}
			return countMultiples(overallRoot, value);
		}

		private int countMultiples(IntTreeNode root, int value) {
			if (root == null) {
				return 0;
			} else {
				int sum = countMultiples(root.left, value) + countMultiples(root.right, value);
			if (root.data % value == 0) {
				return 1 + sum;
			} else {
				return sum;
			}
		}
	}
	```

1. pairsOfTwins. One possible answer is shown below.