package input_output;

import java.util.Scanner;

/**
 * Problem: Accept All Data Types from Console
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Use Scanner methods to read each data type
 * 2. Use next().charAt(0) for character input
 * 3. Clear buffer before reading full string
 *
 * ------------------------------------------------------
 * ⚠️ Important Concept:
 * nextLine() reads entire line including spaces
 * Must clear buffer after numeric inputs
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
 * - Negative numbers
 * - Large values
 * - Empty string
 * - Boolean case sensitivity (true/false)
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Forgetting buffer clear before nextLine()
 * - Using next() instead of nextLine()
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * 10
 * 10000000000
 * 5.5
 * 10.12345
 * A
 * true
 * Hello World
 *
 * 🧪 Sample Output:
 * Integer: 10
 * Long: 10000000000
 * Float: 5.5
 * Double: 10.12345
 * Char: A
 * Boolean: true
 * String: Hello World
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Helps understand handling of multiple data types and input flow.
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Multi-Type Input Handling
 */

public class AllDataTypesInput {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //Integer
        System.out.println("Enter an int :");
        int a = sc.nextInt();

        //Long
        System.out.println("Enter an long");
        long b = sc.nextLong();

        // Float
        System.out.print("Enter float: ");
        float f = sc.nextFloat();

        // Double
        System.out.print("Enter double: ");
        double d = sc.nextDouble();

        // Boolean
        System.out.print("Enter boolean (true/false): ");
        boolean bl = sc.nextBoolean();

        // Character
        System.out.print("Enter char: ");
        char c = sc.next().charAt(0);

        // Word
        System.out.print("Enter word: ");
        String word = sc.next();

        sc.nextLine(); // 🔥 clear buffer before nextLine

        // Full sentence
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        // Output
        System.out.println("\n--- Output ---");
        System.out.println("int: " + a);
        System.out.println("long: " + b);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bl);
        System.out.println("char: " + c);
        System.out.println("word: " + word);
        System.out.println("sentence: " + sentence);

        sc.close();
    }
}
