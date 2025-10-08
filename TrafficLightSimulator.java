

public class TrafficLightSimulator {
    public static void main(String[] args) {

        // Input variable for the traffic light color.
        String lightColor = "Green";

        // Use a switch statement to check the value of lightColor.
        switch (lightColor) {

            // If the color is "Red", print "Stop".
            case "Red":
                System.out.println("Stop");
                break; // Exit the switch statement.

            // If the color is "Yellow", print "Ready".
            case "Yellow":
                System.out.println("Ready");
                break; // Exit the switch statement.

            // If the color is "Green", print "Go".
            case "Green":
                System.out.println("Go");
                break; // Exit the switch statement.

            // The default case handles any other input.
            default:
                System.out.println("Invalid Input");
                break; // Exit the switch statement.
        }
    }
}
