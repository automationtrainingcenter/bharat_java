package polymorphism;
/*
This class explains compile time polymorphism
 */
public class CompileTimePolyDemo {

    public void methodOne(String a, int b){
        System.out.println(a+b);
    }

    // changing the number of inputs
    public void methodOne(String a, int b, int c){
        System.out.println(a+b+c);
    }

    // changing the type of inputs
    public void methodOne(int a, int b){
        System.out.println(a+b);
    }

    // changing the sequence of inputs
    public void methodOne(int a, String b){
        System.out.println(a+b);
    }

    // changing return type of the method
//    public String methodOne(String a, int b){
//        return "";
//    } /* only by changing the return type of a method we can't achieve method overloading */



}
