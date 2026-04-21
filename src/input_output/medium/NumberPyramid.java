package input_output.medium;

import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Number Pyramid Pattern
 * ======================================================
 *
 * 📌 Pattern:
 *         1
 *        1 2
 *       1 2 3
 *      1 2 3 4
 *     1 2 3 4 5
 *
 * ======================================================
 *
 * 🧠 APPROACH 1: BRUTE FORCE (Hardcoding)
 *
 * ❌ Idea:
 * Manually print each row
 *
 * Example:
 * System.out.println("    1");
 * System.out.println("   1 2");
 * ...
 *
 * ❌ Problems:
 * - Not scalable
 * - Cannot handle dynamic input n
 * - Not reusable
 * - Not acceptable in interviews
 *
 * ⏱ Time Complexity: O(1) (but meaningless)
 * 🧠 Space Complexity: O(1)
 *
 * 👉 Verdict: ❌ Reject
 *
 * ======================================================
 *
 * 🧠 APPROACH 2: OPTIMIZED (Loop-Based)
 *
 * ✅ Idea:
 * - Outer loop controls rows
 * - Inner loop 1 → spaces
 * - Inner loop 2 → numbers
 *
 * 📊 Pattern Observation:
 * Row (i):
 * Spaces = n - i
 * Numbers = 1 → i
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(n²)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ======================================================
 *
 * 🔍 EDGE CASES:
 * - n = 0 → no output
 * - n = 1 → single element
 *
 * ======================================================
 *
 * ⚠️ COMMON MISTAKES:
 * - Incorrect spacing → misaligned pyramid
 * - Not resetting numbers per row
 *
 * ======================================================
 *
 * 💡 INTERVIEW INSIGHT:
 * Pattern problems are about:
 * 👉 Visualization
 * 👉 Loop control
 * 👉 Relationship between row & column
 *
 * ======================================================
 */
public class NumberPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // 🔥 OPTIMIZED APPROACH

        // Outer loop → rows
        for (int i = 1; i <= n; i++) {

            // Inner loop 1 → spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop 2 → numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}