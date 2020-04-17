package abstraction;

public interface Outer {

    void oMethod();

    Inner methodOne();

    interface Inner{
        void iMethod();
    }

}
