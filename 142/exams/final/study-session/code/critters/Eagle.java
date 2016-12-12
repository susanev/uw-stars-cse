import java.awt.*;

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