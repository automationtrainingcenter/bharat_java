package methods_and_constructors;

/*
    Constructor is nothing but a method which will have same name as the class name
    including the case.

    Constructors might or might not have the input but it must have an output.

    Constructors does not have any explicit return type by default every
    constructor will return memory location of the object (the instance) of the class.

    There are two types of constructors
    1. Default constructor (constructor without input)
    2. Parameterized constructor (constructor with input)

    The purpose of constructor is to create an object of the class and to allocate memory
    to the instance variables of that class and also assign default values to the instance
    variables based on their data type.

    Note: Default constructor will assign default values based on the data type of instance
    variables and Parameterized constructor will assign user specified to the instance variables.

    Note: if we are not writing any constructor in a java class then java compiler will create
    one default constructor while creating .class file. If in case java class contains parameterized
    constructor then java compiler will not create default constructor for us.

    we can write as many parametrized constructors as we want in a class which is known as Constructor overloading
    to create a overloaded constructor we can change either
    number of parameters or
    type of parameters or
    sequence of parameters

 */
public class ConstructorDemo {

    // instance variables
    int id;
    String name;
    double salary;
    long aadhar;
    String panNum;

    // default constructor
    public ConstructorDemo(){
        id = 100;
        name = "sunshine";
        salary = 30000.0;
        aadhar = 987612340000l;
        panNum = "ava1199q";
    }

    // parametrized constructor
    public ConstructorDemo(int i, String n, double s, long a, String pn){
        id = i;
        name = n;
        salary = s;
        aadhar = a;
        panNum = pn;
    }

    public ConstructorDemo(int i, String n, double s){
        id = i;
        name = n;
        salary = s;
    }

    public ConstructorDemo(int i, String n, double s, long a){
        id = i;
        name = n;
        salary = s;
        aadhar = a;
    }

    public ConstructorDemo(int i, String n, double s, String pn){
        id = i;
        name = n;
        salary = s;
        panNum = pn;
    }

    public void display(){
        System.out.println("id = "+id+" name = "+name+" salary = "+salary+" aadhar num = "+aadhar+" pan num = "+panNum);
    }


    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo();
        obj1.display();

        ConstructorDemo obj2 = new ConstructorDemo(101, "prakash", 350000.00, 123487659876l, "axs9988k");
        obj2.display();

        ConstructorDemo obj3 = new ConstructorDemo(102, "surya", 40000.00);
//        obj3.id = 102;
//        obj3.name = "surya";
//        obj3.salary = 40000.00;
//        obj3.aadhar = 897612346655l;
//        obj3.panNum = "anh6754l";
        obj3.display();

        ConstructorDemo obj4 = new ConstructorDemo(103, "ravi", 30000.00, 432199887654l);
        obj4.display();

        ConstructorDemo obj5 = new ConstructorDemo(104, "rakesh", 37000.00, "tak3214j");
        obj5.display();
    }



}
