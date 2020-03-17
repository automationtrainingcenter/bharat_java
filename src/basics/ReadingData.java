package basics;
/*
to read data from the console we have to use
Scanner class. This class contains several methods to read the data based
on the type of data we are reading

All these methods are instance methods, so we have to create an object of the
Scanner class to call these methods


Syntax to create a Scanner class object
    Scanner obj_name = new Scanner(input_source);
eg:
    Scanner sc = new Scanner(System.in);

Methods:
boolean  -- nextBoolean()
byte -- nextByte()
short -- nextShort()
int --- nextInt()
long -- nextLong()
float -- nextFloat()
double -- nextDouble()

Scanner class does not contains any method to read a character data
to read a character we have to read that character as string and convert that string
to character

String -- next() -- to read String single word
String -- nextLine() -- to read String with multiple words
 */

import java.util.Scanner;

public class ReadingData {
    public static void main(String[] args) {
        // create an object of the Scanner class
        Scanner sc = new Scanner(System.in);


        // boolean
        System.out.println("enter a boolean value");
        boolean b = sc.nextBoolean();
        System.out.println("boolean input is "+b);

        // byte
        System.out.println("enter a byte value");
        byte by = sc.nextByte();
        System.out.println("byte input is "+by);


        // short
        System.out.println("enter a short value");
        short sh = sc.nextShort();
        System.out.println("short input is "+sh);

        // integer
        System.out.println("enter a integer value");
        int i = sc.nextInt();
        System.out.println("integer input is "+i);


        // long
        System.out.println("enter a long value");
        long l = sc.nextLong();
        System.out.println("long input is "+l);

        // float
        System.out.println("enter a float value");
        float f = sc.nextFloat();
        System.out.println("float input is "+f);

        // double
        System.out.println("enter a double value");
        double d = sc.nextDouble();
        System.out.println("double input is "+d);

        // string
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("hello "+name);


        // char
        System.out.println("enter a character");
        String chs = sc.next();
        char ch = chs.charAt(0);
        System.out.println("character input is "+ch);
    }



}
