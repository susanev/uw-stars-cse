// AbstractIntList provides a skeletal implementation of the IntList class.
// Many operations are defined in terms of the list iterator.  Subclasses
// need to define size(), get(int index), add(int value), add(index, value),
// remove(index), set(index, value), clear(), and iterator().

import java.util.*;

public abstract class AbstractIntList implements IntList {
    // post: returns a comma-separated, bracketed version of the list
    public String toString() {
        Iterator<Integer> i = iterator();
        String result = "[";
        if (i.hasNext()) {
            result += i.next();
            while (i.hasNext())
                result += ", " + i.next();
        }
        result += "]";
        return result;
    }

    // post : returns the position of the first occurence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        for (int i: this) {
            if (i == value)
                return index;
            index++;
        }
        return -1;
    }

    // post: returns true if list is empty, false otherwise
    public boolean isEmpty() {
        return !iterator().hasNext();
    }

    // post: returns true if the given value is contained in the list,
    //       false otherwise
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    // post: appends all values in the given list to the end of this list
    public void addAll(IntList other) {
        for (int i: other)
            add(i);
    }

    // post: removes all occurrences of the values in the given list from
    //       this list
    public void removeAll(IntList other) {
        Iterator<Integer> i = iterator();
        while (i.hasNext())
            if (other.contains(i.next()))
                i.remove();
    }

    // post: throws an exception if the given index is out of range
    protected void checkIndex(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("index: " + index);
    }
}
