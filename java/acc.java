import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class acc {
    public static void main(String[] args) {
        System.out.println("\n*******************  Welcome To Madhav Education Foundation  ***************\n");

        // Database connection details
        String url = "localhost"; // Database URL with XAMPP default MySQL port 3306
        String user = "root"; // XAMPP default MySQL user
        String password = ""; // XAMPP default MySQL password is empty

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Scanner sc = new Scanner(System.in)) {

            // Confirmation message for a successful database connection
            System.out.println("Connected to the database successfully!");

            String continueInput;

            // Loop to collect multiple records
            do {
                System.out.print("Enter Your Surname: ");
                String surname = sc.nextLine();

                System.out.print("Enter Your Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Your Father Name: ");
                String fname = sc.nextLine();

                System.out.print("Enter Your Standard: ");
                String std = sc.nextLine();

                System.out.print("Enter Your Address: ");
                String add = sc.nextLine();

                // Phone number input with validation
                String phone;
                while (true) {
                    System.out.print("Enter Parents' Contact No (10 digits): ");
                    phone = sc.nextLine();
                    try {
                        // Check if it's numeric and exactly 10 digits
                        Long.parseLong(phone);
                        if (phone.length() == 10) {
                            break;
                        } else {
                            System.out.println("Phone number must be exactly 10 digits.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a numeric 10-digit phone number.");
                    }
                }

                // Prepare SQL insert statement
                String query = "INSERT INTO student_details (surname, name, father_name, standard, address, phone) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, surname);
                    pstmt.setString(2, name);
                    pstmt.setString(3, fname);
                    pstmt.setString(4, std);
                    pstmt.setString(5, add);
                    pstmt.setString(6, phone);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("Record saved successfully!\n");
                    }
                } catch (SQLException e) {
                    System.out.println("Error inserting record into database.");
                    e.printStackTrace();
                }

                // Ask if the user wants to add another record
                System.out.print("Do you want to enter another record? (yes/no): ");
                continueInput = sc.nextLine().trim().toLowerCase();

            } while (continueInput.equals("yes"));

            System.out.println("All records have been saved. Thank you!");

        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
        }
    }
}
