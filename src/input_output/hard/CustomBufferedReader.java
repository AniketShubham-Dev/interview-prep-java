package input_output.hard;

import java.io.FileReader;
import java.io.IOException;

/**
 * ======================================================
 * 🔥 Problem: Custom File Reader with Buffer
 * ======================================================
 *
 * 🧠 GOAL:
 * Implement buffered file reading manually
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Maintain a char buffer[]
 * 2. Read chunk from file into buffer
 * 3. Serve characters from buffer
 * 4. Refill when buffer is exhausted
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(n)
 *
 * 🧠 Space Complexity:
 * O(buffer size)
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "Buffering reduces expensive disk I/O operations"
 *
 * ======================================================
 *
 * 📌 SAMPLE INPUT:
 * ======================================================
 * File: data.txt
 * Content:
 * Hello Aniket
 * Welcome to Java
 *
 * ======================================================
 * 📌 SAMPLE OUTPUT:
 * ======================================================
 * Hello Aniket
 * Welcome to Java
 *
 * ======================================================
 */
public class CustomBufferedReader {

    private FileReader fileReader;
    private char[] buffer;
    private int bufferSize;
    private int bufferPointer;
    private int charsRead;

    // Constructor
    public CustomBufferedReader(String filePath, int size) throws IOException {
        fileReader = new FileReader(filePath);
        bufferSize = size;
        buffer = new char[bufferSize];
        bufferPointer = 0;
        charsRead = 0;
    }

    /**
     * 🔥 Fill buffer from file
     */
    private void fillBuffer() throws IOException {
        charsRead = fileReader.read(buffer, 0, bufferSize);
        bufferPointer = 0;
    }

    /**
     * 🔥 Read next character
     */
    public char read() throws IOException {

        // If buffer empty → refill
        if (bufferPointer >= charsRead) {
            fillBuffer();

            // End of file
            if (charsRead == -1) {
                return (char) -1;
            }
        }

        return buffer[bufferPointer++];
    }

    /**
     * 🔥 Close file
     */
    public void close() throws IOException {
        fileReader.close();
    }

    // Test
    public static void main(String[] args) {

        try {
            CustomBufferedReader reader =
                    new CustomBufferedReader("data.txt", 8);

            char ch;

            while ((ch = reader.read()) != (char) -1) {
                System.out.print(ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
