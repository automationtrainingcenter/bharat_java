package abstraction;
/*
Abstract means existing in thoughts
Abstraction means hiding the implementation details of the methods i.e. method definition not
method declaration

We can achieve abstraction in two ways
Note: Abstract method is a method which is declared using abstract keyword and it contains only method
declaration and it does not contains any method definition.

1. Abstract classes
    Abstract class is a class which contains at least one abstract method and declared using abstract keyword.
    It is not mandatory that an abstract class must contain a abstract method. A normal Java class will
    extends this abstract class and provides definition to the abstract methods of the abstract class. If the
    normal java class failed to provide definition to any one abstract method of it's parent abstract class then
    this normal class also becomes abstract class.

    the level of abstraction using abstract classes is 0 to 100%

2. Interfaces
    Interface is like class which contains abstract methods only.
    Note: To declare an interface we have to use interface keyword not class keyword
    access_modifier interface interface_name{ ... }. We have to create a class which will
    implement all the abstract methods of the interface.

    public class ImplClass implements Interface{ }

    class "implements" interface, class can not "extends" interface

    the level of abstraction using interfaces is always 100%


Note: We can not create an object of an abstract class or an interface.

Multiple inheritance is not possible in Java using classes, but we can achieve using interfaces.

Java 8 Interfaces:
From Java8 onwards interfaces allows concrete methods i.e. methods with definitions
These methods are either static methods or default methods
Note: to create default methods we have to "default" keyword which is a new keyword introduced
in Java8.

static methods of an interface can be accessed using interface name. we can not override
static methods of an interface in implementation classes.
default methods of an interface can be accessed using interface object reference. we can
override default methods within implementation classes.

Inner interfaces:
inner interface is nothing but an interface with in another interface. A single class can implement
both outer and inner interfaces or two different classes also can implement outer and inner interfaces.

Functional Interfaces:
This is an interface which contains only one abstract method. it does not allow more than one abstract method
To create these interfaces we have to use FunctionalInterface annotation.
We can implement these functional interfaces in three ways
1. using normal java class
2. using anonymous class (The class which does not contains name)
3. using lambda expressions
Note: for lambda expressions refer to FuncInterfaceDemo interface.

*/

public class AbstractionDemo {
    public static void main(String[] args) {
        // abstract class
        AbstractClassDemo obj = new AbstractClassChild();
        obj.methodOne();
        obj.methodTwo();

        // interface
        InterfaceDemo iObj = new InterfaceImpl();
        iObj.methodOne();
        iObj.methodTwo();

        // multiple inheritance using interfaces
        // single class implementing multiple interfaces
        InterfaceOne i1Obj = new MultipleInterfaceImpl();
        i1Obj.methodOne();
        i1Obj.method();

        // Typecast InterfaceOne object reference to the InterfaceTwo object reference
        // so that we can call InterfaceTwo methods
        /*
        Note: we have to Typecast One interface object reference to the another interface object
        reference if and only if both the interfaces are implemented same class.
         */
//        InterfaceTwo i2Obj = (InterfaceTwo) i1Obj;
//        i2Obj.methodTwo();
        ((InterfaceTwo) i1Obj).methodTwo();

        // Java8 interfaces
        Java8Interface.methodTwo(); // static method
        // create an object reference to the interface
        Java8Interface j8Obj = new Java8InterfaceImpl();
        j8Obj.methodOne(); // abstract method
        j8Obj.methodThree(); // default method


        // Inner interfaces
        Outer oObj = new OuterInnerImpl();
        oObj.oMethod();

//        Outer.Inner inObj = (Outer.Inner) oObj;
//        inObj.iMethod();
//        ((Outer.Inner)oObj).iMethod();

//        Outer.Inner inObj = oObj.methodOne();
//        inObj.iMethod();
        oObj.methodOne().iMethod(); // object chaining


        // Functional interfaces implemented by normal java class
        FuncInterfaceDemo fnor = new FuncInterfaceImpl();
        fnor.methodOne();

        // Functional interface implemented by anonymous class
        FuncInterfaceDemo fanon = new FuncInterfaceDemo(){

            @Override
            public void methodOne() {
                System.out.println("method one implementation in ANONYMOUS class");
            }
        };

        fanon.methodOne();

        // Functional interface implemented by lambda expression
        FuncInterfaceDemo flam = () -> System.out.println("method one definition using LAMBDA expression");
        flam.methodOne();



    }
}
