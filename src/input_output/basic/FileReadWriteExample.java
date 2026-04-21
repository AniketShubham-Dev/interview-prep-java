package input_output.basic;

import java.io.*;

/**
 * Problem: Read and Write Text File
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Use BufferedWriter to write data to file
 * 2. Use BufferedReader to read data from file
 * 3. Handle exceptions properly
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(n) → depends on number of characters
 *
 * 🧠 Space Complexity:
 * O(1) → ignoring file storage
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - File does not exist
 * - Empty file
 * - Large file size
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Not closing file resources
 * - Using FileWriter/FileReader without buffering
 *
 * ------------------------------------------------------
 * 🧪 Sample Output:
 * Writing to file...
 * Reading from file...
 * Hello, this is a sample text file.
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Real-world applications use file I/O frequently (logs, configs, data storage)
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * File Input/Output Handling
 */
public class FileReadWriteExample {

    public static void main(String[] args) {

        String filePath = "sample.txt";

        // 🔹 Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            System.out.println("Writing to file...");
            writer.write("Hello, this is a sample text file.");
            writer.newLine();
            writer.write("This is second line.");

        } catch (IOException e) {
            System.out.println("Error while writing file: " + e.getMessage());
        }

        // 🔹 Reading from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            System.out.println("\nReading from file...");
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}