package chamrattt.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        // Remove Element after Add
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Tow");
        set.add("Three");
        set.add("Seven");
        set.add("Five");
        set.add("Six");
        set.add("Seven");
        System.out.println("Before Remove "+set);
        set.remove("Seven");
        System.out.println("After Remove "+set);
        HashSet<String> set1 = new HashSet<String>();

        set1.add("Nine");
        set1.add("Ten");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);

        set.removeIf(s -> s.contains("Five"));
        System.out.println("After invoking removeIf() method: "+set);


    }
}
