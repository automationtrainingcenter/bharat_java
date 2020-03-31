package basics;
/*
Loop is a collection of statements which will execute repeatedly for certain number of times
based on some condition.
In loops one repetition is known as iteration or increments also.
There are 4 loops in Java

1. while loop: used to execute a block of code based on some condition
2. do while loop: used to execute a block of code based on some condition
3. for loop: used to execute a block of code for certain number of time
4. for each loop: used to iterate over a collection of data like arrays, lists .. etc

while, do while and for loops contains mainly 3 parts
1. initialization
2. condition or expression
3. increment or decrement

 */

public class LoopsDemo {

    public static void main(String[] args) {
        System.out.println("****While loop****");
        // while loop: print numbers from 1 to 10 (included)
        // initialization
        int i = 1;
        // condition or expression
        while(i < 11){
            // statements to repeat
            System.out.println(i);
            // increment
            i++;
        }
        // Note: the minimum number of iterations for while loop 0


        // do while loop: print even numbers from 20 to 10 (excluded)
        // initialization
        System.out.println("****Do While loop****");

        int j = 20;
        do{
            if(j % 2 == 0){
                System.out.println(j);
            }
            j--; // decrement
        }while(j > 10); // condition
        // Note: The minimum number of iterations for do while loop is 1


        // for loop: print 3 multiples from 1 to 10
        System.out.println("****For loop****");
        for(int k = 1; k < 11; k++){
            System.out.println(k * 3);
        }
        // Note: The minimum number of iterations for the for loop is 0


        // for each loop: to retrieve values from an array
        System.out.println("****For each loop****");
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19};
        for(int number : numbers){
            System.out.println(number);
        }

        // Note: The minimum number of iterations for the for each loop 0





    }
}
