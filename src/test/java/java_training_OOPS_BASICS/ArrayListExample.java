package java_training_OOPS_BASICS;

import java.util.ArrayList;

public class ArrayListExample {
//    can accept duplicate values
//    ArrayList, LinkedList, vector- implementing List interface
//    array have fixed size, Where ArrayList can grow dynamically
//    you can access and insert any values in any index
    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<String>();
        a.add("Jaime");
        a.add("Java");
        System.out.println(a);
        a.add(0, "Student");
        System.out.println(a);
//        a.remove(1);
//        a.remove("Java");
//        a.removeAll(a);
//        System.out.println(a);
        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.contains("Java"));
        System.out.println(a.indexOf("Jaime"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());

    }
}
