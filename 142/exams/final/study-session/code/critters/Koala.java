import java.util.*;
import java.awt.*;

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