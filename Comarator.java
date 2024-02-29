import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Comarator {
    public static void main(String args[]) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create a new ArrayList to store the entered numbers
        List<String> nums = new ArrayList<>();

        // Loop through the input process 5 times
        for (int i = 0; i < 5; i++) {
            // Read a line of input and store it as a String
            String n = scanner.nextLine();

            // Add the String to the nums list
            nums.add(n);
        }

        // Create a new Comparator object that compares Strings based on their length
        Comparator<String> com = new Comparator<String>() {
            public int compare(String s1, String s2) {
                // Compare the lengths of the two Strings
                if (s1.length() > s2.length()) {
                    // If s1 is longer, return a positive value
                    return 1;
                } else {
                    // If s1 is shorter, return a negative value
                    return -1;
                }
            }
        };

        // Sort the nums list using the custom Comparator
        Collections.sort(nums, com);

        // Print the sorted list of Strings
        System.out.println(nums);

        // Close the Scanner to release system resources
        scanner.close();
    }
}
