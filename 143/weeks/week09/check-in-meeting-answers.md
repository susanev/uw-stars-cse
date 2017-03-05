_CSE 143_
# Check-in Meeting Answers
## Week 9

1. hasDuplicates

	```java
	public boolean hasDuplicates() {
		ListNode current = front;
		while (current != null) {
			ListNode comparison = current.next;
			while (comparison != null) {
				if (comparison.data == current.data) {
					return true;
				}
				else {
					comparison = comparison.next;
				}
			}
			current = current.next;
		}
		return false;
	}
	```

1. addListAt

	```java
	public void addListAt(ListNode list, int index) {
		if (index < 0) {
			throw newIllegalArgumentException("index negative");
		}
		if (list != null) {
			ListNode oldListAfterIndex = front;
			ListNode oldListBeforeIndex = null;
			for(int i = 0; i < index; i++) {
				if (oldListAfterIndex == null) {
					throw new IllegalArgumentException("index beyond list");
				}
				oldListBeforeIndex = oldListAfterIndex;
				oldListAfterIndex = oldListAfterIndex.next;
			}
			ListNode newListLast = list;
			while (newListLast.next != null) {
				newListLast = newListLast.next;
			}
			if (oldListBeforeIndex == null) {
				front = list;
			}
			else {
				oldListBeforeIndex.next = list;
			}
			newListLast.next = oldListAfterIndex;
		}
	}
	```

1. countPathsOfLength

	```java
	public int countPathsOfLength(int length) {
		return countPathsOfLength(this.root, length);
	}

	private int countPathsOfLength(IntTreeNode current, int length) {
		if (current == null && length != 0) {
			return 0;
		}
		else if (current == null && length == 0) {
			return 1;
		}
		else {
			return countPathsOfLength(current.left, length − 1) + 
					countPathsOfLength(current.right, length − 1);
		}
	}
```
