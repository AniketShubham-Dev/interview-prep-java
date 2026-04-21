package input_output.basic;

import java.util.Scanner;

/**
 * Problem: Print Star Triangle Pattern
 *
 * ------------------------------------------------------
 * Pattern:
 * *
 * * *
 * * * *
 * * * * *
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Outer loop → number of rows
 * 2. Inner loop → print stars equal to row number
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(n^2) → nested loops
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - n = 0 → no output
 * - n = 1 → single star
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Wrong loop boundaries
 * - Printing extra spaces or missing stars
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * 5
 *
 * 🧪 Sample Output:
 * *
 * * *
 * * * *
 * * * * *
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Builds strong foundation for nested loops and pattern recognition
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Increasing Triangle Pattern
 */
public class StarTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Step 2: Outer loop (rows)
        for (int i = 1; i <= n; i++) {

            // Step 3: Inner loop (stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }

        System.out.println();
        //Reversed String
        System.out.println("Reversed Triangle:-");
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}