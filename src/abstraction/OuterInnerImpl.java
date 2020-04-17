package abstraction;


public class OuterInnerImpl implements Outer, Outer.Inner {
    @Override
    public void oMethod() {
        System.out.println("outer interface method definition");
    }

    @Override
    public Inner methodOne() {
        return this;
    }

    @Override
    public void iMethod() {
        System.out.println("inner interface method definition");
    }
}
