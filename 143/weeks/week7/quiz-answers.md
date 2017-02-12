_CSE 143_
# Quiz Answers
## Week 7

### Do these on your own

1. Collections Mystery, 5 points.

	| Method Call | Value Returned |
	| :--- | :--- |
	| `mystery(grid, 5);` | `5` | 
	| `mystery(grid, 3);` | `22` | 
	| `mystery(grid, 1);` | `24` | 

1. Collections Programming, 5 points. acronymFor.

	```java
	public String acronymFor(List<String> words) {
		String acronym = "";
		for (String next : words) {
			acronym += next.toUpperCase().charAt(0);
		}
		return acronym;
	}
	```

### We will do these together

1. Binary Tree Traversals, 6 points. 

	| Traversal | Result |
	| :--- | :--- |
	| Preorder traversal | `0, 3, 1, 2, 5, 8, 9, 4, 7, 6` |
	| Inorder traversal | `1, 3, 5, 2, 8, 0, 9, 7, 4, 6` |
	| Postorder traversal | `1, 5, 8, 2, 3, 7, 6, 4, 9, 0` |

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