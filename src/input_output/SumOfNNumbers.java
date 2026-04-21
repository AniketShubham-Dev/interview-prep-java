package input_output;

import java.util.Scanner;

/**
 * Problem: Sum of N Numbers
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Brute Force → loop from 1 to n and add
 * 2. Optimized → use formula n(n+1)/2
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * Brute Force: O(n)
 * Optimized: O(1)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - n = 0 → output = 0
 * - n < 0 → depends on requirement (not valid here)
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Integer overflow for large n
 * - Using loop unnecessarily when formula exists
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * 5
 *
 * 🧪 Sample Output:
 * 15
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Introduces optimization using mathematical formulas
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Mathematical Optimization
 */
public class SumOfNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // 🔹 Brute Force
        int bruteSum = 0;
        for (int i = 1; i <= n; i++) {
            bruteSum += i;
        }

        // 🔹 Optimized
        int optimizedSum = (n * (n + 1)) / 2;

        // Output
        System.out.println("\n--- Output ---");
        System.out.println("Brute Force Sum: " + bruteSum);
        System.out.println("Optimized Sum: " + optimizedSum);

        sc.close();
    }
}