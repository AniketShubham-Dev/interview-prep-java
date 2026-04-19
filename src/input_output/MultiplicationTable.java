package input_output;


import java.util.Scanner;

/**
 * Problem: Print Multiplication Table
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Take input number
 * 2. Use loop from 1 to 10
 * 3. Multiply number with loop variable
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(n) → where n = 10 (constant, but conceptually linear)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - Input = 0
 * - Negative number
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Hardcoding instead of loop
 * - Incorrect loop range
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * 5
 *
 * 🧪 Sample Output:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Builds loop fundamentals and pattern thinking
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Fixed Value + Iteration Pattern
 */

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Step 2: Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Step 3: Print multiplication result
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}