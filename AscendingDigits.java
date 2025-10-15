import java.util.Scanner;

public class AscendingDigits {

    public static void main(String[] args) {
        // To read user input
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Input : ");
        int num = scanner.nextInt();

        // Assume the number is ascending
        boolean isAscending = true;

        // Get the last digit to start the comparison
        int lastDigit = num % 10;
        // Remove the last digit from the number
        num = num / 10;

        // Loop while there are still digits left
        while (num > 0) {
            // Get the current last digit
            int currentDigit = num % 10;

            // If the digit on the left is bigger than the digit on the right
            if (currentDigit > lastDigit) {
                isAscending = false; // It's not ascending
                break; // No need to check more, so exit loop
            }

            // The current digit becomes the last digit for the next check
            lastDigit = currentDigit;
            // Remove the digit we just checked
            num = num / 10;
        }

        // Print the final result
        if (isAscending) {
            System.out.println("Output : Digits are in ascending order");
        } else {
            System.out.println("Output : Digits are not in ascending order");
        }

        scanner.close();
    }
}

