/*8d. Develop a JDBC project using JDBC to update the fields empno, empname 
 * and basicsalary into  the table Emp of the database Employee using HTML
 *  and JSP to get the fields and display the  results respectively 
 */

package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/Employee";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Default XAMPP password is empty

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Get Connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        return conn;
    }
}
