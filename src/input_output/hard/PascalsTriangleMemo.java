package input_output.hard;


import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Pascal’s Triangle with Memoization
 * ======================================================
 *
 * 🧠 GOAL:
 * Print Pascal’s Triangle using recursion + memoization
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Use recursive formula:
 *    C(n, r) = C(n-1, r-1) + C(n-1, r)
 *
 * 2. Store results in dp[][] to avoid recomputation
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(n^2) ✅
 *
 * 🧠 Space Complexity:
 * O(n^2)
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "Convert recursion to DP using memoization"
 *
 * ======================================================
 *
 * 📌 SAMPLE INPUT:
 * ======================================================
 * Enter number of rows: 5
 *
 * ======================================================
 * 📌 SAMPLE OUTPUT:
 * ======================================================
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 *
 * ======================================================
 */
public class PascalsTriangleMemo {

    static int[][] dp;

    // 🔥 Memoized recursive function
    public static int nCr(int n, int r) {

        // Base cases
        if (r == 0 || r == n) {
            return 1;
        }

        // If already computed → return
        if (dp[n][r] != -1) {
            return dp[n][r];
        }

        // Store result
        dp[n][r] = nCr(n - 1, r - 1) + nCr(n - 1, r);

        return dp[n][r];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        dp = new int[n][n];

        // Initialize dp with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        // Print triangle
        for (int i = 0; i < n; i++) {

            // Formatting spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
