_CSE 143_

# Collections Programming Hard
## Final Study Session

1. Write a method named whereInTheWorld that accepts two parameters:
	1. a String representing the name of a person
	1. a Map in which keys represent names of cities and values represent the set of which friends have visited the city

	Your method should return a set of the cities where the given person has been. The set returned should be sorted alphabetically.

	For example, given the following map called places:

	```
	{"Joe"=["New York", "San Francisco"], "Samantha"=["London"],
	 "Elias"=["London", "New York", "San Francisco", "Singapore"],
	 "Myra"=["Beijing", "Beirut", "Nashville", "Phoenix"]}
  ```

	The call to whereInTheWorld("New York", places) should return the set:

	```
	["Joe", "Elias"]
	```

	because Joe and Elias have visited New York.

	Your method should return only names that match the city exactly, including case. Your method should not modify the contents of the map. You may assume that the map passed to your method is not null and that it does not contain any null values.

1. Write a method byAge that accepts three parameters: 1) a Map where each key is a person's name (a string) and the associated value is that person's age (an integer); 2) an integer for a minimum age; and 3) an integer for a max age. Your method should return a new map with information about people with ages between the min and max, inclusive.

	In your result map, each key is an integer age, and the value for that key is a string with the names of all people at that age, separated by "and" if there is more than one person of that age. Include only ages between the min and max inclusive, where there is at least one person of that age in the original map. If the map passed in is empty, or if there are no people in the map between the min/max ages, return an empty map.

	For example, if a Map named ages stores the following key=value pairs:

	```
	{Paul=28, David=20, Janette=18, Marty=35, Stuart=98, Jessica=35, Helene=40, 
	Allison=18, Sara=15, Grace=25, Zack=20, Galen=15, Erik=20, Tyler=6, Benson=48}
	```

	The call of byAge(ages, 16, 25) should return the following map (the contents can be in any order):

	```
	{18=Janette and Allison, 20=David and Zack and Erik, 25=Grace}
	```

	For the same map, the call of byAge(ages, 20, 40) should return the following map:

	```
	{20=David and Zack and Erik, 25=Grace, 28=Paul, 35=Marty and Jessica, 40=Helene}
	```

	For full credit, obey the following restrictions in your solution. A solution that disobeys them can get partial credit. • You will need to construct a map to store your results, but you may not use any other structures (arrays, lists, etc.) as auxiliary storage. (You can have as many simple variables as you like.) • You should not modify the contents of the map passed to your method. • Your solution should run in no worse than O(N log N) time, where N is the number of pairs in the map.

1. Write a method extractShorterThan that takes as parameters a set of strings and an integer. The method will remove from the set all strings whose length is strictly less than the given integer length, and return those strings as a new set. For example, if the set s stored the following values:

	```
	[Basic, C, C++, Haskell, Java, Ruby, Scheme, VisualBasic]
	```

	and the following call is made:

	```java
	extractShorterThan(s, 5);
	```

	then the call should return the following set:

	```
	[C, C++, Java, Ruby]
	```

	and the original set s should store the following values after the call:

	```
	[Basic, Haskell, Scheme, VisualBasic]
	```

	Notice that the returned set organizes its contents in alphabetical order. You should throw an IllegalArgumentException if the integer passed as the parameter is less than 0. You may assume that the set you are given is not null and contains no null strings.

	You may construct iterator objects and a single set that you will return, but otherwise you should not construct any additional structured objects (no array, set, map, list, etc). You can have as many simple variables as you like. You are expected to use generics properly and declare variables using interface types when possible.