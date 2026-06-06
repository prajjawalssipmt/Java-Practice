package OOPs.Encapsulation.NewStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the value of 'n' from the user
        System.out.print("Enter the total number of students (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        // 2. Initialize a dynamic list to hold 'n' students
        ArrayList<Student> studentList = new ArrayList<>();

        // 3. Loop 'n' times to collect data for each student
        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Enter Details for Student " + i + " ---");

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            // Create object and add it directly to the list
            studentList.add(new Student(name, rollNo, age));
        }

        // 4. Extract and print all student details in one go
        System.out.println("\n=========================================");
        System.out.println("   DISPLAYING ALL " + n + " STUDENT DETAILS");
        System.out.println("=========================================");

        studentList.forEach(student -> System.out.println(student));

        scanner.close(); // Close the scanner resource
    }
}
