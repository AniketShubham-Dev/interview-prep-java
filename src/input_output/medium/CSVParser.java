package input_output.medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Problem: Read CSV File and Parse Data
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Read file using BufferedReader
 * 2. Read line by line
 * 3. Split line using comma delimiter
 * 4. Extract values and print
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(n * m)
 * n = number of lines
 * m = number of columns
 *
 * 🧠 Space Complexity:
 * O(m)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - Empty file
 * - Missing values
 * - Extra commas
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Not handling header separately
 * - Not trimming values
 *
 * ------------------------------------------------------
 * 🧪 Sample Output:
 * ID: 1, Name: Aniket, Age: 28
 * ID: 2, Name: Rahul, Age: 30
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Real-world data is often stored in CSV format
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * File Parsing / Data Processing
 */
public class CSVParser {

    public static void main(String[] args) {

        String filePath = "data.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Split line
                String[] values = line.split(",");

                // Extract data
                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                int age = Integer.parseInt(values[2].trim());

                // Print formatted output
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}