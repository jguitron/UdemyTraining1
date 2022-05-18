package java_training_OOPS_BASICS;

public class StaticVar {

    String name;    //instance variables
    String address;
    static String city= "Florida"; //class variables
    static int i = 0;
    static {
        city="Tampa";
        i = 0;

    }

    StaticVar (String name, String address)
    {
        this.name = name;
        this.address=address;
        i++;
        System.out.println(i);


    }
    public void getAddress()
    {
        System.out.println(address+", "+city);
    }

    public static void getCity ()
    {
        System.out.println(city);    //static method will only accept static variables
    }



    public static void main(String[] args) {
        StaticVar obj = new StaticVar("Bob", "Tampa");
        StaticVar obj1 = new StaticVar("Bob", "Odessa");
        obj.getAddress();
        obj1.getAddress();
        StaticVar.getCity();
        StaticVar.i=4;
        obj.address="XYZ";
    }
}
