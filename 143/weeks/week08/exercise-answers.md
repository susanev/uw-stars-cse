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

1. Collections Programming, 10 points. 

	```java
	public static int recordDate(Map<String, List<String>> dates,
			String name1, String name2) {
		if (!dates.containsKey(name1)) {
			dates.put(name1, new LinkedList<String>());
		}
		if (!dates.containsKey(name2)) {
			dates.put(name2, new LinkedList<String>());
		}
		dates.get(name1).add(0, name2);
		dates.get(name2).add(0, name1);
		int n = 0;
		for (String s : dates.get(name1)) {
			if (s.equals(name2)) {
				n++;
			}
		}
		return n;
	}
	```
	