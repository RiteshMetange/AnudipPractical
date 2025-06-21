import java.sql.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    private static final String URL = "jdbc:mysql://localhost:3306/PROJECTONE";
    private static final Scanner scanner = new Scanner(System.in);
    private static final String USER;
    private static final String PASSWORD;

    static {
        System.out.println("Employee Management System");
        System.out.print("Enter database username: ");
        USER = scanner.nextLine();
        System.out.print("Enter database password: ");
        PASSWORD = scanner.nextLine();
    }

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connected to the database successfully!");

            boolean running = true;
            while (running) {
                showMenu();
                int choice = getChoice();

                switch (choice) {
                    case 1 -> createTable(connection);
                    case 2 -> insertData(connection);
                    case 3 -> retrieveData(connection);
                    case 4 -> updateData(connection);
                    case 5 -> deleteData(connection);
                    case 6 -> running = false;
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println(" Application exited.");
        }
    }

    private static void showMenu() {
        System.out.println("""
                \n *** Opration Menu ****
                1. Create Table
                2. Insert Data
                3. Retrieve Data
                4. Update Data
                5. Delete Data
                6. Exit
                """);
        System.out.print("Enter your choice: ");
    }

    private static int getChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("⚠️ Enter a valid number: ");
            scanner.next(); // discard invalid input
        }
        return scanner.nextInt();
    }

    private static void createTable(Connection connection) {
        String sql = """
                CREATE TABLE IF NOT EXISTS users (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(100),
                    email VARCHAR(100) UNIQUE
                )""";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'users' created or already exists.");
        } catch (SQLException e) {
            System.out.println("Failed to create table: " + e.getMessage());
        }
    }

    private static void insertData(Connection connection) {
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        int id = rs.getInt(1);
                        System.out.println(" User inserted with ID: " + id);
                    }
                }
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Email already exists. Please use a different email.");
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }

    private static void retrieveData(Connection connection) {
        String sql = "SELECT * FROM users";

        try (Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n User Records:");
            System.out.println("--------------------------------------------------");
            while (rs.next()) {
                System.out.printf("ID: %-5d Name: %-20s Email: %-25s%n",
                        rs.getInt("id"), rs.getString("name"), rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Failed to retrieve data: " + e.getMessage());
        }
    }

    private static void updateData(Connection connection) {
        System.out.print("Enter user ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter new email: ");
        String newEmail = scanner.nextLine();

        String sql = "UPDATE users SET email = ? WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, id);
            int updated = pstmt.executeUpdate();
            if (updated > 0) {
                System.out.println("Updated email for user ID: " + id);
            } else {
                System.out.println("No user found with ID: " + id);
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Email already in use.");
        } catch (SQLException e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }

    private static void deleteData(Connection connection) {
        System.out.print("Enter user ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String sql = "DELETE FROM users WHERE id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int deleted = pstmt.executeUpdate();
            if (deleted > 0) {
                System.out.println("Deleted user with ID: " + id);
            } else {
                System.out.println("No user found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Deletion failed: " + e.getMessage());
        }
    }
}
