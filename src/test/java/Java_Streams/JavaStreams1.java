package Java_Streams;

import javax.xml.stream.StreamFilter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class JavaStreams1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("glittergarret");
        names.add("Jaime");
        names.add("susan");
        names.add("spider");
        names.add("salad");
        int count = 0;

        for (int i = 0; i <names.size(); i++)
        {
            String actual = names.get(i);
            if (actual.startsWith("s"))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public void StreamFilter ()
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("glittergarret");
        names.add("Jaime");
        names.add("susan");
        names.add("spider");
        names.add("salad");
        //there is no life for intermiate op if there is no terminal op
        //terminal operation will execute only if inter op (filter) returns true
        //how to use filter in stream API

        Long c = names.stream().filter(s -> s.startsWith("J")).count();
        System.out.println(c);

        Long d = Stream.of("glittergarret", "Jaime", "susan", "spider", "salad").filter(s ->
        {
            s.startsWith("s");
            return true;
        } ).count();
        System.out.println(d);

        //print all the names of ArrayList
//        names.stream().filter(s-> s.length()>4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));
    }


}
