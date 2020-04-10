package inheritance;
/*
    Inheritance means achieving or acquiring the properties and behaviour of one class (Parent or Super or Base) in
    another class (Child or Sub).
    To Create one class as parent to another class we have to use "extends" keyword.

    syntax:
    public class Child extends Parent{ }

    Whenever we are creating child class object, that child class object can access child class methods and also
    it's parent class methods.

    Note: we can't access Parent class private properties or methods using child class objects or Child class
    can't inherit Parent class private properties and methods.

    There are 5 types of inheritance
    1. single : single parent and single child

    class A {
        methodOne() { }
    }

    A a = new A();
    a.methodOne();

    class B extends A{
        methodTwo() { }
    }

    B b = new B();
    b.methodTwo();
    b.methodOne();

    2. multi level : Grand parent and parent and child and sub child and so on

    class A {
        methodOne() { }
    }

    A a = new A();
    a.methodOne();

    class B extends A{
        methodTwo() { }
    }

    B b = new B();
    b.methodTwo();
    b.methodOne();

    class C extends B{
        methodThree(){ }
    }

    C c = new C();
    c.methodThree();
    c.methodTwo();
    c.methodOne();

    3. hierarchical : single parent and multiple child
    class A {
        methodOne() { }
    }

    A a = new A();
    a.methodOne();

    class B extends A{
        methodTwo() { }
    }

    B b = new B();
    b.methodTwo();
    b.methodOne();

    class C extends A{
        methodThree(){ }
    }

    C c = new C();
    c.methodThree();
    c.methodOne();


    4. multiple : multiple parent and single child

    class C extends A, B { }
    Java compiler will give a syntax error

    5. hybrid ( hierarchical and multiple)

    Java uses constructor concept to achieve inheritance.

 */

public class InheritancesDemo {

    public static void main(String[] args) {
        // single inheritance
        Parent pObj = new Parent();
        pObj.methodOne();

        ChildOne cObj = new ChildOne();
        cObj.methodTwo(); // ChildOne
        cObj.methodOne(); // Parent

        // multi level inheritance
        SubChild scObj = new SubChild();
        scObj.methodThree(); // SubChild
        scObj.methodTwo(); // ChildOne
        scObj.methodOne(); // Parent

        // hierarchical inheritance
        ChildTwo c2Obj = new ChildTwo();
        c2Obj.methodFour(); // ChildTwo
        c2Obj.methodOne(); // Parent











    }
}
