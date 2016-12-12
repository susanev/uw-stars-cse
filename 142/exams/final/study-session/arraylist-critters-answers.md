# ArrayList and Critters Answers
## Final Study Session

### ArrayList
1. removeShorterStrings. One possible answer is shown below.

	```java
	public static void removeShorterStrings(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).length() <= list.get(i + 1).length()) {
				list.remove(i);
			} else {
				list.remove(i + 1);
			}
		}
	}
	```

2. collapse. One possible answer is shown below.

	```java
	public static void collapse(ArrayList<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			list.add(i, "(" + list.get(i) + ", " + list.get(i + 1) + ")");
			list.remove(i + 1);
			list.remove(i + 1);
		}
	}
	```

3. expand. One possible answer is shown below.

	```java
	public static void expand(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int mult = list.remove(i) - 1;
			for (int j = 0; j < mult; j++) {
				list.add(i, list.get(i));
			}
			i += mult;
		}
	}
	```

### Critters
1.

2.

3.


