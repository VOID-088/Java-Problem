

import java.util.Scanner;

public class InPlaceReverse {

    public static void main(String[] args) {
        // Create a scanner to read user input.
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements.
        System.out.print("Input: "); 
        int n = scanner.nextInt();
        
        // Create an array of the specified size.
        int[] arr = new int[n];

        // Read the elements into the array.
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // --- In-place reversal logic ---
        
        // 'start' pointer is at the beginning of the array.
        int start = 0;
        // 'end' pointer is at the end of the array.
        int end = arr.length - 1;

        // Loop until the pointers meet in the middle.
        while (start < end) {
            // Store the element from the start.
            int temp = arr[start];
            
            // Swap the elements.
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers closer to the center.
            start++;
            end--;
        }

        // Print the reversed array.
        System.out.print("Output: "); 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner.
        scanner.close();
    }
}
