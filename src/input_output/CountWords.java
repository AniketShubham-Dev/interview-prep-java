package input_output;

import java.util.Scanner;

/**
 * Problem: Count Words in a Sentence
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Brute Force → split by single space
 * 2. Optimized → trim + split using regex "\\s+"
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(n)
 *
 * 🧠 Space Complexity:
 * O(n)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - Empty string
 * - Multiple spaces between words
 * - Leading/trailing spaces
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Using split(" ") instead of split("\\s+")
 * - Not trimming input
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * "  Hello   world from   Java  "
 *
 * 🧪 Sample Output:
 * 4
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Introduces string parsing and regex usage
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * String Parsing / Tokenization
 */
public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // 🔹 Brute Force
        String[] bruteWords = str.split(" ");
        int bruteCount = bruteWords.length;

        // 🔹 Optimized
        String trimmed = str.trim();
        int optimizedCount = 0;

        if (!trimmed.isEmpty()) {
            String[] words = trimmed.split("\\s+");
            optimizedCount = words.length;
        }

        // Output
        System.out.println("\n--- Output ---");
        System.out.println("Brute Force Count: " + bruteCount);
        System.out.println("Optimized Count: " + optimizedCount);

        sc.close();
    }
}