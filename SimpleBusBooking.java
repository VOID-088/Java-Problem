

import java.util.Scanner;

public class SimpleBusBooking {

    public static void main(String[] args) {
        
        // Define the total number of seats on the bus.
        final int TOTAL_SEATS = 10;
        
        // Create a String array to manage seat status.
        String[] seats = new String[TOTAL_SEATS];

        // Set all seats to "Empty" initially.
        for (int i = 0; i < TOTAL_SEATS; i++) {
            seats[i] = "Empty";
        }
        
        // Create a Scanner to get user input.
        Scanner scanner = new Scanner(System.in);
        
        // The main loop keeps the menu running.
        while (true) {
            // Display menu options.
            System.out.println("\n===== Bus Booking Menu =====");
            System.out.println("1. View all seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // View all seats
                    System.out.println("\n--- Current Seat Status ---");
                    for (int i = 0; i < seats.length; i++) {
                        // Add 1 to index 'i' for user-friendly seat numbers (1-10).
                        System.out.println("Seat " + (i + 1) + ": " + seats[i]);
                    }
                    System.out.println("---------------------------");
                    break;

                case 2: // Book a seat
                    System.out.print("Enter seat number to book (1-" + seats.length + "): ");
                    int seatToBook = scanner.nextInt();

                    // Check for valid seat number.
                    if (seatToBook < 1 || seatToBook > seats.length) {
                        System.out.println("Invalid seat number!");
                    // Check if the seat is already taken. Subtract 1 to get the array index.
                    } else if (!seats[seatToBook - 1].equals("Empty")) {
                        System.out.println("Sorry, Seat " + seatToBook + " is already booked.");
                    } else {
                        // If the seat is available, book it.
                        System.out.print("Enter passenger name: ");
                        String name = scanner.next();
                        seats[seatToBook - 1] = name;
                        System.out.println("Booking successful for " + name + " on Seat " + seatToBook);
                    }
                    break;

                case 3: // Cancel a booking
                    System.out.print("Enter seat number to cancel (1-" + seats.length + "): ");
                    int seatToCancel = scanner.nextInt();
                    
                    // Check for valid seat number.
                    if (seatToCancel < 1 || seatToCancel > seats.length) {
                        System.out.println("Invalid seat number!");
                    // Check if the seat is already empty.
                    } else if (seats[seatToCancel - 1].equals("Empty")) {
                        System.out.println("Error: Seat " + seatToCancel + " is already empty.");
                    } else {
                        // If the seat is booked, make it empty.
                        seats[seatToCancel - 1] = "Empty";
                        System.out.println("Cancellation successful for Seat " + seatToCancel);
                    }
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the booking system.");
                    scanner.close(); // Close the scanner.
                    return; // Exit the program.

                default: // Handle invalid menu choices
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
