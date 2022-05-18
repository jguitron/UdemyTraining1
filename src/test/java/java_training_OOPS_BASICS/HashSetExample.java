package java_training_OOPS_BASICS;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
//        HashSet, TreeSet, LinkedHashSet, implements set interface
//        does not accept duplicate values
//        there is no guarantee store in sequential order..random order
        HashSet <String> hs = new HashSet <String>();
        hs.add("USA");
        hs.add("UK");
        hs.add("MEXICO");
        hs.add("PHL");
        hs.add("Germany");
        System.out.println(hs);
//        System.out.println(hs.remove("UK"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

        Iterator<String> i = hs.iterator();
//        has next will check if the next value has the specific value
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
