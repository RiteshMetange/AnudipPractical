import java.sql.*;

public class MySQLConnect {
    public static void main(String[] args) {
        // JDBC URL, username and password
        String url = "jdbc:mysql://localhost:3306/Student"; // Replace 'mydb' with your DB name
        String user = "root"; // Replace with your MySQL username
        String password = "Kingstaromega2611"; // Replace with your MySQL password

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database!");

            // Sample query: Display data from Stud table
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Stud");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
