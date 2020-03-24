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
 * 		case value1;
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


    }


}
