import java.sql.*;

public class sqlll {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student"; // Replace with your DB name
        String user = "root"; // Replace with your username
        String password = "Kingstaromega2611"; // Replace with your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC driver

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Stud");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Age: " + rs.getInt("age")
                );
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
