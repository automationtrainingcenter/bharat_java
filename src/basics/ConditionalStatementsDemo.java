package basics;
/*
   Conditional statement is a statement (line of code) which contains either
   conditional operator or combination of conditional and logical operators using if keyword

   These are used to execute a block of statements based on some condition or expression

   condition means any one conditional operator
   expression means combining conditions using logical operators

   we have 5 types of conditional operators in Java.
   1. simple if
   2. if else
   3. else if ladder
   4. nested if
   5. switch case

 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 *
 *
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements
 * inside else block will be executed
 *
 *
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 *
 *
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 *
 *
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1:
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 *
 *
 */

import java.util.Scanner;

public class ConditionalStatementsDemo {

    public static void main(String[] args) {
        int num = 101;
        // simple if
        // verify a given number is positive
        /*
        if number is greater than 0 then
            given number is positive
         */
        if (num > 0) {
            System.out.println("num is positive");
        }


        // if else
        // verify given number is even or odd
        /*
        if number % 2 is equal to 0 then
            given number is even
        else
            given number is odd
         */
        if (num % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("given number is odd");
        }

        // else if ladder
        // find the biggest number in given two numbers using else if ladder
        int num1 = 10;
        int num2 = 1;
       /*
        if num1 is greater than num2 then
            num1 is bigger
        else if num2 is greater than num1 then
            num2 is bigger
        else
            num1 is equal to num2
        */
        System.out.println("*************** ELSE IF LADDER **********************");
        if (num1 > num2) {
            System.out.println("num1 is bigger");
        } else if (num2 > num1) {
            System.out.println("num2 is bigger");
        } else {
            System.out.println("num1 is equal to num2");
        }

        // nested if
        // find the biggest number in given two numbers using else nested if
        /*
        if num1 is not equal to num2 then
            if num1 is greater than num2 then
                num1 is bigger
            else
                num2 is bigger
        else
            num1 is equal to num2
         */
        System.out.println("*************** NESTED IF **********************");
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("num1 is bigger");
            } else {
                System.out.println("num2 is bigger");
            }
        } else {
            System.out.println("num1 is equals to num2");
        }


        /*
        Switch case is almost same as else if ladder
        switch case only compares equality of the operands.
         */
        // verify a character is vowel or not
        char ch = 'g';
        switch (ch){
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
            default:
                System.out.println("character is not vowel");
        }

        // facebook account
        // enter username, enter password and click on login button
        Scanner sc = new Scanner(System.in);
        System.out.println("enter facebook username");
        String username = sc.next();
        System.out.println("enter facebook password");
        String password = sc.next();
        if(username.equals("sunshine") && password.equals("selenium")){
            System.out.println("welcome user");
        }else{
            System.out.println("incorrect credentials");
        }


        // gmail account
        // enter username, click next, if username is valid then it will display
        // enter password and click on login
        System.out.println("enter gmail username");
        String guser = sc.next();
        if(guser.equalsIgnoreCase("sunshine")){
            System.out.println("enter gmail password");
            String gpass = sc.next();
            if(gpass.equals("selenium")){
                System.out.println("Welcome "+guser);
            }else{
                System.out.println("invalid password");
            }
        }else{
            System.out.println("Invalid username");
        }


        // open a browser based on browser name
        System.out.println("enter browser name");
        String browserName = sc.next();
        switch (browserName){
            case "chrome":
                System.out.println("launching chrome browser");
                break;
            case "firefox":
                System.out.println("launching firefox browser");
                break;
            case "opera":
                System.out.println("launching opera browser");
                break;
            case "ie":
                System.out.println("launching ie browser");
                break;
            case "edge":
                System.out.println("launching edge browser");
                break;
            default:
                System.out.println("invalid browser name");
        }

        //  verify OS of our machine
//        String osname = System.getProperty("os.name").toLowerCase();
        System.out.println("enter os name");
        String osname = sc.next();
        if(osname.contains("mac")){
            System.out.println("OS is mac");
        }else if (osname.contains("windows")){
            System.out.println("OS is windows");
        }else if (osname.contains("linux")){
            System.out.println("OS is linux");
        }else{
            System.out.println("invalid os name");
        }

    }

}
