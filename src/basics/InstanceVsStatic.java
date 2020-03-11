package basics;

public class InstanceVsStatic {
    // instance variable
    int accNum = 0;

    // static variable
    static int ifscCode = 0;

    // instance method
    public void display(){
        System.out.println("account number is "+accNum+"\tIFSC code is "+ifscCode);
    }

    // static method
    public static void main(String[] args) {
        // assign ifsc code
        ifscCode = 1234;


        // create an object of the class
        InstanceVsStatic obj1 = new InstanceVsStatic();
        obj1.accNum = 98761234;
        obj1.display();


        // create one more object
        InstanceVsStatic obj2 = new InstanceVsStatic();
        obj2.accNum = 89127766;
        obj2.display();


        // create one more object
        InstanceVsStatic obj3 = new InstanceVsStatic();
        obj3.accNum = 99110022;
        obj3.display();


        obj2.accNum = 77890077;
        ifscCode = 9876;

        obj1.display();
        obj2.display();
        obj3.display();
    }




}
