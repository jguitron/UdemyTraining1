package java_training_OOPS_BASICS;

public class Austrillian_Traffic implements CentralTraffic{
    public static void main(String[] args) {

    }

    @Override
    public void greenGo() {
        System.out.println("Green go implementation");
    }

    @Override
    public void redStop() {
        System.out.println(" redstop implementation ");
    }

    @Override
    public void FlashYellow() {
        System.out.println(" flash yellow implementation ");
    }
}
