_CSE 143_
# Exercise Answers
## Week 8

1. Binary Search Tree, 4 points.

	```
	                           +------------+
	                           |    Karl    |
	                           +------------+
	                        /                  \
	                     /                        \
	                  /                              \
	         +------------+                      +------------+
	         |   Chris    |                      |   Simon    |
	         +------------+                      +------------+
	        /              \                                   \
	       /                \                                   \
	      /                  \                                   \
	+------------+      +------------+                      +------------+
	|   Anton    |      |    John    |                      |    Zoe     |
	+------------+      +------------+                      +------------+
	                                                      /
	                                                     /
	                                                    /
	                                             +------------+
	                                             |    Zach    |
	                                             +------------+
	```

1. Binary Trees, 10 points.

	```java
	public boolean hasPathSum(int sum) {
	 return hasPathSum(overallRoot, sum);
	}

	private boolean hasPathSum(IntTreeNode root, int sum) {
		if (root == null)
			return false;
		if (root.data == sum)
			return true;
		int sum2 = sum - root.data;
			return hasPathSum(root.left, sum2) || hasPathSum(root.right, sum2);
	}
	```

1. Programming, 10 points.

	