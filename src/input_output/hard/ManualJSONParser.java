package input_output.hard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ======================================================
 * 🔥 Problem: Manual JSON Parsing
 * ======================================================
 *
 * 🧠 GOAL:
 * Read JSON file and parse key-value pairs manually
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Read entire file into string
 * 2. Remove { and }
 * 3. Split by comma → key-value pairs
 * 4. Split by colon → key and value
 * 5. Clean quotes and spaces
 *
 * ======================================================
 *
 * ⚠️ LIMITATION:
 * - Only supports flat JSON
 * - No nested objects
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(n)
 *
 * 🧠 Space Complexity:
 * O(n)
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "This demonstrates how parsers tokenize structured data"
 *
 * ======================================================
 */
public class ManualJSONParser {

    public static void main(String[] args) {

        String filePath = "data.json";

        try {
            String json = readFile(filePath);

            Map<String, String> parsedData = parseJSON(json);

            // Print result
            System.out.println("Parsed JSON:");
            for (Map.Entry<String, String> entry : parsedData.entrySet()) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * 🔹 Read file content into string
     */
    private static String readFile(String filePath) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line.trim());
        }

        br.close();
        return sb.toString();
    }

    /**
     * 🔹 Parse JSON string manually
     */
    private static Map<String, String> parseJSON(String json) {

        Map<String, String> map = new HashMap<>();

        // Remove braces
        json = json.replace("{", "").replace("}", "");

        // Split key-value pairs
        String[] pairs = json.split(",");

        for (String pair : pairs) {

            String[] keyValue = pair.split(":");

            String key = keyValue[0].trim().replace("\"", "");
            String value = keyValue[1].trim().replace("\"", "");

            map.put(key, value);
        }

        return map;
    }
}