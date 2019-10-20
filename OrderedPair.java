public class OrderedPair<T> implements Pairable<T> {
    private T first;
    private T second;

    /**
     * Constructor, note: no <T> after constructor name
     * 
     * @param firstItem  Generic type to be entered first
     * @param secondItem Generic type to be entered second
     */
    public OrderedPair(T firstItem, T secondItem) {
        first = firstItem;
        second = secondItem;
    }// end constructor

    /**
     * @return First Value
     */
    public T getFirst() {
        return first;
    }// end getFirst

    /**
     * @return Second Value
     */
    public T getSecond() {
        return second;
    }// end getSecond

    /**
     * @return String representation in an ordered pair
     */
    public String toString() {
        return "(" + first + ", " + second + ")";
    }// end toString

    /**
     * Interchanges the object in the pair
     */
    public void changeOrder() {
        T temp = first;
        first = second;
        second = temp;
    }// end ChangeOrder
}// end OrderedPair