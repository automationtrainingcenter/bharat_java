package abstraction;

public class InterfaceImpl implements InterfaceDemo{

    @Override
    public void methodOne() {
        System.out.println("method one definition in implementation class");
    }

    @Override
    public void methodTwo() {
        System.out.println("method two definition in implementation class");
    }
}
