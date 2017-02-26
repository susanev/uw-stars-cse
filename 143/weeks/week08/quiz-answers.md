_CSE 143_
# Quiz Answers
## Week 8

1. Binary Search Tree, 4 points.

	```
	                             +------------+
	                             |   Ephraim  |
	                             +------------+
	                          /                  \
	                       /                        \
	                    /                              \
	           +------------+                      +------------+
	           |    Ben     |                      |   Frank    |
	           +------------+                      +------------+
	          /              \                                   \
	         /                \                                   \
	        /                  \                                   \
	+------------+          +------------+                      +------------+
	|    Adam    |          |    Dan     |                      |   Gideon   |
	+------------+          +------------+                      +------------+
	                      /
	                     /
	                    /
	           +------------+
	           |   Caleb    |
	           +------------+
	```

1. Binary Trees, 10 points. One possible solution appears below.

	```java
	public void printLevel(int target) {
		if (target < 1) {
			throw new IllegalArgumentException();
		}
		System.out.print("nodes at level " + target + " =");
		printLevel(overallRoot, target, 1);
		System.out.println();
	}

	private void printLevel(IntTreeNode root, int target, int level) {
		if (root != null)
			if (level == target)
				System.out.print(" " + root.data);
		else {
			printLevel(root.left, target, level + 1);
			printLevel(root.right, target, level + 1);
		}
	}
	```

1. Collections Programming, 10 points. One possible solution appears below.

	```java
	public Map<String, Set<List<String>>> acronyms(Set<List<String>> lists) {
		Map<String, Set<List<String>>> result = new TreeMap<String, Set<List<String>>>();
		for (List<String> words : lists) {
			String acronym = acronymFor(words);
			if (!result.containsKey(acronym)) {
				result.put(acronym, new HashSet<List<String>>());
			}
			result.get(acronym).add(words);
		}
		return result;
	}
	```

1. Binary Trees, 20 points.

	```java
	public void limitLeaves(int min) {
		overallRoot = limitLeaves(overallRoot, min);
	}

	private IntTreeNode limitLeaves(IntTreeNode root, int min) {
		if (root != null) {
			root.left = limitLeaves(root.left, min);
			root.right = limitLeaves(root.right, min);
			if (root.left == null && root.right == null && root.data <= min)
				root = null;
		}
		return root;
	}
	```

1. Linked Lists, 20 points.

	```java
	public boolean bubble() {
		boolean swap = false;
		if (front != null && front.next != null) {
			if (front.data > front.next.data) {
				swap = true;
				ListNode temp = front;
				front = front.next;
				temp.next = front.next;
				front.next = temp;
			}
			ListNode current = front;
			while (current.next != null && current.next.next != null) {
				if (current.next.data > current.next.next.data) {
					swap = true;
					ListNode temp = current.next.next;
					current.next.next = temp.next;
					temp.next = current.next;
					current.next = temp;
				}
				current = current.next;
			}
		}
		return swap;
	}
	```