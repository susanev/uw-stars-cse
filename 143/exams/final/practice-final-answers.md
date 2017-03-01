_CSE 143_
# Practice Final Answers
## Week 9

1. Binary Tree Traversals. 6 points.

	| Traversal | Output |
	| :--- | :--- |
	| Preorder traversal | 0, 3, 4, 7, 6, 2, 1, 5, 9, 8 |
	| Inorder traversal | 7, 4, 6, 3, 2, 1, 0, 5, 8, 9 |
	| Postorder traversal | 7, 6, 4, 1, 2, 3, 8, 9, 5, 0|

1. Binary Search Tree. 4 points.

	Draw a picture below of the binary search tree that would result from inserting the following words into an empty binary search tree in the following order: Facebook, Accenture, Nintendo, Expedia, Amazon, Microsoft, Zillow, Google. Assume the search tree uses alphabetical ordering to compare words.

	```
	             +------------------+
	             |     Facebook     |
	             +------------------+
	              /                \
	             /                  \
	      +-----------+           +------------+
	      | Accenture |           |  Nintendo  |
	      +-----------+           +------------+
	               \               /          \
	                \             /            \
	            +---------+  +-----------+  +--------+
	            | Expedia |  | Microsoft |  | Zillow |
	            +---------+  +-----------+  +--------+
	             /             /   
	            /             / 
	       +--------+     +--------+
	       | Amazon |     | Google |
	       +--------+     +--------+ 
	```

1. Collections Mystery. 5 points.

	| Two-Dimensional Array	Contents of List | Returned |
	| :--- | :--- |
	| `[[1, 2, 3], [4, 5, 6]]` | `[8, 17]` |
	| `[[3, 4], [1, 2, 3], [], [5, 6]]` | `[4, 8, 0, 6]` |
	| `[[1, 2, 3], [4, 5, 6], [7, 8, 9]]` | `[8, 17, 26]` |

1. Collections Programming. 5 points. retainEvenLength.

	```java
	public static void retainEvenLength(Set<String> set) {
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.length() % 2 != 0) {
				itr.remove();
			}
		}
	}
	```

1. Binary Trees. 10 points. hasPathSum.

	```java
	public boolean hasPathSum(int sum) {
		return hasPathSum(overallRoot, sum);
	}

	private boolean hasPathSum(IntTreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		if (root.data == sum) {
			return true;
		}
		int sum2 = sum - root.data;
		return hasPathSum(root.left, sum2) || hasPathSum(root.right, sum2);
	}
	```

1. Collections Programming. 10 points. recordScore.

	```java
	public static double recordScore(Map<String, List<Integer>> scores, String name, int score) {
		if (score < 0 || score > 30) {
			throw new IllegalArgumentException();
		}
		if (!scores.containsKey(name)) {
			scores.put(name, new LinkedList<Integer>());
		}
		scores.get(name).add(0, score);
		int total = 0;
		for (int i : scores.get(name)) {
			total += i;
		}
		return (int) Math.round((1000.0) * total / (scores.get(name).size() * 30)) / 10.0;
	}
	```

1. Comparable Class. 20 points. ClockTime.

	```java
	public class ClockTime implements Comparable<ClockTime> {
		private int hours;
		private int minutes;
		private String amPm;

		public ClockTime(int hours, int minutes, String amPm) {
			this.hours = hours;
			this.minutes = minutes;
			this.amPm = amPm;
		}

		public int compareTo(ClockTime other) {
			if (!amPm.equals(other.amPm)) {
				return amPm.compareTo(other.amPm);
			}
			else if (hours != other.hours) {
				return hours % 12 - other.hours % 12;
			}
			else {
				return minutes - other.minutes;
			}
		}

		public int getHours() {
			return hours;
		}

		public int getMinutes() {
			return minutes;
		}

		public String getAmPm() {
			return amPm;
		}

		public String toString() {
			String result = hours + ":";
			if (minutes < 10) {
				result += "0" + minutes;
			} else {
				result += minutes;
			}
			result += " " + amPm;
			return result;
		}
	}
	```

1. Binary Trees. 20 points. removeLeftLeaves.

	```java
	public void removeLeftLeaves() {
		removeLeftLeaves(overallRoot, false);
	}

	private IntTreeNode removeLeftLeaves(IntTreeNode root, boolean left) {
		if (root != null) {
			root.left = removeLeftLeaves(root.left, true);
			removeLeftLeaves(root.right, false);
			if (left && root.left == null && root.right == null) {
				root = null;
			}
		}
		return root;
	}
	```

1. Linked Lists. 20 points. increasingTriples.

	```java
	public boolean increasingTriples() {
		ListNode current = front;
		while (current != null && current.next != null && 
				current.next.next != null) {
			if (current.data >= current.next.data || 
					current.next.data >= current.next.next.data) {
				return false;
			}
			current = current.next.next.next;
		}
		if (current!= null && current.next != null && 
				current.data >= current.next.data) {
			return false;
		}
		return true;
	}
	```