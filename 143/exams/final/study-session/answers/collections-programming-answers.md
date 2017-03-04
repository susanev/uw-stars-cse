_CSE 143_

# Collections Programming Answers
## Final Study Session

1. extractEqual. Two possible solutions are shown below.

	```java
	public Set<Point> extractEqual(Set<Point> data) {
		Set<Point> result = new HashSet<Point>();
		for (Point p : data)
			if (p.getX() == p.getY())
		result.add(p);
		return result;
	}
	```

	```java
	public Set<Point> extractEqual(Set<Point> data) {
		Set<Point> result = new HashSet<Point>();
		Iterator<Point> i = data.iterator();
		while (i.hasNext()) {
			Point p = i.next();
			if (p.getX() == p.getY())
				result.add(p);
		}
		return result;
	}
	```

1. convert. One possible solution appears below.

	```java
	public static Map<Integer, Integer> convert(int[] list) {
		Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
		for (int i = 0; i < list.length; i++) {
			if (list[i] != 0) {
				result.put(i, list[i]);
			}
		}
		return result;
	}
	```