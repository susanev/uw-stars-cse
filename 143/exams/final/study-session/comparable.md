_CSE 143_

# Comparable class
## Final Study Session

1. Define a class TeamData that keeps track of information for a team of students competing in a programming contest. The class has the following public methods:

	| Method | Description |
	| :--- | :--- |
	| `TeamData(name, problems)` | constructs a TeamData object with the given team name and the given number of problems |
	| `success(problem, time)` | record the successful completion of the given problem with the given time |
	| `solved()` | returns the total number of problems solved |
	| `time()` | returns the total time for problems solved |
	| `percentCorrect()` | returns the percent of problems solved |
	| `toString()` | returns a String with name, problems solved, total problems, and total time |

	Each time a team solves a problem, the success method for the team will be called once giving the problem number and the time for that problem. The TeamData object must keep track of the total number of problems solved and the sum of all of the times. It does NOT have to keep track of which problems have been solved. Below is an example of a typical usage:

	```java
	TeamData team1 = new TeamData("UW Red", 8);
	team1.success(3, 18);
	team1.success(4, 82);
	team1.success(6, 130);
	System.out.println(team1);
	```

	The println should produce the following output:

	```
	UW Red solved 3 of 8 in 230 minutes
	```

	Your toString method must exactly reproduce this format. After this interaction, the call team1.solved() would return 3, the call team1.time() would return 230, and the call team1.percentCorrect() would return 37.5.

	The TeamData class should implement the Comparable interface. Teams that perform better should be considered to be "less" than other teams so that they appear at the beginning of a sorted list. In general, the team that solves the most problems is considered the best, but when there is a tie for the number of problems solved, then total time determines the winner. The team with the lower total time wins in the case of a tie for total problems solved.

	You may assume that all values passed to your methods are valid and that the total number of problems is greater than 0.

1. Define a class RadioStation that can be used to store information about radio stations. For each station, you must keep track of its name (a string), its broadcast band (a string) and its station number (a real number). For example, there is a local station called KUOW that is an FM station broadcast on 94.9. Your class must have the following public methods:

	| Method | Description |
	| :--- | :--- |
	| `RadioStation(name, band, number)` | constructs a radio station with given name, band and station number |
	| `getName()` | returns the name | 
	| `getBand()` | returns the band |
	| `getNumber()` | returns the number |
	| `toString()` | returns a String representation of the radio station |
	| `simulcast(other)` | records the fact that this station and the other are simulcasts |

	The broadcast band can be any arbitrary string. For example, it might be "AM" versus "FM" or might include subdivisions like "FM 1" and "FM 2" or might include other text like "XM" for satellite radio.

	The toString method should return a String composed of the station name followed by the band followed by the station number. For example, if you were to construct the following station:

	```java
	RadioStation station = new RadioStation("KKNW", "AM", 1150.0);
	```

	then a call on station.toString() should return "KKNW AM 1150.0".

	The simulcast method is used to record a relationship between two stations that are broadcasting the same material, as in:

	```java
	RadioStation station1 = new RadioStation("KUOW", "FM", 94.9);
	RadioStation station2 = new RadioStation("KUOW", "AM", 1340);
	station1.simulcast(station2);
	```

	The call on simulcast indicates a link between the two stations. The link goes in both directions, so it shouldn't matter whether you make the call above or if you instead make the following call:

	```java
	station2.simulcast(station1);
	```

	A given station will have at most one simulcast relationship. When such a relationship exists, it should be included in the result of toString. Given the calls above, the call station1.toString() should return:

	```
	KUOW FM 94.9 (simulcast on AM 1340.0)
	```

	and the call station2.toString() should return:

	```
	KUOW AM 1340.0 (simulcast on FM 94.9)
	```

	Notice that the simulcast notation appears in parentheses and that we include just the band and station number. You are to exactly reproduce this format.

	Your class should implement the Comparable interface. Radio stations should be grouped together by band (e.g., AM stations grouped together and FM stations grouped together). Within a given band, the stations should be sorted by station number (e.g., FM 94.9 less than FM 96.5).

1. Define a class called AdmissionsEntry that keeps track of information for an admissions candidate and how that candidate is rated by reviewers (real numbers between 0.0 and 5.0). The class has the following public methods:

	| Method | Description |
	| :--- | :--- |
	| `AdmissionsEntry(id)` | constructs an AdmissionsEntry object with given ID |
	| `rate(rating)` | records a rating for the candidate |
	| `flag()` | indicates that the candidate should be discussed |
	| `getID()` | returns the ID of the candidate |
	| `getRating()` | returns the average rating (0.0 if no ratings) |
	| `toString()` | returns a String with ID and average rating |

	Below is an example for a candidate that has been reviewed four times:

	```java
	AdmissionsEntry entry = new AdmissionsEntry("2222222");
	entry.rate(3.75);
	entry.rate(3.65);
	entry.rate(3.8);
	entry.rate(3.75);
	entry.flag();
	```

	After these calls, the call entry.getRating() would return 3.7375 (the average of the ratings). The toString method should return a string composed of the ID, a colon, and the average rating rounded to 2 digits after the decimal point ("2222222: 3.74" for this example). If there are no ratings, then getRating and toString should indicate a rating of 0.0.

	Each AdmissionsEntry object should keep track of whether that candidate should be discussed by the admissions committee. Any candidate who receives a score of 4.0 or higher should be discussed even if their average rating is below 4.0. Notice also that a candidate can be flagged for discussion even if none of the ratings are 4.0 or higher, as in the example above.

	The AdmissionsEntry class should implement the Comparable<E> interface. Define the method so that when sorted, a list of entries will have students to be discussed appearing first followed by students not to be discussed. Within those groups, students with higher average ratings should appear earlier in the list. Students with the same discussion status and the same average rating should appear in increasing order by ID. Recall that values considered "less" appear earlier in a sorted list. You may not use Double objects or methods of the Double class to solve this problem.

	You may begin your solution to AdmissionsEntry below, but an extra page is provided for your answer after this page.

1. Define a class called RentalCar that represents cars that can be rented. Each rental car has a model, a name and the number of miles it has traveled. For example, there is a Mazda 3 for rent called Milo that has traveled 69834.2 miles. Your class must have the following public methods:

	| Method | Description |
	| :--- | :--- |
	| `public RentalCar(model, name, miles)` | constructs a rental car with the given  model, name and miles |                      
	| `public void setReplaced(other)` | stores a reference to the car that this car replaced |
	| `public boolean isReplacement()` | returns true if this car replaced another, false otherwise |
	| `public String toString()` | returns a String representation of the car |

	Your constructor should throw an IllegalArgumentException if the mileage passed to it is negative.

	The toString method returns a String composed of the model followed by a comma, followed by the car name, followed by a colon, followed by the mileage and the word "miles." For example, given the following declaration:

	```java
	RentalCar milo = new RentalCar("Mazda 3", "Milo", 69834.2);
	```

	The call milo.toString() should return:

	```
	Mazda 3, Milo: 69834.2 miles
	```

	If a car is a replacement for an existing rental car, that relationship can be set using the setReplaced method. For example, the following calls record that the car Milo replaced the car Salami:

	```java
	RentalCar salami = new RentalCar("Nissan Sentra", "Salami", 97348.1);
	milo.setReplaced(salami);
	```

	If a car is a replacement for another car, this relationship should be indicated in the replacement car’s toString. After the calls above, the call milo.toString() now returns:

	```
	Mazda 3, Milo: 69834.2 miles (replaced Nissan Sentra, Salami)
	```

	Notice that the replaced car appears in parentheses and is identified by its model and name only. Your toString must match this format exactly.

	Also make RentalCar objects comparable to each other using the Comparable<E> interface. RentalCar objects are compared by model in ascending order, breaking ties by mileage in ascending order. In other words, RentalCar objects will be grouped together by model in alphabetical order and within a given model, the cars will be sorted by mileage.
