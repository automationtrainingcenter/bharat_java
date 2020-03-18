package basics;

/*
Array is used to store collection of values of similar data type in continuous memory locations
Array size or length is static i.e. we can not change array size at run time.

1. easy to maintain
2. searching and sorting is easy

we have two types of arrays
1. one dimension arrays
2. two dimension arrays

1. One Dimension Array:
    It is used to store one row and multiple columns of data. It is like 1 X N matrix.

   Syntax to declare 1D array:
        data_type[] var_name = new data_type[length];
        Note: here length represents number of values we can store in array
   eg:
        int[] marks = new int[6];

   Syntax to access data of a 1D array
   we can access data of an array using index numbers, index number starts with 0 and maximum
   index number is length of array - 1
        var_name[index] = value;
   eg:
        marks[0] = 19;

   Syntax to initialize a 1D array
        data_type[] var_name = {value1, value2, value3 .... valueN};
   eg:
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

   To find the length of an array (i.e. number of items in an array) we use length property
   eg: vowels.length will give 5

2. Two Dimension Array:
    It is used to store multiple rows and multiple columns of the data. It is like m X n
    matrix. It is an array of 1D array.

    Syntax to declare a 2D array
        data_type[][] var_name = new data_type[row_length][column_length];
    eg:
       int[][] m1 = new int[2][2];

    Syntax to access 2D array data
        var_name[row_index][column_index] = value;
    eg:
        m1[0][0] = 1;

    Syntax to initialize 2D array:
        data_type[][] var_name = {{r1c1, r1c2, r1c3... r1cN},
                                 {r2c1, r2c2, r2c3 ... r2cN},
                                 {r3c1, r3c2, r3c3 ... r3cN},
                                 .
                                 .
                                 .
                                 {rMc1, rMc2, rMc3 ... rMcN}};

        eg:
            int[][] m3 = {{1,2,3}, {4,5,6}, {7,8,9}}

     m3.length will give 3 (i.e. 3 1D arrays)
     m3[0] == {1,2,3}
     m3[0].length == 3
     m3[0][0] = 1
     m3[0][1] = 2
     m3[0][2] = 3

     m3[1] == {4,5,6}
     m3[1].length = 3
     m3[1][0] = 4
     m3[1][1] = 5
     m3[1][2] = 6

     m3[2] == {7,8,9}
     m3[2].length = 3
     m3[2][0] = 7
     m3[2][1] = 8
     m3[2][2] = 9
 */
public class ArraysDemo {

    public static void main(String[] args) {
        // declaring 1D array
        int[] marks = new int[6];

        // assign values to the marks array
        marks[0] = 19;
        marks[1] = 20;
        marks[2] = 18;
        marks[3] = 21;
        marks[4] = 22;
        marks[5] = 23;

        // retrieve the data from marks array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        // initialize a 1D array
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // find the number of items in vowels array
        System.out.println("number of items in vowels array "+vowels.length);

        // retrieving data from the vowels array
        System.out.println(vowels[0]);
        System.out.println(vowels[1]);
        System.out.println(vowels[2]);
        System.out.println(vowels[3]);
        System.out.println(vowels[4]);


        // 2D array declaration
        int[][] m1 = new int[2][2];

        // assign values in m1 array
        // First row
        m1[0][0] = 1; // First column
        m1[0][1] = 2; // Second column
        // second row
        m1[1][0] = 3; // First column
        m1[1][1] = 4; // Second column

        // retrieve the data from m1 array
        // First row
        System.out.print(m1[0][0] + " ");
        System.out.print(m1[0][1] + "\n");
        // Second column
        System.out.print(m1[1][0]+" ");
        System.out.print(m1[1][1]+"\n");








    }


}
