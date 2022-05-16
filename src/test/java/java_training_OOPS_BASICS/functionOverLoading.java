package java_training_OOPS_BASICS;
//function overloading
//either argument count should be different or argument data type should be different
public class functionOverLoading {

    public void getData (int a) {
        System.out.println(a);

    }

    public void getData (String a) {
        System.out.println(a);

    }
    public void getData(int a, int b) {
        System.out.println(b);
    }


    public static void main(String[] args) {
        functionOverLoading cl = new functionOverLoading();
        cl.getData(2);
        cl.getData("hello");
        cl.getData(2, 5);

    }
}
