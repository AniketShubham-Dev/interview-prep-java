package input_output;

import java.util.Scanner;

/**
 * Problem: Print Diamond Pattern
 *
 * ------------------------------------------------------
 * Pattern:
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Print upper pyramid (1 to n)
 * 2. Print lower reverse pyramid (n-1 to 1)
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
 * - Printing middle row twice
 * - Incorrect spacing logic
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
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Combines multiple patterns → tests strong loop control
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Pyramid + Reverse Pyramid
 */
public class DiamondPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // 🔼 Upper Pyramid
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // 🔽 Lower Reverse Pyramid
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}