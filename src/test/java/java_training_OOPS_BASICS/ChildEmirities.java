package java_training_OOPS_BASICS;

//Abstraction

public class ChildEmirities extends ParentAirCraft {
    public static void main(String[] args) {
        ChildEmirities c = new ChildEmirities();
        c.engine();
        c.SafetyGuidelines();
        c.bodyColor();
    }

    @Override
    public void bodyColor() {
        System.out.println("Red color on the body");
    }
}
