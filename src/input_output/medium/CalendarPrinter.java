package input_output.medium;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

/**
 * Problem: Print Calendar for Given Month & Year
 *
 * ------------------------------------------------------
 * 🧠 Approach:
 * 1. Use YearMonth to get number of days
 * 2. Use LocalDate to find first day of month
 * 3. Print spaces for alignment
 * 4. Print dates in calendar format
 *
 * ------------------------------------------------------
 * ⏱ Time Complexity:
 * O(n) → n = number of days (max 31)
 *
 * 🧠 Space Complexity:
 * O(1)
 *
 * ------------------------------------------------------
 * 🔍 Edge Cases:
 * - Leap year (Feb = 29)
 * - Invalid month input
 *
 * ------------------------------------------------------
 * ⚠️ Common Mistakes:
 * - Wrong day alignment
 * - Ignoring leap year
 *
 * ------------------------------------------------------
 * 🧪 Sample Input:
 * Month: 4
 * Year: 2026
 *
 * ------------------------------------------------------
 * 💡 Why This Problem?
 * Combines date handling + formatting logic
 *
 * ------------------------------------------------------
 * 🧩 Pattern:
 * Real-world simulation problem
 */
public class CalendarPrinter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Get number of days
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        // Get first day of month
        LocalDate firstDay = LocalDate.of(year, month, 1);
        int dayOfWeek = firstDay.getDayOfWeek().getValue(); // 1 = Monday

        // Print header
        System.out.println("\nSu Mo Tu We Th Fr Sa");

        // Adjust for Sunday start
        int startDay = dayOfWeek % 7;

        // Print spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}