package finalkeyword;
/*
Final keyword can be used to declare a variable or a method or a class.

if we declare a variable as a final then we can not change the value of that variable. So to create
constant variables we can use final keyword.

if we declare a method as final in parent class then we can not override that method within the child
class

if we declare a class as final, we can not create child classes to the final class but it can have parent
A final class can be a child class but it can not be a parent class.

 */
public class FinalKeywordDemo {

    public static void main(String[] args) {
        final int i = 10;
        System.out.println("final variable i = "+i);
//        i = 1000; // we can not assign new values to the final variables


        // create an object of MethodChild by giving object reference to the MethodParent
        // Object reference to the MethodParent and Object creation the MethodChild
        MethodParent pObj = new MethodChild();
        pObj.methodOne();
        pObj.methodTwo();

    }

}
