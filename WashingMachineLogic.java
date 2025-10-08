

public class WashingMachineLogic {

    public static void main(String[] args) {
        // Test cases
        runTest(2000);
        runTest(8000);
        runTest(-5);
        runTest(3500);
    }
    
    // Helper method to run tests and print results.
    public static void runTest(int weight) {
        System.out.println("\nInput: " + weight);
        String result = getTimeEstimate(weight);
        System.out.println("Output: " + result);
    }

    // Estimates washing time based on the weight of clothes.
    public static String getTimeEstimate(int weightInGrams) {
        
        // Handle invalid and boundary conditions first.
        if (weightInGrams < 0) {
            return "INVALID INPUT";
        } else if (weightInGrams > 7000) {
            return "OVERLOADED";
        } else if (weightInGrams == 0) {
            return "Time Estimated: 0 minutes";
        
        // Check the valid weight ranges.
        } else if (weightInGrams <= 2000) {
            return "Time Estimated: 25 minutes";
        } else if (weightInGrams <= 4000) {
            return "Time Estimated: 35 minutes";
        } else { 
            return "Time Estimated: 45 minutes";
        }
    }
}
