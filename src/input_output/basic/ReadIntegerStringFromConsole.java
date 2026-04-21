package input_output.basic;

import java.util.Scanner;

/**
 * Problem: Read Integer and String from Console
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Read integer using nextInt()
 * 2. Clear buffer using nextLine()
 * 3. Read full string using nextLine()
 *
 * ------------------------------------------------------
 * ⚠️ Important Concept:
 * nextInt() does NOT consume newline (\n)
 * So nextLine() reads leftover newline instead of actual input
 *
 * Solution:
 * Use an extra nextLine() to clear buffer
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(1) → Constant time input operations
 *
 * 🧠 Space Complexity:
 * O(1) → No extra space used
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - Empty string input
 * - String with only spaces
 * - Negative integer input
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Forgetting buffer clearing step
 * - Using next() instead of nextLine()
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * 10
 * Hello World
 *
 * 🧪 Sample Output:
 * Integer: 10
 * String: Hello World
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Helps understand Java input buffer behavior.
 * Very common interview trap.
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Input Handling + Buffer Management
 */

public class ReadIntegerStringFromConsole {

    public static void main(String[] args){
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Step 1: Read integer
        System.out.println("Enter an int");
        int a = sc.nextInt();

        // Step 2: Clear buffer (IMPORTANT STEP)
        sc.nextLine();

        // Step 3: Read string (full line)
        System.out.println("Enter a String");
        String b = sc.nextLine();

        // Step 4: Print output
        System.out.println("int : "+a);
        System.out.println("String : "+b);

        // Close scanner
        sc.close();
    }
}
