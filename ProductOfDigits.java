

public class ProductOfDigits {

    public static void main(String[] args) {
        // Test cases
        calculateAndPrint(234);
        calculateAndPrint(105);
        calculateAndPrint(7);
        calculateAndPrint(-543);
        calculateAndPrint(0);
    }

    /**
     * Calculates and prints the product of a number's digits.
     */
    public static void calculateAndPrint(long number) {
        System.out.println("Input  : " + number);

        // Handle the input 0.
        if (number == 0) {
            System.out.println("Output : 0");
            return;
        }

        // Use the absolute value to handle negative numbers.
        long tempNumber = Math.abs(number);

        // Initialize product to 1.
        long product = 1;

        // Loop through each digit of the number.
        while (tempNumber > 0) {
            // Get the last digit.
            long lastDigit = tempNumber % 10;
            
            // If any digit is 0, the final product must be 0.
            if (lastDigit == 0) {
                product = 0;
                break; // Exit the loop early.
            }
            
            product = product * lastDigit;

            // Remove the last digit.
            tempNumber = tempNumber / 10;
        }

        System.out.println("Output : " + product);
    }
}
