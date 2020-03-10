package basics;
/*
 * Variable is name of memory location where we store data.
 *
 * if we want to make any variable as constant then use "final" keyword.
 *
 * Types of variables
 *
 * 1.Instance variables
 * 		 It is a variable which is declared inside the class but outside of any method.
 * These are object level. We can access these variables directly inside the class
 * instance methods and by creating an object of the class in same class static methods
 * and outside the class.
 * Variable declaration
 * 		access_modifier data_type var_name;
 * accessing variable
 * 		object_name.var_name = value;
 * Initialization variable: At the time of variable declaration we are going to assign some value
 * 		access_modifier data_type var_name = value;
 *
 * 2.static variables
 * 		It is a variable which declared inside the class and outside of any method
 * but declared using 'static' keyword. These are class level i.e. object to object these
 * variables will share the information. We can access these variables directly inside the
 * class and by using class_name outside the class.
 * Variable declaration
 * 		access_modifier static data_type var_name;
 * accessing variable
 * 		class_name.var_name = value;
 * Initialization
 * 		access_modifier static data_type var_name = value;
 *
 * 3.local variables
 * 		It is variable which is declared inside any method. we can
 * access this variable inside the method only.
 * Variable declaration
 * 		data_type var_name;
 * accessing variable
 * 		var_name = value;
 * Initialization
 * data_type var_name = value;
 *
 *  | var type | inside the class instance method | inside the class static method | outside the class  |
 * | instance | directly						 | by creating object			  | by creating object |
 * | static   | directly						 | directly or by class name	  | by class name	   |
 *
 *
 * Creating an object of the class
 *
 * Class_name obj_name = new Class_name();
 */

public class VariablesDemo {

    // instance variable
    int insVar;

    // static variable
    static int stVar;

    // instance method
    public void insMethod(){
        // accessing instance variable
        System.out.println("inside the instance method insVar = "+insVar);
        // accessing static variable
        System.out.println("inside the instance method stVar = "+stVar);
    }

    // static method
    public static void main(String[] args) {
        // local variable
        int locVar;
        locVar = 10;
        System.out.println("local variable value = "+locVar);

        // assign static variable
        VariablesDemo.stVar = 20;
        // accessing static variable
        System.out.println("static variable value = "+VariablesDemo.stVar);

        // create an object of the class
        VariablesDemo obj = new VariablesDemo();
        // assign instance variable
        obj.insVar = 30;
        // accessing instance variable
        System.out.println("instance variable value = "+obj.insVar);


        // calling instance method
        obj.insMethod();
    }
}

/*
when we declare instance and static variables, they allocate the memory and also stores default values
based on the datatype but local variables will not store any default values at declaration.
 */
