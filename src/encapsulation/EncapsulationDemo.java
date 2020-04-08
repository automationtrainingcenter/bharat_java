package encapsulation;
/*
    Encapsulation means hiding the properties of a class outside of the class or
    Encapsulation means binding data and the operations on the data together.

    to hide the properties outside the class we have to declare those
    properties using private access modifier.

    to perform read and write operations on the properties we have to create
    getter and setter methods using public access modifier.

    read --- getter
    write --- setter
 */

import java.util.Scanner;

public class EncapsulationDemo {

    private int accNum;
    private String name;
    private String address;
    private long phoneNum;
    private double balance;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your phone number");
        long pn = sc.nextLong();
        if(this.phoneNum == pn) {
            this.address = address;
            System.out.println("address updated successfully");
        }else{
            System.out.println("Unauthorized access. Invalid phone number");
        }
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
