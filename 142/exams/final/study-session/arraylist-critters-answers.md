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
1. Ferret. One possible answer is shown below.

	```java
	public class Ferret extends Critter {
		private Random r;
		private int infect;

		public Ferret() {
			r = new Random();
			infect = 0;
		}

		public Action getMove(CritterInfo info) {
			if (info.getFront() == Neighbor.OTHER) {
				infect = 5;
				return Action.INFECT;
			} else {
				infect = Math.max(infect - 1, 0);
				if (info.getFront() == Neighbor.EMPTY) {
					return Action.HOP;
				} else if (r.nextInt(2) == 0){
					return Action.RIGHT;
				} else {
					return Action.LEFT;
				}
			}
		}

		public Color getColor() {
			if (infect == 0) {
				return Color.BLUE;
			} else {
				return Color.RED;
			}
		}      

		public String toString() {
			return "I=" + infect;
		}
	}
	```

2. Koala. One possible answer is shown below.

	```java
	public class Koala extends Critter {
		private boolean fighter;
		private int hopCount;

		public Koala(boolean fighter) {
			this.fighter = fighter;
			hopCount = 0;
		}

		public Action getMove(CritterInfo info) {
			if (info.getFront() == Neighbor.OTHER && fighter) {
				return Action.INFECT;
			} else if (hopCount < 3) {
				if (info.getFront() == Neighbor.EMPTY) {
					hopCount++;
					return Action.HOP;
				} else {
					return Action.RIGHT;
				}
			} else {
				hopCount = 0;
				return Action.LEFT;
			}
		}

		public Color getColor() {
			return Color.GRAY;
		}      
	}
	```

3. Eagle. One possible answer is shown below.

	```java
	public class Eagle extends Critter {
		private int multiplier;
		private int colorCount;
		private boolean isRed;

		public Eagle() {
			multiplier = 1;
			colorCount = 0;
			isRed = true;
		}

		public Action getMove(CritterInfo info) {
			colorCount++;
			if (colorCount == multiplier) {
				colorCount = 0;
				if (!isRed) {
					multiplier++;
				} 
				isRed = !isRed;
			}

			if (info.getFront() == Neighbor.EMPTY) {
				return Action.HOP;
			} else if (info.getFront() == Neighbor.WALL) {
				return Action.RIGHT;
			} else {
				return Action.INFECT;
			}            
		}

		public Color getColor() {
			if (isRed) {
				return Color.RED;
			} else {
				return Color.BLUE;
			}
		}      

		public String toString() {
			return "<>";
		}
	}
	```