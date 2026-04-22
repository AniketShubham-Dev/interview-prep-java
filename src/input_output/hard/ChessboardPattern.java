package input_output.hard;


/**
 * ======================================================
 * 🔥 Problem: Chessboard Pattern
 * ======================================================
 *
 * 🧠 GOAL:
 * Print chessboard with:
 * - Alternating colors (B/W)
 * - Row numbers (n → 1)
 * - Column labels (a → ...)
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Take board size input (n)
 * 2. Print column labels (a → ...)
 * 3. Loop rows (n → 1)
 * 4. Loop columns (0 → n-1)
 * 5. Use (i + j) % 2 for color
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
 * "Use parity of indices to alternate colors and add labels for real-world structure"
 *
 * ======================================================
 *
 * 📌 SAMPLE INPUT:
 * ======================================================
 * Enter size: 8
 *
 * ======================================================
 * 📌 SAMPLE OUTPUT:
 * ======================================================
 *   a b c d e f g h
 * 8 B W B W B W B W
 * 7 W B W B W B W B
 * 6 B W B W B W B W
 * 5 W B W B W B W B
 * 4 B W B W B W B W
 * 3 W B W B W B W B
 * 2 B W B W B W B W
 * 1 W B W B W B W B
 *
 * ======================================================
 */
public class ChessboardPattern {

    public static void main(String[] args) {

        int n = 8; // You can later replace with Scanner input

        // 🔹 Column labels
        System.out.print("  ");
        for (char c = 'a'; c < 'a' + n; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 🔹 Rows
        for (int i = 0; i < n; i++) {

            // Row label
            System.out.print((n - i) + " ");

            for (int j = 0; j < n; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("W ");
                }
            }

            System.out.println();
        }
    }
}