package input_output.medium;

import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Pascal’s Triangle using Recursion
 * ======================================================
 *
 * 📌 Pattern:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 *
 * ======================================================
 *
 * 🧠 APPROACH 1: BRUTE FORCE (Factorial)
 *
 * ❌ Inefficient due to repeated factorial calls
 *
 * ======================================================
 *
 * 🧠 APPROACH 2: RECURSIVE (Optimized Conceptually)
 *
 * Use:
 * C(n, r) = C(n-1, r-1) + C(n-1, r)
 *
 * Base Cases:
 * C(n, 0) = 1
 * C(n, n) = 1
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(2^n) → exponential ❌
 *
 * 🧠 Space Complexity:
 * O(n) → recursion stack
 *
 * ======================================================
 *
 * ⚠️ NOTE:
 * This is NOT the most optimized solution.
 * (Memoization will optimize later)
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "This is a recursive definition of Pascal’s Triangle"
 *
 * ======================================================
 */
public class PascalsTriangleRecursion {

    // 🔥 Recursive function to calculate nCr
    public static int nCr(int n, int r) {

        // Base case
        if (r == 0 || r == n) {
            return 1;
        }

        // Recursive case
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Print triangle
        for (int i = 0; i < n; i++) {

            // Spaces (optional formatting)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Values
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}