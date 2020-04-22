package collections;
/*
Collection api (java.util) contains several classes and interfaces which are used to store
collection of similar items.
In this api Collections is the main interface which is extended by other Collection api interfaces

List is an interface in java.util package. It is an inbuilt data structure in Java.
List interface is implemented by ArrayList and LinkedList classes.

ArrayList: it is same as array, which is used to store collection of values of similar data type
in continues memory locations of any size.
Note: In array size is fixed or static. we can not change array size at run time but we can change
array list size at run time so in array list size is dynamic

LinkedList: It is double linked list by default. Unlike ArrayList, LinkedList will store data
in random memory locations.

List allows duplicate values.
List is index based and index number starts with 0.

For Insertion and Deletion LinkedList is very fast
For remaining all operation ArrayList is fast.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        // create a list
        List<String> courses = new LinkedList<>();

        // verify the number of elements in a list
        System.out.println("the number of courses is :: "+courses.size());

        // verify a list is empty or not
        System.out.println("list is empty :: "+courses.isEmpty());

        // store the data in a list
        courses.add("Java");
        courses.add("python");
        courses.add("c");
        courses.add("Selenium");
        courses.add("testing");
        courses.add("Java");
        courses.add("flask");
        courses.add("Django");

        // print all the of a list on the console
        System.out.println("the number of courses is :: "+courses.size());
        System.out.println(courses);

        // retrieve the data from a list
        System.out.println(courses.get(1));


        // retrieve all the data from a list using normal for loop
        System.out.println("::: Using Normal for Loop :::");
        for(int i = 0; i < courses.size(); i++){
            System.out.print(courses.get(i)+"  ");
        }

        // retrieve all the data from a list using for each loop
        System.out.println("\n::: Using for each loop :::");
        for(String course : courses){
            System.out.print(course.toUpperCase()+"  ");
        }
        System.out.println();

        // insert the data in a list
        courses.add(3, "cpp");
        System.out.println(courses);

        // update the data in a list
        courses.set(3, "C++");
        System.out.println(courses);

        // delete the data from the list
        courses.remove(3);
        System.out.println(courses);

        courses.remove("c");
        System.out.println(courses);

        // search for a data in list
        System.out.println(courses.contains("python"));

        // remove all the data from the list
        courses.clear();
        System.out.println("the number of courses is :: "+courses.size());







    }

}
