package java_training_OOPS_BASICS;

public class superKeyWordChild extends superKeyWordParent {
    String name = "QAClickAcademy";
    public void getStringData()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
    public superKeyWordChild()
    {
        super(); //this should always be at the first line, this is how to call class from parent
        System.out.println("child class constructor");
    }
    public void getData()
    {
        super.getData();
        System.out.println("I am in child class");
    }
    public static void main(String[] args)
    {
        superKeyWordChild cd = new superKeyWordChild();

        cd.getStringData();
        cd.getData();
    }
}
