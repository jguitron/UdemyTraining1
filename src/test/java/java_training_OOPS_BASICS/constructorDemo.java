package java_training_OOPS_BASICS;

public class constructorDemo {
    //demo
    public constructorDemo()
    {
        System.out.println("I am the in the constructor");
        System.out.println("I am the in the constructor lecture 1");

    }
    //parameterized constructor
    public constructorDemo(int a, int b)
    {
        System.out.println("I am in the parameterized constructor");
        int c =a+b;
        System.out.println(c);
    }

    public constructorDemo(String str)
    {
        System.out.println(str);

    }

    public void getData ()
        {
            System.out.println("I am the method");
        }
        //will not return values
    //name of constructor should be the class name
    public static void main (String[]args){
            constructorDemo cd = new constructorDemo("hello");
            constructorDemo cds = new constructorDemo();
            constructorDemo c = new constructorDemo(4,5);

        }
    }
