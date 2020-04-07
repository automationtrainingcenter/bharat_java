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

    we can write as many parametrized constructors as we want in a class which is known as "Constructor overloading"
    to create a overloaded constructor we can change either
    number of parameters or
    type of parameters or
    sequence of parameters

    "this" is a keyword in java which will represent current class instance.
    "this" keyword is used to differentiate instance variables with arguments of a constructor
    and also used to call a constructor from another constructor.

    Note: Calling a constructor from another constructor is known as "constructor chaining".
    Note: Calling a constructor from another constructor must be first statement with in the constructor

 */
public class ConstructorDemo {

    // instance variables
    int id;
    String name;
    double salary;
    long aadhar;
    String panNum;

    // default constructor
    public ConstructorDemo() {
        id = 100;
        name = "sunshine";
        salary = 30000.0;
        aadhar = 987612340000l;
        panNum = "ava1199q";
    }

    // change in number of arguments
    public ConstructorDemo(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // change in number of arguments
    public ConstructorDemo(int id, String name, double salary, long aadhar) {
        this(id, name, salary);
        this.aadhar = aadhar;
    }

    // change in type of arguments from above constructor to this constructor
    public ConstructorDemo(int id, String name, double salary, String panNum) {
        this(id, name, salary);
        this.panNum = panNum;
    }

    // parametrized constructor
    public ConstructorDemo(int id, String name, double salary, long aadhar, String panNum) {
        this(id, name, salary, aadhar);
        this.panNum = panNum;
    }


    public void display() {
        System.out.println("id = " + id + " name = " + name + " salary = " + salary + " aadhar num = " + aadhar + " pan num = " + panNum);
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
