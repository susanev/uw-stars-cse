_CSE 143_
# Exercise Answers
## Week 7

1. Comparable class, 20 points. BookData.

	```java
	public class BookData implements Comparable<BookData> {
		private String title;
		private String author;
		private int reviews;
		private double total;

		public BookData(String title, String author) {
			this.title = title;
			this.author = author;
			this.reviews = 0;
			this.total = 0.0;
		}

		public void review(double rating) {
			reviews++;
			total += rating;
		}

		public String getTitle() {
			return title;
		}

		public double getRating() {
			if (reviews == 0)
				return 0.0;
			else
				return total / reviews;
		}

		public String toString() {
			double rating = (int) (10.0 * getRating()) / 10.0;
			String result = title + ", by " + author + ", " + rating + " (";
			if (reviews == 1)
				result += "1 review)";
			else
				result += reviews + " reviews)";
			return result;
		}

		public int compareTo(BookData other) {
			double delta = other.getRating() - getRating();
			if (delta < 0)
				return -1;
			else if (delta > 0)
				return 1;
			else // delta == 0
				return other.reviews - reviews;
		}
	}
	```

1. Comparable class, 20 points. Office.

	```java
	public class Office implements Comparable<Office> {
		private double width;
		private double length;
		private boolean couch;
		private int windows;

		public Office(double width, double length, boolean couch, int windows) {
			this.width = width;
			this.length = length;
			this.couch = couch;
			this.windows = windows;
		}

		public boolean isCorner() {
			return width == length && windows == 2;
		}

		public String toString() {
			String output = "width: " + width + ", length: " + length + ", windows: " + windows;
			if (couch) {
			output += ", has a couch";
			}
			return output;
		}

		public int compareTo(Office other) {
			double area = width * length;
			double otherArea = other.width * other.length;
			if (area == otherArea) {
				if (windows != other.windows) {
					return other.windows - windows;
				} else {
					if (couch && !other.couch) {
						return -1;
					} else if (!couch && other.couch) {
						return 1;
					} else {
						return 0;
				}
			}
			} else if (area > otherArea) {
				return -1;
			} else {
				return 1;
			}   
		}
	}
	```