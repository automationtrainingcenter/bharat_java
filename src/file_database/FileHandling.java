package file_database;
/*
To read data from any file first we have create an object of FileInputStream class.
In this class we retrieving data from a properties file.
properties file is like a text file which contains data in key and value pairs.
To retrieve data from properties file Java provides Properties class in java.util package
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class FileHandling {

    public static void main(String[] args) {
        /* create an object of FileInputStream class by providing path of the file
         from which you want retrieve the data.
         you can provide either absolute path of the file or relative path of the file.
         absolute path means complete address path of the file in local machine.
         relative path means address path of the file with respect to our project folder path
        */
        // /Users/suryaprakash/Documents/SSTS/bharat/bharat_java/config.properties
        try {
            FileInputStream fis = new FileInputStream("./config.properties");
            // Create an object of Properties class
            Properties prop = new Properties();
            prop.load(fis);
            String name = prop.getProperty("name", "surya");
            System.out.println("name :: "+name);
            String address = prop.getProperty("address");
            System.out.println("address :: "+address);
            String phone = prop.getProperty("phone");
            System.out.println("phone :: "+phone);
            String email = prop.getProperty("email", "surya@sunshine.com");
            System.out.println("email :: "+email);
            /*
            If you are providing a key which does not exist in properties file for a getProperty()
            then it will return a null value.
             */
            // to write the data we have to use FileOutputStream class object.
            FileOutputStream fos = new FileOutputStream("./config.properties");
            prop.setProperty("name", "prakash");
            prop.put("username", "surya123");
            prop.store(fos, "name value modified");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
