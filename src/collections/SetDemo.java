package collections;
/*
Set is an interface in java.util package.
Set is also collection type which is used to store collection of similar values
Set is implemented by 3 classes
1. HashSet: It won't maintain any order of the data
2. LinkedHashSet: It will maintain insertion order of the data
3. TreeSet: It is will maintain ascending order for numeric data and alphabetical order for character
data.

Set is not index based. Set does not allows duplicate values.
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // create a set
        Set<String> courses = new TreeSet<>();

        // verify the number of elements in a set
        System.out.println("the number of courses is :: "+courses.size());

        // verify a set is empty or not
        System.out.println("set is empty :: "+courses.isEmpty());

        // store the data in a list
        courses.add("Java");
        courses.add("python");
        courses.add("c");
        courses.add("Selenium");
        courses.add("testing");
        courses.add("Java");
        courses.add("flask");
        courses.add("Django");

        // print all the of a set on the console
        System.out.println("the number of courses is :: "+courses.size());
        System.out.println(courses);

        // retrieve all the data from a set using for each loop
        System.out.println("\n::: Using for each loop :::");
        for(String course : courses){
            System.out.print(course.toUpperCase()+"  ");
        }
        System.out.println();

        // insertion is not possible because set is not index based and set will not store data
        // in order

        // to update the data remove the old data and add new data
        // delete the data from a set
        courses.remove("c");
        System.out.println(courses);

        // search for a data in set
        System.out.println(courses.contains("python"));

        // remove all the data from the set
        courses.clear();
        System.out.println("the number of courses is :: "+courses.size());

    }

}
