// This is the superclass of all of the Critter classes.  Your class should
// extend this class.  The class provides several kinds of constants:
//
//    type Neighbor  : WALL, EMPTY, SAME, OTHER
//    type Action    : HOP, LEFT, RIGHT, INFECT
//    type Direction : NORTH, SOUTH, EAST, WEST
//
// Override the following methods to change the behavior of your Critter:
//
//     public Action getMove(CritterInfo info)
//     public Color getColor()
//     public String toString()
//
// The CritterInfo object passed to the getMove method has the following
// available methods:
//
//     public Neighbor getFront();            neighbor in front of you
//     public Neighbor getBack();             neighbor in back of you
//     public Neighbor getLeft();             neighbor to your left
//     public Neighbor getRight();            neighbor to your right
//     public Direction getDirection();       direction you are facing
//     public Direction getFrontDirection();  direction of front neighbor
//     public Direction getBackDirection();   direction of back neighbor
//     public Direction getLeftDirection();   direction of left neighbor
//     public Direction getRightDirection();  direction of right neighbor

import java.awt.*;

public class Critter {
    public static enum Neighbor {
        WALL, EMPTY, SAME, OTHER
    };

    public static enum Action {
        HOP, LEFT, RIGHT, INFECT
    };

    public static enum Direction {
        NORTH, SOUTH, EAST, WEST
    };

    // This method should be overriden (default action is turning left)
    public Action getMove(CritterInfo info) {
        return Action.LEFT;
    }

    // This method should be overriden (default color is black)
    public Color getColor() {
        return Color.BLACK;
    }

    // This method should be overriden (default display is "?")
    public String toString() {
        return "?";
    }

    // This prevents critters from trying to redefine the definition of
    // object equality, which is important for the simulator to work properly.
    public final boolean equals(Object other) {
        return this == other;
    }
}