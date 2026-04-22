package input_output.hard;


import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Zig-Zag Matrix Traversal
 * ======================================================
 *
 * 🧠 GOAL:
 * Print matrix in zig-zag (wave) order
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Traverse row by row
 * 2. If row index is even → left to right
 * 3. If row index is odd  → right to left
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(n * m)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "Change traversal direction based on row parity"
 *
 * ======================================================
 *
 * 📌 SAMPLE INPUT:
 * ======================================================
 * Enter rows: 3
 * Enter columns: 4
 * Enter matrix:
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 *
 * ======================================================
 * 📌 SAMPLE OUTPUT:
 * ======================================================
 * 1 2 3 4 8 7 6 5 9 10 11 12
 *
 * ======================================================
 */
public class ZigZagMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        System.out.print("Enter columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements:");

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Zig-Zag Traversal
        System.out.println("Zig-Zag Order:");

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                // Left to Right
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Right to Left
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        sc.close();
    }
}
