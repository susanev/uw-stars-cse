# Quiz Answers
## Week 11

1. One possible answer is shown below.

	```java
	public class Chameleon extends Critter {
		private int moves;
		private Color c;
		private String display;

		public Chameleon() {
			moves = 0;
			c = Color.RED;
			display = "R";
		}

		public Action getMove(CritterInfo info) {
			moves++;
			if (moves % 3 == 0) {
				c = Color.RED;
				display  = "R";
				return Action.INFECT;
			} else if (moves % 3 == 1) {
				c = Color.WHITE;
				display = "W";
			} else {
				c = Color.BLUE;
				display = "B";
			}
			if (info.getFront() == Neighbor.EMPTY) {
				return Action.HOP;
			} else {
				return Action.RIGHT;
			}
		}

		public Color getColor() {
			return c;
		}

		public String toString() {
			return display;
		}
	}
	```

2. One possible answer is shown below.

	```java
	public static void removeAdjacentMatches(ArrayList<Integer> list) {
		for(int i = 0; i<list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				list.remove(i);
				i--;
			}
		}
	}
	```