package polymorphism;

/*
    Polymorphism means one object behaving differently based on input or based on environment
  We have two types of polymorphism

  1. Compile time polymorphism:
  	it is also known as method overloading
  We can achieve method overloading within a class either
  1. by changing number of inputs of a method or
  2. by changing type of inputs
  3. by changing sequence of inputs

  Note: By changing only the return type of a method we can't achieve method overloading

  2. Runtime polymorphism:
  	it is also known as method overriding
  	we can achieve method overriding using inheritance. We can override a method of parent class within
  child class.
 */

public class PolymorphismDemo {

    public static void main(String[] args) {
        // create an object of CompileTimePolyDemo class
        CompileTimePolyDemo obj = new CompileTimePolyDemo();
        obj.methodOne(10, 20); // 30
        obj.methodOne(10, "java"); // 10java
        obj.methodOne("surya", 10, 20); // surya1020
        obj.methodOne("java", 25); // java25


        // create an object of RunTimePolyParent
        RunTimePolyParent rpObj = new RunTimePolyParent();
        rpObj.methodOne("10", 20); // 1020

        // create an object of RunTimePolyChild
        RunTimePolyChild rcObj = new RunTimePolyChild();
        rcObj.methodOne("10", 20); // 30

        // create an object to child class but giving object reference to the parent class
        RunTimePolyParent rpcObj = new RunTimePolyChild();
        rpcObj.methodOne("10", 20); // 30

    }

}
