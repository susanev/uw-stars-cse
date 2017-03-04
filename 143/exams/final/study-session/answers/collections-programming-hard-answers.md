_CSE 143_

# Collections Programming Hard Answers
## Final Study Session

1. whereInTheWorld.

1. byAge. One possible solution appears below.

	```java
	public static Map<Integer, String> byAge(Map<String, Integer> ages, int min, int max) {
		Map<Integer, String> result = new TreeMap<Integer, String>();
		for (String name : ages.keySet()) {
			int age = ages.get(name);
			if (min <= age && age <= max) {
				if (result.containsKey(age)) {
					result.put(age, result.get(age) + " and " + name);
				} else {
					result.put(age, name);
				}
			}
		}

		return result;
	}
	```

1. extractShorterThan. One possible solution appears below.

	```java
	public static Set<String> extractShorterThan2(Set<String> s, int n) {
		Set<String> result = new TreeSet<String>();
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) {
			String word = iter.next();
			if (word.length() < n) {
				iter.remove();
				result.add(word);
			}
		}
		return result;
	}
	```