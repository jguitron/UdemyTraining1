package java_training_OOPS_BASICS;

public class superKeyWordThisDemo {
    int a = 2; //global variable

    public void getData()
    {
        int a = 3; //global variable
        int b = a+ this.a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        //this java refers to current object-object scope lies in class level
    }

    public static void main(String[] args) {
        superKeyWordThisDemo td=new superKeyWordThisDemo();
        td.getData();

    }
}
