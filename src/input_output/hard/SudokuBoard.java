package input_output.hard;

import java.util.Scanner;

/**
 * ======================================================
 * 🔥 Problem: Print Sudoku Board from Input
 * ======================================================
 *
 * 🧠 GOAL:
 * Print 9x9 Sudoku grid in structured format
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Store input in 2D array
 * 2. Print row by row
 * 3. Add formatting:
 *    - Horizontal lines after every 3 rows
 *    - Vertical separators after every 3 columns
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(81) → O(1)
 *
 * 🧠 Space Complexity:
 * O(81)
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "Use modulo operation to divide grid into sub-boxes"
 *
 * ======================================================
 */
public class SudokuBoard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = new char[9][9];

        System.out.println("Enter Sudoku (use . for empty):");

        // Input
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        // Print formatted board
        printBoard(board);

        sc.close();
    }

    /**
     * 🔥 Print Sudoku Board with formatting
     */
    private static void printBoard(char[][] board) {

        for (int i = 0; i < 9; i++) {

            // Horizontal separator
            if (i % 3 == 0) {
                System.out.println("-------------------------");
            }

            for (int j = 0; j < 9; j++) {

                // Vertical separator
                if (j % 3 == 0) {
                    System.out.print("| ");
                }

                System.out.print(board[i][j] + " ");
            }

            System.out.println("|");
        }

        System.out.println("-------------------------");
    }
}
