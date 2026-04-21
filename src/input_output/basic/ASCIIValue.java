package input_output.basic;

import java.util.Scanner;

/**
 * Problem: Print ASCII Value of a Character
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Take character input
 * 2. Typecast character to int
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(1)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - Special characters (!, @, #)
 * - Lowercase vs uppercase letters
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Not using charAt(0) for input
 * - Confusing ASCII with Unicode (Java uses Unicode but ASCII is subset)
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * A
 *
 * 🧪 Sample Output:
 * ASCII Value: 65
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Helps understand how characters are stored internally
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Type Casting / Character Encoding
 */
public class ASCIIValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to ASCII
        int ascii = (int) ch;

        // Output
        System.out.println("\nASCII Value: " + ascii);

        sc.close();
    }
}