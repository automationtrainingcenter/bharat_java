package polymorphism;

public class RunTimePolyChild extends RunTimePolyParent{
    /*
    To override a parent class method within child class, the method must maintain
    same signature (declaration) in both parent and child classes.
    @Override annotation will make sure we are maintaining same declaration for overridden
    methods in both parent and child classes.
     */
    @Override
    public void methodOne(String a, int b){
        int ia = Integer.parseInt(a);
        System.out.println(ia+b);

    }

}
