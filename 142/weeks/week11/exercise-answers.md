# Exercise Answers
## Week 11

1. One possible answer is shown below.

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

2. One possible answer is shown below.

	```java
	public static void manyStrings(ArrayList<String> list, int n) {
		for (int i = 0; i < list.size(); i+=n) {
			String word = list.get(i);
			for (int j = 1; j < n; j++) {
				list.add(i + j, word);
			}   
		}
	}
	```

3. One possible answer is shown below.

	```java 
	public static boolean allPlural(String[] list) {      
		for (int i = 0; i < list.length; i++) {
			if (!list[i].toLowerCase().endsWith("s")) {
				return false;
			}
		}
		return true;      
	}
	```