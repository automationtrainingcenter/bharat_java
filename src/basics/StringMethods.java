package basics;
/*
String is a collection of characters
we can store String data using ""
String can be stored as either String class object using new keyword or literal

    String var_name = new String("value");  using object

    String var_name = "value"; using literal

the default value is null.
Strings are index based. index number starts with 0
 */

public class StringMethods {

    public static void main(String[] args) {
        String s1 = "selenium";
        String s2 = "";
        String s3 = " webdriver";
        String s4 = "SUNSHINE";
        String s5 = "welcome to the selenium course with Java programming launguage";
        String s6 = "                          actual text                          ";

        /*
         * length() : which will return an integer value which is the number of
         * characters in the given string
         */
        System.out.println("number of characters in s1 string is "+ s1.length());
        System.out.println("number of characters in s2 string is "+ s2.length());

        /* isEmpty() : returns true if a given string is an empty string */
        System.out.println("s1 is an empty string "+s1.isEmpty()); // False
        System.out.println("s2 is an empty string "+s2.isEmpty()); // True

        /* concat(): combines two given strings and returns a new string*/
        String str = s1.concat(s3);
        System.out.println(str);
        System.out.println(s1);
        System.out.println(s3);


        /* equals(): verifies two strings by considering case */
        System.out.println(s1.equals("selenium")); // true
        System.out.println(s1.equals("Selenium")); // false
        System.out.println(s1.equals(s3)); //false


        /*
         * equalsIgnoreCase(): verifies two strings are equal or not without considering
         * the case
         */
        System.out.println(s4.equalsIgnoreCase("sunshine")); // true
        System.out.println(s1.equalsIgnoreCase("SELENIUM")); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // false



        /*
         * contains(): verifies a given substring is available inside the given string
         * or not
         */
        System.out.println(s5.contains(s1)); // true
        System.out.println(s5.contains("java")); // false


        /* toLowerCase(): converts given string to lower case */
//        s4 = s4.toLowerCase();
        System.out.println(s4.toLowerCase());
        System.out.println(s4);

        /* toUpperCase(): converts given string to upper case */
        System.out.println(s1.toUpperCase());
        System.out.println(s1);


        /* charAt(int index): returns a character at a given index number */
        System.out.println(s1.charAt(5));
//        System.out.println(s1.charAt(8)); // gives String index out of bounds exception


        /* indexOf(): returns index value of first occurrence of a given character */
        System.out.println(s4.indexOf('S'));
        System.out.println(s1.indexOf('z')); // returns -1 if given character is not available in given string
        System.out.println(s5.indexOf(s1));


        /* stratsWith(): verifies a given string starts with given substring */



        /* endsWith(): verifies a given string ends with given substring */


        /*
         * replace(): it will replace given old character or old substring with new
         * character or new substring
         */



        /*
         * substring(): returns substring from a given string based on beginning and
         * optional ending index values Note: substring() will include the beginning
         * index character and excludes ending index character
         */



        /* toCharArray() return an array of characters inside the given string */



        /*
         * split() return an array of substrings inside the given string, divided based
         * on some expression
         */


        /*
         * trim() which will remove extra spaces at beginning and ending of given string
         */
    }



}
