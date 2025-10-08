

public class SwapFirstLastDigit {

    public static void main(String[] args) {
        // --- Run all test cases ---
        System.out.println("--- Test Case 01 ---");
        swapAndPrint(12345);

        System.out.println("\n--- Test Case 02 ---");
        swapAndPrint(9876);

        System.out.println("\n--- Test Case 03 ---");
        swapAndPrint(808);
        
        System.out.println("\n--- Bonus Test Case (Single Digit) ---");
        swapAndPrint(7);
    }

    /**
     * A helper method that performs the swap and prints the result.
     * @param number The number to process.
     */
    public static void swapAndPrint(long number) {
        System.out.println("Input : " + number);

        // Rule: If the number has only one digit, it remains the same.
        if (number < 10) {
            System.out.println("Output : " + number);
            return;
        }

        // Step 1: Get the last digit. This is the easy part.
        // Example: 12345 % 10 = 5
        long lastDigit = number % 10;

        // Step 2: Find the first digit and its place value (power of 10).
        long temp = number;
        long powerOf10 = 1;
        while (temp >= 10) {
            temp = temp / 10;
            powerOf10 *= 10;
        }
        // After the loop, 'temp' will be the first digit.
        // Example: For 12345, temp becomes 1 and powerOf10 becomes 10000.
        long firstDigit = temp;

        // Step 3: Isolate the middle part of the number.
        // First, remove the first digit's value.
        // Example: 12345 % 10000 = 2345
        long numberWithoutFirst = number % powerOf10;
        // Then, remove the last digit from that result.
        // Example: 2345 / 10 = 234
        long middleDigits = numberWithoutFirst / 10;

        // Step 4: Reconstruct the new number with swapped digits.
        // (lastDigit * its_new_place) + (middle * its_place) + firstDigit
        // Example: (5 * 10000) + (234 * 10) + 1
        long newNumber = (lastDigit * powerOf10) + (middleDigits * 10) + firstDigit;

        System.out.println("Output : " + newNumber);
    }
}
