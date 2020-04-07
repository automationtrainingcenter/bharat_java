package encapsulation;
/*
    Encapsulation means hiding the properties of a class outside of the class or
    Encapsulation means binding data and the operations on the data together.
 */

public class EncapsulationDemo {

    int accNum;
    String name;
    String address;
    long phoneNum;
    double balance;

    // parameterized constructor
    public EncapsulationDemo(int accNum, String name, String address, long phoneNum, double balance) {
        this.accNum = accNum;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.balance = balance;
    }

    public void display() {
        System.out.println("account number = " + accNum + "\tname = " + name + "\taddress = " + address + "\tphone number = " + phoneNum + "\tbalance = " + balance);
    }

}
