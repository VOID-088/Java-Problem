

public class SimpleCheckAscending {

    public static void main(String[] args) {
        
        // The number we want to check.
        long number = 12341;
        System.out.println("Checking number: " + number);

        // This will hold the digit to the right for comparison.
        // We start it at 10, a value higher than any possible digit.
        long previousDigit = 10;

        // Loop as long as there are digits left in the number.
        while (number > 0) {
            // Get the current rightmost digit.
            long currentDigit = number % 10;

            // If a digit is larger than the one that was to its right,
            // the number is not in ascending order.
            if (currentDigit > previousDigit) {
                System.out.println("Digits are not in ascending order");
                return; // Exit the program immediately.
            }

            // The current digit becomes the previous digit for the next loop.
            previousDigit = currentDigit;
            
            // Remove the last digit from the number.
            number = number / 10;
        }

        // If the loop completes without exiting, it means all digits were in order.
        System.out.println("Digits are in ascending order");
    }
}
