// The CritterInfo interface defines a set of methods for querying the
// state of a critter simulation.  You should not alter this file.  See
// the documentation in the Critter class for a more detailed explanation.

public interface CritterInfo {
    public Critter.Neighbor getFront();
    public Critter.Neighbor getBack();
    public Critter.Neighbor getLeft();
    public Critter.Neighbor getRight();
    public Critter.Direction getDirection();
    public Critter.Direction getFrontDirection();
    public Critter.Direction getBackDirection();
    public Critter.Direction getLeftDirection();
    public Critter.Direction getRightDirection();
}
