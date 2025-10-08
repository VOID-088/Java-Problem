// File Name: DailyActivity.java

public class DailyActivity {
    public static void main(String[] args) {
        // Input day number
        int day = 3; // You can change this value to test other cases

        System.out.print("Today's Activity: ");

        // Use a switch statement to find the activity for the given day
        switch (day) {
            case 1:
                System.out.println("Math Class");
                break;
            case 2:
                System.out.println("Science Class");
                break;
            case 3:
                System.out.println("English Class");
                break;
            case 4:
                System.out.println("Sports");
                break;
            case 5:
                System.out.println("Art & Craft");
                break;
            case 6:
                System.out.println("Field Trip");
                break;
            case 7:
                System.out.println("Holiday");
                break;
            default: // This runs if no other case matches
                System.out.println("Invalid day. Please enter a number from 1 to 7.");
                break;
        }
    }
}
