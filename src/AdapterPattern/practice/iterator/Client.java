package AdapterPattern.practice.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> iterator = new EnumerationIterator<>(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
