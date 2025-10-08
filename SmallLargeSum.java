

import java.util.ArrayList;
import java.util.Collections;

public class SmallLargeSum {

    public static void main(String[] args) {
        // Input array.
        int[] arr = {3, 2, 1, 7, 5, 4};
        
        // Get and print the result.
        int result = smallLargeSum(arr);
        System.out.println("Output: " + result);
    }

    public static int smallLargeSum(int[] arr) {
        
        // Return 0 if array is too small.
        if (arr.length <= 3) {
            return 0;
        }

        // Create lists for even and odd index elements.
        ArrayList<Integer> evenElements = new ArrayList<>();
        ArrayList<Integer> oddElements = new ArrayList<>();

        // Separate array elements based on index.
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenElements.add(arr[i]); // Even index
            } else {
                oddElements.add(arr[i]); // Odd index
            }
        }

        // Sort both lists.
        Collections.sort(evenElements);
        Collections.sort(oddElements);

        // Get the second largest element from each list.
        int secondLargestEven = evenElements.get(evenElements.size() - 2);
        int secondLargestOdd = oddElements.get(oddElements.size() - 2);
        
        // Return the sum.
        return secondLargestEven + secondLargestOdd;
    }
}
