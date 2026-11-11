import java.util.ArrayList;
import java.util.List;
/**
 * A min-heap. 
 * 
 * Must contain functionality for the following: (n = # of elements in heap)
 * 
 * Adding a new value to the heap  O(log(n))
 * Popping the front of the heap O(log(n))
 * Peeking at the front of the heap without removing the element O(1)
 * Getting the size of the heap O(1)
 * Checking whether the heap is empty O(1)
 * 
 * 
 * The Heap must hold ints
 * 
 * Use List/ArrayList as a backing array, but DO NOT use the 
 * PriorityQueue class. Do not make Node objects, use array
 * indexing instead.
 * 
 * It is up to you to make design decisions about how to:
 *  - name methods
 *  - determine return value and argument types
 *  - hold private instance variables
 */
public class Heap {
    private final List<Integer> data;

    //make an empty heap
    public Heap(){
        data = new ArrayList<>();
    }

    // return the size of things in the heap
    public int size() {
        return data.size();
    }

    // return if the heap is empty or not
    public boolean isEmpty(){
        return data.isEmpty();
    }

    // return index of parent of the given index
    private int parent(int index){
        return (index -1)/2;
    }

    // return the index of the right child of the index
    private int rightChild(int index){
        return index * 2 + 2;
    }

    // retur the index of the left child of the given index
    private int leftChild(int index){
        return index * 2 + 1;
    }

    // use to switch value at index between two index
    // private int switch ( int index , int index2) 
}