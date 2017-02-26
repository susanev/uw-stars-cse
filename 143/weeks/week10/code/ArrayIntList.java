// ArrayIntList provides an implementation of the IntList interface backed by
// an array of int values.  The array is resized as needed.  The get and set
// methods are O(1) and adding at the end of the list has amortized O(1)
// performance.  Adding and removing in the middle of the list are O(n).

import java.util.*;

public class ArrayIntList extends AbstractIntList {
    private int[] elementData; // list of integers
    private int size;          // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("negative capacity");
        elementData = new int[capacity];
        size = 0;
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        ensureCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
    public void add(int index, int value) {
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--)
            elementData[i] = elementData[i - 1];
        elementData[index] = value;
        size++;
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++)
            elementData[i] = elementData[i + 1];
        size--;
    }

    // pre : 0 <= index < size()
    // post: replaces the integer at the given index with the given value
    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }

    // post: list is empty
    public void clear() {
        size = 0;
    }

    // post: ensures that the list has the given capacity; if not, the size is
    //       doubled (or more if given capacity is even larger)
    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity)
                newCapacity = capacity;
            int[] newList = new int[newCapacity];
            for (int i = 0; i < size; i++)
                newList[i] = elementData[i];
            elementData = newList;
        }
    }

    // post: returns an iterator for this list
    public Iterator<Integer> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<Integer> {
        private int position;      // current position within the list
        private boolean removeOK;  // whether it's okay to remove now

        // post: constructs an iterator for the given list
        public ArrayIterator() {
            position = 0;
            removeOK = false;
        }

        // post: returns true if there are more elements left, false otherwise
        public boolean hasNext() {
            return position < size();
        }

        // pre : hasNext() (throws NoSuchElementException if not)
        // post: returns the next element in the iteration
        public Integer next() {
            if (!hasNext())
                throw new NoSuchElementException();
            int result = get(position);
            position++;
            removeOK = true;
            return result;
        }

        // pre : next() has been called without a call on remove (i.e., at most
        //       one call per call on next; throws IllegalStateException if
        //       not)
        // post: removes the last element returned by the iterator
        public void remove() {
            if (!removeOK)
                throw new IllegalStateException();
            ArrayIntList.this.remove(position - 1);
            position--;
            removeOK = false;
        }
    }
}
