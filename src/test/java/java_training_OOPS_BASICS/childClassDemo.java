package java_training_OOPS_BASICS;
//inheritance
//function over ridding from overloading
public class childClassDemo extends ParentClassDemo{
    public void audioSystem () {
        System.out.println("new audio child");
    }

    public void engine () {
        System.out.println("new engine ");
    }

    public void Color () {
        System.out.println("Color");
    }

    public static void main(String[] args) {
    childClassDemo cd = new childClassDemo();
    cd.Color();
    cd.brakes();
    cd.audioSystem();
    //function overriding - both have method same name same signature
    }
}
