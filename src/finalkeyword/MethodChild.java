package finalkeyword;

public class MethodChild extends  MethodParent{

    @Override
    public void methodOne(){
        System.out.println("normal method one overriden in child class");
    }


//    @Override
//    public void methodTwo(){
//
//    } // we can not override final methods of a parent class in child class
}
