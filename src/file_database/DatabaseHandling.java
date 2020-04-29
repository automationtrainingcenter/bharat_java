package file_database;
/*
 * To work with database we have gather the following information
 * 1. DB technology (MSSQL Server, MYSQL, Oracle, DB2 ..etc)
 * 2. DB Server address
 * 3. DB credentials
 * 4. Database Name we want to connect to
 * 5. Table Name on which we want to perform the operations
 * 6. Column Names and their data types
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseHandling {

    public static void main(String[] args) {
        /*
         * Load the driver class related to the DB technology dynamically using
         * forName() method of Class class
         */
        String driverClass = "com.mysql.cj.jdbc.Driver";
        String query = "SELECT * FROM employees where officeCode = 1";
        try {
            Class.forName(driverClass);
            /*
             * Create connection to the required database by calling getConnection() method
             * of DriverManager class and storing reference in Connection class object
             */
            // connection url for mysql is
            // ("protocol://sever_ip_address:port/data_base_name", "username", "password")
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "password");

            /*
             * Create Statement class object by calling createStatement() method of
             * Connection class so that we can execute SQL queries
             */
            Statement statement = con.createStatement();


            /*
             * Execute SQL queries using executeQuery() method of Statement class and store
             * the results in ResultSet class object
             */
//            ResultSet rs = statement.executeQuery("SELECT * FROM employees where jobTitle = 'VP Sales'");
            ResultSet rs = statement.executeQuery(query);

            /* Iterate over the results using next() method of ResultSet class */
            while(rs.next()){
                String firstName = rs.getString("firstName");
                String email = rs.getString("email");
                int reportsTo = rs.getInt("reportsTo");
                String jobTitle = rs.getString("jobTitle");
                System.out.println(firstName+"\t"+email+"\t"+reportsTo+"\t"+jobTitle);
            }

            /* Close the data base connection using close() method of Connection class */
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
