package input_output.medium;

import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Spiral Matrix Traversal
 * ======================================================
 *
 * 📌 Input:
 * Matrix of size n x m
 *
 * 📌 Output:
 * Print elements in spiral order
 *
 * Example:
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 *
 * Output:
 * 1 2 3 4 8 12 11 10 9 5 6 7
 *
 * ======================================================
 *
 * 🧠 APPROACH 1: BRUTE FORCE (Visited Array)
 *
 * ❌ Idea:
 * - Keep visited matrix
 * - Move in directions (right, down, left, up)
 *
 * ❌ Problems:
 * - Extra space O(n*m)
 * - Complex logic
 *
 * ======================================================
 *
 * 🧠 APPROACH 2: OPTIMIZED (Boundary Traversal)
 *
 * ✅ Use 4 pointers:
 * top, bottom, left, right
 *
 * Steps:
 * 1. Traverse top row → left to right
 * 2. Traverse right column → top to bottom
 * 3. Traverse bottom row → right to left
 * 4. Traverse left column → bottom to top
 *
 * After each step → shrink boundary
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
 * 🔍 EDGE CASES:
 * - Single row
 * - Single column
 *
 * ======================================================
 *
 * ⚠️ COMMON MISTAKES:
 * - Not checking boundary conditions
 * - Infinite loop
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "Use boundary pointers instead of visited array for optimal solution"
 *
 * ======================================================
 */
public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        System.out.print("Enter columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        System.out.println("Spiral Order:");

        while (top <= bottom && left <= right) {

            // 🔹 Top Row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // 🔹 Right Column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // 🔹 Bottom Row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // 🔹 Left Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}