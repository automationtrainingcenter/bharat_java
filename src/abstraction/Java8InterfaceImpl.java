package abstraction;

public class Java8InterfaceImpl implements Java8Interface {

    @Override
    public void methodOne() {
        System.out.println("method one definition in implementation class");
    }

    @Override
    public void methodThree() {
        System.out.println("method three definition within the implementation class");
    }
}
