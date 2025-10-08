

public class InvertedStarPattern {

    public static void main(String[] args) {
        
        // Defines the total number of rows for the triangle.
        int rows = 4;

        // The outer loop handles the number of rows.
        // It starts from the total number of rows and counts down to 1.
        for (int i = rows; i >= 1; i--) {

            // The inner loop handles the number of stars in each row.
            // It runs 'i' times, printing one star in each iteration.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // After printing all stars for a row, this moves the cursor to the next line.
            System.out.println();
        }
    }
}
