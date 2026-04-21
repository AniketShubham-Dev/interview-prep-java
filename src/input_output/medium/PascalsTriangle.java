package input_output.medium;

import java.util.Scanner;

/**
 * Problem: Print Pascal's Triangle
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Print row by row
 * 2. Use optimized formula:
 *    value = value * (row - col) / (col + 1)
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
 * - n = 1 → single element
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Using factorial repeatedly
 * - Integer overflow (use long if needed)
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * 5
 *
 * 🧪 Sample Output:
 *         1
 *       1 1
 *     1 2 1
 *   1 3 3 1
 * 1 4 6 4 1
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Introduces combinatorics + optimization
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Mathematical + Pattern Combination
 */
public class PascalsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Compute values
            int value = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}