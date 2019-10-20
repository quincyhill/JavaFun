/**
 * 
 * @author Quincy Hill
 * @since 4/8/19
 */
public class Pair<S, T> {

    private S first;
    private T second;

    public Pair(S firstItem, T secondItem) {
        first = firstItem;
        second = secondItem;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        /*
         * Name joe = new Name("Joe","Java"); String joePhone = "(401) 555-1234";
         * Pair<Name, String> joeEntry = new Pair<>(joe,joePhone);
         * System.out.println(joeEntry);
         */
        Pair<Integer, Double> test0 = new Pair<>(4, 3.4);
        System.out.println(test0.toString());
    }
}