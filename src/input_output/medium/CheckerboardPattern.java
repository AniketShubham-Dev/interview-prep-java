package input_output.medium;

import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Checkerboard Pattern
 * ======================================================
 *
 * 📌 Pattern (n = 5):
 *
 * *   *   *   *   *
 *   *   *   *   *
 * *   *   *   *   *
 *   *   *   *   *
 * *   *   *   *   *
 *
 * ======================================================
 *
 * 🧠 APPROACH 1: BRUTE FORCE (Hardcoding)
 *
 * ❌ Not scalable
 *
 * ======================================================
 *
 * 🧠 APPROACH 2: OPTIMIZED (Mathematical Condition)
 *
 * ✅ Use:
 * (i + j) % 2
 *
 * If even → print "*"
 * If odd  → print space
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(n^2)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ======================================================
 *
 * 🔍 EDGE CASES:
 * - n = 1 → single "*"
 *
 * ======================================================
 *
 * ⚠️ COMMON MISTAKES:
 * - Wrong spacing
 * - Not using modulo logic
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "Use parity of indices to alternate pattern"
 *
 * ======================================================
 */
public class CheckerboardPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {           // rows
            for (int j = 0; j < n; j++) {       // columns

                // Core condition
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}