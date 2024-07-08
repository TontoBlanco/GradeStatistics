/*------------------------------------------------------------------------------------
Program Name: CSC320_CTA4_Option2.java
Author: Cole Miller
Date: 07/07/24
---------------------------------------------------------------------------------------
Psuedocode:
    1. Start
    2. Initialize variables for sum, max, and min.
    3. Use a for-loop to read 10 grades from the user.
    4. For each grade:
       A. Add the grade to the sum.
       B. Update max if the grade is greater than the current max.
       C. Update min if the grade is less than the current min.
    5. Display all grades entered.
    6. Calculate the average.
    7. Print the average, max, and min.
    8. End

---------------------------------------------------------------------------------------
Program Inputs: 10 grades.
Program Outputs: Display average, max, and min or grades.
---------------------------------------------------------------------------------------

 */

import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Array to store the grades
        float[] grades = new float[10];

        // Variables to store the sum of grades, maximum grade, and minimum grade
        float sum = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;

        // Prompt user to enter 10 grades
        System.out.println("Enter 10 grades:");

        // For-loop to read 10 grades from the user
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    // Ask the user to enter a grade
                    System.out.print("Grade " + (i + 1) + ": ");
                    // Read the grade and convert it to a float
                    grades[i] = Float.parseFloat(scanner.nextLine());
                    break; // Exit the loop if parsing is successful
                } catch (NumberFormatException e) {
                    // Handle invalid input and prompt the user again
                    System.out.println("Invalid input. Please enter a valid floating-point number.");
                }
            }

            // Add the grade to the sum
            sum += grades[i];

            // Update the maximum grade if the current grade is higher
            if (grades[i] > max) {
                max = grades[i];
            }

            // Update the minimum grade if the current grade is lower
            if (grades[i] < min) {
                min = grades[i];
            }
        }

        // Display all grades entered
        System.out.println("Grades entered:");
        for (int i = 0; i < 10; i++){
            System.out.printf("Grade %d: %.2f\n", i + 1, grades[i]);
        }

        // Calculate the average grade
        float average = sum / 10;

        // Print the average, maximum, and minimum grades
        System.out.printf("Average grade: %.2f\n", average);
        System.out.printf("Maximum grade: %.2f\n", max);
        System.out.printf("Minimum grade: %.2f\n", min);

        // Close the scanner
        scanner.close();
    }
}
