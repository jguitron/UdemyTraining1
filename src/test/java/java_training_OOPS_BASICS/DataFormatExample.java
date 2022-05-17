package java_training_OOPS_BASICS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatExample {
    public static void main(String[] args) {
        //current date.current time.
        Date d = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("MM/d/yyyy HH:mm;ss");

        System.out.println(sdf.format(d));
        System.out.println(d.toString());


    }
}
