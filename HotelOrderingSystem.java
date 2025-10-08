

import java.util.Scanner; // Import the Scanner class for user input.

public class HotelOrderingSystem {

    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Display the welcome message and main menu.
        System.out.println("===== Welcome to Hotel Restaurant =====");
        System.out.println("\nMenu:");
        System.out.println("1. Starters");
        System.out.println("2. Main Course");
        System.out.println("3. Desserts");
        System.out.print("Enter your choice (1-3): ");

        // Read the main category choice from the user.
        int categoryChoice = scanner.nextInt();
        
        // Use a switch statement to handle the category selection.
        switch (categoryChoice) {
            
            // User selected Starters.
            case 1:
                System.out.println("Starters Menu:");
                System.out.println("1. Gobi Manchurian - ₹150");
                System.out.println("2. Paneer Tikka - ₹170");
                System.out.print("Enter your choice: ");
                int starterChoice = scanner.nextInt();
                
                // Nested switch to handle the specific starter item.
                switch (starterChoice) {
                    case 1:
                        calculateBill(scanner, 150);
                        break;
                    case 2:
                        calculateBill(scanner, 170);
                        break;
                    default:
                        System.out.println("Invalid Item Choice!");
                        break;
                }
                break;

            // User selected Main Course.
            case 2:
                System.out.println("Main Course Menu:");
                System.out.println("1. Paneer Butter Masala - ₹200");
                System.out.println("2. Veg Biryani - ₹180");
                System.out.print("Enter your choice: ");
                int mainCourseChoice = scanner.nextInt();
                
                // Nested switch to handle the specific main course item.
                switch (mainCourseChoice) {
                    case 1:
                        calculateBill(scanner, 200);
                        break;
                    case 2:
                        calculateBill(scanner, 180);
                        break;
                    default:
                        System.out.println("Invalid Item Choice!");
                        break;
                }
                break;

            // User selected Desserts.
            case 3:
                System.out.println("Desserts Menu:");
                System.out.println("1. Gulab Jamun - ₹100");
                System.out.println("2. Ice Cream - ₹80");
                System.out.print("Enter your choice: ");
                int dessertChoice = scanner.nextInt();
                
                // Nested switch to handle the specific dessert item.
                switch (dessertChoice) {
                    case 1:
                        calculateBill(scanner, 100);
                        break;
                    case 2:
                        calculateBill(scanner, 80);
                        break;
                    default:
                        System.out.println("Invalid Item Choice!");
                        break;
                }
                break;
                
            // Handles any category choice other than 1, 2, or 3.
            default:
                System.out.println("Invalid Category Choice!");
                break;
        }

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }

    /**
     * Helper method to get quantity, calculate the total bill, and print it.
     * @param scanner The Scanner object to read user input.
     * @param itemPrice The price of the chosen item.
     */
    public static void calculateBill(Scanner scanner, int itemPrice) {
        // Prompt user for quantity.
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        // Calculate the total bill.
        int totalBill = itemPrice * quantity;
        
        // Print the final bill details.
        System.out.println("================================");
        System.out.println("Thank you for your order!");
        System.out.println("Your Total Bill: ₹" + totalBill);
        System.out.println("================================");
    }
}
