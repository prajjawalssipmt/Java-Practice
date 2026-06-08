package Exception;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionDemo {

    // 1. CHOSEN TOPIC: 'throws' keyword with a CHECKED exception
    // This method warns the caller: "I might not find this file, handle it!"
    public static void readConfigFile(String filename) throws FileNotFoundException {
        // FileReader constructor throws a checked FileNotFoundException
        FileReader reader = new FileReader(filename);
    }

    // 2. CHOSEN TOPIC: 'throw' keyword with an UNCHECKED exception
    // Explicitly throwing an exception if validation rules fail
    public static void validateAge(int age) {
        if (age < 18) {
            // Using 'throw' to explicitly trigger an unchecked RuntimeException

            throw new ArithmeticException("Underage: Access Denied!");
        } else {
            System.out.println("Access Granted. Welcome!");
        }
    }

    public static void main(String[] args) {
        // --- Handling Checked Exception ---
        System.out.println("--- Scenario 1: Checked Exception Handling ---");
        try {
            // Because readConfigFile() uses 'throws', we MUST wrap it in try-catch
            readConfigFile("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: File was not found!");
        }

        // --- Handling Unchecked Exception ---
        System.out.println("\n--- Scenario 2: Unchecked Exception / throw ---");
        try {
            // This triggers our custom validation error inside validateAge()
            validateAge(14);
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        System.out.println("\nProgram executed successfully until the end!");
    }
}
