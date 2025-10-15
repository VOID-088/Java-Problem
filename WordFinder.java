import java.util.Scanner;

public class WordFinder {

    public static void main(String[] args) {

        // To read user input
        Scanner scanner = new Scanner(System.in);

        // Get the main string from the user
        System.out.print("Enter a string: ");
        String mainString = scanner.nextLine();

        // Get the word to search from the user
        System.out.print("Enter word to search: ");
        String wordToSearch = scanner.nextLine();

        // Convert both to lowercase to ignore case
        String lowerCaseMainString = mainString.toLowerCase();
        String lowerCaseWord = wordToSearch.toLowerCase();

        // Use contains() to check if the word exists
        if (lowerCaseMainString.contains(lowerCaseWord)) {
            // Print if found
            System.out.println("Word found!");
        } else {
            // Print if not found
            System.out.println("Word not found!");
        }

        // Close the scanner
        scanner.close();
    }
}
