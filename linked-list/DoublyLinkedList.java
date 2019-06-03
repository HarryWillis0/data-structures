/**
 * A doubly linked list implementation
 * 
 * @author Harry Willis
 */
public class DoublyLinkedList<T extends Object> implements LinkedList<T>{
    
    private Node<T> head;
    
    private Node<T> tail;

    private int size;

    /** 
     * Construct defualt empty list
    */
    public DoublyLinkedList() {
        this(null);
    }

    /**
     * Construct list with specified first item
     */
    public DoublyLinkedList(T item) {
        this.head = new Node<T>(item);

        this.tail = this.head;
    }
    
    /**
     * add(int index, T item)
     * Inserts item into specified position
     * If index is too large - item is appended to end of list
     * @param index of position 
     * @param item to be added
     * @throws exception if invalid index
     */
    public void add(int index, T item) throws Exception {

    }

    /**
     * clear()
     * Removes all items from list
     */
    public void clear() {
        this.head = null;

        this.tail = this.head;
    }

    /**
     * contains(T item)
     * Returns true if list contains item
     * @param item to be found
     * @return true if found, false otherwise
     */
    public boolean contains(T item) {
        return false;
    }

    /**
     * get(int index)
     * Returns item at specified position in list
     * @param index of position
     * @return item at position
     * @throws exception if list empty or index out of range.
     */
    public T get(int index) throws Exception {
        return null;
    }   

    /**
     * indexOf(T item)
     * Returns index of item in list
     * @param item to find
     * @return index of item if found, -1 otherwise
     * @throws exception if list empty
     */
    public int indexOf(T item) throws Exception {
        return -1;
    }

    /**
     * peek()
     * Retrieves first item without removing it
     * @return first item
     * @throws exception if list empty
     */
    public T peek() throws Exception {
        return null;
    }

    /**
     * remove(int index)
     * Removes item at specified index
     * @param index of item in list
     * @return the item
     * @throws exception if index invalid or list empty
     */
    public T remove(int index) throws Exception {
        return null;
    }

    /**
     * set(int index, T item)
     * Replaces element at index with specified item
     * @param index of item to be replaced in list
     * @param item to replace with
     * @return item previously in list
     * @throws exception if invalid index or list empty
     */
    public T set(int index, T item) throws Exception {
        return null;
    }

    /**
     * swap(int i, int j)
     * Swaps the elements at positions i and j
     * @throws exception if list empty or invalid indices
     */
    public void swap(int i, int j) throws Exception {

    }

    /**
     * size()
     * Retrieve number of elements in list
     * @return number of elements in list
     */
    public int size() {
        return this.size;
    }

    /**
     * toString()
     * Retrieve list in string form 
     * @return String representation of list
     */
    public String toString() {
        if(this.size == 0) {
            return "[]";
        }

        String s = "[" + this.head.getData();
        
        Node<T> temp = this.head;
        while(temp.next() != null) {
            temp = temp.next();
            s += ", " + temp.getData();
        }

        temp = null;
        
        return s += "]";
    }
}