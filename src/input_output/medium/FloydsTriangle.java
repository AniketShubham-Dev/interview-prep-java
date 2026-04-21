package input_output.medium;

import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Floyd’s Triangle
 * ======================================================
 *
 * 📌 Pattern:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 * ======================================================
 *
 * 🧠 APPROACH 1: BRUTE FORCE (Hardcoding)
 *
 * ❌ Idea:
 * Manually print each row
 *
 * ❌ Problems:
 * - Not scalable
 * - Not dynamic
 * - Not reusable
 *
 * 👉 Verdict: ❌ Not acceptable
 *
 * ======================================================
 *
 * 🧠 APPROACH 2: OPTIMIZED (Loop + Counter)
 *
 * ✅ Key Idea:
 * - Use a variable `num` initialized to 1
 * - Print number and increment after each print
 *
 * 📊 Pattern Analysis:
 *
 * Row (i) → Number of elements = i
 * Numbers → Continuous (1, 2, 3, 4...)
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
 * - n = 0 → no output
 * - n = 1 → only "1"
 *
 * ======================================================
 *
 * ⚠️ COMMON MISTAKES:
 * - Resetting number inside loop ❌
 * - Using j instead of global counter ❌
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * Say:
 * "Instead of restarting each row, I maintain a global counter
 * that increments after every print."
 *
 * ======================================================
 */
public class FloydsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Counter for continuous numbers
        int num = 1;

        // Outer loop → rows
        for (int i = 1; i <= n; i++) {

            // Inner loop → numbers in each row
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++; // increment after every print
            }

            System.out.println();
        }

        sc.close();
    }
}
