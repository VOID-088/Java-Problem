

public class SupermarketBilling {
    public static void main(String[] args) {
        
        // Let's start with a list of our item prices.
        // Feel free to change these values to test out different scenarios!
        double[] items = {600, 250, 150, 800};

        // We'll need a variable to keep track of the final bill. Let's call it 'totalBill' and start it at zero.
        double totalBill = 0;

        // Now, let's go through each item in our list, one by one.
        for (double price : items) {
            
            double discountedPrice; // This will hold the price after any discount is applied.

            // First, let's check if the item is expensive (500 or more).
            if (price >= 500) {
                // If it is, we'll give a generous 20% discount.
                // Multiplying by 0.80 is the same as taking 20% off.
                discountedPrice = price * 0.80;
                
            // What if the price isn't that high, but it's 200 or more?
            } else if (price >= 200) {
                // For these items, a 10% discount seems fair.
