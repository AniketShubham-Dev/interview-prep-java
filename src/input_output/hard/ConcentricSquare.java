package input_output.hard;


import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Concentric Square Pattern
 * ======================================================
 *
 * 🧠 GOAL:
 * Print concentric squares based on input n
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Matrix size = (2*n - 1)
 * 2. For each cell:
 *    value = n - min(
 *                min(i, j),
 *                min(size-1-i, size-1-j)
 *             )
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
 * "Value depends on minimum distance from boundary"
 *
 * ======================================================
 *
 * 📌 SAMPLE INPUT:
 * ======================================================
 * Enter n: 4
 *
 * ======================================================
 * 📌 SAMPLE OUTPUT:
 * ======================================================
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 *
 * ======================================================
 */
public class ConcentricSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));

                int value = n - minDistance;

                System.out.print(value + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}