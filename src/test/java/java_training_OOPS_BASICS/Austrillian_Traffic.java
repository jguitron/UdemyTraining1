package java_training_OOPS_BASICS;
//interface
public class Austrillian_Traffic implements CentralTraffic, continentTraffic {
    public static void main(String[] args) {
    CentralTraffic a = new Austrillian_Traffic();
        a.redStop();
        a.FlashYellow();
        a.greenGo();

        Austrillian_Traffic at = new Austrillian_Traffic();
        continentTraffic ct = new Austrillian_Traffic();
        at.walkonsymbol();
        ct.trainsymbol();

    }

    @Override
    public void greenGo() {
        System.out.println("Green go implementation");
    }
    public  void  walkonsymbol () {
        System.out.println("Walking");
    }

    @Override
    public void redStop() {
        System.out.println(" redstop implementation ");
    }

    @Override
    public void FlashYellow() {
        System.out.println(" flash yellow implementation ");
    }

    @Override
    public void trainsymbol() {
        System.out.println("Stop if using bus");
    }
}
