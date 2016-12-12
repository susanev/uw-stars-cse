import java.util.*;
import java.awt.*;

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