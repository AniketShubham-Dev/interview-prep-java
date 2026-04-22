package input_output.hard;


import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Diamond Pattern with Numbers
 * ======================================================
 *
 * 🧠 GOAL:
 * Print diamond pattern using numbers
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * Pattern = Upper Half + Lower Half
 *
 * Each row contains:
 * 1. Spaces → (n - i)
 * 2. Increasing numbers → 1 to i
 * 3. Decreasing numbers → i-1 to 1
 *
 * Lower half is mirror of upper half
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
 * 💡 INTERVIEW TIP:
 * "Break pattern into symmetric halves and reuse logic"
 *
 * ======================================================
 *
 * 📌 SAMPLE INPUT:
 * ======================================================
 * Enter size: 5
 *
 * ======================================================
 * 📌 SAMPLE OUTPUT:
 * ======================================================
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 *  1234321
 *   12321
 *    121
 *     1
 *
 * ======================================================
 */
public class DiamondNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // 🔼 Upper Half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // 🔽 Lower Half
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
