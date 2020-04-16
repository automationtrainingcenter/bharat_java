package abstraction;

public class MultipleInterfaceImpl implements InterfaceOne, InterfaceTwo {
    @Override
    public void methodOne() {
        System.out.println("Interface One method one definition in impl class");
    }

    @Override
    public void method() {
        System.out.println("method definition in impl class");
    }

    @Override
    public void methodTwo() {
        System.out.println("Interface Two method two definition in impl class");
    }


}
