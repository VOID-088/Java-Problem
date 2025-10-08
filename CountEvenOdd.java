

public class CountEvenOdd {

    public static void main(String[] args) {
        
        // The input array of integers.
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Initialize counters for even and odd numbers to zero.
        int evenCount = 0;
        int oddCount = 0;

        // Loop through each number in the array.
        for (int number : arr) {
            // Check if the number is divisible by 2.
            if (number % 2 == 0) {
                // If the remainder is 0, the number is even.
                evenCount++;
            } else {
                // Otherwise, the number is odd.
                oddCount++;
            }
        }

        // Print the final counts.
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
