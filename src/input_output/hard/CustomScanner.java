package input_output.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ======================================================
 * 🔥 Problem: Implement Custom Scanner Class
 * ======================================================
 *
 * 🧠 GOAL:
 * Create a fast input reader similar to Scanner
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * Use:
 * 1. BufferedReader → fast reading
 * 2. StringTokenizer → token parsing
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * Faster than Scanner (less overhead)
 *
 * 🧠 Space Complexity:
 * O(n) for input buffer
 *
 * ======================================================
 *
 * 💡 INTERVIEW INSIGHT:
 * Scanner is slow due to parsing overhead.
 * BufferedReader + StringTokenizer is preferred in competitive coding.
 *
 * ======================================================
 */
public class CustomScanner {

    private BufferedReader reader;
    private StringTokenizer tokenizer;

    // Constructor
    public CustomScanner() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * 🔥 Get next token
     */
    public String next() throws IOException {

        // If no tokens or tokens exhausted → read new line
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = reader.readLine();

            if (line == null) {
                return null;
            }

            tokenizer = new StringTokenizer(line);
        }

        return tokenizer.nextToken();
    }

    /**
     * 🔥 Read integer
     */
    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    /**
     * 🔥 Read long
     */
    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    /**
     * 🔥 Read double
     */
    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    /**
     * 🔥 Read full line
     */
    public String nextLine() throws IOException {
        return reader.readLine();
    }

    // Test main method
    public static void main(String[] args) throws IOException {

        CustomScanner sc = new CustomScanner();

        System.out.print("Enter int: ");
        int x = sc.nextInt();

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.print("Enter full line: ");
        String line = sc.nextLine();

        System.out.println("\nOutput:");
        System.out.println("Integer: " + x);
        System.out.println("String: " + str);
        System.out.println("Line: " + line);
    }
}