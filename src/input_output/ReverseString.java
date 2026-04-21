package input_output;

import java.util.Scanner;

/**
 * Problem: Reverse a String
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Brute Force → iterate from end and build string
 * 2. Optimized → use StringBuilder reverse()
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * Brute Force: O(n^2)
 * Optimized: O(n)
 *
 * 🧠 Space Complexity:
 * O(n)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - Empty string
 * - Single character
 * - String with spaces
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Using string concatenation inside loop
 * - Not handling spaces properly
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * Hello World
 *
 * 🧪 Sample Output:
 * dlroW olleH
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Introduces string manipulation and optimization
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Two-pointer / String manipulation
 */
public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 🔹 Brute Force
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // 🔹 Optimized
        StringBuilder sb = new StringBuilder(str);
        String optimized = sb.reverse().toString();

        // Output
        System.out.println("\n--- Output ---");
        System.out.println("Brute Force: " + reversed);
        System.out.println("Optimized: " + optimized);

        sc.close();
    }
}