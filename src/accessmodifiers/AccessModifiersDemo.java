package accessmodifiers;
/*
access modifiers are keywords which are used to define scope of variables (either instance or static)
and methods. There are 4 types of access modifiers
1. public : these are accessible every where without any restrictions.
2. private : these are accessible with in that class only, can't be accessed outside the class.
3. default : if we are not writing any access modifier then that is default. These are accessible
with in the package, can't be accessed outside the package.
4. protected : same as default, but outside the package child class can access parent class protected
fields.
 */

public class AccessModifiersDemo {
    public String pVar = "public variable";
    private String prVar = "private variable";
    String dVar = "default variable";
    protected String proVar = "protected variable";

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println(obj.pVar);
        System.out.println(obj.prVar);
        System.out.println(obj.dVar);
        System.out.println(obj.proVar);
    }


}
