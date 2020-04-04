package methods_and_constructors;
/*
Method is a collection of statement or block of statements which are combined
together to perform specific task.

Every method will have three parts
1. method head or method declaration
2. method body or method definition
3. method call

Syntax for method head or method declaration and method body
access_modifier static (optional) return_type method_name(arg1, arg2, arg3 ... argN){
    statements of the method;
    these are method body;
    return output;
}

Here arguments and return type of the method are optional. if we want to give some input
to the method we can give that using arguments and if want some output from the method then
we can write return statement and return type in method head.

Syntax for method call
return_type var_name = method_name(para1, para2, para3 ... paraN);

based on the input and output of method, methods are 4 types
1. method without input and without output
2. method without input and with output
3. method with input and without output
4. method with input and with output


Note: Java compiler will not execute the statements inside the method definition or method body
until Java compiler see a method call statement by it's name.

Note: if a method is not returning anything then the return type of the method is void in method
declaration.
 */

public class MethodsDemo {

    // method without input and without output
    public void methodOne(){
        System.out.println("this is method one without any input or output");
    }


    // method without input and with output
    public boolean methodTwo(){
        System.out.println("this is method two without input but with boolean output");
        return true;
    }

    // method with input and without output
    public void methodThree(String name){
        System.out.println("this is method three with String input and without output");
        System.out.println("String input is "+name);
    }

    // method with input and with output
    public int methodFour(int a, int b){
        System.out.println("this is method with two integer inputs and with integer output");
        System.out.println("input a = "+a+" input b = "+b);
        System.out.println("this method returns sum of a and b");
        return a+b;
    }



    public static void main(String[] args) {
        System.out.println("inside the main method");
        // create of object of this class
        MethodsDemo obj = new MethodsDemo();
        obj.methodOne();
        boolean m2output = obj.methodTwo();
        System.out.println(m2output);
        obj.methodThree("sunshine");
        int m4output = obj.methodFour(10, 20); // alt + enter or control + 1 (Eclipse)
        System.out.println(m4output);
    }





}
