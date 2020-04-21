package abstraction;


@FunctionalInterface
public interface FuncInterfaceDemo {

    void methodOne();

}
/*
Before Java 8 we don't have any FunctionalInterface annotation but we have interfaces
which contains single abstract method. The FunctionalInterface annotation make sure
our interface contains only one abstract method. These Functional interfaces are also
known as SAM (Single Abstract Method) interfaces.
 */

/*
LAMBDA EXPRESSIONS

lambda expression means method definitions as a single statement.

1.  void methodOne(){
        sout();
    }

    () -> sout();

    or

    void methodOne(){
        statement1;
        statement2;
        statement3;
    }

    () -> { statement1;
        statement2;
        statement3;
    };

2.  void methodTwo(int a, int b){
        sout(a+b);
    }

    (int a, int b) -> sout(a+b);

3.  int methodThree(){
        return 10;
    }

    () -> 10;
    or
    () -> { return 10; };

    int methodThree(){
        statement1;
        statement2;
        statement3:
        return 1000;
    }

    () -> {
        statement1:
        statement2;
        statement3;
        return 1000;
    };

4. int methodFour(int a, int b){
        return a+b;
   }

   (int a, int b) -> a+b;
   or
   (int a, int b) -> { return a+b; };


   int methodFour(int a, int b){
        statement1;
        statement2;
        statement3;
        return a+b;
   }

    (int a, int b) -> {
        statement1;
        statement2;
        statement3;
        return a+b;
   }


 */