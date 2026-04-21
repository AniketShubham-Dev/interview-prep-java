package input_output.basic;

import java.util.Scanner;

/**
 * Problem: Print Pyramid Pattern
 *
 * ------------------------------------------------------
 * Pattern:
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * *
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Outer loop → rows (1 to n)
 * 2. First inner loop → print spaces (n - i)
 * 3. Second inner loop → print stars (i)
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(n^2)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - n = 0 → no output
 * - n = 1 → single star
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Wrong number of spaces
 * - Misalignment due to spacing
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * 5
 *
 * 🧪 Sample Output:
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * *
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Builds visualization + multi-loop control
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Space + Star Combination Pattern
 */
public class PyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Step 2: Outer loop (rows)
        for (int i = 1; i <= n; i++) {

            // Step 3: Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Step 4: Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}