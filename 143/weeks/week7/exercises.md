_CSE 143_
# Exercises
## Week 7

1. Comparable class, 20 points. Define a class called BookData that keeps track of information for a book and how it is rated by customers (real numbers between 0.0 and 5.0). The class has the following public methods:

	| Method | Description |
	| :--- | :--- |
	| BookData(title, author) | constructs a BookData object with the given title and author |
	| review(rating) | records a review for the book with given rating |
	| getTitle() | returns the title of the book |
	| getRating() | returns the average of all ratings (0.0 if none) |
	| toString() | returns a String with title, author, average rating, and number of ratings |
   
	Below is an example for a book that has been reviewed four times:

	```java
	BookData book = new BookData("1984", "George Orwell");
	book.review(4.7);
	book.review(5);
	book.review(4.9);
	book.review(4.9);
	```

	After these calls, the call book.getRating() would return 4.875 (the average of the ratings). The toString method should return a string of the form:

	```
	<title>, by <author>, <rating> (<count> reviews)
	```

	In this string the rating should be truncated to a single digit after the decimal point (truncated, not rounded). For example, given the previous calls, book.toString() would produce:

	```
	"1984, by George Orwell, 4.8 (4 reviews)"
	```

	If a book has been reviewed just once, then toString should include the grammatically correct text "1 review" rather than "1 reviews".

	The BookData class should implement the Comparable<E> interface. Books that have a higher average rating should be considered "less" than other books so that they appear at the beginning of a sorted list. You should use the complete value of the average rating rather than the truncated value displayed by toString to determine the ordering. Books that have the same average rating should be ordered by the number of reviews, with books that have been reviewed more often considered "less" than books that have been reviewed less frequently.

1. Define a class called Office that keeps track of information about an office's features. The class should have the following public methods:

	| Method | Description |
	| :--- | :--- |
	| `public Office(double width, double length, boolean couch, int windows)` | constructs an Office object with the given width and length, couch (true or false) and number of windows |
	| `public boolean isCorner()` | returns true if the office is a corner office. A corner office is square (has the same width and length) and has exactly two windows. |
	| `public String toString()` | returns a string representing the office in the format: width: , length: , windows: . If the office has a couch ", has a couch" should be appended to the end of the string. |

	Examples:

	```java
	Office o1 = new Office (10.3, 10.3, true, 3);
	Office o2 = new Office (14.0, 6.7, false, 3);
	```

	A call on o1.toString() and o2.toString() would return, respectively:

	```
	width: 10.3, length: 10.3, windows: 3, has a couch
	width: 14.0, length: 6.7, windows: 2
	```

	Also make Office objects comparable to each other using the Comparable interface. Offices that have that have a greater area (width * length) should be considered "less" than other Offices so that they appear at the beginning of a sorted list. Offices that have the same area should be ordered by the number of windows they have, with Offices that have a greater amount of windows considered "less" than Offices that have less. If Offices still appear equal they should be compared by whether or not they have a couch. Offices with couches should be considered "less".