

public class SimpleSumOfSquares {

    public static void main(String[] args) {
        
        // Step 1: Define the input numbers.
        int M = 1;
        int N = 5;

        // Step 2: Calculate the sum of squares in a loop.
        long sumOfSquares = 0;
        for (int i = M; i <= N; i++) {
            sumOfSquares += (long) i * i;
        }

        // Step 3: Apply the rules to determine the final result.
        long finalResult;

        if (sumOfSquares > N) {
            // If the sum is greater than N, the result is -1.
            finalResult = -1;
        } else {
            // Otherwise, check if the sum is even or odd.
            if (sumOfSquares % 2 == 0) {
                // If even, the result is the sum divided by 2.
                finalResult = sumOfSquares / 2;
            } else {
                // If odd, the result is just the sum.
                finalResult = sumOfSquares;
            }
        }

        // Step 4: Print the final result.
        System.out.println("The final result is: " + finalResult);
    }
}
