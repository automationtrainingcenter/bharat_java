package assignment;

import javax.swing.*;

public class Bharat {
    public static void main(String[] args) {
        // find out given number is odd or even
        int num = 98;

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is Odd");

        }
        // divisible of 3
        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
        // copy the data of an array into another array
        int[] a = {20, 10, 30};
        for (int b : a) {
            System.out.println(b);

        }

        // find the length of an array without using length property of array (for each loop)
        int[] x = {2, 3, 5, 7, 11};
        int arraylength = x.length;
        System.out.println(x.length);


        //find given character is vowel or not
        char ch = 's';
        switch (ch) {
            case 'a':
                System.out.println("a is a vowel");
                break;
            case 'e':
                System.out.println("e is a vowel");
                break;
            case 'i':
                System.out.println("i is a vowel");
                break;
            case 'o':
                System.out.println("o is a vowel");
                break;
            case 'u':
                System.out.println("u is a vowel");
                break;
            default:
                System.out.println("character is not an vowel");
        }


        // matrix addition


        // verify given number is palindrome or not
        String data = "I am Bharat";
        String revData = "";
        for (int s = data.length() - 1; s >= 0; s--) {
            revData = revData + data.charAt(s);
        }
        System.out.println(revData);
        if (data.equalsIgnoreCase(revData)) {
            System.out.println("given string is palindrome");
        } else {
            System.out.println("given string is not a palindrome");

            // factorial of a given number 5 -- 1*2*3*4*5 = 120


            // reverse of the given string
            {
                StringBuffer y = new StringBuffer("I am Bharat");
                System.out.println(y.reverse());
            }


            // print prime numbers until given number


            // find given matrix is identity matrix or not

            // sum and average of elements in an int array

            // find the number of vowels in a given string selenium -- 3

        }
    }
}


