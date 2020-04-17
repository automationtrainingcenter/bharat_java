package abstraction;

/*
This is a Java8 interface with concrete static and default methods
 */
public interface Java8Interface {

    // abstract
    void methodOne();

    // static method
    public static void methodTwo(){
        System.out.println("static method definition within the interface");
    }


    // default method
    public default void methodThree(){
        System.out.println("default method definition within the interface");
    }
}
