package java_training_OOPS_BASICS;

//Abstraction
public abstract class ParentAirCraft {

    public void engine () {
        System.out.println("Follow Engine Guidelines");
    }

    public void SafetyGuidelines () {
        System.out.println("Follow Safety Guidelines");
    }

    public abstract void bodyColor();
}
