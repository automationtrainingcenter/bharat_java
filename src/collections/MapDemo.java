package collections;
/*
Map is an interface in java.util.
Map is a collection which is used to store collection of values of similar type as key and value
pairs.
Map is implemented by 3 classes
1. HashMap: it won't maintain any order of the data
2. LinkedHashMap: it will maintain insertion order for the data
3. TreeMap: it will maintain ascending order for numeric data and alphabetical order for character
data based on keys not based on values.

Map is not index based.
Map allows duplicate values, but it does not allows duplicate keys.

 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        // create a map
        Map<String, Integer> courses = new HashMap<>();

        // verify the number of elements in a map
        System.out.println("the number of courses is :: "+courses.size());

        // verify a map is empty or not
        System.out.println("map is empty :: "+courses.isEmpty());

        // store the data in map
        courses.put("Java", 45);
        courses.put("python", 60);
        courses.put("c", 30);
        courses.put("Selenium", 90);
        courses.put("Testing", 30);
        courses.put("Java", 40);
        courses.put("flask", 30);
        courses.put("Django", 40);


        // print all the of a list on the console
        System.out.println("the number of courses is :: "+courses.size());
        System.out.println(courses);

        // retrieve the data from a map
        System.out.println(courses.get("c"));
        // retrieve all the keys and values
        Set<String> keys = courses.keySet();
        for(String key : keys){
            System.out.println(key + " :: "+ courses.get(key));
        }

        // retrieve all the values
        Collection<Integer> values = courses.values();
        for(Integer value : values){
            System.out.println(value);
        }

        // retrieve all keys and values as a pair
        Set<Map.Entry<String, Integer>> entries = courses.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + " --- "+entry.getValue());
        }

        // insertion is not possible in map

        // to update the data use old key with new value in put()
        courses.put("c", 35);
        System.out.println(courses);

        // delete a value from map
        courses.remove("c");
        System.out.println(courses);

        courses.remove("Selenium", 90);
        System.out.println(courses);

        // search for a key
        System.out.println(courses.containsKey("flask"));

        // search for a value
        System.out.println(courses.containsValue(35));

        // remove all the values from the map
        courses.clear();
        System.out.println(courses.size());



    }

}
