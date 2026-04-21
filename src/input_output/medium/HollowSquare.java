package input_output.medium;


import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Hollow Square Pattern
 * ======================================================
 *
 * 📌 Pattern (n = 5):
 *
 * * * * *
 * *       *
 * *       *
 * *       *
 * * * * *
 *
 * ======================================================
 *
 * 🧠 APPROACH 1: BRUTE FORCE (Hardcoding)
 *
 * ❌ Not scalable, not dynamic
 *
 * ======================================================
 *
 * 🧠 APPROACH 2: OPTIMIZED (Condition-Based)
 *
 * ✅ Print '*' only at borders:
 *
 * Condition:
 * i == 1  → top row
 * i == n  → bottom row
 * j == 1  → left column
 * j == n  → right column
 *
 * Else → print space
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
 * - n = 1 → single '*'
 * - n = 0 → no output
 *
 * ======================================================
 *
 * ⚠️ COMMON MISTAKES:
 * - Printing '*' everywhere
 * - Missing corner conditions
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "I identify border conditions and print based on them"
 *
 * ======================================================
 */
public class HollowSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // Outer loop → rows
        for (int i = 1; i <= n; i++) {

            // Inner loop → columns
            for (int j = 1; j <= n; j++) {

                // Border condition
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // space inside
                }
            }

            System.out.println();
        }

        sc.close();
    }
}