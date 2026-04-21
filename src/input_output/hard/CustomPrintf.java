package input_output.hard;

/**
 * ======================================================
 * 🔥 Problem: Custom printf Implementation
 * ======================================================
 *
 * 🧠 GOAL:
 * Implement basic printf functionality
 *
 * Supports:
 * %s → String
 * %d → Integer
 * %f → Double
 *
 * ======================================================
 *
 * 🧠 APPROACH:
 *
 * 1. Traverse format string character by character
 * 2. When '%' is found:
 *    - Look at next character
 *    - Replace with corresponding argument
 * 3. Maintain argument index
 *
 * ======================================================
 *
 * ⏱ Time Complexity:
 * O(n)
 *
 * 🧠 Space Complexity:
 * O(n)
 *
 * ======================================================
 *
 * ⚠️ LIMITATIONS:
 * - No formatting width/precision
 * - Limited specifiers
 *
 * ======================================================
 *
 * 💡 INTERVIEW TIP:
 * "This mimics how formatting engines parse templates"
 *
 * ======================================================
 */
public class CustomPrintf {

    public static void myPrintf(String format, Object... args) {

        int argIndex = 0;

        for (int i = 0; i < format.length(); i++) {

            char ch = format.charAt(i);

            // Check for format specifier
            if (ch == '%' && i + 1 < format.length()) {

                char nextChar = format.charAt(i + 1);

                switch (nextChar) {

                    case 's':
                        System.out.print((String) args[argIndex++]);
                        break;

                    case 'd':
                        System.out.print((Integer) args[argIndex++]);
                        break;

                    case 'f':
                        System.out.print((Double) args[argIndex++]);
                        break;

                    default:
                        System.out.print("%" + nextChar);
                }

                i++; // Skip next char (specifier)
            } else {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {

        myPrintf("Hello %s, age %d, score %f\n", "Aniket", 28, 95.5);
    }
}