package input_output.medium;

import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Butterfly Pattern
 * ======================================================
 *
 * 📌 Pattern (n = 5):
 *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * Pattern = Upper Half + Lower Half
 *
 * Each row has:
 * 1. Left stars
 * 2. Spaces
 * 3. Right stars
 *
 * ------------------------------------------------------
 *
 * 🔼 Upper Half:
 * i = 1 → n
 * Stars = i
 * Spaces = 2 * (n - i)
 *
 * 🔽 Lower Half:
 * i = n → 1
 * Stars = i
 * Spaces = 2 * (n - i)
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
 * - n = 1 → minimal butterfly
 * - n = 0 → no output
 *
 * ======================================================
 *
 * ⚠️ COMMON MISTAKES:
 * - Wrong spacing (pattern breaks)
 * - Not mirroring correctly
 * - Printing middle row incorrectly
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "Break complex pattern into smaller known patterns"
 *
 * ======================================================
 */
public class ButterflyPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // 🔼 Upper Half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 🔽 Lower Half
        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}